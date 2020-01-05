package gameplan;

import players.Player;
import strategy.Context;
import strategy.KnightFirstStrategy;
import strategy.KnightSecondStrategy;
import strategy.PyromancerFirstStrategy;
import strategy.PyromancerSecondStrategy;
import strategy.RogueFirstStrategy;
import strategy.RogueSecondStrategy;
import strategy.WizardFirstStrategy;
import strategy.WizardSecondStrategy;

public class ChooseStrategy {
    public void playerChooseStrategy(Player player) {
        Context context = null;
        if (player.getType() == 'K') {
            if (player.getIncapacityOfMovementThisRound() == 0) {
                context = new Context(new KnightFirstStrategy());
                context.executeStrategy(player);
                context = new Context(new KnightSecondStrategy());
                context.executeStrategy(player);
            } else {
                player.setIncapacityOfMovement(player.getIncapacityOfMovement() - 1);
            }
        }
        if (player.getType() == 'P') {
            if (player.getIncapacityOfMovementThisRound() == 0) {
                context = new Context(new PyromancerFirstStrategy());
                context.executeStrategy(player);
                context = new Context(new PyromancerSecondStrategy());
                context.executeStrategy(player);
            } else {
                player.setIncapacityOfMovement(player.getIncapacityOfMovement() - 1);
            }
        }
        if (player.getType() == 'R') {
            if (player.getIncapacityOfMovementThisRound() == 0) {
                context = new Context(new RogueFirstStrategy());
                context.executeStrategy(player);
                context = new Context(new RogueSecondStrategy());
                context.executeStrategy(player);
            } else {
                player.setIncapacityOfMovement(player.getIncapacityOfMovement() - 1);
            }
        }
        if (player.getType() == 'W') {
            if (player.getIncapacityOfMovementThisRound() == 0) {
                context = new Context(new WizardFirstStrategy());
                context.executeStrategy(player);
                context = new Context(new WizardSecondStrategy());
                context.executeStrategy(player);
            } else {
                player.setIncapacityOfMovement(player.getIncapacityOfMovement() - 1);
            }
        }
    }
}

