package players.type;

import angels.AngelVisitor;
import gameplan.Map;
import players.Player;
import players.visitor.PlayerVisitor;

public final class Wizard extends Player {
    private Map land = Map.getInstance();
    private char[][] gameMap = land.getMap();
    private double landAmplifier = 1.0;
    public Wizard(final char type) {
        super(type);
        final int hpInitialWizard = 400;
        setMaxHP(hpInitialWizard);
        setHp(hpInitialWizard);
        setFullType("Wizard");
    }

    @Override
    public void accept(final PlayerVisitor player) {
        player.visit(this);
    }
    @Override
    public void accept(final AngelVisitor angel) {
        angel.visit(this);
    }
    // check if it is a land amplifier or not
    public void landAmplifier() {
        final float landAmplifierW = (float) 1.1;
        if (gameMap[getLineMap()][getColumnMap()] == 'D') {
            landAmplifier = landAmplifierW;
        }
    }
    // first power
    public final class Drain implements PlayerVisitor {
        private double baseHP =  0;
        private int damageDrain = 0;
        private  final float drainDamage = (float) 0.20;
        private final float drainDamagePerLevel = (float) 0.05;
        private final float drainPercent = (float) 0.3;
        private double damageInitial = drainDamage
                + getLevel() * drainDamagePerLevel;
        public void baseHP(final Player player) {
            baseHP = Math.min(drainPercent * player.getMaxHP(), player.getHp());
        }

        @Override
        public void visit(final Knight player) {
            baseHP(player);
            landAmplifier();
            damageDrain = (int) Math.round(landAmplifier * baseHP
                    * damageInitial * getDrainAmplifierWK());
            player.setReceivedDamageWRA((int) Math.round(landAmplifier * baseHP));
            player.setDamageThisRound(damageDrain);
        }

        @Override
        public void visit(final Pyromancer player) {
            landAmplifier();
            baseHP(player);
            damageDrain = (int) Math.round(landAmplifier * baseHP
                    * damageInitial * getDrainAmplifierWP());
            player.setReceivedDamageWRA((int) Math.round(landAmplifier * baseHP));
            player.setDamageThisRound(damageDrain);
        }

        @Override
        public void visit(final Rogue player) {
            baseHP(player);
            landAmplifier();
            damageDrain = (int) Math.round(landAmplifier
                    * baseHP * damageInitial * getDrainAmplifierWR());
            player.setReceivedDamageWRA((int) Math.round(landAmplifier * baseHP));
            player.setDamageThisRound(damageDrain);
        }

        @Override
        public void visit(final Wizard player) {
            baseHP(player);
            landAmplifier();
            damageDrain = (int) Math.round(landAmplifier
                    * baseHP * damageInitial * getDrainAmplifierWW());
            player.setReceivedDamageWRA((int) Math.round(landAmplifier * baseHP));
            player.setDamageThisRound(damageDrain);

        }
    }
    // second power
    public final class Deflect implements PlayerVisitor {
        private final float deflectPercent = (float) 0.35;
        private final float deflectPercentPerLevel = (float) 0.02;
        private final float deflectPercentMaxim = (float) 0.7;
        private double percentDamage = deflectPercent
                 + deflectPercentPerLevel * getLevel();

        private int deflect = 0;

        public void calculatePercent(final Player player) {
            if (percentDamage > deflectPercentMaxim) {
                percentDamage = deflectPercentMaxim;
            }
        }
        @Override
        public void visit(final Knight player) {
            calculatePercent(player);
            landAmplifier();
            player.setExtraRounds(0);
            deflect = (int) Math.round(percentDamage
                    * getDeflectAmplifierWK() * getReceivedDamageWRA() * landAmplifier);
            player.setDamageThisRound(player.getDamageThisRound() + deflect);

        }
        @Override
        public void visit(final Pyromancer player) {
            calculatePercent(player);
            landAmplifier();
            player.setExtraRounds(0);
            deflect = (int) Math.round(percentDamage
                    * getDeflectAmplifierWP() * getReceivedDamageWRA() * landAmplifier);
            player.setDamageThisRound(player.getDamageThisRound() + deflect);
        }

        @Override
        public void visit(final Rogue player) {
            calculatePercent(player);
            landAmplifier();
            player.setExtraRounds(0);
            deflect = (int) Math.round(percentDamage
                    * getDeflectAmplifierWR() * getReceivedDamageWRA() * landAmplifier);
            player.setDamageThisRound(player.getDamageThisRound() + deflect);
        }

        @Override
        public void visit(final Wizard player) {
            calculatePercent(player);
            landAmplifier();
            player.setExtraRounds(0);
            player.setDamageThisRound(player.getDamageThisRound());
        }
    }
}

