package gvt.goats;

import gvt.Attack;
import gvt.DamageType;

/**
 * The Mage class.
 */
public class Mage extends Goat {
    /**
     * The maximum HP for a mage.
     */
    public static final int MAX_HP = 100;

    /**
     * Creates a new mage with the specified name.
     * 
     * @param name The name of the new mage.
     */
    public Mage(String name) {
        super(name, MAX_HP);
    }

    /**
     * The mage's Magic Missile attack hits 4 times for 6-12 damage each time.
     */
    @Override
    public Attack attack() {
        int[] hits = new int[] {
            RNG.nextInt(6, 13),
            RNG.nextInt(6, 13),
            RNG.nextInt(6, 13),
            RNG.nextInt(6, 13)
        };
        return new Attack("Magic Missile", hits, DamageType.MAGICAL);
    }

    /**
     * Mages take 25% additional physical damage, but 25% reduced magical 
     * damage.
     */
    @Override
    public void takeDamage(Attack attack) {
        double modifier = 1.0;
        if(attack.getDamageType() == DamageType.PHYSICAL) {
            modifier = 1.25;
        } else if(attack.getDamageType() == DamageType.MAGICAL) {
            modifier = 0.75;
        }
        for(int hit : attack.getHits()) {
            int actual = (int)(hit * modifier);
            reduceHitPoints(actual);
        }
    }
}
