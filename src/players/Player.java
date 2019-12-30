package players;

import angels.AngelVisitor;
import players.visitor.PlayerVisitor;

public abstract class Player {
    private int id;
    private char type;
    private String fullType;
    private int hp;
    private int xp = 0;
    private int level = 0;
    private int maxHP;
    // depending on the level, maxHP is the greatest hp a player can have
    private int lineMap;
    private int columnMap;
    // lineMap and columnMap are the coordinates of the player
    private int damageExtra = 0;
    private int extraRounds = 0;
    // damageExtra and extraRounds are for overtime damage
    private int damageThisRound = 0;
    // damageThisRound = all the damage a player receive
    // with land amplifier, bonus damage, race amplifier and so on
    private float receivedDamageWRA = 0;
    // receivedDamage = the damage a player receive without race amplifier
    private int incapacityOfMovement = 0;
    private int wasFighting = 0;
    private int dead = 0;
    // dead = 0 --> the player is still in the game
    // dead = 1 --> the player was eliminated

    public Player(final char type) {
        this.type = type;
    }

    public Player() {

    }
    public abstract void accept(PlayerVisitor player);
    public abstract void accept(AngelVisitor angel);
    public final void poisonDamage(final Player player) {
        if (player.getExtraRounds() > 0) {
            player.setHp(player.getHp() - player.getDamageExtra());
            player.setExtraRounds(player.getExtraRounds() - 1);
        }
    }
    private  float fireBlastAmplifierPR = (float) 0.8;
    private  float fireBlastAmplifierPK = (float) 1.2;
    private  float fireBlastAmplifierPP = (float) 0.9;
    private  float fireBlastAmplifierPW = (float) 1.05;

    private  float igniteAmplifierPR = (float) 0.8;
    private  float igniteAmplifierPK = (float) 1.2;
    private  float igniteAmplifierPP = (float) 0.9;
    private  float igniteAmplifierPW = (float) 1.05;

    private  float executeAmplifierKR = (float) 1.15;
    private  float executeAmplifierKK = 1;
    private  float executeAmplifierKP = (float) 1.1;
    private  float executeAmplifierKW = (float) 0.8;

    private  float slamAmplifierKR = (float) 0.8;
    private  float slamAmplifierKK = (float) 1.2;
    private  float slamAmplifierKP = (float) 0.9;
    private  float slamAmplifierKW = (float) 1.05;

    private  float drainAmplifierWR = (float) 0.8;
    private  float drainAmplifierWK = (float) 1.2;
    private  float drainAmplifierWP = (float) 0.9;
    private  float drainAmplifierWW = (float) 1.05;

    private  float deflectAmplifierWR = (float) 1.2;
    private  float deflectAmplifierWK = (float) 1.4;
    private  float deflectAmplifierWP = (float) 1.3;

    private  float backStabAmplifierRR = (float) 1.2;
    private  float backStabAmplifierRK = (float) 0.9;
    private  float backStabAmplifierRP = (float) 1.25;
    private  float backStabAmplifierRW = (float) 1.25;

    private  float paralysisAmplifierRR = (float) 0.9;
    private  float paralysisAmplifierRK = (float) 0.8;
    private  float paralysisAmplifierRP = (float) 1.2;
    private  float paralysisAmplifierRW = (float) 1.25;

    public String getFullType() {
        return fullType;
    }

