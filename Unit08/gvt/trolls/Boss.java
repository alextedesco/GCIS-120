package gvt.trolls;

import java.util.Random;

import gvt.Attack;
import gvt.DamageType;

public class Boss extends Troll {
    private static final Random RNG = new Random ();
    public static final int MAX_HP = 500;
    public static final double REGEN = 0.05;

    public Boss () {
        super("Boss", MAX_HP, REGEN);
    }
    
    @Override
    public Attack attack() {
        int damage = RNG.nextInt(25, 51);
        int number =  RNG.nextInt(3);
        if (number == 0) {
            return new Attack ("Slam!", damage, DamageType.PHYSICAL);
        } else if (number == 1) {
            return new Attack ("Belch!", damage, DamageType.POISON);
        } else {
            return new Attack("He Who Smelt It!", damage, DamageType.ELEMENTAL);
        }
    }

    @Override
    public void takeDamage(Attack attack) {
        for (int hit : attack.getHits()) {
            reduceHP(hit);
        }
        
    }
}
