package strategy;

import gameplan.AmplifierModifier;
import players.Player;

public final class KnightFirstStrategy implements  StrategyToPlay {
    @Override
    public void useStrategy(final Player player) {
        final int knightFirstVariable = 3;
        final int knightSecondVariable = 2;
        final float knightAmplifier = (float) 0.5;
        final int knightHpVariable = 5;
        if (player.getMaxHP() / knightFirstVariable < player.getHp()) {
            if (player.getHp() <  player.getMaxHP() / knightSecondVariable) {
                AmplifierModifier modifier = new AmplifierModifier();
                modifier.knightAmplifierModification(player, knightAmplifier);
                player.setHp(player.getHp() - player.getHp() / knightHpVariable);
            }
        }
    }
}
