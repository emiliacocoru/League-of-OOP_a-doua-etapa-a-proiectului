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

    public Player getActualPlayer() {
        return actualPlayer;
    }

    public void setActualPlayer(Player actualPlayer) {
        this.actualPlayer = actualPlayer;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLinePosition() {
        return linePosition;
    }

    public void setLinePosition(int linePosition) {
        this.linePosition = linePosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }


    public void addObserver(Observer o) {
            magician.add(o);
    }

    public void removeObserver(Observer o) {
        magician.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer magic : magician){
            magic.update();
        }
    }
}
