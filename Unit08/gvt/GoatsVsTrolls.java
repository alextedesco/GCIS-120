package gvt;

import java.util.LinkedList;
import java.util.Random;

import gvt.goats.Cleric;
import gvt.goats.Fighter;
import gvt.goats.Goat;
import gvt.goats.Mage;
import gvt.goats.Ranger;
import gvt.goats.Thief;
import gvt.trolls.Boss;
import gvt.trolls.Troll;
import gvt.trolls.Trolling;
import gvt.trolls.Trollzord;

public class GoatsVsTrolls {
    private static final Random RNG = new Random ();

    public static void epicBattle (LinkedList<Goat> goats, LinkedList<Troll> trolls) {
        
        while (goats.size() > 0 && trolls.size () > 0) {
            int goatIndex = RNG.nextInt(goats.size());
            Goat goat = goats.remove(goatIndex);
            int trollIndex = RNG.nextInt(trolls.size());
            Troll troll = trolls.remove(trollIndex);

            System.out.println(goat + " vs. " + troll + "!");
            Attack goatAttack = goat.attack();
            System.out.println("   " + goatAttack);
            troll.takeDamage(goatAttack);

            Attack trollAttack = troll.attack();
            System.out.println("   " + trollAttack);
            goat.takeDamage(trollAttack);

            if (goat.isConscious()) {
                goats.add (goat);
            }

            if (troll.isVanquished()) {
                trolls.add (troll);
            }

            if (goats.size() > 0) {
                System.out.println("The heroic goats are victorious!");
            } else if (trolls.size() > 0) {
                System.out.println("The evil trolls have won!");
            } else {
                System.out.println("It is a draw!");
            }
            
        }

    }
    public static void main(String[] args) {

        LinkedList<Goat> goats = new LinkedList<>();
        goats.add(new Fighter("Goatman"));
        goats.add (new Mage("Hairy POtter"));
        goats.add (new Thief("Bilbo Goatgins"));
        goats.add (new Cleric("Father McCree"));
        goats.add (new Ranger("Aragoat"));

        LinkedList<Troll> trolls = new LinkedList<>();
        trolls.add (new Trollzord());
        trolls.add (new Trollzord());
        trolls.add (new Trolling());
        trolls.add (new Trolling());
        trolls.add (new Trollzord());
        trolls.add (new Trollzord());
        trolls.add (new Trolling());
        trolls.add (new Trolling());
        trolls.add (new Boss());

        epicBattle(goats, trolls);
    }
}