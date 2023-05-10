import java.util.Random;

public class Blacksmith extends Goat {
    private static final Random rng = new Random ();
    public static final int MAX_HP = 135;

    public Blacksmith (String name) {
        super (name, MAX_HP);
    }

    @Override
    public Attack attack () {
        int number_of_hits = rng.nextInt(3) + 1;
        int [] hits = new int [number_of_hits];

        for (int i = 0; i<number_of_hits; i++) {
            int baseDamage = rng.nextInt(10) + 10;
            if (rng.nextDouble() <= 0.25) {
                baseDamage = baseDamage * 2;
            }
            hits[i] = baseDamage;
        }

        return new Attack ("Sword Swipe", DamageType.Physical, hits);
    }

    @Override
    public void takeDamage (Attack attack) {
        double modifier = 1.0;
        if (attack.getType() == DamageType.Physical) {
            modifier = 1.25;
        } else {
            modifier = 0.5;
        }

        for (int hit : attack.getHits()) {
            int actual = (int)(hit * modifier);
            adjustHP(actual);
        }
    }
}
