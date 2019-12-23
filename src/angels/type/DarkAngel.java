package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;

public class DarkAngel extends Angel implements AngelVisitor {
    @Override
    public void visit(Knight player) {
        if (player.getDead() == 0) {
           player.setHp(player.getHp() - 40);
            System.out.println(getType() + " hit "+ player.getFullType() + " " + player.getId() );

        }
    }

    @Override
    public void visit(Pyromancer player) {
        if (player.getDead() == 0) {
            player.setHp(player.getHp() - 30);
            System.out.println(getType() + " hit "+ player.getFullType() + " " + player.getId() );

        }
    }

    @Override
    public void visit(Rogue player) {
        if (player.getDead() == 0) {
            player.setHp(player.getHp() - 10);
            System.out.println(getType() + " hit "+ player.getFullType() + " " + player.getId() );

        }
    }

    @Override
    public void visit(Wizard player) {
        if (player.getDead() == 0) {
            player.setHp(player.getHp() - 20);
            System.out.println(getType() + " hit "+ player.getFullType() + " " + player.getId() );

        }
    }
}
