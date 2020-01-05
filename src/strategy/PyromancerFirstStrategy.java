package strategy;

import gameplan.AmplifierModifier;
import players.Player;

public final class PyromancerFirstStrategy implements  StrategyToPlay {
    @Override
    public void useStrategy(final Player player) {
        final int polymarcerFirstVariable = 4;
        final int polymarcerSecondVariable = 3;
        final float polymancerAmplifier = (float) 0.7;
        final int polymancerTakeHpVariable = 4;
        if (player.getMaxHP() / polymarcerFirstVariable < player.getHp()) {
            if (player.getHp() < player.getMaxHP() / polymarcerSecondVariable) {
                AmplifierModifier modifier = new AmplifierModifier();
                player.setHp(player.getHp() - player.getHp() / polymancerTakeHpVariable);
                modifier.pyromancerAmplifierModification(player, polymancerAmplifier);
            }
        }
    }
}
