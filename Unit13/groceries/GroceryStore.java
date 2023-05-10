package groceries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroceryStore {

    private final Map<String, GroceryItem> stock;

    public GroceryStore () {
        stock = new HashMap<>();
        for (int i = 1; i < 101; i++) {
            GroceryItem item = GroceryItem.makeItem(i);
            stock.put(item.getName(), item);
        }
    }

    public static List<String> makeList (Map<String, GroceryItem> stock) {
        List<String> all = new ArrayList<>();
        for (String name : stock.keySet()) {
            all.add(name);
    }
    Collections.shuffle(all); 

    List<String> shoppingList = new ArrayList<>();
    for (int i = 0; i < 25; i++) {
        shoppingList.add(all.get(i));
    }
    return shoppingList;
    }
}
