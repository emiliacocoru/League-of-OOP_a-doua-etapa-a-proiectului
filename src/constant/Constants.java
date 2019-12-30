package constant;

public final class Constants {
    public Constants() {
    }
    // here are all the constants taken from the requirement
   /* private final  float fireBlastAmplifierPR = 0.8;
    private final  float fireBlastAmplifierPK = 1.2;
    private final  float fireBlastAmplifierPP = 0.9;
    private final  float fireBlastAmplifierPW = 1.05;

    private final  float igniteAmplifierPR = 0.8;
    private final  float igniteAmplifierPK = 1.2;
    private final  float igniteAmplifierPP = 0.9;
    private final  float igniteAmplifierPW = 1.05;

    private final  float executeAmplifierKR = 1.15;
    private final  float executeAmplifierKK = 1;
    private final  float executeAmplifierKP = 1.1;
    private final  float executeAmplifierKW = 0.8;

    private final  float slamAmplifierKR = 0.8;
    private final  float slamAmplifierKK = 1.2;
    private final  float slamAmplifierKP = 0.9;
    private final  float slamAmplifierKW = 1.05;

    private final  float drainAmplifierWR = 0.8;
    private final  float drainAmplifierWK = 1.2;
    private final  float drainAmplifierWP = 0.9;
    private final  float drainAmplifierWW = 1.05;

    private final  float deflectAmplifierWR = 1.2;
    private final  float deflectAmplifierWK = 1.4;
    private final  float deflectAmplifierWP = 1.3;

    private final  float backStabAmplifierRR = 1.2;
    private final  float backStabAmplifierRK = 0.9;
    private final  float backStabAmplifierRP = 1.25;
    private final  float backStabAmplifierRW = 1.25;

    private final  float paralysisAmplifierRR = 0.9;
    private final  float paralysisAmplifierRK = 0.8;
    private final  float paralysisAmplifierRP = 1.2;
    private final  float paralysisAmplifierRW = 1.25;*/

    private final int hpInitialKnight = 900;
    private final int hpInitialRogue = 600;
    private final int hpInitialPyromancer = 500;
    private final int hpInitialWizard = 400;

    private final int levelUpHPKnight = 80;
    private final int levelUpHPRoque =  40;
    private final int levelUpHpPyromancer = 50;
    private final int levelUpHpWizard = 30;
    private final int xpValue = 200;
    private final int xpPerLevelValue = 40;
    private final int levelUpValue = 250;
    private final int levelUpPerLevelValue = 50;

    private final float landAmplifierR = (float) 1.15;
    private final int numberOfRoundsWithoutAmplifier = 3;
    private final int numberOfRoundsWithAmplifier = 6;
    private final int hitsNumber = 3;
    private final float percentBonusRogue = (float) 1.5;

    private final int bachStabBaseDamage = 200;
    private final int bacKStabBaseDamagePerLevel = 20;

    private final int fireBlastBaseDamage = 350;
    private final int getFireBlastBaseDamagePerLevel = 50;

    private final float landAmplifierP = (float) 1.25;

    private final float landAmplifierW = (float) 1.1;

    private final float deflectPercent = (float) 0.35;
    private final float deflectPercentPerLevel = (float) 0.02;
    private final float deflectPercentMaxim = (float) 0.7;

    private  final float drainDamage = (float) 0.20;
    private final float drainDamagePerLevel = (float) 0.05;
    private final float drainPercent = (float) 0.3;

    private final float landAmplifierK = (float) 1.15;
    private final float executePercentPerLevel = (float) 0.01;
    private final float executePercent = (float) 0.2;
    private final float executeMaxPercent = (float) 0.4;

    private final int paralysisDamage = 40;
    private final int paralysisDamagePerLevel = 10;
    private final int executeDamage = 200;
    private final int executeDamagePerLevel = 30;
    private final int slamDamage = 100;
    private final int slamDamagePerLevel = 40;
    private final int igniteDamage = 150;
    private final int igniteDamagePerLevel = 20;
    private final int damageExtraPyromancer = 50;
    private final int damageExtraPyromancerPerLevel = 30;

    public int getDamageExtraPyromancer() {
        return damageExtraPyromancer;
    }

    public int getDamageExtraPyromancerPerLevel() {
        return damageExtraPyromancerPerLevel;
    }

    public int getIgniteDamage() {
        return igniteDamage;
    }

    public int getIgniteDamagePerLevel() {
        return igniteDamagePerLevel;
    }

    public int getSlamDamage() {
        return slamDamage;
    }

    public int getSlamDamagePerLevel() {
        return slamDamagePerLevel;
    }

    public int getExecuteDamage() {
        return executeDamage;
    }

    public int getExecuteDamagePerLevel() {
        return executeDamagePerLevel;
    }

    public int getParalysisDamage() {
        return paralysisDamage;
    }

    public int getParalysisDamagePerLevel() {
        return paralysisDamagePerLevel;
    }

    public float getExecutePercentPerLevel() {
        return executePercentPerLevel;
    }

    public float getExecutePercent() {
        return executePercent;
    }

    public float getExecuteMaxPercent() {
        return executeMaxPercent;
    }

    public float getLandAmplifierK() {
        return landAmplifierK;
    }

    public int getHpInitialKnight() {
        return hpInitialKnight;
    }

    public int getHpInitialRogue() {
        return hpInitialRogue;
    }

    public int getHpInitialPyromancer() {
        return hpInitialPyromancer;
    }

    public int getHpInitialWizard() {
        return hpInitialWizard;
    }

    public float getDrainPercent() {
        return drainPercent;
    }

    public float getDrainDamage() {
        return drainDamage;
    }

    public float getDrainDamagePerLevel() {
        return drainDamagePerLevel;
    }

    public float getDeflectPercentMaxim() {
        return deflectPercentMaxim;
    }

    public float getDeflectPercent() {
        return deflectPercent;
    }

    public float getDeflectPercentPerLevel() {
        return deflectPercentPerLevel;
    }

    public float getLandAmplifierW() {
        return landAmplifierW;
    }

    public float getLandAmplifierP() {
        return landAmplifierP;
    }

    public int getFireBlastBaseDamage() {
        return fireBlastBaseDamage;
    }

    public int getGetFireBlastBaseDamagePerLevel() {
        return getFireBlastBaseDamagePerLevel;
    }

    public int getBachStabBaseDamage() {
        return bachStabBaseDamage;
    }

    public int getBacKStabBaseDamagePerLevel() {
        return bacKStabBaseDamagePerLevel;
    }

    public float getPercentBonusRogue() {
        return percentBonusRogue;
    }

    public int getHitsNumber() {
        return hitsNumber;
    }

    public float getLandAmplifierR() {
        return landAmplifierR;
    }

    public int getNumberOfRoundsWithoutAmplifier() {
        return numberOfRoundsWithoutAmplifier;
    }

    public int getNumberOfRoundsWithAmplifier() {
        return numberOfRoundsWithAmplifier;
    }

    public int getXpPerLevelValue() {
        return xpPerLevelValue;
    }

    public int getLevelUpValue() {
        return levelUpValue;
    }

    public int getLevelUpPerLevelValue() {
        return levelUpPerLevelValue;
    }

    public int getXpValue() {
        return xpValue;
    }

    public int getLevelUpHPKnight() {
        return levelUpHPKnight;
    }

    public int getLevelUpHPRoque() {
        return levelUpHPRoque;
    }

    public int getLevelUpHpPyromancer() {
        return levelUpHpPyromancer;
    }

    public int getLevelUpHpWizard() {
        return levelUpHpWizard;
    }

}
