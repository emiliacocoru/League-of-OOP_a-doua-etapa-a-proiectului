package strategy;

import players.Player;

public class WizardSecondStrategy implements StrategyToPlay {
    @Override
    public void useStrategy(Player player) {
        if (player.getHp() < (player.getMaxHP() / 4)) {

            AmplifierModifier modifier = new AmplifierModifier();
            modifier.wizardAmplifierModification(player, (float) -0.2);
            player.setHp(player.getHp() + player.getHp() / 5);
        }
    }
}
