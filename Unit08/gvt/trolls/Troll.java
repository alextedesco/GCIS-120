package gvt.trolls;

import gvt.Attack;

public abstract class Troll {
    private final String name;
    private final int maxHP;
    private int currentHP;
    private final double regenAmount;

    public Troll (String name, int maxHP, double regenAmount) {
        this.name = name;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
        this.regenAmount = regenAmount;
    }

    public boolean isVanquished() {
        return currentHP <= 0;
    }

    public void regenerate() {
        int amount = (int)(this.maxHP * regenAmount);
        this.currentHP += amount;
        if (currentHP > maxHP) {
            currentHP = maxHP;
        }
    }

    public abstract Attack attack ();

    public abstract void takeDamage (Attack attack);

    protected void reduceHP (int amount) {
        currentHP -= amount;
        if (currentHP < 0) {
            currentHP =0;
        }

    }    

    @Override
    public String toString() {
        return name + " (" + currentHP + "/" + maxHP + ")";
    }
}
