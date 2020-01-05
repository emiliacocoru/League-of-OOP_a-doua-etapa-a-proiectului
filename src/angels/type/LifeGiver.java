package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;
import gameplan.AmplifierModifier;

public final class LifeGiver extends Angel implements AngelVisitor {
    private AmplifierModifier modifier = new AmplifierModifier();
    @Override
    public void visit(final Knight player) {
        if (player.getDead() == 0) {
            // increase the hp by 100
            final int giveHpLifeGiverKnight = 100;
            player.setHp(Math.min(player.getHp() + giveHpLifeGiverKnight, player.getMaxHP()));
        }
    }

    @Override
    public void visit(final Pyromancer player) {
        if (player.getDead() == 0) {
            // increase the hp by 80
            final int giveHpLifeGiverPyromancer = 80;
            player.setHp(Math.min(player.getHp() + giveHpLifeGiverPyromancer, player.getMaxHP()));
        }
    }

    @Override
    public void visit(final Rogue player) {
        if (player.getDead() == 0) {
            // increase the hp by 90
            final int giveHpLifeGiverRogue = 90;
            player.setHp(Math.min(player.getHp() + giveHpLifeGiverRogue, player.getMaxHP()));
        }
    }

    @Override
    public void visit(final Wizard player) {
        if (player.getDead() == 0) {
            // increase the hp by 120
            final int giveHpLifeGiverWizard = 120;
            player.setHp(Math.min(player.getHp() + giveHpLifeGiverWizard, player.getMaxHP()));
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
