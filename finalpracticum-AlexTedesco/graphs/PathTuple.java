package graphs;


public class PathTuple<E> {
    private final WVertex<E> vertex;
    private WVertex<E> predecessor;
    private double distance;

    public PathTuple(WVertex<E> vertex) {
        this(vertex, null, Double.MAX_VALUE);
    }

    public PathTuple(WVertex<E> vertex, WVertex<E> predecessor, double distance) {
        this.vertex = vertex;
        this.predecessor = predecessor;
        this.distance = distance;
    }

    public WVertex<E> getPredecessor() {
        return predecessor;
    }

    public WVertex<E> getVertex() {
        return vertex;
    }

    public double getDistance() {
        return distance;
    }

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
            + ", " + (distance == Double.MAX_VALUE ? 
                "infinity" : Double.toString(distance))
            + ")";
    }
}
