package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;

public final class Spawner extends Angel implements AngelVisitor {
    // spawner brings a player to life and sets his hp to a certain value
    @Override
    public void visit(final Knight player) {
        if (player.getDead() == 1) {
            final int giveHpSpawnerKnight = 200;
            player.setDead(0);
            player.setHp(giveHpSpawnerKnight);
        }
    }

    @Override
    public void visit(final Pyromancer player) {
        if (player.getDead() == 1) {
            final int giveHpSpawnerPyromancer = 150;
            player.setDead(0);
            player.setHp(giveHpSpawnerPyromancer);
        }
    }

    @Override
    public void visit(final Rogue player) {
        if (player.getDead() == 1) {
            final int giveHpSpawnerRogue = 180;
            player.setDead(0);
            player.setHp(giveHpSpawnerRogue);
        }
    }

    @Override
    public void visit(final Wizard player) {
        if (player.getDead() == 1) {
            final int giveHpSpawnerWizard = 120;
            player.setDead(0);
            player.setHp(giveHpSpawnerWizard);
        }
    }

    @Override
    public void update() {
        if (getActualPlayer().getDead() == 1) {
            System.out.println(getType() + " helped " + getActualPlayer().getFullType() + " "
                    + getActualPlayer().getId());
            System.out.println("Player " + getActualPlayer().getFullType() + " "
                    + getActualPlayer().getId()
                    + " was brought to life by an angel ");
        }
    }
}
