package strategy;

import players.Player;

public class KnightFirstStrategy implements  StrategyToPlay {
    @Override
    public void useStrategy(Player player) {
        if((player.getMaxHP() /3) < player.getHp()) {
            if (player.getHp() < (1 / 2) * player.getMaxHP()) {
                AmplifierModifier modifier = new AmplifierModifier();
                modifier.knightAmplifierModification(player, (float) 0.5);
                player.setHp(player.getHp() - player.getHp() / 5);
            }
        }
    }
}
