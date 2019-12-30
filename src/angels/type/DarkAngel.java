package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;

public final class DarkAngel extends Angel implements AngelVisitor {
    @Override
    public void visit(final Knight player) {
        if (player.getDead() == 0) {
            final int damageDarkAngelKnight = 40;
            player.setHp(player.getHp() - damageDarkAngelKnight);
            if (player.getHp() < 0) {
                player.setDead(1);
            }
        }
    }

    @Override
    public void visit(final Pyromancer player) {
        if (player.getDead() == 0) {
            final int damageDarkAngelPyromancer = 30;
            player.setHp(player.getHp() - damageDarkAngelPyromancer);
            if (player.getHp() < 0) {
                player.setDead(1);
            }
        }
    }

    @Override
    public void visit(final Rogue player) {
        if (player.getDead() == 0) {
            final int damageDarkAngelRogue = 10;
            player.setHp(player.getHp() - damageDarkAngelRogue);
            if (player.getHp() < 0) {
                player.setDead(1);
            }
        }
    }

    @Override
    public void visit(final Wizard player) {
        if (player.getDead() == 0) {
            final int damageDarkAngelWizard = 20;
            player.setHp(player.getHp() - damageDarkAngelWizard);
            if (player.getHp() < 0) {
                player.setDead(1);
            }
        }
    }

    @Override
    public void update() {
        if (getActualPlayer().getDead() == 0) {
            System.out.println(getType() + " hit "
                    + getActualPlayer().getFullType() + " " + getActualPlayer().getId());
        }
    }
}
