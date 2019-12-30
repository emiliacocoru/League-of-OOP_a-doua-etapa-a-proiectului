package strategy;

import players.Player;

public final class RogueSecondStrategy implements StrategyToPlay {
    @Override
    public void useStrategy(final Player player) {
        final int rogueFirstVariable = 7;
        final int rogueGiveHp = 2;
        final float rogueDamage = (float) -0.1;
        if (player.getHp() < player.getMaxHP() / rogueFirstVariable) {
            AmplifierModifier modifier = new AmplifierModifier();
            modifier.rogueAmplifierModification(player, rogueDamage);
            player.setHp(player.getHp() + player.getHp() / rogueGiveHp);
        }
    }
}
