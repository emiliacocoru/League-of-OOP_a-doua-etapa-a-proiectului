package magician;

import angels.Angel;
import players.Player;

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
    public void setWhatPlayersDo(final PlayerObservable whatPlayersDo) {
        this.whatPlayersDo = whatPlayersDo;
    }
    public void setFirstPlayer(final Player firstPlayer) {
        this.firstPlayer = firstPlayer;
    }
    public void setSecondPlayer(final Player secondPlayer) {
        this.secondPlayer = secondPlayer;
    }

    public void setWinner(final Player winner) {
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
