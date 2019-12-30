package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import magician.Magician;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;
import strategy.AmplifierModifier;

public class SmallAngel extends Angel implements AngelVisitor {
    AmplifierModifier modifier = new AmplifierModifier();

   // public SmallAngel(Magician magician){
     //   this.magician = magician;
      //  this.magician.addObserver(this);
    //}


    @Override
    public void visit(Knight player) {
        if (player.getDead() == 0) {
            float percent = (float) 0.1;
            modifier.knightAmplifierModification(player, percent);
            player.setHp(player.getHp() + 10);
        }
    }

    @Override
    public void visit(Pyromancer player) {
        if (player.getDead() == 0) {
            float percent = (float) 0.15;
            modifier.pyromancerAmplifierModification(player, percent);
            player.setHp(player.getHp() + 15);
        }
    }

    @Override
    public void visit(Rogue player) {
        if (player.getDead() == 0) {
            float percent = (float) 0.05;
            modifier.rogueAmplifierModification(player, percent);
            player.setHp(player.getHp() + 20);

        }
    }

    @Override
    public void visit(Wizard player) {
        if (player.getDead() == 0) {
            float percent = (float) 0.1;
            modifier.wizardAmplifierModification(player, percent);
            player.setHp(player.getHp() + 25);

        }
    }

    @Override
    public void update() {
        if (getActualPlayer().getDead() == 0) {

            System.out.println(getType() + " helped " + getActualPlayer().getFullType() + " "
                    + getActualPlayer().getId());
        }
    }
}
