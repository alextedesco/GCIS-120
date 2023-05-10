// Alex Tedesco

// Imports:
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class BinaryConverterTest {
    @Test
    public void testStringToArray() {
        // setup
        String a_string = "10011";

        // invoke
        int [] actual =  BinaryConverter.stringToArray(a_string);
        int [] expected = {1, 0, 0, 1, 1};

        // test
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testArrayToInt() {
        // setup
        String a_string = "10011";
        int [] an_array =  BinaryConverter.stringToArray(a_string);

        // invoke
        int actual =  BinaryConverter.arrayToInt(an_array);
        int expected = 25;

        // test
        assertEquals(expected, actual);
    }
}