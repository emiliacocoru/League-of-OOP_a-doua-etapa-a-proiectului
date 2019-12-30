package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import magician.Magician;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;
import strategy.AmplifierModifier;

public class GoodBoy extends Angel implements AngelVisitor {
    AmplifierModifier modifier = new AmplifierModifier();

    //public GoodBoy(Magician magician){
      //  this.magician = magician;
       // this.magician.addObserver(this);
    //}

    @Override
    public void visit(Knight player) {
        if (player.getDead() == 0) {
            modifier.knightAmplifierModification(player, (float) 0.4);
            player.setHp(player.getHp() + 20);
        }
    }

    @Override
    public void visit(Pyromancer player) {
        if (player.getDead() == 0) {
            float percent = (float) 0.5;
            modifier.pyromancerAmplifierModification(player, percent);
            player.setHp(player.getHp() + 30);
        }
    }

    @Override
    public void visit(Rogue player) {
        if (player.getDead() == 0) {

            float percent = (float) 0.4;
            modifier.rogueAmplifierModification(player, percent);
            player.setHp(player.getHp() + 40);

        }
    }

    @Override
    public void visit(Wizard player) {
        if (player.getDead() == 0) {
            float percent = (float) 0.3;
            modifier.wizardAmplifierModification(player, percent);
            player.setHp(player.getHp() + 50);

        }
    }

    @Override
    public void update() {
        if (getActualPlayer().getDead() == 0) {

            System.out.println(getType() + " helped "
                    + getActualPlayer().getFullType() + " " + getActualPlayer().getId());
        }
    }
}
