package strategy;

import players.Player;

public class PyromancerFirstStrategy implements  StrategyToPlay{

    @Override
    public void useStrategy(Player player) {
        if (player.getMaxHP() / 4 < player.getHp()) {
            if(player.getHp() < player.getMaxHP() / 3){
                AmplifierModifier modifier = new AmplifierModifier();
                player.setHp(player.getHp() - player.getHp() / 4);
                modifier.pyromancerAmplifierModification(player, (float) 0.7);
            }
        }
    }
}
