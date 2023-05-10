package graphs;

import java.util.Collection;

/**
 * The abstract data type for a weighted graph.
 */
public interface WGraph<E> {
    /**
     * Adds a value to the graph.
     * 
     * @param value The value being added to the graph.
     */
    void add(E value);

    /**
     * Returns true if the value is present in the graph.
     * 
     * @param value The value.
     * @return True if the value is present in the graph. False if it is not.
     */
    boolean contains(E value);

    /**
     * The number of values in the graph.
     * 
     * @return The number of values in the graph.
     */
    int size();

    /**
     * Creates an undirected edge between the two values in the grpah.
     * 
     * @param a The firts value.
     * @param b The second value.
     * @param weight The weight (or cost) of the new edge between the values.
     */
    void connect(E a, E b, double weight);

    /**
     * Returns true if the two values are connected by an edge.
     * 
     * @param a The first value.
     * @param b The second value.
     * @return True if the two values are connected by an edge.
     */
    boolean connected(E a, E b);
    double weight(E a, E b);

    /**
     * Returns all of the values in the graph.
     * 
     * @return All of the values in the graph.
     */
    default Collection<E> getValues() {
        throw new UnsupportedOperationException(
            "get values!");
    }

    /**
     * Finds a path from start to end using the nearest neighbors algorithm.
     * 
     * @param start The starting value.
     * @param end The ending value.
     * @return The weighted path from start to end (if it exists).
     */
    default WPath<E> nearestNeighbors(E start, E end) {
        throw new UnsupportedOperationException(
            "nearest neighbors not implemented!");
    }

    /**
     * Finds a path from start to end using Dijkstra's Algorithm.
     * 
     * @param start The starting value.
     * @param end The ending value.
     * @return The weighted path from start to end (if if exists).
     */
    default WPath<E> dijkstrasPath(E start, E end) {
        throw new UnsupportedOperationException(
            "Dijkstra's Path not implemented!");
    }
}
