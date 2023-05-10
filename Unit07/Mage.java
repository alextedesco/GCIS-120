public class Mage extends Goat {
    public static final int MAX_HP = 100;

    public Mage (String name) {
        super (name, MAX_HP);
    }

    public Attack attack () {
        int [] hits = {9,9,9};
        return new Attack("Magical Missile", DamageType.Magical, hits);
    }

    public void takeDamage (Attack attack) {
        double modifier = 1.0;
        if (attack.getType() == DamageType.Magical) {
            modifier = 0.75;
        } else if (attack.getType() == DamageType.Physical) {
            modifier = 1.25;
        }

        for (int hit : attack.getHits()) {
            int actual = (int)(hit * modifier);
            adjustHP(actual);
        }
    }
}
