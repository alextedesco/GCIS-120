import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable

public class RecursionTest {

@Test
public void product() {
    int n = 10;
    int divisor = 3;
    int product = 1;
    int expected = 162;


    // invoke
    int actual = Recursion.multiples(n, divisor, product);

    // analysis
    assertEquals(expected, actual);


    
}
    
}
