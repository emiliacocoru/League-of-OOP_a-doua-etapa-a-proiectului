package strategy;

import gameplan.AmplifierModifier;
import players.Player;

public final class PyromancerSecondStrategy implements StrategyToPlay {
    @Override
    public void useStrategy(final Player player) {
        final int pyromancerFirstVariable = 4;
        final int pyromancerGiveHpVariable = 3;
        final float pyromancerDamage = (float) -0.3;
        if (player.getHp() < player.getMaxHP() / pyromancerFirstVariable) {
            AmplifierModifier modifier = new AmplifierModifier();
            player.setHp(player.getHp() + player.getHp() / pyromancerGiveHpVariable);
            modifier.pyromancerAmplifierModification(player, pyromancerDamage);
        }
    }
}
