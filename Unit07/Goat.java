public class Goat {
    private String name;
    private int maximumHP;
    protected int currentHP;

    public Goat (String name, int maximumHP) {
        this.name = name;
        this.maximumHP = maximumHP;
        this.currentHP = 125;
    }
    
    public void heal (int amount) {
        currentHP += amount;
        if (currentHP > maximumHP) {
            currentHP = maximumHP;
        }
    }

    public boolean isConscious () {
        return currentHP > 0;
    }

    @Override
    public String toString() {
        return "A goat named " + this.name + " with " + "(" + this.currentHP + "/" + this.maximumHP + ") hit points";
    }

    public String getName() {
        return this.name;
    }

    protected void adjustHP (int amount) {
        currentHP -= amount;
        if (currentHP < 0) {
            currentHP = 0;
        }
    }

    public Attack attack() {
        return null;
    }

    public void takeDamage (Attack attack) {
    }
}
