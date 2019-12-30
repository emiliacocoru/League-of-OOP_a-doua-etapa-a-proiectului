package strategy;

import players.Player;

public class KnightSecondStrategy implements StrategyToPlay{

    @Override
    public void useStrategy(Player player) {
        if (player.getHp() < (player.getMaxHP() / 3)) {
            AmplifierModifier modifier = new AmplifierModifier();
            modifier.knightAmplifierModification(player, (float) -0.2);
            player.setHp(player.getHp() + player.getHp() / 4);
        }
    }
}
