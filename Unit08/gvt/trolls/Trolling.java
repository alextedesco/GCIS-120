package gvt.trolls;

import gvt.Attack;
import gvt.DamageType;

public class Trolling extends Troll {
    public static int MAX_HP = 18;
    public static double REGEN = 0.03;

    public Trolling () {
        super("Trolling", MAX_HP, REGEN);
    }

    @Override
    public Attack attack () {
        return new Attack ("U Mad?", 15, DamageType.PHYSICAL);
    }

    @Override
    public void takeDamage (Attack attack) {
        double modifier = 1.0;
        if (attack.getDamageType() == DamageType.MAGICAL) {
            modifier = 1.25;
        }
        for (int hit : attack.getHits()) {
            int amount =  (int)(hit * modifier);
            reduceHP(amount);
        }
    }
}

    