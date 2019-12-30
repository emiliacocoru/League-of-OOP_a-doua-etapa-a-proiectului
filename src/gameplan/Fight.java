package gameplan;

import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;
import players.Player;
import strategy.*;

public final class Fight {
    public void fight(final Player firstPlayer, final Player secondPlayer) {
        Context context = null;

        if (firstPlayer.getType() == 'K') {
            if(firstPlayer.getIncapacityOfMovement() == 0) {
                context = new Context(new KnightFirstStrategy());
                context.executeStrategy(firstPlayer);
                context = new Context(new KnightSecondStrategy());
                context.executeStrategy(firstPlayer);
            }
            Knight.Execute firstAction = ((Knight) firstPlayer).new Execute();
            Knight.Slam secondAction = ((Knight) firstPlayer).new Slam();
            secondPlayer.accept(firstAction);
            secondPlayer.accept(secondAction);
        }
        if (firstPlayer.getType() == 'P') {
            if(firstPlayer.getIncapacityOfMovement() == 0) {

                context = new Context(new PyromancerFirstStrategy());
                context.executeStrategy(firstPlayer);
                context = new Context(new PyromancerSecondStrategy());
                context.executeStrategy(firstPlayer);
            }
            Pyromancer.FireBlast firstAction = ((Pyromancer) firstPlayer).new FireBlast();
            Pyromancer.Ignite secondAction = ((Pyromancer) firstPlayer).new Ignite();
            secondPlayer.accept(firstAction);
            secondPlayer.accept(secondAction);
        }
        if (firstPlayer.getType() == 'R') {
            if(firstPlayer.getIncapacityOfMovement() == 0) {

                context = new Context(new RogueFirstStrategy());
                context.executeStrategy(firstPlayer);
                context = new Context(new RogueSecondStrategy());
                context.executeStrategy(firstPlayer);
            }
            Rogue.BackStab firstAction = ((Rogue) firstPlayer).new BackStab();
            Rogue.Paralysis secondAction = ((Rogue) firstPlayer).new Paralysis();
            secondPlayer.accept(firstAction);
            secondPlayer.accept(secondAction);
        }
        if (firstPlayer.getType() == 'W') {
            if (firstPlayer.getIncapacityOfMovement() == 0) {
                context = new Context(new WizardFirstStrategy());
                context.executeStrategy(firstPlayer);
                context = new Context(new WizardSecondStrategy());
                context.executeStrategy(firstPlayer);
            }
            Wizard.Drain firstAction = ((Wizard) firstPlayer).new Drain();
            Wizard.Deflect secondAction = ((Wizard) firstPlayer).new Deflect();
            secondPlayer.accept(firstAction);
            secondPlayer.accept(secondAction);

        }
    }
}
