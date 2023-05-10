package graphs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * A weighted vertex.
 */
public class WVertex<E> {
    /**
     * The value.
     */
    private E value;

    /**
     * The set of weighted edges connecting this vertex to its neighbors.
     */
    private final Map<WVertex<E>, Edge<E>> neighbors;    

    public WVertex(E value) {
        this.value = value;
        neighbors = new HashMap<>();
    }

    /**
     * Returns the value.
     * 
     * @return The value.
     */
    public E getValue() {
        return value;
    }

    /**
     * Connects the vertex to its neighbor by creating an edge with the 
     * specified weight.
     * 
     * @param neighbor The neighbor to connect to.
     * @param weight The weight of the edge between the vertex and its neighbor.
     */
    public void connect(WVertex<E> neighbor, double weight) {
        Edge<E> edge = new Edge<>(this, neighbor, weight);
        neighbors.put(neighbor, edge);
    }   

    /**
     * Returns the set of edges connecting from this vertex to its neighbors.
     * @return The set of edges form this vertex to its neighbors.
     */
    public Set<Edge<E>> edges() {
        return new TreeSet<>(neighbors.values());
    }

    /**
     * Returns the edge connecting from this vertex to the specified neighbor
     * (if it exists).
     * 
     * @param neighbor The neighbor.
     * @return The edge to the neighbor, or null if it does not exist.
     */
    public Edge<E> edge(WVertex<E> neighbor) {
        return neighbors.get(neighbor);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
