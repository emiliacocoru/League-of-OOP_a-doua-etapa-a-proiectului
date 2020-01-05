package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;
import gameplan.AmplifierModifier;

public final class GoodBoy extends Angel implements AngelVisitor {
    private AmplifierModifier modifier = new AmplifierModifier();
    @Override
    public void visit(final Knight player) {
        if (player.getDead() == 0) {
            // increases damage by 40%
            // increase the hp by 20
            final float amplifierGoodBoyKnight = (float) 0.4;
            final int amplifierHpGoodBoyKnight = 20;
            modifier.knightAmplifierModification(player, amplifierGoodBoyKnight);
            player.setHp(player.getHp() + amplifierHpGoodBoyKnight);
        }
    }

    @Override
    public void visit(final Pyromancer player) {
        if (player.getDead() == 0) {
            // increases damage by 50%
            // increase the hp by 30
            final float amplifierGoodBoyPyromancer = (float) 0.5;
            final int amplifierHpGoodBoyPyromancer = 30;
            modifier.pyromancerAmplifierModification(player, amplifierGoodBoyPyromancer);
            player.setHp(player.getHp() + amplifierHpGoodBoyPyromancer);
        }
    }

    @Override
    public void visit(final Rogue player) {
        if (player.getDead() == 0) {
            // increases damage by 40%
            // increase the hp by 40
            final float amplifierGoodBoyRogue = (float) 0.4;
            final int amplifierHpGoodBoyRogue = 40;
            modifier.rogueAmplifierModification(player, amplifierGoodBoyRogue);
            player.setHp(player.getHp() + amplifierHpGoodBoyRogue);
        }
    }

    @Override
    public void visit(final Wizard player) {
        if (player.getDead() == 0) {
            // increases damage by 30%
            // increase the hp by 50
            final float amplifierGoodBoyWizard = (float) 0.3;
            final int amplifierHpGoodBoyWizard = 50;
            modifier.wizardAmplifierModification(player, amplifierGoodBoyWizard);
            player.setHp(player.getHp() + amplifierHpGoodBoyWizard);
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
