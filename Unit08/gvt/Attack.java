package gvt;

import java.util.Arrays;

/**
 * An attack in a game of Goats vs. Trolls.
 */
public class Attack {
    /**
     * The name of the attack.
     */
    private final String name;

    /**
     * The hits, each of which does a separate amount of damage.
     */
    private final int[] hits;

    /**
     * The damage type.
     */
    private final DamageType damageType;

    /**
     * Convenience constructor that creates a new single-hit attack with the 
     * specified atttibutes.
     * 
     * @param name The name of the attack.
     * @param hit The single hit.
     * @param damageType The damage type.
     */
    public Attack(String name, int hit, DamageType damageType) {
        this(name, new int[] { hit }, damageType);
    }

    /**
     * Creates a new attack with the specified attributes.
     * 
     * @param name The name of the attack.
     * @param hits The hits.
     * @param damageType The damage type.
     */
    public Attack(String name, int[] hits, DamageType damageType) {
        this.name = name;
        this.hits = hits;
        this.damageType = damageType;
    }

    public String getName() {
        return name;
    }

    public int[] getHits() {
        return hits;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    @Override
    public String toString() {
        return name + " " + Arrays.toString(hits) + ", " + damageType;
    }
    
}
