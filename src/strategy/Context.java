package strategy;

import players.Player;

public final class Context {
    private StrategyToPlay strategy;
    public Context(final StrategyToPlay strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(final Player player) {
        strategy.useStrategy(player);
    }
}
