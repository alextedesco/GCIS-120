package groceries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

/**
 * A class that represents an item for sale in a grocery store.
 */
public class GroceryItem implements Comparable<GroceryItem> {
    /**
     * Used to help create random grocery items.
     */
    private static final Random RNG = new Random();

    /**
     * The name of the item.
     */
    private final String name;

    /**
     * The weight of th eitem.
     */
    private final int weight;

    /**
     * The price of the item.
     */
    private final int price;

    /**
     * Creates a new grocery item with the specified attributes.
     * 
     * @param name The name of the item.
     * @param weight The weight of the item.
     * @param price The price of the item.
     */
    public GroceryItem(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    /**
     * A factory method that makes a new GroceryItem. It will be named using
     * the specified item number, e.g. "Item #7" and have a random weight in 
     * the range 1-10 pounds, and a price in the range $1-$20.
     * 
     * @param number The item number.
     * 
     * @return The newly created grocery item.
     */
    public static GroceryItem makeItem(int number) {
        String name = "Item #" + number;
        int weight = RNG.nextInt(10) + 1;
        int price = RNG.nextInt(20) + 1;
        return new GroceryItem(name, weight, price);
    }

    /**
     * Returns the item name.
     * 
     * @return The item name.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the item weight.
     * 
     * @return The item weight.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Returns the item price.
     * 
     * @return The item price.
     */
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.weight + "lbs, $" + this.price + ")";
    }

    @Override
    public int compareTo(GroceryItem other) {
        // When calling a.compareTo (b)
        // return < 0 if a comes first
        // return 0 if a == b
        // return > 0 if b comes first
        return this.name.compareTo(other.name);
    }

    public static void main(String[] args) {
        List<GroceryItem> items = new ArrayList<>();
        items.add(makeItem(5));
        items.add(makeItem(11));
        items.add(makeItem(2));
        items.add(makeItem(1));
        items.add(makeItem(47));
        System.out.println(items);
        Collections.sort(items);
        System.out.println(items);

        TreeSet<GroceryItem> sorted = new TreeSet<>(new WeightComparator());
        for (GroceryItem item : items) {
            sorted.add (item);
        }
        System.out.println(sorted);
    }
}
