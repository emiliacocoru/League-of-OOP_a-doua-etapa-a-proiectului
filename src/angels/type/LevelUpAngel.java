package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import constant.Constants;
import gameplan.GetXPandMaybeLevelUP;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;

public class LevelUpAngel extends Angel implements AngelVisitor {
    private Constants helper = new Constants();
    private GetXPandMaybeLevelUP level = new GetXPandMaybeLevelUP();

    @Override
    public void visit(Knight player) {
        if (player.getDead() == 0) {
            player.setLevel(player.getLevel() + 1);
            System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());

            player.setXp(helper.getLevelUpValue()
                + player.getLevel() * helper.getLevelUpPerLevelValue());
            double percent = 0.1;
            knightAmplifierModification(player, percent);

        }
    }

    @Override
    public void visit(Pyromancer player) {
        if (player.getDead() == 0) {
            player.setLevel(player.getLevel() + 1);
            player.setXp(helper.getLevelUpValue()
                    + player.getLevel() * helper.getLevelUpPerLevelValue());
            System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());
            double percent = 0.2;
            knightAmplifierModification(player, percent);

        }
    }

    @Override
    public void visit(Rogue player) {
        if (player.getDead() == 0) {
            player.setLevel(player.getLevel() + 1);
            player.setXp(helper.getLevelUpValue()
                    + player.getLevel() * helper.getLevelUpPerLevelValue());
            double percent = 0.15;
            knightAmplifierModification(player, percent);
            System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());

        }
    }

    @Override
    public void visit(Wizard player) {
        if (player.getDead() == 0) {
            System.out.println(getType() + " helped " + player.getFullType() + " " + player.getId());
            player.setLevel(player.getLevel() + 1);
            player.setXp(helper.getLevelUpValue()
                    + player.getLevel() * helper.getLevelUpPerLevelValue());
            double percent = 0.25;
            knightAmplifierModification(player, percent);

        }
    }
}
