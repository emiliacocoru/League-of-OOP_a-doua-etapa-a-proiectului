package magician;

import players.Player;

import java.util.ArrayList;

public class PlayerObservable implements Observable {
    private ArrayList<Observer> magician = new ArrayList<>();

    public final void addObserver(final Observer o) {
        magician.add(o);
    }

    public final void removeObserver(final Observer o) {
        magician.remove(o);
    }

    @Override
    public final void notifyObserver() {
    }

    @Override
    public final void notifyObserverForDead() {
        for (Observer magic : magician) {
            magic.updatePlayerDead();
        }
    }
    public final void notifyObserverForLevelUp() {
        for (Observer magic : magician) {
            magic.updateLevelUp();
        }
    }

    final void updateDead(final Player firstPlayer, final Player secondPlayer) {
        if (firstPlayer.getDead() == 0 && secondPlayer.getDead() == 1) {
            System.out.println("Player " + secondPlayer.getFullType() + " "
                    + secondPlayer.getId() + " was killed by "
                    + firstPlayer.getFullType()
                    + " " + firstPlayer.getId());
        }
        if (secondPlayer.getDead() == 0 && firstPlayer.getDead() == 1) {
            System.out.println("Player " + firstPlayer.getFullType() + " "
                    + firstPlayer.getId() + " was killed by "
                    + secondPlayer.getFullType() + " "
                    + secondPlayer.getId());
        }
        if (firstPlayer.getDead() == 1 && secondPlayer.getDead() == 1) {
            System.out.println("Player " + secondPlayer.getFullType() + " "
                    + secondPlayer.getId() + " was killed by "
                    + firstPlayer.getFullType() + " "
                    + firstPlayer.getId());
            System.out.println("Player " + firstPlayer.getFullType() + " "
                    + firstPlayer.getId() + " was killed by "
                    + secondPlayer.getFullType() + " "
                    + secondPlayer.getId());
        }
    }
    final void updateLevelUp(final Player winner) {
        System.out.println(winner.getFullType() + " " + winner.getId() + " reached level "
                + winner.getLevel());

    }
}
