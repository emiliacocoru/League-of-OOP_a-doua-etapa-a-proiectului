package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;

public class SmallAngel extends Angel implements AngelVisitor {
    @Override
    public void visit(Knight player) {
        if (player.getDead() == 0) {
            double percent = 0.1;
            knightAmplifierModification(player, percent);
            player.setHp(player.getHp() + 10);
            System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());

        }
    }

    @Override
    public void visit(Pyromancer player) {
        if (player.getDead() == 0) {
            double percent = 0.15;
            pyromancerAmplifierModification(player, percent);
            player.setHp(player.getHp() + 15);
            System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());

        }
    }

    @Override
    public void visit(Rogue player) {
        if (player.getDead() == 0) {
            double percent = 0.05;
            rogueAmplifierModification(player, percent);
            player.setHp(player.getHp() + 20);
            System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());

        }
    }

    @Override
    public void visit(Wizard player) {
        if (player.getDead() == 0) {
            double percent = 0.1;
            wizardAmplifierModification(player, percent);
            player.setHp(player.getHp() + 25);
            System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());

        }
    }
}
