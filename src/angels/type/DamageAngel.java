package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;
import gameplan.AmplifierModifier;

public final class DamageAngel extends Angel implements AngelVisitor {
    private AmplifierModifier modifier = new AmplifierModifier();
    @Override
    public void visit(final Knight player) {
        // boosts damage by 15%
        if (player.getDead() == 0) {
            final float amplifierDamageAngelKnight = (float) 0.15;
            modifier.knightAmplifierModification(player, amplifierDamageAngelKnight);
        }
    }

    @Override
    public void visit(final Pyromancer player) {
        // boosts damage by 20%
        if (player.getDead() == 0) {
            final float amplifierDamageAngelPyromancer = (float) 0.2;
            modifier.pyromancerAmplifierModification(player, amplifierDamageAngelPyromancer);
        }
    }

    @Override
    public void visit(final Rogue player) {
        // boosts damage by 30%
        if (player.getDead() == 0) {
            final float amplifierDamageAngelRogue = (float) 0.3;
            modifier.rogueAmplifierModification(player, amplifierDamageAngelRogue);
        }
    }

    @Override
    public void visit(final Wizard player) {
        // boosts damage by 40%
        if (player.getDead() == 0) {
            final float amplifierDamageAngelWizard = (float) 0.40;
            modifier.wizardAmplifierModification(player, amplifierDamageAngelWizard);
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
