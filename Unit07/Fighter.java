public class Fighter extends Goat {
    public static final int MAX_HP = 100;

    public Fighter (String name) {
        super (name, MAX_HP);
    }

    public Attack attack () {
        int [] hits = {25};
        return new Attack("Magical Missile", DamageType.Magical, hits);
    }

    public void takeDamage (Attack attack) {
        double modifier = 1.0;
        if (attack.getType() == DamageType.Magical) {
            modifier = 1.25;
        } else if (attack.getType() == DamageType.Physical) {
            modifier = 0.75;
        }

        for (int hit : attack.getHits()) {
            int actual = (int)(hit * modifier);
            adjustHP(actual);
        }
    }
}
