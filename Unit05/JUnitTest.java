import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class JUnitTest {
    @Test
    public void testJUnit() {
        assertEquals("abc", "abc");
    }
}