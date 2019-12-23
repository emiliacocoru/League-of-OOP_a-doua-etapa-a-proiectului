package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;

public class DamageAngel extends Angel implements AngelVisitor {

    @Override
    public void visit(Knight player) {
        // 15%
        if (player.getDead() == 0) {
            double percent = 0.15;
            knightAmplifierModification(player, percent);
            System.out.println(getType() + " helped " + player.getFullType() + " "
                    + player.getId());
        }
    }

    @Override
    public void visit(Pyromancer player) {
        // 20%
        if (player.getDead() == 0) {
            double percent = 0.2;
            pyromancerAmplifierModification(player, percent);
            System.out.println(getType() + " helped " + player.getFullType() + " "
                    + player.getId());
        }
    }

    @Override
    public void visit(Rogue player) {
        // 30%
        if (player.getDead() == 0) {
            double percent = 0.3;
            rogueAmplifierModification(player, percent);
            System.out.println(getType() + " helped " + player.getFullType() + " "
                    + player.getId());
        }
    }

    @Override
    public void visit(Wizard player) {
        // 40%
        if (player.getDead() == 0) {
            double percent = 0.4;
            wizardAmplifierModification(player, percent);
            System.out.println(getType() + " helped " + player.getFullType() + " "
                    + player.getId());
        }
    }
}
