public class GoatArena {
    public static void battle (Goat goat_1, Goat goat_2) {
        while (goat_1.isConscious() && goat_2.isConscious()) {
            System.out.println(goat_1.getName());
            Attack g1_attack = goat_1.attack();
            System.out.println(g1_attack);
            goat_2.takeDamage(g1_attack);

            System.out.println(goat_2.getName());
            Attack g2_attack = goat_2.attack();
            System.out.println(g2_attack);
            goat_1.takeDamage(g2_attack);

            System.out.println(goat_1);
            System.out.println(goat_2);
        }
    }

    public static void main(String[] args) {
        Mage mage = new Mage ("Hairy Potter");
        Mage mage_2 = new Mage ("Dr. Poodoo");
        Fighter fighter = new Fighter ("Goatman");
        Fighter fighter_2 = new Fighter ("Mangoat");
        Blacksmith blacksmith_1 = new Blacksmith ("Blacksmith");
        // battle(mage, fighter);
        // battle(mage_2, mage);
        // battle(fighter_2, fighter);
        battle(mage, blacksmith_1);
    }
    
}
