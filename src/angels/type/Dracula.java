package angels.type;

import angels.Angel;
import angels.AngelVisitor;
import magician.Magician;
import players.type.Knight;
import players.type.Pyromancer;
import players.type.Rogue;
import players.type.Wizard;
import strategy.AmplifierModifier;

public class Dracula extends Angel implements AngelVisitor {
    AmplifierModifier modifier = new AmplifierModifier();

    //public Dracula(Magician magician){
      //  this.magician = magician;
      //  this.magician.addObserver(this);
    //}


    @Override
    public void visit(Knight player) {
        if (player.getDead() == 0) {
            modifier.knightAmplifierModification(player, (float) -0.2);
            player.setHp(player.getHp() - 60);

            if (getActualPlayer().getHp() < 0) {
                getActualPlayer().setDead(1);
                updateDEAD();
            }
        }
    }

    @Override
    public void visit(Pyromancer player) {
        if (player.getDead() == 0) {
            modifier.pyromancerAmplifierModification(player, (float) -0.3);
            player.setHp(player.getHp() - 40);


            if (getActualPlayer().getHp() < 0) {
                getActualPlayer().setDead(1);
                updateDEAD();
            }
        }
    }

    @Override
    public void visit(Rogue player) {
        if (player.getDead() == 0) {
            modifier.rogueAmplifierModification(player, (float) - 0.1);
            player.setHp(player.getHp() - 35);


        if (getActualPlayer().getHp() < 0) {
            getActualPlayer().setDead(1);
            updateDEAD();
        }}
    }

    @Override
    public void visit(Wizard player) {
        if (player.getDead() == 0) {
            player.setHp(player.getHp() - 20);
            modifier.wizardAmplifierModification(player, (float) -0.4);


        if (getActualPlayer().getHp() < 0) {
            getActualPlayer().setDead(1);
            updateDEAD();
        }}
    }

    @Override
    public void update() {
        if (getActualPlayer().getDead() == 0) {
            System.out.println(getType() + " hit " + getActualPlayer().getFullType() + " " + getActualPlayer().getId());
        }
    }
    public void updateDEAD(){
        if(getActualPlayer().getDead() == 1){

                System.out.println("Player " + getActualPlayer().getFullType() + " " + getActualPlayer().getId() + " was killed by an angel");
            }
        }

}
