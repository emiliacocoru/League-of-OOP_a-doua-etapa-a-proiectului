package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import gameplan.GetXPandMaybeLevelUP;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;

public final class XPAngel extends Angel implements AngelVisitor {
    private GetXPandMaybeLevelUP level = new GetXPandMaybeLevelUP();

    @Override
    public void visit(final Knight player) {
        if (player.getDead() == 0) {
            final int giveXpKnight = 45;
            player.setXp(player.getXp() + giveXpKnight);
            level.xpLevelUp(player);

        }
    }

    @Override
    public void visit(final Pyromancer player) {
        if (player.getDead() == 0) {
            final int giveXpPyromancer = 50;
            player.setXp(player.getXp() + giveXpPyromancer);
            level.xpLevelUp(player);

        }
    }

    @Override
    public void visit(final Rogue player) {
        if (player.getDead() == 0) {
            final int giveXpRogue = 40;
            player.setXp(player.getXp() + giveXpRogue);
            level.xpLevelUp(player);

        }
    }

    @Override
    public void visit(final Wizard player) {
        if (player.getDead() == 0) {
            final int giveXpWizard = 60;
            player.setXp(player.getXp() + giveXpWizard);
            level.xpLevelUp(player);
        }
    }

    @Override
    public void update() {
        if (getActualPlayer().getDead() == 0) {
            System.out.println(getType() + " helped " + getActualPlayer().getFullType()
                    + " " + getActualPlayer().getId());
        }
    }
}
