package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import constant.Constants;
import gameplan.GetXPandMaybeLevelUP;
import magician.Magician;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;
import strategy.AmplifierModifier;

public class LevelUpAngel extends Angel implements AngelVisitor {
    private Constants helper = new Constants();
    private GetXPandMaybeLevelUP level = new GetXPandMaybeLevelUP();
    AmplifierModifier modifier = new AmplifierModifier();


   // public LevelUpAngel(Magician magician){
     //   this.magician = magician;
      //  this.magician.addObserver(this);
    //}

    @Override
    public void visit(Knight player) {
        if (player.getDead() == 0) {

            player.setXp(helper.getLevelUpValue()
                + player.getLevel() * helper.getLevelUpPerLevelValue());
            level.xpLevelUp(player);

            float percent = (float) 0.1;
            modifier.knightAmplifierModification(player, percent);

        }
    }

    @Override
    public void visit(Pyromancer player) {
        if (player.getDead() == 0) {

            //player.setLevel(player.getLevel() + 1);

            player.setXp(helper.getLevelUpValue()
                    + player.getLevel() * helper.getLevelUpPerLevelValue());
            level.xpLevelUp(player);
            float percent = (float) 0.2;
            modifier. pyromancerAmplifierModification(player, percent);

        }
    }

    @Override
    public void visit(Rogue player) {
        if (player.getDead() == 0) {

            player.setXp(helper.getLevelUpValue()
                    + player.getLevel() * helper.getLevelUpPerLevelValue());
            level.xpLevelUp(player);
            float percent = (float) 0.15;
            modifier.rogueAmplifierModification(player, percent);

        }
    }

    @Override
    public void visit(Wizard player) {
        if (player.getDead() == 0) {
            player.setXp(helper.getLevelUpValue()
                    + player.getLevel() * helper.getLevelUpPerLevelValue());
            level.xpLevelUp(player);
            float percent = (float) 0.25;
            modifier.wizardAmplifierModification(player, percent);

        }
    }

    @Override
    public void update() {
        if(getActualPlayer().getDead() == 0) {
            System.out.println(getType() + " helped " +
                    getActualPlayer().getFullType() + " " + getActualPlayer().getId());
        }
    }
}
