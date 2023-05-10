package gvt.goats;

import gvt.Attack;
import gvt.DamageType;

/**
 * A cleric class.
 */
public class Cleric extends Goat {
    /**
     * The maximum HP for a cleric.
     */
    public static final int MAX_HP = 125;

    /**
     * Creates a new cleric with the specified name.
     * 
     * @param name The name of the new cleric.
     */
    public Cleric(String name) {
        super(name, MAX_HP);
    }

    /**
     * The cleric's Bell, Book, & Candle attack hits once for 15-25 holy 
     * damage.
     */
    @Override
    public Attack attack() {
        return new Attack("Bell, Book, & Candle", RNG.nextInt(15, 26), 
            DamageType.HOLY);
    }

    /**
     * Clerics heal for 25% holy damage.
     */
    @Override
    public void takeDamage(Attack attack) {
        if(attack.getDamageType() == DamageType.HOLY) {
            for(int hit : attack.getHits()) {
                heal(hit);
            }
        } else {
            for(int hit : attack.getHits()) {
                reduceHitPoints(hit);
            }
        }
    }
}