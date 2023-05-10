public class Troll {
    private final String name;
    private final int maximumHP;
    private int currentHP;
    private final double regeneration;


    public Troll (String name, int maximumHP, double regeneration) {
        this.name = name;
        this.maximumHP = maximumHP;
        this.currentHP = maximumHP;
        this.regeneration = regeneration;
    }

    public boolean isVanquished () {
        return this.currentHP <= 0;
    }

    public void regenerate () {
        int amount = (int)(regeneration * maximumHP);
        currentHP += amount;
        if (currentHP > maximumHP) {
            currentHP = maximumHP;
        }
    }

    public Attack attack () {
        return null;
    }
    
    public void takeDamage (Attack attack) {

    }

    protected void adjustHP (int amount) {
        currentHP -= amount;
        if (currentHP < 0) {
            currentHP = 0;
        }
    }
}
