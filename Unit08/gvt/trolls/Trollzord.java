package gvt.trolls;

import gvt.Attack;
import gvt.DamageType;

public class Trollzord extends Troll {
    public static int MAX_HP = 64;
    public static double REGEN = 0.05;

    public Trollzord () {
        super("Trollzord", MAX_HP, REGEN);
    }

    @Override
    public Attack attack () {
        return new Attack ("Flame War", 25, DamageType.MAGICAL);
    }

    @Override
    public void takeDamage (Attack attack) {
        double modifier = 1.0;
        if (attack.getDamageType() == DamageType.HOLY) {
            modifier = 1.25;
        }
        for (int hit : attack.getHits()) {
            int amount =  (int)(hit * modifier);
            reduceHP(amount);
        }
    }
}

    