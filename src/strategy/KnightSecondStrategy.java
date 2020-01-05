package strategy;

import gameplan.AmplifierModifier;
import players.Player;

public final class KnightSecondStrategy implements StrategyToPlay {
    @Override
    public void useStrategy(final Player player) {
        final int knightFirstVariable = 3;
        final float knightDamage = (float) -0.2;
        final int knightGiveHpVariable = 4;
        if (player.getHp() < player.getMaxHP() / knightFirstVariable) {
            AmplifierModifier modifier = new AmplifierModifier();
            modifier.knightAmplifierModification(player, knightDamage);
            player.setHp(player.getHp() + player.getHp() / knightGiveHpVariable);
        }
    }
}
