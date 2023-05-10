import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class SodaTest {

@Test
public void testToString () {
    // setup
    Soda soda_1 = new Soda(16, "Cherry-Cola");
    // invoke
    String expected = "A 16.0oz Cherry-Cola soda for $1.76";
    String actual = soda_1.toString();
    // analysis
    assertEquals(expected, actual);
    }

@Test
public void testTrue () {
    // setup
    Soda soda_1 = new Soda(16, "Cherry-Cola");
    Soda soda_2 = new Soda(16, "Cherry-Cola");
    // invoke
    boolean expected = true;
    boolean actual = soda_1.equals(soda_2);
    // analysis
    assertEquals(expected, actual);
    }

@Test
public void testFalse () {
    // setup
    Soda soda_1 = new Soda(16, "Cherry-Cola");
    Soda soda_2 = new Soda(16, "Sprite");
    // invoke
    boolean expected = false;
    boolean actual = soda_1.equals(soda_2);
    // analysis
    assertEquals(expected, actual);
    }
}
