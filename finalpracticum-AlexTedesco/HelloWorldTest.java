import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class HelloWorldTest {
    @Test
    public void helloWorld() {
        assertEquals("Hello, World!", "Hello, World!");
    }
}