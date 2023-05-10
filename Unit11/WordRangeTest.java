import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class WordRangeTest {
    @Test
    public void helloWorld() {
        assertEquals("Hello, World!", "Hello, World!");
    }

    // @Test
    // public void create() {
    //     // setup
    //     String text = "one two three";

    //     // invoke
    //     Range<String> range = new WordRange(text);

    //     // analyze
    //     assertEquals(3, range.size());
    //     assertEquals("one", range.get(0));
    //     assertEquals("two", range.get(1));
    //     assertEquals("three", range.get(2));
    // }

    // @Test
    // public void createSingleWord() {
    //     // setup
    //     String text = "single";

    //     // invoke
    //     Range<String> range = new WordRange(text);

    //     // analyze
    //     assertEquals(1, range.size());
    //     assertEquals("single", range.get(0));
    // }

    // @Test
    // public void createEmpty() {
    //     // setup
    //     String text = "";

    //     // invoke
    //     Range<String> range = new WordRange(text);

    //     // analyze
    //     assertEquals(1, range.size());
    //     assertEquals("", range.get(0));
    // }

    // @Test
    // public void getNegativeIndex() {
    //     // setup
    //     String text = "a cat in a hat";
    //     int index = -1;
    //     Range<String> range = new WordRange(text);

    //     // invoke
    //     try {
    //         range.get(index);
    //         fail("Negative index should throw an exception!");
    //     } catch(IndexOutOfBoundsException e) {
    //         assertEquals("Index -1 out of bounds for length 5", e.getMessage());
    //     }
    // }

    // @Test
    // public void getIndexTooLarge() {
    //     // setup
    //     String text = "a fox in a box";
    //     int index = 5;
    //     Range<String> range = new WordRange(text);

    //     // invoke
    //     try {
    //         range.get(index);
    //         fail("Large index should throw an exception!");
    //     } catch(IndexOutOfBoundsException e) {
    //         assertEquals("Index 5 out of bounds for length 5", e.getMessage());
    //     }
    // }

    // @Test
    // public void iterator() {
    //     // setup
    //     String text = "Do you know the muffin man?";
    //     Range<String> range = new WordRange(text);

    //     // invoke
    //     Iterator<String> iterator = range.iterator();

    //     // analyze
    //     assertTrue(iterator.hasNext());
    //     assertEquals("Do", iterator.next());
    //     assertTrue(iterator.hasNext());
    //     assertEquals("you", iterator.next());
    //     assertTrue(iterator.hasNext());
    //     assertEquals("know", iterator.next());
    //     assertTrue(iterator.hasNext());
    //     assertEquals("the", iterator.next());
    //     assertTrue(iterator.hasNext());
    //     assertEquals("muffin", iterator.next());
    //     assertTrue(iterator.hasNext());
    //     assertEquals("man?", iterator.next());
    //     assertFalse(iterator.hasNext());
    // }
}
