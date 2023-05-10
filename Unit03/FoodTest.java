// Alex Tedesco

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class FoodTest {
    @Test
    public void testFood() {
        // setup
        String name = "Twinkie";
        double gramsOfFat = 8.0;
        double gramsOfCarbohydates = 43.0;

        // invoke
        Food food_1 = new Food(name, gramsOfFat, gramsOfCarbohydates);

        // test
        assertEquals(name, food_1.getName());
        assertEquals(gramsOfFat, food_1.getGramsOfFat());
        assertEquals(gramsOfCarbohydates, food_1.getGramsOfCarbohydrates());
    }
    @Test
    public void testCalories() {
        // setup
        String name = "Twinkie";
        double gramsOfFat = 8.0;
        double gramsOfCarbohydates = 43.0;

        // invoke
        Food food_1 = new Food(name, gramsOfFat, gramsOfCarbohydates);
        double expected = 104.0;

        // test
        assertEquals(expected, food_1.calories());
    }
    

}