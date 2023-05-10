package groceries;

import java.util.Comparator;

public class WeightComparator implements Comparator<GroceryItem> {

    @Override
    public int compare(GroceryItem item1, GroceryItem item2) {
        return item1.getWeight() - item2.getWeight();
    }
}