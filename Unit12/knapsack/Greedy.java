package knapsack;

import java.util.Collections;
import java.util.List;

public class Greedy {

    public double makeChange (double price, double payment) {
        double remainingAmount = payment - price;
        if (payment < price) {
            System.out.println("Not enough money!");
            return remainingAmount;
        } else {
            return remainingAmount;
        }
    }

    public static void packItems (Knapsack knapsack, List<Item> items) {
        // sort items from lightest ot heaviest
        // pack them in order until nothing else fits
        Collections.sort(items, new PPRComparator());
        for (Item item : items) {
            knapsack.pack(item);
        }
        System.out.println(knapsack);
    }

    public static void main(String[] args) {
        packItems (new Knapsack(10), ItemSets.electronicsSet());
        packItems (new Knapsack(10), ItemSets.toySet());
        packItems (new Knapsack(10), ItemSets.metalSet());
        packItems (new Knapsack(10), ItemSets.sportsSet());
    }
}
