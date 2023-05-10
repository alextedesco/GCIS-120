package graphs;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class PracticumTest {
    @Test
    public void helloWorld() {
        assertEquals("Hello, World!", "Hello, World!");
        assertTrue(true);
        assertFalse(false);
        assertNotNull("test");
    }

    @Test
    public void makeGraph01() {
        // setup - none

        // invoke
        Graph<String> graph = GraphMaker.makeGraph01();

        // analyze
        assertNotNull(graph);
        assertFalse(graph.connected("A", "A"));
        assertTrue(graph.connected("A", "B"));
        assertFalse(graph.connected("A", "C"));
        assertFalse(graph.connected("A", "D"));
        assertFalse(graph.connected("A", "E"));

        assertFalse(graph.connected("B", "A"));
        assertFalse(graph.connected("B", "B"));
        assertTrue(graph.connected("B", "C"));
        assertFalse(graph.connected("B", "D"));
        assertTrue(graph.connected("B", "E"));

        assertFalse(graph.connected("C", "A"));
        assertFalse(graph.connected("C", "B"));
        assertFalse(graph.connected("C", "C"));
        assertTrue(graph.connected("C", "D"));
        assertFalse(graph.connected("C", "E"));

        assertFalse(graph.connected("D", "A"));
        assertFalse(graph.connected("D", "B"));
        assertFalse(graph.connected("D", "C"));
        assertFalse(graph.connected("D", "D"));
        assertFalse(graph.connected("D", "E"));

        assertTrue(graph.connected("E", "A"));
        assertFalse(graph.connected("E", "B"));
        assertFalse(graph.connected("E", "C"));
        assertFalse(graph.connected("E", "D"));
        assertFalse(graph.connected("E", "E"));
    }

    @Test
    public void makeGraph02() {
        // setup - none

        // invoke
        Graph<String> graph = GraphMaker.makeGraph02();

        // analyze
        assertNotNull(graph);
        assertFalse(graph.connected("T", "T"));
        assertFalse(graph.connected("T", "U"));
        assertTrue(graph.connected("T", "V"));
        assertFalse(graph.connected("T", "W"));
        assertFalse(graph.connected("T", "X"));
        assertFalse(graph.connected("T", "Y"));
        assertFalse(graph.connected("T", "Z"));

        assertFalse(graph.connected("U", "T"));
        assertFalse(graph.connected("U", "U"));
        assertFalse(graph.connected("U", "V"));
        assertFalse(graph.connected("U", "W"));
        assertFalse(graph.connected("U", "X"));
        assertFalse(graph.connected("U", "Y"));
        assertFalse(graph.connected("U", "Z"));

        assertFalse(graph.connected("V", "T"));
        assertFalse(graph.connected("V", "U"));
        assertFalse(graph.connected("V", "V"));
        assertFalse(graph.connected("V", "W"));
        assertFalse(graph.connected("V", "X"));
        assertFalse(graph.connected("V", "Y"));
        assertFalse(graph.connected("V", "Z"));

        assertTrue(graph.connected("W", "T"));
        assertFalse(graph.connected("W", "U"));
        assertFalse(graph.connected("W", "V"));
        assertFalse(graph.connected("W", "W"));
        assertFalse(graph.connected("W", "X"));
        assertFalse(graph.connected("W", "Y"));
        assertFalse(graph.connected("W", "Z"));

        assertTrue(graph.connected("X", "T"));
        assertTrue(graph.connected("X", "U"));
        assertFalse(graph.connected("X", "V"));
        assertFalse(graph.connected("X", "W"));
        assertFalse(graph.connected("X", "X"));
        assertFalse(graph.connected("X", "Y"));
        assertFalse(graph.connected("X", "Z"));

        assertFalse(graph.connected("Y", "T"));
        assertFalse(graph.connected("Y", "U"));
        assertFalse(graph.connected("Y", "V"));
        assertTrue(graph.connected("Y", "W"));
        assertTrue(graph.connected("Y", "X"));
        assertFalse(graph.connected("Y", "Y"));
        assertFalse(graph.connected("Y", "Z"));

        assertFalse(graph.connected("Z", "T"));
        assertTrue(graph.connected("Z", "U"));
        assertFalse(graph.connected("Z", "V"));
        assertFalse(graph.connected("Z", "W"));
        assertFalse(graph.connected("Z", "X"));
        assertTrue(graph.connected("Z", "Y"));
        assertFalse(graph.connected("Z", "Z"));
    }

    @Test
    public void isMOtherVertexGraph01() {
        Graph<String> graph = GraphMaker.makeGraph01();
        assertTrue(graph.isMotherVertex("A"));
        assertTrue(graph.isMotherVertex("B"));
        assertFalse(graph.isMotherVertex("C"));
        assertFalse(graph.isMotherVertex("D"));
        assertTrue(graph.isMotherVertex("E"));
    }

    // @Test
    // public void isMOtherVertexGraph02() {
    //     Graph<String> graph = GraphMaker.makeGraph02();
    //     assertFalse(graph.isMotherVertex("T"));
    //     assertFalse(graph.isMotherVertex("U"));
    //     assertFalse(graph.isMotherVertex("V"));
    //     assertFalse(graph.isMotherVertex("W"));
    //     assertFalse(graph.isMotherVertex("X"));
    //     assertFalse(graph.isMotherVertex("Y"));
    //     assertTrue(graph.isMotherVertex("Z"));
    // }
}
