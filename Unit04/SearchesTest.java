import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class SearchesTest {

@Test
public void binarySearchStartGreater() {
    // setup
    int[] array = {1, 3, 5, 7, 9, 10, 11, 13, 18, 19};
    int target = 9;
    int start = 5;
    int end = 4;
    int expected = -1;

    // invoke
    int actual = Searches.binarySearch(array, target, start, end);

    // analyze
    assertEquals(expected, actual);
}

@Test
public void binarySearchStartAtMidpoint() {
    // setup
    int[] array = {1, 3, 5, 7, 9, 10, 11, 13, 18, 19};
    int target = 9;
    int start = 0;
    int end = array.length - 1;
    int expected = 5;

    // invoke
    int actual = Searches.binarySearch(array, target, start, end);

    // analyze
    assertEquals(expected, actual);
}

@Test
public void binarySearchStartTargetLeft() {
    // setup
    int[] array = {1, 3, 5, 7, 9, 10, 11, 13, 18, 19};
    int target = 5;
    int start = 0;
    int end = array.length - 1;
    int expected = 2;

    // invoke
    int actual = Searches.binarySearch(array, target, start, end);

    // analyze
    assertEquals(expected, actual);
}

@Test
public void binarySearchStartTargetRight() {
    // setup
    int[] array = {1, 3, 5, 7, 9, 10, 11, 13, 18, 19};
    int target = 5;
    int start = 0;
    int end = array.length - 1;
    int expected = 2;

    // invoke
    int actual = Searches.binarySearch(array, target, start, end);

    // analyze
    assertEquals(expected, actual);
    }   
}
