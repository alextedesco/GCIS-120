import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class FruitTest {
    @Test
    public void testCreate() {
        // setup
        String name = "orange";
        double price = 1.25;
        String color = "yellow";

        // Invoke
        Fruit fruit = new Fruit(name, price, color);

        // analyze
        assertEquals(name, fruit.getName());
        assertEquals(price, fruit.getPrice(), 0.00000);
        assertEquals(color, fruit.getColor());

    }
    
}
