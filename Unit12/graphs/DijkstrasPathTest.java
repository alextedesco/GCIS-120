package graphs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class DijkstrasPathTest {
    @Test
    public void testGraphAAToE() {
        // setup
        WGraph<String> graph = GraphMaker.makeGraphA();

        // invoke
        WPath<String> path = graph.dijkstrasPath("A", "E");

        // analyze
        assertNotNull(path);
        assertEquals(4, path.size());
        assertEquals(10, path.distance(), 0.0);
        assertEquals("A", path.get(0));
        assertEquals("C", path.get(1));
        assertEquals("G", path.get(2));
        assertEquals("E", path.get(3));
    }

    @Test
    public void testGraphADToG() {
        // setup
        WGraph<String> graph = GraphMaker.makeGraphA();

        // invoke
        WPath<String> path = graph.dijkstrasPath("D", "G");

        // analyze
        assertNotNull(path);
        assertEquals(4, path.size());
        assertEquals(8, path.distance(), 0.0);
        assertEquals("D", path.get(0));
        assertEquals("A", path.get(1));
        assertEquals("C", path.get(2));
        assertEquals("G", path.get(3));
    }

    @Test
    public void testGraphBAToG() {
        // setup
        WGraph<String> graph = GraphMaker.makeGraphB();

        // invoke
        WPath<String> path = graph.dijkstrasPath("A", "G");

        // analyze
        assertNotNull(path);
        assertEquals(5, path.size());
        assertEquals(17, path.distance(), 0.0);
        assertEquals("A", path.get(0));
        assertEquals("B", path.get(1));
        assertEquals("E", path.get(2));
        assertEquals("F", path.get(3));
        assertEquals("G", path.get(4));
    }

    @Test
    public void testGraphBAToK() {
        // setup
        WGraph<String> graph = GraphMaker.makeGraphB();

        // invoke
        WPath<String> path = graph.dijkstrasPath("A", "K");

        // analyze
        assertNull(path);
    }
}
