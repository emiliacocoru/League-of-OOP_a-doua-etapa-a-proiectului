package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;

public class Dracula extends Angel implements AngelVisitor {
    @Override
    public void visit(Knight player) {
        if (player.getDead() == 0) {
           double percent = -0.2;
           knightAmplifierModification(player, percent);
           player.setHp(player.getHp() - 60);
           System.out.println(getType() + " hit "+ player.getFullType() + " " + player.getId() );
        }
    }

    @Override
    public void visit(Pyromancer player) {
        if (player.getDead() == 0) {
            double percent = -0.3;
            pyromancerAmplifierModification(player, percent);
            player.setHp(player.getHp() - 40);
            System.out.println(getType() + " hit "+ player.getFullType() + " " + player.getId() );

        }
    }

    @Override
    public void visit(Rogue player) {
        if (player.getDead() == 0) {
            double percent = -0.1;
            rogueAmplifierModification(player, percent);
            player.setHp(player.getHp() - 35);
            System.out.println(getType() + " hit "+ player.getFullType() + " " + player.getId() );

        }
    }

    @Override
    public void visit(Wizard player) {
        if (player.getDead() == 0) {
            double percent = -0.4;
            wizardAmplifierModification(player, percent);
            player.setHp(player.getHp() - 20);
            System.out.println(getType() + " hit "+ player.getFullType() + " " + player.getId() );

        }
    }
}
