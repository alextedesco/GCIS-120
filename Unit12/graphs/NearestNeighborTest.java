package graphs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class NearestNeighborTest {
    @Test
    public void nearestNeighborGraphA() {
        // setup
        WGraph<String> graph = GraphMaker.makeGraphA();

        // invoke
        WPath<String> path = graph.nearestNeighbors("A", "E");

        // analyze
        assertNotNull(path);
        assertEquals(11.0, path.distance(), 0.0);
        assertEquals(5, path.size());
        assertEquals("A", path.get(0));
        assertEquals("C", path.get(1));
        assertEquals("B", path.get(2));
        assertEquals("G", path.get(3));
        assertEquals("E", path.get(4));
    }

    @Test
    public void nearestNeighborGraphBPath() {
        // setup
        WGraph<String> graph = GraphMaker.makeGraphB();

        // invoke
        WPath<String> path = graph.nearestNeighbors("A", "G");

        // analyze
        assertNotNull(path);
        assertEquals(35.0, path.distance(), 0.0);
        assertEquals(7, path.size());
        assertEquals("A", path.get(0));
        assertEquals("B", path.get(1));
        assertEquals("E", path.get(2));
        assertEquals("C", path.get(3));
        assertEquals("D", path.get(4));
        assertEquals("F", path.get(5));
        assertEquals("G", path.get(6));
    }

    @Test
    public void nearestNeighborGraphBNoPath() {
        // setup
        WGraph<String> graph = GraphMaker.makeGraphB();

        // invoke
        WPath<String> path = graph.nearestNeighbors("A", "J");

        // analyze
        assertNull(path);
    }
}
