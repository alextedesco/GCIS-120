import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class Practicum06Test {
    @Test
    public void helloWorld() {
        assertEquals("Hello, World!", "Hello, World!");
    }

    @Test
    public void arrayToListEmpty() {
        // setup
        int[] array = {};
        ArrayList<Integer> expected = new ArrayList<>();
        
        // invoke
        ArrayList<Integer> actual = Practicum06.arrayToList(array);

        // analyze
        assertEquals(expected, actual);
    }

    @Test
    public void arrayToListThree() {
        // setup
        int[] array = {3, 5, 2, 1};
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(5);
        expected.add(2);
        expected.add(1);
        
        // invoke
        ArrayList<Integer> actual = Practicum06.arrayToList(array);

        // analyze
        assertEquals(expected, actual);
        
    }

    @Test
    public void uniqueValuesEmpty() {
        // setup
        ArrayList<Integer> original = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();

        // invoke
        ArrayList<Integer> actual = Practicum06.uniqueValues(original);

        // analyze
        assertEquals(expected, actual);   
    }

    @Test
    public void uniqueValuesNoChange() {
        // setup
        int[] array = {1, 2, 3, 4};
        ArrayList<Integer> expected = Practicum06.arrayToList(array);

        // invoke
        ArrayList<Integer> actual = Practicum06.uniqueValues(expected);

        // analyze
        Collections.sort(expected);
        Collections.sort(actual);
        assertEquals(expected, actual);   
    }

    @Test
    public void uniqueValuesThree() {
        // setup
        int[] array = {7, 5, 7, 9, 7, 7, 9, 5};
        ArrayList<Integer> original = Practicum06.arrayToList(array);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(7);
        expected.add(9);

        // invoke
        ArrayList<Integer> actual = Practicum06.uniqueValues(original);

        // analyze
        Collections.sort(expected);
        Collections.sort(actual);
        assertEquals(expected, actual);   
    }

    // @Test
    // public void characterCountEmpty() {
    //     // setup
    //     String string = "";

    //     // invoke
    //     HashMap<Character, Integer> map = Practicum06.characterCount(string);

    //     // analyze
    //     assertEquals(0, map.size());
    // }

    // @Test
    // public void characterCountAAA() {
    //     // setup
    //     String string = "AAA";

    //     // invoke
    //     HashMap<Character, Integer> map = Practicum06.characterCount(string);

    //     // analyze
    //     assertEquals(1, map.size());
    //     assertEquals(3, map.get('A').intValue());
    // }

    // @Test
    // public void characterCountHelloWorld() {
    //     // setup
    //     String string = "Hello, World!";

    //     // invoke
    //     HashMap<Character, Integer> map = Practicum06.characterCount(string);

    //     // analyze
    //     assertEquals(10, map.size());
    //     assertEquals(1, map.get('H').intValue());
    //     assertEquals(1, map.get('e').intValue());
    //     assertEquals(3, map.get('l').intValue());
    //     assertEquals(2, map.get('o').intValue());
    //     assertEquals(1, map.get(',').intValue());
    //     assertEquals(1, map.get(' ').intValue());
    //     assertEquals(1, map.get('W').intValue());
    //     assertEquals(1, map.get('r').intValue());
    //     assertEquals(1, map.get('d').intValue());
    //     assertEquals(1, map.get('!').intValue());
    // }
}
