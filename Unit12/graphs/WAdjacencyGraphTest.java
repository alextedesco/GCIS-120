package graphs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class WAdjacencyGraphTest {
    @Test
    public void create() {
        // setup - none

        // invoke
        WGraph<String> graph = new WAdjacencyGraph<>();

        // analyze
        assertEquals(0, graph.size());
    }

    @Test
    public void add() {
        // setup
        WGraph<String> graph = new WAdjacencyGraph<>();
        String value = "abc";

        // invoke
        graph.add(value);

        // analyze
        assertEquals(1, graph.size());
        assertTrue(graph.contains(value));
    }

    @Test
    public void connect() {
        // setup
        String a = "abc";
        String b = "def";
        double weight = 123.456;
        WGraph<String> graph = new WAdjacencyGraph<>();
        graph.add(a);
        graph.add(b);

        // invoke
        graph.connect(a, b, weight);

        // analyze
        assertTrue(graph.connected(a, b));
        assertEquals(weight, graph.weight(a, b));
    }


}
