package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import magician.Magician;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;
import strategy.AmplifierModifier;

public class Spawner extends Angel implements AngelVisitor {
    AmplifierModifier modifier = new AmplifierModifier();

    //public Spawner(Magician magician){
      //  this.magician = magician;
       // this.magician.addObserver(this);
    //}
    @Override
    public void visit(Knight player) {
        if (player.getDead() == 1) {
            player.setDead(0);
            player.setHp(200);
        }
    }

    @Override
    public void visit(Pyromancer player) {
        if (player.getDead() == 1) {
            player.setDead(0);
            player.setHp(150);
        }
    }

    @Override
    public void visit(Rogue player) {
        if (player.getDead() == 1) {
            player.setDead(0);
            player.setHp(180);
        }
    }

    @Override
    public void visit(Wizard player) {
        if (player.getDead() == 1) {
            player.setDead(0);
            player.setHp(120);
        }
    }

    @Override
    public void update() {
        if (getActualPlayer().getDead() == 1) {

            System.out.println(getType() + " helped " + getActualPlayer().getFullType() + " "
                    + getActualPlayer().getId());
            System.out.println("Player " + getActualPlayer().getFullType() + " " +
                    getActualPlayer().getId() +
                    " was brought to life by an angel ");
        }
    }
}
