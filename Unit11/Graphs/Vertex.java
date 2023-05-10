package Graphs;

import java.util.HashSet;
import java.util.Set;

public class Vertex<T> {
    private T value;
    private final Set<Vertex<T>> neighbors;

    public Vertex (T value) {
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    public T getValue() {
        return value;
    }

    public void connect (Vertex<T> neighbor) {
        neighbors.add(neighbor);
    }

    public boolean connected (Vertex<T> vertex) {
        return neighbors.contains(vertex);
    }

    public Set<Vertex<T>> getNeighbors () {
        return neighbors;
    }

    @Override
    public String toString() {
        return value + " " + neighbors;
    }




    
}
