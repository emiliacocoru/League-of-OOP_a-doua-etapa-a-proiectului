package strategy;

import players.Player;

public class WizardFirstStrategy implements StrategyToPlay {
    @Override
    public void useStrategy(Player player) {
        if((player.getMaxHP() /4) < player.getHp()) {
            if (player.getHp() < (1 / 2) * player.getMaxHP()) {
                AmplifierModifier modifier = new AmplifierModifier();
                modifier.wizardAmplifierModification(player, (float) 0.6);
                player.setHp(player.getHp() - player.getHp() / 10);
            }
        }
    }
}

