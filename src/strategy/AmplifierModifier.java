package strategy;

import players.Player;

public final class AmplifierModifier {
    public void  knightAmplifierModification(final Player player, final float percent) {
        player.setExecuteAmplifierKP(player.getExecuteAmplifierKP() + percent);
        player.setExecuteAmplifierKR(player.getExecuteAmplifierKR() + percent);
        player.setExecuteAmplifierKW(player.getExecuteAmplifierKW() + percent);

        player.setSlamAmplifierKK(player.getSlamAmplifierKK() + percent);
        player.setSlamAmplifierKR(player.getSlamAmplifierKR() + percent);
        player.setSlamAmplifierKP(player.getSlamAmplifierKP() + percent);
        player.setSlamAmplifierKW(player.getSlamAmplifierKW() + percent);
    }

    public void pyromancerAmplifierModification(final Player player, final float percent) {
        player.setFireBlastAmplifierPK(player.getFireBlastAmplifierPK() + percent);
        player.setFireBlastAmplifierPP(player.getFireBlastAmplifierPP() + percent);
        player.setFireBlastAmplifierPR(player.getFireBlastAmplifierPR() + percent);
        player.setFireBlastAmplifierPW(player.getFireBlastAmplifierPW() + percent);

        player.setIgniteAmplifierPK(player.getIgniteAmplifierPK() + percent);
        player.setIgniteAmplifierPP(player.getIgniteAmplifierPP() + percent);
        player.setIgniteAmplifierPR(player.getIgniteAmplifierPR() + percent);
        player.setIgniteAmplifierPW(player.getIgniteAmplifierPW() + percent);
    }
    public void rogueAmplifierModification(final Player player, final float percent) {
        player.setBackStabAmplifierRK(player.getBackStabAmplifierRK() + percent);
        player.setBackStabAmplifierRP(player.getBackStabAmplifierRP() + percent);
        player.setBackStabAmplifierRR(player.getBackStabAmplifierRR() + percent);
        player.setBackStabAmplifierRW(player.getBackStabAmplifierRW() + percent);

        player.setParalysisAmplifierRK(player.getParalysisAmplifierRK() + percent);
        player.setParalysisAmplifierRP(player.getParalysisAmplifierRP() + percent);
        player.setParalysisAmplifierRR(player.getParalysisAmplifierRR() + percent);
        player.setParalysisAmplifierRW(player.getParalysisAmplifierRW() + percent);
    }

    public void wizardAmplifierModification(final Player player, final float percent) {
        player.setDrainAmplifierWK(player.getDrainAmplifierWK() + percent);
        player.setDrainAmplifierWP(player.getDrainAmplifierWP() + percent);
        player.setDrainAmplifierWR(player.getDrainAmplifierWR() + percent);
        player.setDrainAmplifierWW(player.getDrainAmplifierWW() + percent);

        player.setDeflectAmplifierWK(player.getDeflectAmplifierWK() + percent);
        player.setDeflectAmplifierWP(player.getDeflectAmplifierWP() + percent);
        player.setDeflectAmplifierWR(player.getDeflectAmplifierWR() + percent);
    }
}
