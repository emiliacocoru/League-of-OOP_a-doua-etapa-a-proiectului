package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;

public class GoodBoy extends Angel implements AngelVisitor {
    @Override
    public void visit(Knight player) {
        if (player.getDead() == 0) {
            double percent = 0.4;
            knightAmplifierModification(player, percent);
            player.setHp(player.getHp() + 20);
            System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());
        }
    }

    @Override
    public void visit(Pyromancer player) {
        if (player.getDead() == 0) {
            double percent = 0.5;
            pyromancerAmplifierModification(player, percent);
            player.setHp(player.getHp() + 30);
            System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());

        }
    }

    @Override
    public void visit(Rogue player) {
        if (player.getDead() == 0) {
            System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());
            double percent = 0.4;
            rogueAmplifierModification(player, percent);
            player.setHp(player.getHp() + 40);

        }
    }

    @Override
    public void visit(Wizard player) {
        if (player.getDead() == 0) {
            double percent = 0.3;
            wizardAmplifierModification(player, percent);
            player.setHp(player.getHp() + 50);
            System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());

        }
    }
}
