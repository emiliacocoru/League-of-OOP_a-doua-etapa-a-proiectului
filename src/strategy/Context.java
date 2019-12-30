package strategy;

import players.Player;

public class Context {
    private StrategyToPlay strategy;
    public Context(StrategyToPlay strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(Player player) {
        strategy.useStrategy(player);
    }
}
