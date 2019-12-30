package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import gameplan.GetXPandMaybeLevelUP;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;
import strategy.AmplifierModifier;

public final class LevelUpAngel extends Angel implements AngelVisitor {
    private GetXPandMaybeLevelUP level = new GetXPandMaybeLevelUP();
    private AmplifierModifier modifier = new AmplifierModifier();
    private final int levelUpValue = 250;
    private final int levelUpPerLevelValue = 50;
    @Override
    public void visit(final Knight player) {
        final int xpValue = 200;
        final int xpPerLevelValue = 40;
        if (player.getDead() == 0) {

            player.setXp(levelUpValue
                    + player.getLevel() * levelUpPerLevelValue);
            level.xpLevelUp(player);
            final float levelUpAngelKnight = (float) 0.1;
            modifier.knightAmplifierModification(player, levelUpAngelKnight);

        }
    }

    @Override
    public void visit(final Pyromancer player) {
        if (player.getDead() == 0) {
            player.setXp(levelUpValue
                    + player.getLevel() * levelUpPerLevelValue);
            level.xpLevelUp(player);
            final float levelUpAngelPyromancer = (float) 0.2;
            modifier.pyromancerAmplifierModification(player, levelUpAngelPyromancer);

        }
    }

    @Override
    public void visit(final Rogue player) {
        if (player.getDead() == 0) {
            player.setXp(levelUpValue
                    + player.getLevel() * levelUpPerLevelValue);
            level.xpLevelUp(player);
            final float levelUpAngelRogue = (float) 0.15;
            modifier.rogueAmplifierModification(player, levelUpAngelRogue);

        }
    }

    @Override
    public void visit(final Wizard player) {
        if (player.getDead() == 0) {
            player.setXp(levelUpValue
                    + player.getLevel() * levelUpPerLevelValue);
            level.xpLevelUp(player);
            final float levelUpAngelWizard = (float) 0.25;
            modifier.wizardAmplifierModification(player, levelUpAngelWizard);

        }
    }

    @Override
    public void update() {
        if (getActualPlayer().getDead() == 0) {
            System.out.println(getType() + " helped "
                    + getActualPlayer().getFullType() + " " + getActualPlayer().getId());
        }
    }
}
