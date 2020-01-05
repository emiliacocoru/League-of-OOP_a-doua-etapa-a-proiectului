package players.type;

import angels.AngelVisitor;
import gameplan.Map;
import players.Player;
import players.visitor.PlayerVisitor;

public final  class Knight extends Player {
    private double landAmplifier = 1.0;
    private final int hpInitialKnight = 900;

    public Knight() {
        super();
        setFullType("Knight");
    }
    public Knight(final char type) {
        super(type);
        setMaxHP(hpInitialKnight);
        setHp(hpInitialKnight);
        setFullType("Knight");
    }

    @Override
    public void accept(final PlayerVisitor player) {
        player.visit(this);
    }
    @Override
    public void accept(final AngelVisitor angel) {
        angel.visit(this);
    }

    //private Map land = new Map();
    private Map land = Map.getInstance();
    private char[][] gameMap = land.getMap();
    // check if it is a land amplifier or not
    private void landAmplifier() {
        if (gameMap[getLineMap()][getColumnMap()] == 'L') {
            final float landAmplifierK = (float) 1.15;
            landAmplifier = landAmplifierK;
        }
    }
    // first power
    public final class Execute implements PlayerVisitor {
        private final int executeDamage = 200;
        private final int executeDamagePerLevel = 30;
        private int damageExecuteInitial = executeDamage
                + executeDamagePerLevel * getLevel();
        private int execute = 0;
        private int hpLimit = 0;
        /* calculates the minimum hp required for a player
           in order not to be killed instantly */
        void findHPLimit(final Player player) {
            final double executePercentPerLevel = (float) 0.01;
            final double executePercent = (float) 0.2;
            final double executeMaxPercent = (float) 0.4;
            if (executePercentPerLevel
                    * player.getLevel() > executePercent) {
                hpLimit = (int) Math.round(executeMaxPercent * (player.getMaxHP()));
            } else {
                hpLimit = (int) Math.round((executePercent
                        + executePercentPerLevel
                        * player.getLevel()) * (player.getMaxHP()));
            }
        }
        @Override
        public void visit(final Knight player) {
            landAmplifier();
            findHPLimit(player);
            if (player.getHp() < hpLimit) {
                execute = player.getHp();
            } else {
                execute = (int) Math.round(damageExecuteInitial * landAmplifier
                         * getExecuteAmplifierKK());
            }
            player.setReceivedDamageWRA((int) Math.round(damageExecuteInitial * landAmplifier));
            player.setDamageThisRound(execute);
        }

        @Override
        public void visit(final Pyromancer player) {
            landAmplifier();
            findHPLimit(player);
            if (player.getHp() < hpLimit) {
                execute = player.getHp();
                player.setReceivedDamageWRA(execute);
            } else {
                execute = (int) Math.round(damageExecuteInitial
                        * landAmplifier * getExecuteAmplifierKP());
                player.setReceivedDamageWRA((int) Math.round(damageExecuteInitial * landAmplifier));
            }
            player.setDamageThisRound(execute);
        }

        @Override
        public void visit(final Rogue player) {
            landAmplifier();
            findHPLimit(player);
            if (player.getHp() < hpLimit) {
                execute = player.getHp();
                player.setReceivedDamageWRA(execute);
            } else {
                execute = (int) Math.round(damageExecuteInitial * landAmplifier
                        * getExecuteAmplifierKR());
                player.setReceivedDamageWRA((int) Math.round(damageExecuteInitial * landAmplifier));
            }
            player.setDamageThisRound(execute);

        }

        @Override
        public void visit(final Wizard player) {
            landAmplifier();
            findHPLimit(player);
            if (player.getHp() < hpLimit) {
                execute = player.getHp();
            } else {
                execute = (int) Math.round(damageExecuteInitial * landAmplifier
                        * getExecuteAmplifierKW());
            }
            player.setReceivedDamageWRA((int) Math.round(damageExecuteInitial * landAmplifier));
            player.setDamageThisRound(execute);

        }
    }

    public final class Slam implements PlayerVisitor {
        private final int slamDamage = 100;
        private final int slamDamagePerLevel = 40;
        private int baseDamage = slamDamage
                + slamDamagePerLevel * getLevel();
        private int slam = 0;
        @Override
        public void visit(final Knight player) {
            landAmplifier();
            slam = (int) Math.round(baseDamage * getSlamAmplifierKK() * landAmplifier);
            player.setReceivedDamageWRA((player.getReceivedDamageWRA())
                    + (int) Math.round(baseDamage * landAmplifier));
            player.setDamageThisRound(player.getDamageThisRound() + slam);
            player.setExtraRounds(0);
            player.setIncapacityOfMovement(1);

        }

        @Override
        public void visit(final Pyromancer player) {
            landAmplifier();
            slam = (int) Math.round(baseDamage * getSlamAmplifierKP() * landAmplifier);
            player.setReceivedDamageWRA((player.getReceivedDamageWRA())
                    + (int) Math.round(baseDamage * landAmplifier));
            player.setDamageThisRound(player.getDamageThisRound() + slam);
            player.setExtraRounds(0);
            player.setIncapacityOfMovement(1);

        }

        @Override
        public void visit(final Rogue player) {
            landAmplifier();
            slam = (int) Math.round(baseDamage * getSlamAmplifierKR() * landAmplifier);
            player.setReceivedDamageWRA(player.getReceivedDamageWRA()
                    + (int) Math.round(baseDamage * landAmplifier));
            player.setDamageThisRound(player.getDamageThisRound() + slam);
            player.setExtraRounds(0);
            player.setIncapacityOfMovement(1);

        }

        @Override
        public void visit(final Wizard player) {
            landAmplifier();

            slam = (int) Math.round(baseDamage * getSlamAmplifierKW() * landAmplifier);
            player.setReceivedDamageWRA((player.getReceivedDamageWRA())
                    + (int) Math.round(baseDamage * landAmplifier));
            player.setDamageThisRound(player.getDamageThisRound() + slam);
            player.setExtraRounds(0);
            player.setIncapacityOfMovement(1);
        }
    }
}
