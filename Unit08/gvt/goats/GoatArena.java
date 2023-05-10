package gvt.goats;

import gvt.Attack;

/**
 * An arena that allows goats to practice their fighting skills against each
 * other.
 */
public class GoatArena {
    /**
     * Two goats enter, one (or zero) goats leaves.
     * 
     * @param goat1 The first goat.
     * @param goat2 The second goat.
     */
    public static void battle(Goat goat1, Goat goat2) {
        System.out.println(goat1 + " faces " + goat2 
            + " on the field of battle!");
        while(goat1.isConscious() && goat2.isConscious()) {
            Attack attack1 = goat1.attack();
            System.err.println(goat1 + " attacks with " + attack1);
            goat2.takeDamage(attack1);

            Attack attack2 = goat2.attack();
            System.err.println(goat2 + " attacks with " + attack2);
            goat1.takeDamage(attack2);
        }

        if(goat1.isConscious()) {
            System.out.println(goat1 + " wins!");
        } else if(goat2.isConscious()) {
            System.out.println(goat2 + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    public static void main(String[] args) {
        Goat goat1 = new Fighter("Goatnan");
        Goat goat2 = new Ranger("Gilbo Goatgins");
        battle(goat1, goat2);
    }
}
