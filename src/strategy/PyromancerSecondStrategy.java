package strategy;

import players.Player;

public class PyromancerSecondStrategy implements StrategyToPlay{

    @Override
    public void useStrategy(Player player) {
        if(player.getHp() < player.getMaxHP() / 4){
            AmplifierModifier modifier = new AmplifierModifier();
            player.setHp(player.getHp() + player.getHp() / 3);
            modifier.pyromancerAmplifierModification(player, (float) -0.3);
        }
    }
}
