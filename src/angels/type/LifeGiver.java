package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;

public class LifeGiver extends Angel implements AngelVisitor {
    @Override
    public void visit(Knight player) {
        player.setHp(player.getHp() + 100);
        System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());

    }

    @Override
    public void visit(Pyromancer player) {
        player.setHp(player.getHp() + 80);
        System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());


    }

    @Override
    public void visit(Rogue player) {
        player.setHp(player.getHp() + 90);
        System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());


    }

    @Override
    public void visit(Wizard player) {
        player.setHp(player.getHp() + 120);
        System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());


    }
}
