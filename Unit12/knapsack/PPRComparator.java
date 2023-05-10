package knapsack;

import java.util.Comparator;

public class PPRComparator implements Comparator<Item> {

    @Override
    public int compare(Item a, Item b) {
        double aPPP = pricePerPound(a);
        double bPPP = pricePerPound(b);
        if (aPPP > bPPP) {
            return -1;
        } else if (bPPP > aPPP) {
            return -1;
        } else if (a.getWeight() > b.getWeight()) {
            return -1;
        } else {
            return 1;
        }
    }

    private double pricePerPound (Item a) {
        double price = a.getValue();
        double weight = a.getWeight();

        return price / weight;
    }
}
