import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Iterator;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class IntRangeTest {
    @Test
    public void helloWorld() {
        assertEquals("Hello, World!", "Hello, World!");
    }

    @Test
    public void create() {
        // setup
        int start = 5;
        int stop = 8;

        // invoke
        Range<Integer> range = new IntRange(start, stop);

        // analyze
        assertEquals(3, range.size());
        assertEquals(5, range.get(0));
        assertEquals(6, range.get(1));
        assertEquals(7, range.get(2));
    }

    @Test
    public void createStopOnly() {
        // setup
        int stop = 4;

        // invoke
        Range<Integer> range = new IntRange(stop);

        // analyze
        assertEquals(4, range.size());
        assertEquals(0, range.get(0));
        assertEquals(1, range.get(1));
        assertEquals(2, range.get(2));
        assertEquals(3, range.get(3));
    }

    @Test
    public void getNegativeIndex() {
        // setup
        int start = 4;
        int stop = 9;
        int index = -1;
        Range<Integer> range = new IntRange(start, stop);

        // invoke
        try {
            range.get(index);
            fail("Negative index should throw an exception!");
        } catch(IndexOutOfBoundsException e) {
            assertEquals("Index out of range: -1", e.getMessage());
        }
    }

    // @Test
    // public void getIndexTooLarge() {
    //     // setup
    //     int start = 2;
    //     int stop = 5;
    //     int index = 4;
    //     Range<Integer> range = new IntRange(start, stop);

    //     // invoke
    //     try {
    //         range.get(index);
    //         fail("Large index should throw an exception!");
    //     } catch(IndexOutOfBoundsException e) {
    //         assertEquals("Index out of range: 4", e.getMessage());
    //     }
    // }

    // @Test
    // public void iterator() {
    //     // setup
    //     int start = 1;
    //     int stop = 4;
    //     Iterable<Integer> iterable = new IntRange(start, stop);

    //     // invoke
    //     Iterator<Integer> iterator = iterable.iterator();

    //     // analyze
    //     assertTrue(iterator.hasNext());
    //     assertEquals(1, iterator.next());
    //     assertTrue(iterator.hasNext());
    //     assertEquals(2, iterator.next());
    //     assertTrue(iterator.hasNext());
    //     assertEquals(3, iterator.next());
    //     assertFalse(iterator.hasNext());
    // }
}
