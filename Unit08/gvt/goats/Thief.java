package gvt.goats;

import gvt.Attack;
import gvt.DamageType;

/**
 * The thief class.
 */
public class Thief extends Goat {
    /**
     * The maximum HP for a thief.
     */
    public static final int MAX_HP = 125;

    /**
     * Creates a new thief with the specified name.
     * 
     * @param name The name of the new thief.
     */
    public Thief(String name) {
        super(name, MAX_HP);
    }
    
    /**
     * The thief's Stabbity-Stab hits for 10-20 damage 1-3 times. Each hit
     * has a 25% chance to crit (double damage).
     */
    @Override
    public Attack attack() {
        int numberOfHits = RNG.nextInt(1, 4);
        int[] hits = new int[numberOfHits];
        for(int i=0; i<numberOfHits; i++) {
            int amount = RNG.nextInt(10, 20);
            if(RNG.nextDouble() > 0.75) {
                hits[i] = amount * 2; // crit!
            } 
            hits[i] = amount;
        }
        return new Attack("Stabbity-Stab", hits, DamageType.POISON);
    }

    /**
     * The thief has a 25% chance to dodge each hit in an attack and takes 25%
     * reduced poison damage.
     */
    @Override
    public void takeDamage(Attack attack) {
        double modifier = 1.0;
        if(attack.getDamageType() == DamageType.POISON) {
            modifier = 0.75;
        }
        for(int hit : attack.getHits()) {
            if(RNG.nextDouble() > 0.25) {
                int amount = (int)(modifier * hit);
                reduceHitPoints(amount);
            }
        }
    }
}
