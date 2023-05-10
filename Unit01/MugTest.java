import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class MugTest {
    public void testCreate () {
        // setup
        double size = 12.5;
        String color = "red";
        String phrase = "I Hate Mondays";
        double fillLevel = 0.0;

        // invoke
        Mug mug = new Mug(size, color, fillLevel, phrase);

        // analyze
        assertEquals(size, mug.getSize());
        assertEquals(color, mug.getSize());
        assertEquals(phrase, mug.getPhrase());
        assertEquals(fillLevel, mug.getFillLevel());
    }
    @Test
    public void testSetPhrase () {
        // setup
        Mug mug = new Mug (12.0, "Red", "blah");
        String phrase = "I love cookies";

        // invoke

        mug.setPhrase(phrase);

        // analyze
        assertEquals(phrase, mug.getPhrase());
    }
    
}
