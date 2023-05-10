package graphs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class WVertexTest {
    @Test
    public void create() {
        // setup
        String value = "abc";
        
        // invoke
        WVertex<String> vertex = new WVertex<>(value);

        // analyze
        assertEquals(value, vertex.getValue());
        assertEquals(value, vertex.toString());
    }

    @Test
    public void connectOne() {
        // setup
        WVertex<Integer> vertex = new WVertex<>(123);
        WVertex<Integer> neighbor = new WVertex<Integer>(456);
        double weight = 456.789;

        // invoke
        vertex.connect(neighbor, weight);

        // analyze
        Edge<Integer> edge = vertex.edge(neighbor);
        assertNotNull(edge);
        assertEdge(edge, vertex, neighbor, weight);
    }

    @Test
    public void connectThree() {
        // setup
        WVertex<Integer> vertex = new WVertex<>(123);
        WVertex<Integer> neighborOne = new WVertex<Integer>(456);
        double weightOne = 456.789;
        WVertex<Integer> neighborTwo = new WVertex<Integer>(789);
        double weightTwo = 123.456;
        WVertex<Integer> neighborThr = new WVertex<Integer>(980);
        double weightThr = 234.567;

        // invoke
        vertex.connect(neighborOne, weightOne);
        vertex.connect(neighborTwo, weightTwo);
        vertex.connect(neighborThr, weightThr);

        // analyze
        Set<Edge<Integer>> edges = vertex.edges();
        assertEquals(3, edges.size());
        Iterator<Edge<Integer>> iterator = edges.iterator();
        assertEdge(iterator.next(), vertex, neighborTwo, weightTwo);
        assertEdge(iterator.next(), vertex, neighborThr, weightThr);
        assertEdge(iterator.next(), vertex, neighborOne, weightOne);
    }

    /**
     * Helper function that asserts that an edge has been properly created
     * between two vertices. The "?" type parameter means that it will work
     * with edges/vertices of any type.
     * 
     * @param edge The edge to assert.
     * @param from The source vertex.
     * @param to The destination vertex.
     * @param weight The expected weight of the edge.
     */
    private void assertEdge(Edge<?> edge, WVertex<?> from, WVertex<?> to, 
        double weight) {
        assertEquals(from, edge.getFrom());
        assertEquals(to, edge.getTo());
        assertEquals(weight, edge.getWeight());
    }
}
