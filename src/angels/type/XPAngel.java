package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import gameplan.GetXPandMaybeLevelUP;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;

public class XPAngel extends Angel implements AngelVisitor {
    private GetXPandMaybeLevelUP level = new GetXPandMaybeLevelUP();
    @Override
    public void visit(Knight player) {
        if (player.getDead() == 0) {
            player.setXp(player.getXp() + 45);
            level.xpLevelUp(player);
            System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());

        }
    }

    @Override
    public void visit(Pyromancer player) {
        if (player.getDead() == 0) {
            player.setXp(player.getXp() + 50);
            level.xpLevelUp(player);
            System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());

        }
    }

    @Override
    public void visit(Rogue player) {
        if (player.getDead() == 0) {
            player.setXp(player.getXp() + 40);
            level.xpLevelUp(player);
            System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());

        }
    }

    @Override
    public void visit(Wizard player) {
        if (player.getDead() == 0) {
            player.setXp(player.getXp() + 60);
            level.xpLevelUp(player);
            System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());

        }
    }
}
