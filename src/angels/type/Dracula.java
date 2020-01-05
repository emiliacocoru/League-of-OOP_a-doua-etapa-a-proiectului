package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;
import gameplan.AmplifierModifier;

public final class Dracula extends Angel implements AngelVisitor {
    private AmplifierModifier modifier = new AmplifierModifier();
    @Override
    public void visit(final Knight player) {
        if (player.getDead() == 0) {
            // lowers the hp by 60
            // reduces damage by 20%
            final float damageDraculaKnight = (float) -0.2;
            final int damageHpDraculaKnight = 60;
            modifier.knightAmplifierModification(player, damageDraculaKnight);
            player.setHp(player.getHp() - damageHpDraculaKnight);

            if (getActualPlayer().getHp() < 0) {
                getActualPlayer().setDead(1);
                updateDEAD();
            }
        }
    }

    @Override
    public void visit(final Pyromancer player) {
        if (player.getDead() == 0) {
            // lowers the hp by 40
            // reduces damage by 30%
            final float damageDraculaPyromancer = (float) -0.3;
            final int damageHpDraculaPyromancer = 40;
            modifier.pyromancerAmplifierModification(player, damageDraculaPyromancer);
            player.setHp(player.getHp() - damageHpDraculaPyromancer);

            if (getActualPlayer().getHp() < 0) {
                getActualPlayer().setDead(1);
                updateDEAD();
            }
        }
    }

    @Override
    public void visit(final Rogue player) {
        if (player.getDead() == 0) {
            // lowers the hp by 35
            // reduces damage by 10%
            final float damageDraculaRogue = (float) -0.1;
            final int damageHpDraculaRogue = 35;
            modifier.rogueAmplifierModification(player, damageDraculaRogue);
            player.setHp(player.getHp() - damageHpDraculaRogue);

            if (getActualPlayer().getHp() < 0) {
                getActualPlayer().setDead(1);
                updateDEAD();
            }
        }
    }

    @Override
    public void visit(final Wizard player) {
        if (player.getDead() == 0) {
            // lowers the hp by 20
            // reduces damage by 40%
            final float damageDraculaWizard = (float) -0.4;
            final int damageHpDraculaWizard = 20;
            player.setHp(player.getHp() - damageHpDraculaWizard);
            modifier.wizardAmplifierModification(player, damageDraculaWizard);
            if (getActualPlayer().getHp() < 0) {
                getActualPlayer().setDead(1);
                updateDEAD();
            }
        }
    }

    @Override
    public void update() {
        if (getActualPlayer().getDead() == 0) {
            System.out.println(getType() + " hit " + getActualPlayer().getFullType()
                    + " " + getActualPlayer().getId());
        }
    }

    private void updateDEAD() {
        if (getActualPlayer().getDead() == 1) {
            System.out.println("Player " + getActualPlayer().getFullType()
                    + " " + getActualPlayer().getId() + " was killed by an angel");
        }
    }
}
