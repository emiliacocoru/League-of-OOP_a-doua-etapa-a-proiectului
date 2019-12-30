package strategy;

import players.Player;

public class RogueFirstStrategy implements StrategyToPlay{
    @Override
    public void useStrategy(Player player) {
        if((player.getMaxHP() / 7) < player.getHp()) {
            if (player.getHp() < (1 / 5) * player.getMaxHP()) {
                AmplifierModifier modifier = new AmplifierModifier();
                modifier.rogueAmplifierModification(player, (float) 0.4);
                player.setHp(player.getHp() - player.getHp() / 7);
            }
        }
    }
}


