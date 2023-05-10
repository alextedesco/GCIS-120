/**
 * This file tests ArrayStack.java
 * @author Alex Tedesco
 */

// Imports
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class ArrayStackTest {

@Test
public void testToString () {
    // setup
    ArrayStack<Integer> stack_1 = new ArrayStack();
    // invoke
    String expected = stack_1.toString();
    String actual = "Stack{[null, null, null]}";
    // analysis
    assertEquals(expected, actual);
    }

@Test
public void testSize () {
    // setup
    ArrayStack<Integer> stack_1 = new ArrayStack();
    // invoke
    int expected = stack_1.size();
    int actual = 0;
    // analysis
    assertEquals(expected, actual);
    }

@Test
public void testIsEmpty () {
    // setup
    ArrayStack<Integer> stack_1 = new ArrayStack();
    // invoke
    boolean expected = stack_1.isEmpty();
    boolean actual = true;
    // analysis
    assertEquals(expected, actual);
    }

@Test
public void testPush () {
    // setup
    ArrayStack<Integer> stack_1 = new ArrayStack();
    // invoke
    stack_1.push(3);
    stack_1.push(2);
    stack_1.push(1);
    String expected = stack_1.toString();
    String actual = "Stack{[3, 2, 1]}";
    // analysis
    assertEquals(expected, actual);
    }

@Test
public void testTop () {
    // setup
    ArrayStack<Integer> stack_1 = new ArrayStack();
    // invoke
    stack_1.push(3);
    stack_1.push(2);
    stack_1.push(1);
    int expected = stack_1.top();
    int actual = 1;
    // analysis
    assertEquals(expected, actual);
    }
    
@Test
public void testPop () {
    // setup
    ArrayStack<Integer> stack_1 = new ArrayStack();
    // invoke
    stack_1.push(3);
    stack_1.push(2);
    stack_1.push(1);
    int expected = stack_1.pop();
    int actual = 1;
    // analysis
    assertEquals(expected, actual);
    }
}