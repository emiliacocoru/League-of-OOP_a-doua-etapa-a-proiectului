package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import gameplan.GetXPandMaybeLevelUP;
import magician.Magician;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;
import strategy.AmplifierModifier;

public class XPAngel extends Angel implements AngelVisitor {
    private GetXPandMaybeLevelUP level = new GetXPandMaybeLevelUP();

   // public XPAngel(Magician magician){
     //   this.magician = magician;
      //  this.magician.addObserver(this);
    //}
    @Override
    public void visit(Knight player) {
        if (player.getDead() == 0) {
            player.setXp(player.getXp() + 45);
            level.xpLevelUp(player);

        }
    }

    @Override
    public void visit(Pyromancer player) {
        if (player.getDead() == 0) {
            player.setXp(player.getXp() + 50);
            level.xpLevelUp(player);

        }
    }

    @Override
    public void visit(Rogue player) {
        if (player.getDead() == 0) {
            player.setXp(player.getXp() + 40);
            level.xpLevelUp(player);

        }
    }

    @Override
    public void visit(Wizard player) {
        if (player.getDead() == 0) {
            player.setXp(player.getXp() + 60);
            level.xpLevelUp(player);

        }
    }

    @Override
    public void update() {
        if (getActualPlayer().getDead() == 0) {

            System.out.println(getType() + " helped " + getActualPlayer().getFullType() +
                    " " + getActualPlayer().getId());
        }
    }
}
