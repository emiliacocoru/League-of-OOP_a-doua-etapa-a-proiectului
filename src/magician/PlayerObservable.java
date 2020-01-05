package magician;

import players.Player;

import java.util.ArrayList;

public class PlayerObservable implements Observable {
    private ArrayList<Observer> magician = new ArrayList<>();

    public void addObserver(final Observer o) {
        magician.add(o);
    }

    public void removeObserver(final Observer o) {
        magician.remove(o);
    }

    @Override
    public void notifyObserver() {
    }

    @Override
    public void notifyObserverForDead() {
        for (Observer magic : magician) {
            magic.updatePlayerDead();
        }
    }
    public void notifyObserverForLevelUp() {
        for (Observer magic : magician) {
            magic.updateLevelUp();
        }
    }

    public void updateDead(Player firstPlayer, Player secondPlayer) {
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
        public void updateLevelUp(Player winner) {
            System.out.println(winner.getFullType() + " " + winner.getId() + " reached level "
                    + winner.getLevel());

    }
}
