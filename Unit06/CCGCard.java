import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class CCGCard {

    private int number;
    private String name;

    public CCGCard (int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.number + ": " + this.name;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof CCGCard) {
            CCGCard card = (CCGCard) other;
             return this.number == card.number;
        } else {
            return false;
        }
        
     }

     @Override
     public int hashCode() {
         return this.number;
     }

    public static ArrayList<CCGCard> makePack() {
        ArrayList<CCGCard> pack = new ArrayList<>();
        Random rng = new Random();
        int rare = rng.nextInt(110) + 1;
        pack.add (new CCGCard(rare, "Rare #" + rare));

        for (int u=0; u<3; u++) {
            int uncommon = rng.nextInt(110) + 111;
            pack.add(new CCGCard(uncommon, "Uncommon #" + uncommon));
        }

        for (int c=0; c<11; c++) {
            int common = rng.nextInt(110) + 221;
            pack.add(new CCGCard(common, "Common #" + common));
        }  
        return pack;
    }

    public static int cardCollector() {
        int howManyPacks = 0;

        HashSet<CCGCard> collection = new HashSet<>();
        while (collection.size() < 330) {
            ArrayList<CCGCard> pack = makePack();
            for (CCGCard card : pack) {
            collection.add (card);
            howManyPacks += 1;
            }
        }
        return howManyPacks;   
    }

    public static void main(String[] args) {
        CCGCard card_1 = new CCGCard(123, "Black Lotus");
        CCGCard card_2 = new CCGCard(456, "Black Lotus");
        CCGCard card_3 = new CCGCard(789, "Black Lotus");
        CCGCard card_4 = new CCGCard(123, "Black Lotus");
        // System.out.println(card_1);
        HashSet<CCGCard> cards = new HashSet<>();
        cards.add(card_1);
        cards.add(card_2);
        cards.add(card_3);
        cards.add (card_4);
        System.out.println(cards);
        
        System.out.println(makePack());
        System.out.println(cardCollector());
    }
}
