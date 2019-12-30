package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import magician.Magician;
import players.Player;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;
import strategy.AmplifierModifier;

public class DamageAngel extends Angel implements AngelVisitor {
    AmplifierModifier modifier = new AmplifierModifier();

   // public DamageAngel(Magician magician){
     //   this.magician = magician;
      //  this.magician.addObserver(this);
   // }
    @Override
    public void visit(Knight player) {
        // 15%
        if (player.getDead() == 0) {
            modifier.knightAmplifierModification(player, (float) 0.15);
        }
    }

    @Override
    public void visit(Pyromancer player) {
        // 20%
        if (player.getDead() == 0) {
            modifier.pyromancerAmplifierModification(player, (float) 0.2);
        }
    }

    @Override
    public void visit(Rogue player) {
        // 30%
        if (player.getDead() == 0) {
            modifier.rogueAmplifierModification(player, (float) 0.3);
        }
    }

    @Override
    public void visit(Wizard player) {
        // 40%
        if (player.getDead() == 0) {
            modifier. wizardAmplifierModification(player, (float) 0.4);
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
