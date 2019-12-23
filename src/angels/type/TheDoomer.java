package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;

public class TheDoomer extends Angel implements AngelVisitor {
    @Override
    public void visit(Knight player) {
        if (player.getDead() == 0 ) {
            System.out.println("TheDoomer hit "+ player.getFullType() + " " + player.getId());
            player.setDead(1);
            System.out.println("Player " + player.getFullType() + " " + player.getId()
                    + " was killed by an angel");
        }
    }

    @Override
    public void visit(Pyromancer player) {
        if (player.getDead() == 0 ) {
            System.out.println("TheDoomer hit "+ player.getFullType() + " " + player.getId());
            player.setDead(1);
            System.out.println("Player " + player.getFullType() + " " + player.getId()
                    + " was killed by an angel");

        }
    }

    @Override
    public void visit(Rogue player) {
        if (player.getDead() == 0 ) {
            System.out.println("TheDoomer hit "+ player.getFullType() + " " + player.getId());
            player.setDead(1);
            System.out.println("Player " + player.getFullType() + " " + player.getId()
                    + " was killed by an angel");

        }
    }

    @Override
    public void visit(Wizard player) {
        if (player.getDead() == 0 ) {
            System.out.println("TheDoomer hit "+ player.getFullType() + " " + player.getId());
            player.setDead(1);
        System.out.println("Player " + player.getFullType() + " " + player.getId()
        + " was killed by an angel");

        }
    }
}
