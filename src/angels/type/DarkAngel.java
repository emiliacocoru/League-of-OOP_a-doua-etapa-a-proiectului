package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import magician.Magician;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;
import strategy.AmplifierModifier;

public class DarkAngel extends Angel implements AngelVisitor {
    AmplifierModifier modifier = new AmplifierModifier();


   // public DarkAngel(Magician magician){
     //   this.magician = magician;
      //  this.magician.addObserver(this);
   // }
    @Override
    public void visit(Knight player) {
        if (player.getDead() == 0) {
            player.setHp(player.getHp() - 40);
            if(player.getHp() < 0){
                player.setDead(1);
            }
        }
    }

    @Override
    public void visit(Pyromancer player) {
        if (player.getDead() == 0) {
            player.setHp(player.getHp() - 30);
            if(player.getHp() < 0){
                player.setDead(1);
            }
        }
    }

    @Override
    public void visit(Rogue player) {
        if (player.getDead() == 0) {
            player.setHp(player.getHp() - 10);
            if (player.getHp() < 0) {
                player.setDead(1);
            }
        }
    }

    @Override
    public void visit(Wizard player) {
        if (player.getDead() == 0) {
            player.setHp(player.getHp() - 20);
            if (player.getHp() < 0) {
                player.setDead(1);
            }
        }
    }

    @Override
    public void update() {
        if (getActualPlayer().getDead() == 0) {

            System.out.println(getType() + " hit "
                    + getActualPlayer().getFullType() + " " + getActualPlayer().getId());
        }
    }
}
