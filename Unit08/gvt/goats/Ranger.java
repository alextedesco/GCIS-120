package gvt.goats;

import gvt.Attack;
import gvt.DamageType;

public class Ranger extends Goat {
    public static final int MAX_HP = 100;

    public Ranger (String name) {
        super(name, MAX_HP);
    }

    @Override
    public Attack attack() {
        int numberOfHits = RNG.nextInt(3, 5);
        int[] hits = new int[numberOfHits];
        for(int i=0; i<numberOfHits; i++) {
            int amount = RNG.nextInt(5, 10);
            if(RNG.nextDouble() > 0.75) {
                hits[i] = amount * 2; // crit!
                hits[i] = amount;
        }
    }
    return new Attack("Volley of Arrows", hits, DamageType.PHYSICAL);
}
        
    @Override
    public void takeDamage(Attack attack) {
        double modifier = 1.0;
        if(attack.getDamageType() == DamageType.ELEMENTAL) {
            modifier = 1.25;
        } for(int hit : attack.getHits()) {
            int actual = (int)(hit * modifier);
            reduceHitPoints(actual);
        }
    }
}
