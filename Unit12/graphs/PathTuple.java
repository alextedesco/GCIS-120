package graphs;

/**
 * A path tuple used to implement Dijkstra's Algorithm in a weighted graph.
 */
public class PathTuple<E> {
    /**
     * The vertex.
     */
    private final WVertex<E> vertex;

    /**
     * It's predecessor.
     */
    private WVertex<E> predecessor;

    /**
     * The total distance from the start vertex to this vertex through the
     * predecessor.
     */
    private double distance;

    /**
     * Creates a new path tuple for the specified vertex. It's predecessor is
     * null and it's distance from start is infinity.
     * 
     * @param vertex The vertex.
     */
    public PathTuple(WVertex<E> vertex) {
        this(vertex, null, Double.MAX_VALUE);
    }

    /**
     * Creates a new path tuple for the specified vertex.
     * 
     * @param vertex The vertex.
     * @param predecessor Its predecessor on the path.
     * @param distance The distance from start to the vertex through the 
     * predecessor.
     */
    public PathTuple(WVertex<E> vertex, WVertex<E> predecessor, 
        double distance) {
        this.vertex = vertex;
        this.predecessor = predecessor;
        this.distance = distance;
    }

    /**
     * Returns the vertex.
     * 
     * @return The vertex.
     */
    public WVertex<E> getVertex() {
        return vertex;
    }

    /**
     * Returns the vertex's predecessor along the path from the start. May be
     * null.
     * 
     * @return The vertex's predecessor.
     */
    public WVertex<E> getPredecessor() {
        return predecessor;
    }

    /**
     * The total distance from the start vertex to this vertex through its 
     * predecessor. May be infinite.
     * 
     * @return The total distance from start to this vertex through its 
     * predecessor.
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Updates the tuple's predecessor and distance if and only if the distance
     * is shorter than the current distance.
     * 
     * @param predecessor The potential new predecessor.
     * @param distance The potential new distance. Only used if shorter than
     * the current distance.
     */
    public void update(WVertex<E> predecessor, double distance) {
        if(distance < this.distance) {
            this.predecessor = predecessor;
            this.distance = distance;
        }
    }

    @Override
    public String toString() {
        return vertex + 
            ":(" 
            + predecessor 
            + ", " + distance + ")";
    }
}
