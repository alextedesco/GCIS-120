package mcf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class ArrayListTest {
    @Test
    public void emptyList() {
        // setup
        ArrayList<String> array_list = new ArrayList<>();

        // invoke
        String actual = array_list.toString();
        String expected = "[null, null], 0";

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void appendOneValue() {
        // setup
        ArrayList<String> array_list = new ArrayList<>();
        array_list.append("a");


        // invoke
        String actual = array_list.toString();
        String expected = "[a, null], 1";

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void appendThreeValues() {
        // setup
        ArrayList<String> array_list = new ArrayList<>();
        array_list.append("a");
        array_list.append("b");
        array_list.append("c");


        // invoke
        String actual = array_list.toString();
        String expected = "[a, b, c, null], 3";

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void insertAtZeroEmpty() {
        // setup
        ArrayList<String> array_list = new ArrayList<>();
        array_list.insert(0, "a");

        // invoke

        String actual = array_list.toString();
        String expected = "[a, null], 1";

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void insertAtZeroFiveValues() {
        // setup
        ArrayList<String> array_list = new ArrayList<>();
        array_list.append("a");
        array_list.append("b");
        array_list.append("c");
        array_list.append("d");
        array_list.append("e");
        array_list.insert(0, "f");

        // invoke

        String actual = array_list.toString();
        String expected = "[f, a, b, c, d, e, null, null], 6";

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void insertAtThreeFiveValues() {
        // setup
        ArrayList<String> array_list = new ArrayList<>();
        array_list.append("a");
        array_list.append("b");
        array_list.append("c");
        array_list.append("d");
        array_list.append("e");
        array_list.insert(3, "f");

        // invoke

        String actual = array_list.toString();
        String expected = "[a, b, c, f, d, e, null, null], 6";

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void insertAtFiveFiveValues() {
        // setup
        ArrayList<String> array_list = new ArrayList<>();
        array_list.append("a");
        array_list.append("b");
        array_list.append("c");
        array_list.append("d");
        array_list.append("e");
        array_list.insert(5, "f");

        // invoke

        String actual = array_list.toString();
        String expected = "[a, b, c, d, e, f, null, null], 6";

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void removeAtZeroOneValue() {
        // setup
        ArrayList<String> array_list = new ArrayList<>();
        array_list.append("a");
        array_list.remove(0);

        // invoke

        String actual = array_list.toString();
        String expected = "[null, null], 0";

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void removeAtThreeFiveValues() {
        // setup
        ArrayList<String> array_list = new ArrayList<>();
        array_list.append("a");
        array_list.append("b");
        array_list.append("c");
        array_list.append("d");
        array_list.append("e");
        array_list.remove(3);

        // invoke

        String actual = array_list.toString();
        String expected = "[a, b, c, e, null, null, null, null], 4";

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void removeAtFourFiveValues() {
        // setup
        ArrayList<String> array_list = new ArrayList<>();
        array_list.append("a");
        array_list.append("b");
        array_list.append("c");
        array_list.append("d");
        array_list.append("e");
        array_list.remove(4);

        // invoke

        String actual = array_list.toString();
        String expected = "[a, b, c, d, null, null, null, null], 4";

        // analyze
        assertEquals(expected, actual);
    }
}