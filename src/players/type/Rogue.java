package players.type;

import angels.AngelVisitor;
import gameplan.Map;
import players.Player;
import players.visitor.PlayerVisitor;


public final class Rogue extends Player {

    private double landAmplifier = 1;
    private final int numberOfRoundsWithoutAmplifier = 3;
    private int landExtraRounds = numberOfRoundsWithoutAmplifier;
    private int numberOfHits = 0;

    private Map land = Map.getInstance();
    private char[][] gameMap = land.getMap();
    public Rogue(final char type) {
        super(type);
        final int hpInitialRogue = 600;

        setMaxHP(hpInitialRogue);
        setHp(hpInitialRogue);
        setFullType("Rogue");
    }

    /* check if it is a land amplifier or not
     and if there are 3 or 6 overtime damage rounds */
    public void extra() {
        final float landAmplifierR = (float) 1.15;
        final int numberOfRoundsWithAmplifier = 6;
        if (gameMap[getLineMap()][getColumnMap()] == 'W') {
            landAmplifier = landAmplifierR;
            landExtraRounds = numberOfRoundsWithAmplifier;
        }
        if (gameMap[getLineMap()][getColumnMap()] == 'D') {
            landAmplifier = 1;
            landExtraRounds = numberOfRoundsWithoutAmplifier;
        }
        if (gameMap[getLineMap()][getColumnMap()] == 'V') {
            landAmplifier = 1;
            landExtraRounds = numberOfRoundsWithoutAmplifier;
        }
        if (gameMap[getLineMap()][getColumnMap()] == 'L') {
            landAmplifier = 1;
            landExtraRounds = numberOfRoundsWithoutAmplifier;
        }
    }

    @Override
    public void accept(final PlayerVisitor player) {
        player.visit(this);
    }
    @Override
    public void accept(final AngelVisitor angel){
        angel.visit(this);
    }
     // first power
     private final int bachStabBaseDamage = 200;
     private final int bacKStabBaseDamagePerLevel = 20;
     public final class BackStab implements PlayerVisitor {
        private int damageInitial = bachStabBaseDamage
                 + bacKStabBaseDamagePerLevel * getLevel();
        private int backStabDamage = 0;
        private double percent = 1.0;


        void backStabWithBonus() {
            final int hitsNumber = 3;
            final float percentBonusRogue = (float) 1.5;
            if (numberOfHits % hitsNumber == 0) {
                if (gameMap[getLineMap()][getColumnMap()] == 'W') {
                    percent = percentBonusRogue;
                } else {
                    percent = 1;
                }
            } else {
                percent = 1;
            }
            numberOfHits++;
        }
         @Override
         public void visit(final Knight player) {
             extra();
             backStabWithBonus();
             backStabDamage = (int) Math.round(damageInitial * percent
                      * getBackStabAmplifierRK() * landAmplifier);
             player.setReceivedDamageWRA((int) Math.round(damageInitial * landAmplifier));
             player.setDamageThisRound(backStabDamage);
         }

         @Override
         public void visit(final Pyromancer player) {
             extra();
             backStabWithBonus();
             backStabDamage = (int) Math.round(damageInitial * percent
                     * getBackStabAmplifierRP() * landAmplifier);
             player.setReceivedDamageWRA((int) Math.round(damageInitial * percent * landAmplifier));
             player.setDamageThisRound(backStabDamage);
         }

         @Override
         public void visit(final Rogue player) {
             extra();
             backStabWithBonus();
             backStabDamage = (int) Math.round(damageInitial * percent
                     * getBackStabAmplifierRR() * landAmplifier);
             player.setReceivedDamageWRA((int) Math.round(damageInitial * percent * landAmplifier));
             player.setDamageThisRound(backStabDamage);
         }

         @Override
         public void visit(final Wizard player) {
             extra();
             backStabWithBonus();
             backStabDamage = (int) Math.round(damageInitial * percent
                     * getBackStabAmplifierRW() * landAmplifier);
             player.setReceivedDamageWRA((int) Math.round(damageInitial * percent * landAmplifier));
             player.setDamageThisRound(backStabDamage);
         }
     }
     // second power
     public final class Paralysis implements PlayerVisitor {
         private final int paralysisDamage = 40;
         private final int paralysisDamagePerLevel = 10;
         private int damageInitial = (paralysisDamage)
                 + paralysisDamagePerLevel * getLevel();
         private int damageParalysis = 0;

         @Override
         public void visit(final Knight player) {
             extra();
             damageParalysis = (int) Math.round(damageInitial
                     * getParalysisAmplifierRK() * landAmplifier);
             player.setReceivedDamageWRA(player.getReceivedDamageWRA()
                     + (int) Math.round(damageInitial * landAmplifier));
             player.setDamageExtra(damageParalysis);
             player.setExtraRounds(landExtraRounds);
             player.setDamageThisRound(player.getDamageThisRound() + damageParalysis);
             player.setIncapacityOfMovement(landExtraRounds);
         }

         @Override
         public void visit(final Pyromancer player) {
             extra();
             damageParalysis = (int) Math.round(damageInitial
                     * getParalysisAmplifierRP() * landAmplifier);
             player.setDamageExtra(damageParalysis);
             player.setExtraRounds(landExtraRounds);
             player.setReceivedDamageWRA((player.getReceivedDamageWRA())
                     + (int) Math.round(damageInitial * landAmplifier));
             player.setDamageThisRound(player.getDamageThisRound() + damageParalysis);
             player.setIncapacityOfMovement(landExtraRounds);
         }

         @Override
         public void visit(final Rogue player) {
             extra();
             damageParalysis = (int) Math.round(damageInitial
                     * getParalysisAmplifierRR() * landAmplifier);
             player.setDamageExtra(damageParalysis);
             player.setExtraRounds(landExtraRounds);
             player.setReceivedDamageWRA((player.getReceivedDamageWRA())
                     + (int) Math.round(damageInitial * landAmplifier));
             player.setDamageThisRound(player.getDamageThisRound() + damageParalysis);
             player.setIncapacityOfMovement(landExtraRounds);

         }

         @Override
         public void visit(final Wizard player) {
             extra();
             damageParalysis = (int) Math.round(damageInitial
                    * getBackStabAmplifierRW() * landAmplifier);
             player.setDamageExtra(damageParalysis);
             player.setExtraRounds(landExtraRounds);
             player.setReceivedDamageWRA((player.getReceivedDamageWRA())
                     + (int) Math.round(damageInitial * landAmplifier));
             player.setDamageThisRound(player.getDamageThisRound() + damageParalysis);
             player.setIncapacityOfMovement(landExtraRounds);
         }
     }
}
