package mcf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class LinkedListTest {
    @Test
    public void emptyList() {
        // setup
        LinkedList<String> linked_list = new LinkedList<>();

        // invoke
        String actual = linked_list.toString();
        String expected = "null, 0";

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void appendOneValue() {
        // setup
        LinkedList<String> linked_list = new LinkedList<>();
        linked_list.append("a");


        // invoke
        String actual = linked_list.toString();
        String expected = "a -> null, 1";

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void appendThreeValues() {
        // setup
        LinkedList<String> linked_list = new LinkedList<>();
        linked_list.append("a");
        linked_list.append("b");
        linked_list.append("c");


        // invoke
        String actual = linked_list.toString();
        String expected = "a -> b -> c -> null, 3";

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void insertAtZeroEmpty() {
        // setup
        LinkedList<String> linked_list = new LinkedList<>();
        linked_list.insert(0, "a");

        // invoke

        String actual = linked_list.toString();
        String expected = "a -> null, 1";

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void insertAtZeroFiveValues() {
        // setup
        LinkedList<String> linked_list = new LinkedList<>();
        linked_list.append("a");
        linked_list.append("b");
        linked_list.append("c");
        linked_list.append("d");
        linked_list.append("e");
        linked_list.insert(0, "f");

        // invoke
        String actual = linked_list.toString();
        String expected = "f -> b -> c -> d -> e -> null -> null, 6";

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void insertAtThreeFiveValues() {
        // setup
        LinkedList<String> linked_list = new LinkedList<>();
        linked_list.append("a");
        linked_list.append("b");
        linked_list.append("c");
        linked_list.append("d");
        linked_list.append("e");
        linked_list.insert(3, "f");

        // invoke

        String actual = linked_list.toString();
        String expected = "a -> b -> c -> f -> e -> null -> null, 6";

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void insertAtFiveFiveValues() {
        // setup
        LinkedList<String> linked_list = new LinkedList<>();
        linked_list.append("a");
        linked_list.append("b");
        linked_list.append("c");
        linked_list.append("d");
        linked_list.append("e");
        linked_list.insert(5, "f");

        // invoke

        String actual = linked_list.toString();
        String expected = "a -> b -> c -> d -> e -> f -> null, 6";

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void removeAtZeroOneValue() {
        // setup
        LinkedList<String> linked_list = new LinkedList<>();
        linked_list.append("a");
        linked_list.remove(0);

        // invoke

        String actual = linked_list.toString();
        String expected = "null -> null, 0";

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void removeAtThreeFiveValues() {
        // setup
        LinkedList<String> linked_list = new LinkedList<>();
        linked_list.append("a");
        linked_list.append("b");
        linked_list.append("c");
        linked_list.append("d");
        linked_list.append("e");
        linked_list.remove(3);

        // invoke

        String actual = linked_list.toString();
        String expected = "a -> b -> c -> e -> null -> null, 4";

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void removeAtFourFiveValues() {
        // setup
        LinkedList<String> linked_list = new LinkedList<>();
        linked_list.append("a");
        linked_list.append("b");
        linked_list.append("c");
        linked_list.append("d");
        linked_list.append("e");
        linked_list.remove(4);

        // invoke

        String actual = linked_list.toString();
        String expected = "a -> b -> c -> d -> null -> null, 4";

        // analyze
        assertEquals(expected, actual);
    }

}

    