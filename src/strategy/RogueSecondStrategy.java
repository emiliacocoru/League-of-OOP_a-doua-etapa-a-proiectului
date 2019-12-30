package strategy;

import players.Player;

public class RogueSecondStrategy implements StrategyToPlay {
    @Override
    public void useStrategy(Player player) {
        if (player.getHp() < (player.getMaxHP() / 7)) {
            AmplifierModifier modifier = new AmplifierModifier();
            modifier.rogueAmplifierModification(player, (float) -0.1);
            player.setHp(player.getHp() + player.getHp() / 2);
        }
    }
}
