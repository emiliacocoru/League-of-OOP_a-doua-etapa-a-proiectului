package magician;

public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserverForAngels();
    void notifyObserverForDead();
    void notifyObserverForLevelUp();
}
