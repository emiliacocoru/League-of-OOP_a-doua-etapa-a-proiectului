package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;
import strategy.AmplifierModifier;

public final class SmallAngel extends Angel implements AngelVisitor {
    private AmplifierModifier modifier = new AmplifierModifier();
    @Override
    public void visit(final Knight player) {
        if (player.getDead() == 0) {
            final int giveHpSmallAngelKnight = 10;
            final float amplifierSmallAngelKnight = (float) 0.1;
            modifier.knightAmplifierModification(player, amplifierSmallAngelKnight);
            player.setHp(player.getHp() + giveHpSmallAngelKnight);
        }
    }

    @Override
    public void visit(final Pyromancer player) {
        if (player.getDead() == 0) {
            final int giveHpSmallAngelPyromancer = 15;
            final float amplifierSmallAngelPyromancer = (float) 0.15;
            modifier.pyromancerAmplifierModification(player, amplifierSmallAngelPyromancer);
            player.setHp(player.getHp() + giveHpSmallAngelPyromancer);
        }
    }

    @Override
    public void visit(final Rogue player) {
        if (player.getDead() == 0) {
            final int giveHpSmallAngelRogue = 20;
            final float amplifierSmallAngelRogue = (float) 0.05;
            modifier.rogueAmplifierModification(player, amplifierSmallAngelRogue);
            player.setHp(player.getHp() + giveHpSmallAngelRogue);
        }
    }

    @Override
    public void visit(final Wizard player) {
        if (player.getDead() == 0) {
            final int giveHpSmallAngelWizard = 25;
            final float amplifierSmallAngelWizard = (float) 0.1;
            modifier.wizardAmplifierModification(player, amplifierSmallAngelWizard);
            player.setHp(player.getHp() + giveHpSmallAngelWizard);
        }
    }

    @Override
    public void update() {
        if (getActualPlayer().getDead() == 0) {
            System.out.println(getType() + " helped " + getActualPlayer().getFullType() + " "
                    + getActualPlayer().getId());
        }
    }
}
