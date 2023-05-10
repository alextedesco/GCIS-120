package gvt.goats;

import gvt.Attack;
import gvt.DamageType;

/**
 * The Fighter class.
 */
public class Fighter extends Goat {
    /**
     * The maximum HP for a fighter.
     */
    public static final int MAX_HP = 150;

    /**
     * Creates a new fighter with the specified name.
     * 
     * @param name The name of the new fighter.
     */
    public Fighter(String name) {
        super(name, MAX_HP);
    }

    /**
     * The fighter's Cleave attack hits once for 15-35 physical damage.
     */
    @Override
    public Attack attack() {
        return new Attack("Cleave", RNG.nextInt(15, 36), DamageType.PHYSICAL);
    }

    /**
     * Fighters take 25% additional magical damage, but 25% reduced physical 
     * damage.
     */
    @Override
    public void takeDamage(Attack attack) {
        double modifier = 1.0;
        if(attack.getDamageType() == DamageType.PHYSICAL) {
            modifier = 0.75;
        } else if(attack.getDamageType() == DamageType.MAGICAL) {
            modifier = 1.25;
        }
        for(int hit : attack.getHits()) {
            int actual = (int)(hit * modifier);
            reduceHitPoints(actual);
        }
    }
}
