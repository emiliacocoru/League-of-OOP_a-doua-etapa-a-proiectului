package strategy;

import players.Player;

public final class WizardSecondStrategy implements StrategyToPlay {
    @Override
    public void useStrategy(final Player player) {
        final int wizardFirstVariable = 4;
        final int wizardTakeHp = 5;
        final float wizardDamage = (float) -0.2;
        if (player.getHp() < (player.getMaxHP() / wizardFirstVariable)) {
            AmplifierModifier modifier = new AmplifierModifier();
            modifier.wizardAmplifierModification(player, wizardDamage);
            player.setHp(player.getHp() + player.getHp() / wizardTakeHp);
        }
    }
}
