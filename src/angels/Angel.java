package angels;

import players.Player;

public class Angel {
    private String type;
    private int linePosition;
    private int columnPosition;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLinePosition() {
        return linePosition;
    }

    public void setLinePosition(int linePosition) {
        this.linePosition = linePosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }


    public void  knightAmplifierModification(final Player player, double percent) {
        player.setExecuteAmplifierKP(player.getExecuteAmplifierKP() + percent);
        player.setExecuteAmplifierKR(player.getExecuteAmplifierKR() + percent);
        player.setExecuteAmplifierKW(player.getExecuteAmplifierKW() + percent);

        player.setSlamAmplifierKK(player.getSlamAmplifierKK() + percent);
        player.setSlamAmplifierKR(player.getSlamAmplifierKR() + percent);
        player.setSlamAmplifierKP(player.getSlamAmplifierKP() + percent);
        player.setSlamAmplifierKW(player.getSlamAmplifierKW() + percent);
    }

    public void pyromancerAmplifierModification(final Player player, double percent) {
        player.setFireBlastAmplifierPK(player.getFireBlastAmplifierPK() + percent);
        player.setFireBlastAmplifierPP(player.getFireBlastAmplifierPP() + percent);
        player.setFireBlastAmplifierPR(player.getFireBlastAmplifierPR() + percent);
        player.setFireBlastAmplifierPW(player.getFireBlastAmplifierPW() + percent);

        player.setIgniteAmplifierPK(player.getIgniteAmplifierPK() + percent);
        player.setIgniteAmplifierPP(player.getIgniteAmplifierPP() + percent);
        player.setIgniteAmplifierPR(player.getIgniteAmplifierPR() + percent);
        player.setIgniteAmplifierPW(player.getIgniteAmplifierPW() + percent);
    }
    public void rogueAmplifierModification(final Player player, double percent){
        player.setBackStabAmplifierRK(player.getBackStabAmplifierRK() + percent);
        player.setBackStabAmplifierRP(player.getBackStabAmplifierRP() + percent);
        player.setBackStabAmplifierRR(player.getBackStabAmplifierRR() + percent);
        player.setBackStabAmplifierRW(player.getBackStabAmplifierRW() + percent);

        player.setParalysisAmplifierRK(player.getParalysisAmplifierRK() + percent);
        player.setParalysisAmplifierRP(player.getParalysisAmplifierRP() + percent);
        player.setParalysisAmplifierRR(player.getParalysisAmplifierRR() + percent);
        player.setParalysisAmplifierRW(player.getParalysisAmplifierRW() + percent);
    }

    public void wizardAmplifierModification(final Player player, double percent){
        player.setDrainAmplifierWK(player.getDrainAmplifierWK() + percent);
        player.setDrainAmplifierWP(player.getDrainAmplifierWP() + percent);
        player.setDrainAmplifierWR(player.getDrainAmplifierWR() + percent);
        player.setDrainAmplifierWW(player.getDrainAmplifierWW() + percent);

        player.setDeflectAmplifierWK(player.getDeflectAmplifierWK() + percent);
        player.setDeflectAmplifierWP(player.getDeflectAmplifierWP() + percent);
        player.setDeflectAmplifierWR(player.getDeflectAmplifierWR() + percent);
    }

}
