package strategy;

import players.Player;

public final class RogueFirstStrategy implements StrategyToPlay {
    @Override
    public void useStrategy(final Player player) {
        final int rogueFirstVariable = 7;
        final int rogueSecondVariable = 5;
        final float rogueAmplifier = (float) 0.4;
        final int rogueTakeHp = 7;
        if ((player.getMaxHP() / rogueFirstVariable) < player.getHp()) {
            if (player.getHp() < player.getMaxHP() / rogueSecondVariable) {
                AmplifierModifier modifier = new AmplifierModifier();
                modifier.rogueAmplifierModification(player, rogueAmplifier);
                player.setHp(player.getHp() - player.getHp() / rogueTakeHp);
            }
        }
    }
}


