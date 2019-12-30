package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;

public final class TheDoomer extends Angel implements AngelVisitor {

    @Override
    public void visit(final Knight player) {
        if (player.getDead() == 0) {
            player.setDead(1);
        }
    }

    @Override
    public void visit(final Pyromancer player) {
        if (player.getDead() == 0) {
            player.setDead(1);
        }
    }

    @Override
    public void visit(final Rogue player) {
        if (player.getDead() == 0) {
            player.setDead(1);
        }
    }

    @Override
    public void visit(final Wizard player) {
        if (player.getDead() == 0) {
            player.setDead(1);
        }
    }

    @Override
    public void update() {
        if (getActualPlayer().getDead() == 0) {
            System.out.println("TheDoomer hit " + getActualPlayer().getFullType()
                    + " " + getActualPlayer().getId());
            System.out.println("Player " + getActualPlayer().getFullType() + " "
                    + getActualPlayer().getId()
                    + " was killed by an angel");
        }
    }
}
