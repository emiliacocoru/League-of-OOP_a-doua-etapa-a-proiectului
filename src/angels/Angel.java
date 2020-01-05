package angels;


import magician.Observable;
import players.Player;

import java.util.ArrayList;
import magician.Observer;

public abstract class Angel implements Observable {
    private ArrayList<Observer> magician = new ArrayList<>();
    private String type;
    private int linePosition;
    private int columnPosition;
    public abstract void update();
    private Player actualPlayer = null;

    public final Player getActualPlayer() {
        return actualPlayer;
    }

    public final void setActualPlayer(final Player actualPlayer) {
        this.actualPlayer = actualPlayer;
    }


    public final String getType() {
        return type;
    }

    public final void setType(final String type) {
        this.type = type;
    }

    public final  int getLinePosition() {
        return linePosition;
    }

    public final void setLinePosition(final int linePosition) {
        this.linePosition = linePosition;
    }

    public final int getColumnPosition() {
        return columnPosition;
    }

    public final void setColumnPosition(final int columnPosition) {
        this.columnPosition = columnPosition;
    }


    public final void addObserver(final Observer o) {
            magician.add(o);
    }

    public final void removeObserver(final Observer o) {
        magician.remove(o);
    }

    @Override
    public final void notifyObserver() {
        for (Observer magic : magician) {
            magic.update();
        }
    }
    @Override
    public void notifyObserverForDead() {
    }
    @Override
    public void notifyObserverForLevelUp() {
    }
}
