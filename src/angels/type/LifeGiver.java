package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import magician.Magician;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;
import strategy.AmplifierModifier;

public class LifeGiver extends Angel implements AngelVisitor {
    AmplifierModifier modifier = new AmplifierModifier();

    //public LifeGiver(Magician magician){
      //  this.magician = magician;
       // this.magician.addObserver(this);
   // }
    @Override
    public void visit(Knight player) {
        if(player.getDead() == 0) {
            if (player.getHp() + 100 < player.getMaxHP()) {
                player.setHp(player.getHp() + 100);
            } else {
                player.setHp(player.getMaxHP());
            }
        }
    }

    @Override
    public void visit(Pyromancer player) {
        if(player.getDead() == 0) {
            if (player.getHp() + 80 < player.getMaxHP()) {
                player.setHp(player.getHp() + 80);
            } else {
                player.setHp(player.getMaxHP());
            }
        }
    }

    @Override
    public void visit(Rogue player) {
        if(player.getDead() == 0) {
            if (player.getHp() + 90 < player.getMaxHP()) {
                player.setHp(player.getHp() + 90);
            } else {
                player.setHp(player.getMaxHP());

            }
        }
    }

    @Override
    public void visit(Wizard player) {
        if(player.getDead() == 0) {
            if (player.getHp() + 120 < player.getMaxHP()) {
            player.setHp(player.getHp() + 120);
        } else {
                player.setHp(player.getMaxHP());

            }
        }
    }

    @Override
    public void update() {
        if (getActualPlayer().getDead() == 0) {

            System.out.println(getType() + " helped " + getActualPlayer().getFullType()
                    + " " + getActualPlayer().getId());
        }
    }
}
