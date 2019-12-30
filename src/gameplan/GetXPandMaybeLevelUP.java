package gameplan;

import players.Player;

public final class GetXPandMaybeLevelUP {
    /* when a player win
       he receives xp according to the formula below */
    void getXP(final Player winner, final Player loser) {
        final int xpValue = 200;
        final int xpPerLevelValue = 40;
        winner.setXp(winner.getXp() + max(xpValue
                 - ((winner.getLevel() - loser.getLevel()) * xpPerLevelValue)));
    }

    private int max(final int y) {
        return Math.max(0, y);
    }
    // if his xp exceeds certain limits, he will advance in level
    public void xpLevelUp(final Player winner) {
        final int levelUpHPKnight = 80;
        final int levelUpHPRoque =  40;
        final int levelUpHpPyromancer = 50;
        final int levelUpHpWizard = 30;
        final int levelUpValue = 250;
        final int levelUpPerLevelValue = 50;
        while (winner.getXp() >= levelUpValue
                + winner.getLevel() * levelUpPerLevelValue) {
            winner.setLevel(winner.getLevel() + 1);
            if (winner.getType() == 'K') {
                winner.setHp(winner.getMaxHP() + levelUpHPKnight);
                winner.setMaxHP(winner.getHp());
                System.out.println(winner.getFullType() + " " + winner.getId() + " reached level "
                        + winner.getLevel());
            }
            if (winner.getType() == 'P') {
                winner.setHp(winner.getMaxHP() + levelUpHpPyromancer);
                winner.setMaxHP(winner.getHp());
                System.out.println(winner.getFullType() + " " + winner.getId() + " reached level "
                        + winner.getLevel());
            }
            if (winner.getType() == 'R') {
                winner.setHp(winner.getMaxHP() + levelUpHPRoque);
                winner.setMaxHP(winner.getHp());
                System.out.println(winner.getFullType() + " " + winner.getId() + " reached level "
                        + winner.getLevel());
            }
            if (winner.getType() == 'W') {
                winner.setHp(winner.getMaxHP() + levelUpHpWizard);
                winner.setMaxHP(winner.getHp());
                System.out.println(winner.getFullType() + " " + winner.getId() + " reached level "
                        + winner.getLevel());
            }
        }
    }
}
