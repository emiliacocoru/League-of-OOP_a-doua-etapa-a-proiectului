package strategy;

import players.Player;

public final class WizardFirstStrategy implements StrategyToPlay {
    @Override
    public void useStrategy(final Player player) {
        final int wizardFirstVariable = 4;
        final int wizardSecondVariable = 2;
        final float wizardAmplifier = (float) 0.6;
        final int wizardTakeHpVariable = 10;
        if (player.getMaxHP() / wizardFirstVariable < player.getHp()) {
            if (player.getHp() < player.getMaxHP() / wizardSecondVariable) {
                AmplifierModifier modifier = new AmplifierModifier();
                modifier.wizardAmplifierModification(player, wizardAmplifier);
                player.setHp(player.getHp() - player.getHp() / wizardTakeHpVariable);
            }
        }
    }
}

