package magician;

import angels.Angel;
import players.Player;

import java.util.ArrayList;

public class Magician implements Observer {
    private Angel angel = null;

    public Angel getAngel() {
        return angel;
    }

    public void setAngel(Angel angel) {
        this.angel = angel;
        System.out.println("Angel " + angel.getType() + " was spawned at "
                + angel.getLinePosition() +" "+ angel.getColumnPosition());
    }

//    public Magician(Angel angel) {
  //      this.angel = angel;
   // }
    @Override
    public void update() {
        angel.update();
    }
    //private Player player;
    //private ArrayList<Angel> angels = new ArrayList<>();
    //public void addObserver(Angel angel) {
    //    this.angels.add(angel);
    //}
    //public void removeObserver(Angel angel){
      //  this.angels.remove(angel);
    //}
    //public void setPlayer(Player player){
      //  this.player = player;
       // notifyAllObservers();
    //}
    ///public Player getPlayer() {
       // return player;
    //}

    //public void notifyAllObservers() {
      //  for(Angel angel:angels){
        //    angel.update();
        //}
    //}




}
