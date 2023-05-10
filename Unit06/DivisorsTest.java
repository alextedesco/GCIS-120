import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class DivisorsTest {
    // SELECT EACH TEST AND PRESS CTRL-/ TO UNCOMMENT

    @Test
    public void divisors0() {
        // setup
        int n = 0;
        String expected = "";

        // invoke
        String actual = Divisors.divisors(n);

        // analyze
        assertEquals(expected, actual.trim());
    }

    @Test
    public void divisors1() {
        // setup
        int n = 1;
        String expected = "1";

        // invoke
        String actual = Divisors.divisors(n);

        // analyze
        assertEquals(expected, actual.trim());
    }

    @Test
    public void divisors64() {
        // setup
        int n = 64;
        String expected = "1 2 4 8 16 32 64";

        // invoke
        String actual = Divisors.divisors(n);

        // analyze
        assertEquals(expected, actual.trim());
    }

    @Test
    public void divisors37() {
        // setup
        int n = 37;
        String expected = "1 37";

        // invoke
        String actual = Divisors.divisors(n);

        // analyze
        assertEquals(expected, actual.trim());
    }

    @Test
    public void divisors55() {
        // setup
        int n = 55;
        String expected = "1 5 11 55";

        // invoke
        String actual = Divisors.divisors(n);

        // analyze
        assertEquals(expected, actual.trim());
    }
}
