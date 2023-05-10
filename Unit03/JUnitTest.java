import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class JUnitTest {
    @Test
    public void helloJUnit() {
        assertEquals("abc", "abc");
    }
}
