import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class Problem1Tests {
    @Test
    public void testPentiumToString() {
        // setup
        Processor processor = new Pentium(3.5);

        // invoke
        String expected = "INTEL Pentium Speed: 3.5Ghz";
        String actual = processor.toString();

        // analysis
        assertEquals(expected, actual);
    }

    @Test
    public void testRyzenToString() {
        // setup
        Processor processor = new Ryzen (3.5);

        // invoke
        String expected = "AMD Ryzen Speed: 3.5Ghz";
        String actual = processor.toString();

        // analysis
        assertEquals(expected, actual);
    }
}