package players;

import angels.AngelVisitor;
import magician.PlayerObservable;
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

    public final int getIncapacityOfMovementThisRound() {
        return incapacityOfMovementThisRound;
    }

    public final void setIncapacityOfMovementThisRound(final int incapacityOfMovementThisRound) {
        this.incapacityOfMovementThisRound = incapacityOfMovementThisRound;
    }

    private int incapacityOfMovementThisRound = 0;
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
    private final float startFireBlastAmplifierPR = (float) 0.8;
    private final float startFireBlastAmplifierPK = (float) 1.2;
    private final float startFireBlastAmplifierPP = (float) 0.9;
    private final float startFireBlastAmplifierPW = (float) 1.05;

    private final float startIgniteAmplifierPR = (float) 0.8;
    private final float startIgniteAmplifierPK = (float) 1.2;
    private final float startIgniteAmplifierPP = (float) 0.9;
    private final float startIgniteAmplifierPW = (float) 1.05;

    private final float startExecuteAmplifierKR = (float) 1.15;
    private final float startExecuteAmplifierKK = 1;
    private final float startExecuteAmplifierKP = (float) 1.1;
    private final float startExecuteAmplifierKW = (float) 0.8;

    private final float startSlamAmplifierKR = (float) 0.8;
    private final float startSlamAmplifierKK = (float) 1.2;
    private final float startSlamAmplifierKP = (float) 0.9;
    private final float startSlamAmplifierKW = (float) 1.05;

    private final float startDrainAmplifierWR = (float) 0.8;
    private final float startDrainAmplifierWK = (float) 1.2;
    private final float startDrainAmplifierWP = (float) 0.9;
    private final float startDrainAmplifierWW = (float) 1.05;

    private final float startDeflectAmplifierWR = (float) 1.2;
    private final float startDeflectAmplifierWK = (float) 1.4;
    private final float startDeflectAmplifierWP = (float) 1.3;

    private final float startBackStabAmplifierRR = (float) 1.2;
    private final float startBackStabAmplifierRK = (float) 0.9;
    private final float startBackStabAmplifierRP = (float) 1.25;
    private final float startBackStabAmplifierRW = (float) 1.25;

    private final float startParalysisAmplifierRR = (float) 0.9;
    private final float startParalysisAmplifierRK = (float) 0.8;
    private final float startParalysisAmplifierRP = (float) 1.2;
    private final float startParalysisAmplifierRW = (float) 1.25;

    private  float fireBlastAmplifierPR = startFireBlastAmplifierPR;
    private  float fireBlastAmplifierPK = startFireBlastAmplifierPK;
    private  float fireBlastAmplifierPP = startFireBlastAmplifierPP;
    private  float fireBlastAmplifierPW = startFireBlastAmplifierPW;

    private  float igniteAmplifierPR = startIgniteAmplifierPR;
    private  float igniteAmplifierPK = startIgniteAmplifierPK;
    private  float igniteAmplifierPP = startIgniteAmplifierPP;
    private  float igniteAmplifierPW = startIgniteAmplifierPW;

    private  float executeAmplifierKR = startExecuteAmplifierKR;
    private  float executeAmplifierKK = startExecuteAmplifierKK;
    private  float executeAmplifierKP = startExecuteAmplifierKP;
    private  float executeAmplifierKW = startExecuteAmplifierKW;

    private  float slamAmplifierKR = startSlamAmplifierKR;
    private  float slamAmplifierKK = startSlamAmplifierKK;
    private  float slamAmplifierKP = startSlamAmplifierKP;
    private  float slamAmplifierKW = startSlamAmplifierKW;

    private  float drainAmplifierWR = startDrainAmplifierWR;
    private  float drainAmplifierWK = startDrainAmplifierWK;
    private  float drainAmplifierWP = startDrainAmplifierWP;
    private  float drainAmplifierWW = startDrainAmplifierWW;

    private  float deflectAmplifierWR = startDeflectAmplifierWR;
    private  float deflectAmplifierWK = startDeflectAmplifierWK;
    private  float deflectAmplifierWP = startDeflectAmplifierWP;

    private  float backStabAmplifierRR = startBackStabAmplifierRR;
    private  float backStabAmplifierRK = startBackStabAmplifierRK;
    private  float backStabAmplifierRP = startBackStabAmplifierRP;
    private  float backStabAmplifierRW = startBackStabAmplifierRW;

    private  float paralysisAmplifierRR = startParalysisAmplifierRR;
    private  float paralysisAmplifierRK = startParalysisAmplifierRK;
    private  float paralysisAmplifierRP = startParalysisAmplifierRP;
    private  float paralysisAmplifierRW = startParalysisAmplifierRW;

    public final String getFullType() {
        return fullType;
    }

    protected final void setFullType(final String fullType) {
        this.fullType = fullType;
    }

    public final int getId() {
        return id;
    }

    public final void setId(final int id) {
        this.id = id;
    }

    public final float getFireBlastAmplifierPR() {
        return fireBlastAmplifierPR;
    }

    public final void setFireBlastAmplifierPR(final float fireBlastAmplifierPR) {
        this.fireBlastAmplifierPR = fireBlastAmplifierPR;
    }

    public final float getFireBlastAmplifierPK() {
        return fireBlastAmplifierPK;
    }

    public final void setFireBlastAmplifierPK(final float fireBlastAmplifierPK) {
        this.fireBlastAmplifierPK = fireBlastAmplifierPK;
    }

    public final float getFireBlastAmplifierPP() {
        return fireBlastAmplifierPP;
    }

    public final void setFireBlastAmplifierPP(final float fireBlastAmplifierPP) {
        this.fireBlastAmplifierPP = fireBlastAmplifierPP;
    }

    public final float getFireBlastAmplifierPW() {
        return fireBlastAmplifierPW;
    }

    public final void setFireBlastAmplifierPW(final float fireBlastAmplifierPW) {
        this.fireBlastAmplifierPW = fireBlastAmplifierPW;
    }

    public final float getIgniteAmplifierPR() {
        return igniteAmplifierPR;
    }

    public final void setIgniteAmplifierPR(final float igniteAmplifierPR) {
        this.igniteAmplifierPR = igniteAmplifierPR;
    }

    public final float getIgniteAmplifierPK() {
        return igniteAmplifierPK;
    }

    public final void setIgniteAmplifierPK(final float igniteAmplifierPK) {
        this.igniteAmplifierPK = igniteAmplifierPK;
    }

    public final float getIgniteAmplifierPP() {
        return igniteAmplifierPP;
    }

    public final void setIgniteAmplifierPP(final float igniteAmplifierPP) {
        this.igniteAmplifierPP = igniteAmplifierPP;
    }

    public final float getIgniteAmplifierPW() {
        return igniteAmplifierPW;
    }

    public final void setIgniteAmplifierPW(final float igniteAmplifierPW) {
        this.igniteAmplifierPW = igniteAmplifierPW;
    }

    public final float getExecuteAmplifierKR() {
        return executeAmplifierKR;
    }

    public final void setExecuteAmplifierKR(final float executeAmplifierKR) {
        this.executeAmplifierKR = executeAmplifierKR;
    }

    public final float getExecuteAmplifierKK() {
        return executeAmplifierKK;
    }

    public final void setExecuteAmplifierKK(final float executeAmplifierKK) {
        this.executeAmplifierKK = executeAmplifierKK;
    }

    public final float getExecuteAmplifierKP() {
        return executeAmplifierKP;
    }

    public final void setExecuteAmplifierKP(final float executeAmplifierKP) {
        this.executeAmplifierKP = executeAmplifierKP;
    }

    public final float getExecuteAmplifierKW() {
        return executeAmplifierKW;
    }

    public final void setExecuteAmplifierKW(final float executeAmplifierKW) {
        this.executeAmplifierKW = executeAmplifierKW;
    }

    public final float getSlamAmplifierKR() {
        return slamAmplifierKR;
    }

    public final void setSlamAmplifierKR(final float slamAmplifierKR) {
        this.slamAmplifierKR = slamAmplifierKR;
    }

    public final float getSlamAmplifierKK() {
        return slamAmplifierKK;
    }

    public final void setSlamAmplifierKK(final float slamAmplifierKK) {
        this.slamAmplifierKK = slamAmplifierKK;
    }

    public final float getSlamAmplifierKP() {
        return slamAmplifierKP;
    }

    public final void setSlamAmplifierKP(final float slamAmplifierKP) {
        this.slamAmplifierKP = slamAmplifierKP;
    }

    public final float getSlamAmplifierKW() {
        return slamAmplifierKW;
    }

    public final void setSlamAmplifierKW(final float slamAmplifierKW) {
        this.slamAmplifierKW = slamAmplifierKW;
    }

    public final float getDrainAmplifierWR() {
        return drainAmplifierWR;
    }

    public final void setDrainAmplifierWR(final float drainAmplifierWR) {
        this.drainAmplifierWR = drainAmplifierWR;
    }

    public final float getDrainAmplifierWK() {
        return drainAmplifierWK;
    }

    public final void setDrainAmplifierWK(final float drainAmplifierWK) {
        this.drainAmplifierWK = drainAmplifierWK;
    }

    public final float getDrainAmplifierWP() {
        return drainAmplifierWP;
    }

    public final void setDrainAmplifierWP(final float drainAmplifierWP) {
        this.drainAmplifierWP = drainAmplifierWP;
    }

    public final float getDrainAmplifierWW() {
        return drainAmplifierWW;
    }

    public final void setDrainAmplifierWW(final float drainAmplifierWW) {
        this.drainAmplifierWW = drainAmplifierWW;
    }

    public final float getDeflectAmplifierWR() {
        return deflectAmplifierWR;
    }

    public final void setDeflectAmplifierWR(final float deflectAmplifierWR) {
        this.deflectAmplifierWR = deflectAmplifierWR;
    }

    public final float getDeflectAmplifierWK() {
        return deflectAmplifierWK;
    }

    public final void setDeflectAmplifierWK(final float deflectAmplifierWK) {
        this.deflectAmplifierWK = deflectAmplifierWK;
    }

    public final float getDeflectAmplifierWP() {
        return deflectAmplifierWP;
    }

    public final void setDeflectAmplifierWP(final float deflectAmplifierWP) {
        this.deflectAmplifierWP = deflectAmplifierWP;
    }

    public final float getBackStabAmplifierRR() {
        return backStabAmplifierRR;
    }

    public final void setBackStabAmplifierRR(final float backStabAmplifierRR) {
        this.backStabAmplifierRR = backStabAmplifierRR;
    }

    public final float getBackStabAmplifierRK() {
        return backStabAmplifierRK;
    }

    public final void setBackStabAmplifierRK(final float backStabAmplifierRK) {
        this.backStabAmplifierRK = backStabAmplifierRK;
    }

    public final float getBackStabAmplifierRP() {
        return backStabAmplifierRP;
    }

    public final void setBackStabAmplifierRP(final float backStabAmplifierRP) {
        this.backStabAmplifierRP = backStabAmplifierRP;
    }

    public final float getBackStabAmplifierRW() {
        return backStabAmplifierRW;
    }

    public final void setBackStabAmplifierRW(final float backStabAmplifierRW) {
        this.backStabAmplifierRW = backStabAmplifierRW;
    }

    public final float getParalysisAmplifierRR() {
        return paralysisAmplifierRR;
    }

    public final void setParalysisAmplifierRR(final float paralysisAmplifierRR) {
        this.paralysisAmplifierRR = paralysisAmplifierRR;
    }

    public final float getParalysisAmplifierRK() {
        return paralysisAmplifierRK;
    }

    public final void setParalysisAmplifierRK(final float paralysisAmplifierRK) {
        this.paralysisAmplifierRK = paralysisAmplifierRK;
    }

    public final float getParalysisAmplifierRP() {
        return paralysisAmplifierRP;
    }

    public final void setParalysisAmplifierRP(final float paralysisAmplifierRP) {
        this.paralysisAmplifierRP = paralysisAmplifierRP;
    }

    public final float getParalysisAmplifierRW() {
        return paralysisAmplifierRW;
    }

    public final void setParalysisAmplifierRW(final float paralysisAmplifierRW) {
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
