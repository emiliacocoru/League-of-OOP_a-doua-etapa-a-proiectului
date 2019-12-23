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
    private double receivedDamageWRA = 0;
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
    private  double fireBlastAmplifierPR = 0.8;
    private  double fireBlastAmplifierPK = 1.2;
    private  double fireBlastAmplifierPP = 0.9;
    private  double fireBlastAmplifierPW = 1.05;

    private  double igniteAmplifierPR = 0.8;
    private  double igniteAmplifierPK = 1.2;
    private  double igniteAmplifierPP = 0.9;
    private  double igniteAmplifierPW = 1.05;

    private  double executeAmplifierKR = 1.15;
    private  double executeAmplifierKK = 1;
    private  double executeAmplifierKP = 1.1;
    private  double executeAmplifierKW = 0.8;

    private  double slamAmplifierKR = 0.8;
    private  double slamAmplifierKK = 1.2;
    private  double slamAmplifierKP = 0.9;
    private  double slamAmplifierKW = 1.05;

    private  double drainAmplifierWR = 0.8;
    private  double drainAmplifierWK = 1.2;
    private  double drainAmplifierWP = 0.9;
    private  double drainAmplifierWW = 1.05;

    private  double deflectAmplifierWR = 1.2;
    private  double deflectAmplifierWK = 1.4;
    private  double deflectAmplifierWP = 1.3;

    private  double backStabAmplifierRR = 1.2;
    private  double backStabAmplifierRK = 0.9;
    private  double backStabAmplifierRP = 1.25;
    private  double backStabAmplifierRW = 1.25;

    private  double paralysisAmplifierRR = 0.9;
    private  double paralysisAmplifierRK = 0.8;
    private  double paralysisAmplifierRP = 1.2;
    private  double paralysisAmplifierRW = 1.25;

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

    public double getFireBlastAmplifierPR() {
        return fireBlastAmplifierPR;
    }

    public void setFireBlastAmplifierPR(double fireBlastAmplifierPR) {
        this.fireBlastAmplifierPR = fireBlastAmplifierPR;
    }

    public double getFireBlastAmplifierPK() {
        return fireBlastAmplifierPK;
    }

    public void setFireBlastAmplifierPK(double fireBlastAmplifierPK) {
        this.fireBlastAmplifierPK = fireBlastAmplifierPK;
    }

    public double getFireBlastAmplifierPP() {
        return fireBlastAmplifierPP;
    }

    public void setFireBlastAmplifierPP(double fireBlastAmplifierPP) {
        this.fireBlastAmplifierPP = fireBlastAmplifierPP;
    }

    public double getFireBlastAmplifierPW() {
        return fireBlastAmplifierPW;
    }

    public void setFireBlastAmplifierPW(double fireBlastAmplifierPW) {
        this.fireBlastAmplifierPW = fireBlastAmplifierPW;
    }

    public double getIgniteAmplifierPR() {
        return igniteAmplifierPR;
    }

    public void setIgniteAmplifierPR(double igniteAmplifierPR) {
        this.igniteAmplifierPR = igniteAmplifierPR;
    }

    public double getIgniteAmplifierPK() {
        return igniteAmplifierPK;
    }

    public void setIgniteAmplifierPK(double igniteAmplifierPK) {
        this.igniteAmplifierPK = igniteAmplifierPK;
    }

    public double getIgniteAmplifierPP() {
        return igniteAmplifierPP;
    }

    public void setIgniteAmplifierPP(double igniteAmplifierPP) {
        this.igniteAmplifierPP = igniteAmplifierPP;
    }

    public double getIgniteAmplifierPW() {
        return igniteAmplifierPW;
    }

    public void setIgniteAmplifierPW(double igniteAmplifierPW) {
        this.igniteAmplifierPW = igniteAmplifierPW;
    }

    public double getExecuteAmplifierKR() {
        return executeAmplifierKR;
    }

    public void setExecuteAmplifierKR(double executeAmplifierKR) {
        this.executeAmplifierKR = executeAmplifierKR;
    }

    public double getExecuteAmplifierKK() {
        return executeAmplifierKK;
    }

    public void setExecuteAmplifierKK(double executeAmplifierKK) {
        this.executeAmplifierKK = executeAmplifierKK;
    }

    public double getExecuteAmplifierKP() {
        return executeAmplifierKP;
    }

    public void setExecuteAmplifierKP(double executeAmplifierKP) {
        this.executeAmplifierKP = executeAmplifierKP;
    }

    public double getExecuteAmplifierKW() {
        return executeAmplifierKW;
    }

    public void setExecuteAmplifierKW(double executeAmplifierKW) {
        this.executeAmplifierKW = executeAmplifierKW;
    }

    public double getSlamAmplifierKR() {
        return slamAmplifierKR;
    }

    public void setSlamAmplifierKR(double slamAmplifierKR) {
        this.slamAmplifierKR = slamAmplifierKR;
    }

    public double getSlamAmplifierKK() {
        return slamAmplifierKK;
    }

    public void setSlamAmplifierKK(double slamAmplifierKK) {
        this.slamAmplifierKK = slamAmplifierKK;
    }

    public double getSlamAmplifierKP() {
        return slamAmplifierKP;
    }

    public void setSlamAmplifierKP(double slamAmplifierKP) {
        this.slamAmplifierKP = slamAmplifierKP;
    }

    public double getSlamAmplifierKW() {
        return slamAmplifierKW;
    }

    public void setSlamAmplifierKW(double slamAmplifierKW) {
        this.slamAmplifierKW = slamAmplifierKW;
    }

    public double getDrainAmplifierWR() {
        return drainAmplifierWR;
    }

    public void setDrainAmplifierWR(double drainAmplifierWR) {
        this.drainAmplifierWR = drainAmplifierWR;
    }

    public double getDrainAmplifierWK() {
        return drainAmplifierWK;
    }

    public void setDrainAmplifierWK(double drainAmplifierWK) {
        this.drainAmplifierWK = drainAmplifierWK;
    }

    public double getDrainAmplifierWP() {
        return drainAmplifierWP;
    }

    public void setDrainAmplifierWP(double drainAmplifierWP) {
        this.drainAmplifierWP = drainAmplifierWP;
    }

    public double getDrainAmplifierWW() {
        return drainAmplifierWW;
    }

    public void setDrainAmplifierWW(double drainAmplifierWW) {
        this.drainAmplifierWW = drainAmplifierWW;
    }

    public double getDeflectAmplifierWR() {
        return deflectAmplifierWR;
    }

    public void setDeflectAmplifierWR(double deflectAmplifierWR) {
        this.deflectAmplifierWR = deflectAmplifierWR;
    }

    public double getDeflectAmplifierWK() {
        return deflectAmplifierWK;
    }

    public void setDeflectAmplifierWK(double deflectAmplifierWK) {
        this.deflectAmplifierWK = deflectAmplifierWK;
    }

    public double getDeflectAmplifierWP() {
        return deflectAmplifierWP;
    }

    public void setDeflectAmplifierWP(double deflectAmplifierWP) {
        this.deflectAmplifierWP = deflectAmplifierWP;
    }

    public double getBackStabAmplifierRR() {
        return backStabAmplifierRR;
    }

    public void setBackStabAmplifierRR(double backStabAmplifierRR) {
        this.backStabAmplifierRR = backStabAmplifierRR;
    }

    public double getBackStabAmplifierRK() {
        return backStabAmplifierRK;
    }

    public void setBackStabAmplifierRK(double backStabAmplifierRK) {
        this.backStabAmplifierRK = backStabAmplifierRK;
    }

    public double getBackStabAmplifierRP() {
        return backStabAmplifierRP;
    }

    public void setBackStabAmplifierRP(double backStabAmplifierRP) {
        this.backStabAmplifierRP = backStabAmplifierRP;
    }

    public double getBackStabAmplifierRW() {
        return backStabAmplifierRW;
    }

    public void setBackStabAmplifierRW(double backStabAmplifierRW) {
        this.backStabAmplifierRW = backStabAmplifierRW;
    }

    public double getParalysisAmplifierRR() {
        return paralysisAmplifierRR;
    }

    public void setParalysisAmplifierRR(double paralysisAmplifierRR) {
        this.paralysisAmplifierRR = paralysisAmplifierRR;
    }

    public double getParalysisAmplifierRK() {
        return paralysisAmplifierRK;
    }

    public void setParalysisAmplifierRK(double paralysisAmplifierRK) {
        this.paralysisAmplifierRK = paralysisAmplifierRK;
    }

    public double getParalysisAmplifierRP() {
        return paralysisAmplifierRP;
    }

    public void setParalysisAmplifierRP(double paralysisAmplifierRP) {
        this.paralysisAmplifierRP = paralysisAmplifierRP;
    }

    public double getParalysisAmplifierRW() {
        return paralysisAmplifierRW;
    }

    public void setParalysisAmplifierRW(double paralysisAmplifierRW) {
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

    public final double getReceivedDamageWRA() {
        return receivedDamageWRA;
    }

    public final void setReceivedDamageWRA(final double receivedDamageWRA) {
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
