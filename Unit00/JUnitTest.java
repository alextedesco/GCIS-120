import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

/**
 * This is a class JavaDoc comment. You can think of it like a Python module 
 * comment. Note that it starts with a slash-DOUBLE-star. 
 * 
 * Class JavaDoc is used to describe the purpose of the class. The purpose of 
 * this class is to test your VS Code JUnit configuration.
 * 
 * @author Alex Tedesco
 */
@Testable // this is an annotation used by VS Code to find unit tests.
public class JUnitTest {
    /**
     * This is a method JavaDoc comment. Its purpose is the same as a Python
     * docstring. These comments are called "JavaDoc" and NOT DOCSTRINGS.
     * 
     * It documents the purpose of the method as well as detailed information 
     * about its parameters and return values.
     * 
     * The purpose of this method is to demonstrate what happens when a test
     * fails in VS Code.
     */
    @Test // this is an annotation used by JUnit to find test methods.
    public void exampleTest() {
        // setup
        int x = 5;
        int y = 2;
        int expected = 7;

        // invoke
        int actual = x + 1; // oops! should be x + y!

        // analyze
        assertEquals(expected, actual); // this will fail
    }
}
