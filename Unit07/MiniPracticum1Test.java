import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class MiniPracticum1Test {
    @Test
    public void helloWorld() {
        assertEquals("Hello, World!", "Hello, World!");
    }

    // Select a test with your mouse and type CTRL-/ to uncomment it.

    // TESTS FOR THE minimum FUNCTION

    @Test
    public void minimumNull() {
        // setup
        Node<Integer> node = null;
        int expected = -1;

        // invoke
        int actual = MiniPracticum5.minimum(node);

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void minimumOne() {
        // setup
        Node<Integer> node = new Node<>(123);
        int expected = 123;

        // invoke
        int actual = MiniPracticum5.minimum(node);

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void minimumThree() {
        // setup
        Node<Integer> node = new Node<>(5,
            new Node<Integer>(3, 
                new Node<Integer>(1, 
                    new Node<Integer>(2,
                        new Node<Integer>(4)))));
        int expected = 1;

        // invoke
        int actual = MiniPracticum5.minimum(node);

        // analyze
        assertEquals(expected, actual);
    }

    TESTS FOR THE reverse FUNCTION

    @Test
    public void reverseNull() {
        // setup
        String original = null;
        String expected = null;

        // invoke
        String actual = MiniPracticum5.reverse(original);

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void reverseEmpty() {
        // setup
        String original = "";
        String expected = "";

        // invoke
        String actual = MiniPracticum5.reverse(original);

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void reverseOne() {
        // setup
        String original = "a";
        String expected = "a";

        // invoke
        String actual = MiniPracticum5.reverse(original);

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void reverse() {
        // setup
        String original = "This is a test!";
        String expected = "!tset a si sihT";

        // invoke
        String actual = MiniPracticum5.reverse(original);

        // analyze
        assertEquals(expected, actual);
    }

    // TESTS FOR THE noOdds FUNCTION

    @Test
    public void noOddsNull() {
        // setup
        int[] original = null;
        int[] expected = null;

        // invoke
        int[] actual = MiniPracticum5.noOdds(original);

        // analyze
        assertArrayEquals(expected, actual);
    }

    @Test
    public void noOddsEmpty() {
        // setup
        int[] original = {};
        int[] expected = {};

        // invoke
        int[] actual = MiniPracticum5.noOdds(original);

        // analyze
        assertArrayEquals(expected, actual);
    }

    @Test
    public void noOddsOneOdd() {
        // setup
        int[] original = {3};
        int[] expected = {};

        // invoke
        int[] actual = MiniPracticum5.noOdds(original);

        // analyze
        assertArrayEquals(expected, actual);        
    }

    @Test
    public void noOddsOneEven() {
        // setup
        int[] original = {8};
        int[] expected = {8};

        // invoke
        int[] actual = MiniPracticum5.noOdds(original);

        // analyze
        assertArrayEquals(expected, actual);        
    }

    @Test
    public void noOddsAllOdds() {
        // setup
        int[] original = {1, 3, 5, 7, 11};
        int[] expected = {};

        // invoke
        int[] actual = MiniPracticum5.noOdds(original);

        // analyze
        assertArrayEquals(expected, actual);        
    }

    @Test
    public void noOddsAllEvens() {
        // setup
        int[] original = {8, 4, 2, 16, 32, 24};
        int[] expected = {8, 4, 2, 16, 32, 24};

        // invoke
        int[] actual = MiniPracticum5.noOdds(original);

        // analyze
        assertArrayEquals(expected, actual);        
    }

    @Test
    public void noOddsMixed() {
        // setup
        int[] original = {9, 2, 4, 3, 11, 15, 6, 2, 24};
        int[] expected = {2, 4, 6, 2, 24};

        // invoke
        int[] actual = MiniPracticum5.noOdds(original);

        // analyze
        assertArrayEquals(expected, actual);        
    }
}
