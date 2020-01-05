package magician;

import angels.Angel;
import players.Player;

import java.util.ArrayList;

public final class Magician implements Observer {
    private static Magician magician = null;
    private Angel angel = null;
    private Player firstPlayer = null;
    private Player secondPlayer = null;
    private Player winner = null;
    private PlayerObservable whatPlayersDo = null;

    public static Magician getMagician() {
        if (magician == null) {
            magician = new Magician();
        }
        return magician;
    }

    public Player getFirstPlayer() {
        return firstPlayer;
    }

    public void setWhatPlayersDo(PlayerObservable whatPlayersDo) {
        this.whatPlayersDo = whatPlayersDo;
    }

    public void setFirstPlayer(Player firstPlayer) {
        this.firstPlayer = firstPlayer;
    }

    public Player getSecondPlayer() {
        return secondPlayer;
    }

    public void setSecondPlayer(Player secondPlayer) {
        this.secondPlayer = secondPlayer;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Angel getAngel() {
        return angel;
    }

    public void setAngel(final Angel angel) {
        this.angel = angel;
        System.out.println("Angel " + angel.getType() + " was spawned at "
                + angel.getLinePosition() + " " + angel.getColumnPosition());
    }
    @Override
    public void update() {
        angel.update();
    }
    public void updatePlayerDead() {
        whatPlayersDo.updateDead(firstPlayer, secondPlayer);
    }
    public void updateLevelUp() {
        whatPlayersDo.updateLevelUp(winner);
    }
}