    public void setFullType(String fullType) {
        this.fullType = fullType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getFireBlastAmplifierPR() {
        return fireBlastAmplifierPR;
    }

    public void setFireBlastAmplifierPR(float fireBlastAmplifierPR) {
        this.fireBlastAmplifierPR = fireBlastAmplifierPR;
    }

    public float getFireBlastAmplifierPK() {
        return fireBlastAmplifierPK;
    }

    public void setFireBlastAmplifierPK(float fireBlastAmplifierPK) {
        this.fireBlastAmplifierPK = fireBlastAmplifierPK;
    }

    public float getFireBlastAmplifierPP() {
        return fireBlastAmplifierPP;
    }

    public void setFireBlastAmplifierPP(float fireBlastAmplifierPP) {
        this.fireBlastAmplifierPP = fireBlastAmplifierPP;
    }

    public float getFireBlastAmplifierPW() {
        return fireBlastAmplifierPW;
    }

    public void setFireBlastAmplifierPW(float fireBlastAmplifierPW) {
        this.fireBlastAmplifierPW = fireBlastAmplifierPW;
    }

    public float getIgniteAmplifierPR() {
        return igniteAmplifierPR;
    }

    public void setIgniteAmplifierPR(float igniteAmplifierPR) {
        this.igniteAmplifierPR = igniteAmplifierPR;
    }

    public float getIgniteAmplifierPK() {
        return igniteAmplifierPK;
    }

    public void setIgniteAmplifierPK(float igniteAmplifierPK) {
        this.igniteAmplifierPK = igniteAmplifierPK;
    }

    public float getIgniteAmplifierPP() {
        return igniteAmplifierPP;
    }

    public void setIgniteAmplifierPP(float igniteAmplifierPP) {
        this.igniteAmplifierPP = igniteAmplifierPP;
    }

    public float getIgniteAmplifierPW() {
        return igniteAmplifierPW;
    }

    public void setIgniteAmplifierPW(float igniteAmplifierPW) {
        this.igniteAmplifierPW = igniteAmplifierPW;
    }

    public float getExecuteAmplifierKR() {
        return executeAmplifierKR;
    }

    public void setExecuteAmplifierKR(float executeAmplifierKR) {
        this.executeAmplifierKR = executeAmplifierKR;
    }

    public float getExecuteAmplifierKK() {
        return executeAmplifierKK;
    }

    public void setExecuteAmplifierKK(float executeAmplifierKK) {
        this.executeAmplifierKK = executeAmplifierKK;
    }

    public float getExecuteAmplifierKP() {
        return executeAmplifierKP;
    }

    public void setExecuteAmplifierKP(float executeAmplifierKP) {
        this.executeAmplifierKP = executeAmplifierKP;
    }

    public float getExecuteAmplifierKW() {
        return executeAmplifierKW;
    }

    public void setExecuteAmplifierKW(float executeAmplifierKW) {
        this.executeAmplifierKW = executeAmplifierKW;
    }

    public float getSlamAmplifierKR() {
        return slamAmplifierKR;
    }

    public void setSlamAmplifierKR(float slamAmplifierKR) {
        this.slamAmplifierKR = slamAmplifierKR;
    }

    public float getSlamAmplifierKK() {
        return slamAmplifierKK;
    }

    public void setSlamAmplifierKK(float slamAmplifierKK) {
        this.slamAmplifierKK = slamAmplifierKK;
    }

    public float getSlamAmplifierKP() {
        return slamAmplifierKP;
    }

    public void setSlamAmplifierKP(float slamAmplifierKP) {
        this.slamAmplifierKP = slamAmplifierKP;
    }

    public float getSlamAmplifierKW() {
        return slamAmplifierKW;
    }

    public void setSlamAmplifierKW(float slamAmplifierKW) {
        this.slamAmplifierKW = slamAmplifierKW;
    }

    public float getDrainAmplifierWR() {
        return drainAmplifierWR;
    }

    public void setDrainAmplifierWR(float drainAmplifierWR) {
        this.drainAmplifierWR = drainAmplifierWR;
    }

    public float getDrainAmplifierWK() {
        return drainAmplifierWK;
    }

    public void setDrainAmplifierWK(float drainAmplifierWK) {
        this.drainAmplifierWK = drainAmplifierWK;
    }

    public float getDrainAmplifierWP() {
        return drainAmplifierWP;
    }

    public void setDrainAmplifierWP(float drainAmplifierWP) {
        this.drainAmplifierWP = drainAmplifierWP;
    }

    public float getDrainAmplifierWW() {
        return drainAmplifierWW;
    }

    public void setDrainAmplifierWW(float drainAmplifierWW) {
        this.drainAmplifierWW = drainAmplifierWW;
    }

    public float getDeflectAmplifierWR() {
        return deflectAmplifierWR;
    }

    public void setDeflectAmplifierWR(float deflectAmplifierWR) {
        this.deflectAmplifierWR = deflectAmplifierWR;
    }

    public float getDeflectAmplifierWK() {
        return deflectAmplifierWK;
    }

    public void setDeflectAmplifierWK(float deflectAmplifierWK) {
        this.deflectAmplifierWK = deflectAmplifierWK;
    }

    public float getDeflectAmplifierWP() {
        return deflectAmplifierWP;
    }

    public void setDeflectAmplifierWP(float deflectAmplifierWP) {
        this.deflectAmplifierWP = deflectAmplifierWP;
    }

    public float getBackStabAmplifierRR() {
        return backStabAmplifierRR;
    }

    public void setBackStabAmplifierRR(float backStabAmplifierRR) {
        this.backStabAmplifierRR = backStabAmplifierRR;
    }

    public float getBackStabAmplifierRK() {
        return backStabAmplifierRK;
    }

    public void setBackStabAmplifierRK(float backStabAmplifierRK) {
        this.backStabAmplifierRK = backStabAmplifierRK;
    }

    public float getBackStabAmplifierRP() {
        return backStabAmplifierRP;
    }

    public void setBackStabAmplifierRP(float backStabAmplifierRP) {
        this.backStabAmplifierRP = backStabAmplifierRP;
    }

    public float getBackStabAmplifierRW() {
        return backStabAmplifierRW;
    }

    public void setBackStabAmplifierRW(float backStabAmplifierRW) {
        this.backStabAmplifierRW = backStabAmplifierRW;
    }

    public float getParalysisAmplifierRR() {
        return paralysisAmplifierRR;
    }

    public void setParalysisAmplifierRR(float paralysisAmplifierRR) {
        this.paralysisAmplifierRR = paralysisAmplifierRR;
    }

    public float getParalysisAmplifierRK() {
        return paralysisAmplifierRK;
    }

    public void setParalysisAmplifierRK(float paralysisAmplifierRK) {
        this.paralysisAmplifierRK = paralysisAmplifierRK;
    }

    public float getParalysisAmplifierRP() {
        return paralysisAmplifierRP;
    }

    public void setParalysisAmplifierRP(float paralysisAmplifierRP) {
        this.paralysisAmplifierRP = paralysisAmplifierRP;
    }

    public float getParalysisAmplifierRW() {
        return paralysisAmplifierRW;
    }

    public void setParalysisAmplifierRW(float paralysisAmplifierRW) {
        this.paralysisAmplifierRW = paralysisAmplifierRW;
    }
    public final char getType() {
        return type;
    }

    public final int getHp() {
        return hp;
    }

    public final void setHp(final int hp) {
        this.hp = hp;
    }

    public final void setType(final char type) {
        this.type = type;
    }

    public final int getLineMap() {
        return lineMap;
    }

    public final int getColumnMap() {
        return columnMap;
    }

    public final void setLineMap(final int lineMap) {
        this.lineMap = lineMap;
    }

    public final void setColumnMap(final int columnMap) {
        this.columnMap = columnMap;
    }

    public final int getXp() {
        return xp;
    }

    public final void setXp(final int xp) {
        this.xp = xp;
    }

    public final int getLevel() {
        return level;
    }

    public final void setLevel(final int level) {
        this.level = level;
    }

    public final int getMaxHP() {
        return maxHP;
    }

    public final void setMaxHP(final int maxHP) {
        this.maxHP = maxHP;
    }


    public final int getDamageExtra() {
        return damageExtra;
    }

    public final void setDamageExtra(final int damageExtra) {
        this.damageExtra = damageExtra;
    }

    public final int getExtraRounds() {
        return extraRounds;
    }

    public final void setExtraRounds(final int extraRounds) {
        this.extraRounds = extraRounds;
    }

    public final  int getDamageThisRound() {
        return damageThisRound;
    }

    public final void setDamageThisRound(final int damageThisRound) {
        this.damageThisRound = damageThisRound;
    }

    public final float getReceivedDamageWRA() {
        return receivedDamageWRA;
    }

    public final void setReceivedDamageWRA(final float receivedDamageWRA) {
        this.receivedDamageWRA = receivedDamageWRA;
    }

    public final int getIncapacityOfMovement() {
        return incapacityOfMovement;
    }

    public final void setIncapacityOfMovement(final int incapacityOfMovement) {
        this.incapacityOfMovement = incapacityOfMovement;
    }

    public final int getWasFighting() {
        return wasFighting;
    }

    public final void setWasFighting(final int wasFighting) {
        this.wasFighting = wasFighting;
    }

    public final int getDead() {
        return dead;
    }

    public final void setDead(final int dead) {
        this.dead = dead;
    }
}
