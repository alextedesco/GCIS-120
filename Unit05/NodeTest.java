import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class NodeTest {

@Test
public void testNodesEquals () {
    // setup
    Node<Integer> seq_1 = null;
    Node<Integer> seq_2 = null;
    // invoke
    Node<Integer> expected = null;
    boolean actual = Nodes.nodesEquals(seq_1, seq_2);
    // analysis
    assertEquals(expected, actual);
    }
}
