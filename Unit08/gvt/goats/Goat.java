package gvt.goats;

import java.util.Random;

import gvt.Attack;

/**
 * The parent class for goats in a game of GvT. Includes all of the common
 * state and behavior.
 */
public abstract class Goat {
    /**
     * Used for random number generation.
     */
    protected static final Random RNG = new Random();

    /**
     * The name of the goat.
     */
    private final String name;

    /**
     * The goat's max HP.
     */
    private final int maxHP;

    /**
     * The goat's current HP. When this is reduced to 0, the goat is knocked
     * unconscious.
     */
    private int currentHP;

    /**
     * Creates a new goat with the specified attributes.
     * 
     * @param name The name of the goat.
     * @param maxHP The goat's max HP. This is also used as the goat's starting
     * HP.
     */
    public Goat(String name, int maxHP) {
        this.name = name;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
    }
    
    public String getName() {
        return name;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    /**
     * Creates and returns the goat's next attack.
     * 
     * @return The goat's next attack.
     */
    public abstract Attack attack();

    /**
     * Damages the goat with the specified attack.
     * 
     * @param attack The attack.
     */
    public abstract void takeDamage(Attack attack);

    /**
     * Heals the goat for the specified amount, up to the goat's max HP.
     * 
     * @param amount The amount to heal the goat.
     */
    public void heal(int amount) {
        currentHP += amount;
        if(currentHP > maxHP) {
            currentHP = maxHP;
        }
    }

    /**
     * Returns true if the goat is conscious, and false otherwise.
     * 
     * @return True if the goat has at least one HP, and false otherwise.
     */
    public boolean isConscious() {
        return currentHP > 0;
    }

    @Override
    public String toString() {
        return name + "(" + currentHP + "/" + maxHP + ")";
    }

    protected void reduceHitPoints(int amount) {
        currentHP -= amount;
        if(currentHP < 0) {
            currentHP = 0;
        }
    }
}
