package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;

public class Spawner extends Angel implements AngelVisitor {
    @Override
    public void visit(Knight player) {
        if (player.getDead() == 1) {
            player.setDead(0);
            player.setHp(200);
            System.out.println(getType() + " helped " + player.getFullType() + " "
                    + player.getId());
            System.out.println("Player " + player.getFullType() +" " + player.getId() +
                    " was brought to life by an angel ");
        }
    }

    @Override
    public void visit(Pyromancer player) {
        if (player.getDead() == 1) {
            player.setDead(0);
            player.setHp(150);
            System.out.println(getType() + " helped " + player.getFullType() + " "
                    + player.getId());
            System.out.println("Player " + player.getFullType() +" " + player.getId() +
                    " was brought to life by an angel ");
        }
    }

    @Override
    public void visit(Rogue player) {
        if (player.getDead() == 1) {
            player.setDead(0);
            player.setHp(180);
            System.out.println(getType() + " helped " + player.getFullType() + " "
                    + player.getId());
            System.out.println("Player " + player.getFullType() +" " + player.getId() +
                    " was brought to life by an angel ");
        }
    }

    @Override
    public void visit(Wizard player) {
        if (player.getDead() == 1) {
            player.setDead(0);
            player.setHp(120);
            System.out.println(getType() + " helped " + player.getFullType() + " "
                    + player.getId());
            System.out.println("Player " + player.getFullType() +" " + player.getId() +
                    " was brought to life by an angel ");
        }
    }
}
