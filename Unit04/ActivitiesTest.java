import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class ActivitiesTest {

@Test
public void printIntegers0() {
    // setup
    int n = 0;
    int expected = 0;

    // invoke
    int actual = Activities.printIntegers(n);

    // analyze
    assertEquals(expected, actual);
    }

@Test
public void printIntegersNegative () {
    // setup
    int n = -5;
    int expected = -1;

    // invoke
    int actual = Activities.printIntegers(n);

    // analyze
    assertEquals(expected, actual);

    }

@Test
public void printIntegers5 () {
    // setup
    int n = 5;
    int expected = 15;

    // invoke
    int actual = Activities.printIntegers(n);

    // analyze
    assertEquals(expected, actual);
    }

@Test
public void factorialNegative () {
    // setup
    int n = -2;
    int expected = -1;

    // invoke
    int actual = Activities.factorial(n);

    // analyze
    assertEquals(expected, actual);
    }

@Test
public void factorial0 () {
    // setup
    int n = 0;
    int expected = 1;

    // invoke
    int actual = Activities.factorial(n);

    // analyze
    assertEquals(expected, actual);
    }

@Test
public void factorial1 () {
    // setup
    int n = 1;
    int expected = 1;

    // invoke
    int actual = Activities.factorial(n);

    // analyze
    assertEquals(expected, actual);
    }

@Test
public void factorial5 () {
    // setup
    int n = 5;
    int expected = 120;

    // invoke
    int actual = Activities.factorial(n);

    // analyze
    assertEquals(expected, actual);
    }

@Test
public void gcdNegativeA () {
    // setup
    int a = -1;
    int b = 10;
    int expected = -1;

    // invoke
    int actual = Activities.gcd(a, b);

    // analyze
    assertEquals(expected, actual);
    }

@Test
public void gcdNegativeB () {
    // setup
    int a = 5;
    int b = -1;
    int expected = -1;

    // invoke
    int actual = Activities.gcd(a, b);

    // analyze
    assertEquals(expected, actual);
    }
     
@Test
public void gcdEquals () {
    // setup
    int a = 7;
    int b = 7;
    int expected = 7;
    
    // invoke
    int actual = Activities.gcd(a, b);
    
    // analyze
    assertEquals(expected, actual);
        }

@Test
public void gcdGreater () {
    // setup
    int a = 20;
    int b = 10;
    int expected = 10;
    
    // invoke
    int actual = Activities.gcd(a, b);
    
    // analyze
    assertEquals(expected, actual);
        }

@Test
public void gcdLesser () {
    // setup
    int a = 15;
    int b = 30;
    int expected = 15;
    
    // invoke
    int actual = Activities.gcd(a, b);
    
    // analyze
    assertEquals(expected, actual);
        }
}
