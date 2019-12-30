package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import magician.Magician;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;
import strategy.AmplifierModifier;

public class TheDoomer extends Angel implements AngelVisitor {

 //   public TheDoomer(Magician magician){
   //     this.magician = magician;
    //    this.magician.addObserver(this);
   // }



    @Override
    public void visit(Knight player) {
        if (player.getDead() == 0 ) {
            player.setDead(1);
        }
    }

    @Override
    public void visit(Pyromancer player) {
        if (player.getDead() == 0 ) {
            player.setDead(1);
        }
    }

    @Override
    public void visit(Rogue player) {
        if (player.getDead() == 0 ) {
            player.setDead(1);
        }
    }

    @Override
    public void visit(Wizard player) {
        if (player.getDead() == 0 ) {
            player.setDead(1);
        }
    }

    @Override
    public void update() {
        if (getActualPlayer().getDead() == 0) {

            System.out.println("TheDoomer hit " + getActualPlayer().getFullType() +
                    " " + getActualPlayer().getId());
            System.out.println("Player " + getActualPlayer().getFullType() + " "
                    + getActualPlayer().getId()
                    + " was killed by an angel");
        }
    }
}
