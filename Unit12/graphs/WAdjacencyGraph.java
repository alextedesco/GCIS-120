package graphs;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * A weighted adjacency graph.
 */
public class WAdjacencyGraph<E> implements WGraph<E> {
    /**
     * The map of values to vertices in the graph.
     */
    private final Map<E, WVertex<E>> vertices;
    
    /**
     * Creates an empty graph.
     */
    public WAdjacencyGraph() {
        vertices = new HashMap<>();
    }

    @Override
    public void add(E value) {
        WVertex<E> vertex = new WVertex<>(value);
        vertices.put(value, vertex);
    }

    @Override
    public boolean contains(E value) {
        return vertices.containsKey(value);
    }

    @Override
    public int size() {
        return vertices.size();
    }

    @Override
    public void connect(E a, E b, double weight) {
        WVertex<E> vertexA = vertices.get(a);
        WVertex<E> vertexB = vertices.get(b);
        vertexA.connect(vertexB, weight);
        vertexB.connect(vertexA, weight);

        if(a.equals("E") && b.equals("G")) {
            System.out.println(a + " = " + vertexA.edges());
            System.out.println(b + " = " + vertexB.edges());
        }

    }

    @Override
    public boolean connected(E a, E b) {
        WVertex<E> vertexA = vertices.get(a);
        WVertex<E> vertexB = vertices.get(b);
        return vertexA.edge(vertexB) != null;
    }

    @Override
    public double weight(E a, E b) {
        WVertex<E> vertexA = vertices.get(a);
        WVertex<E> vertexB = vertices.get(b);
        return vertexA.edge(vertexB).getWeight();
    }

    @Override
    public Collection<E> getValues() {
        return vertices.keySet();
    }

    @Override
    public WPath<E> nearestNeighbors(E start, E end) {
        WVertex<E> s = vertices.get(start);
        WVertex<E> e = vertices.get(end);

        Set<WVertex<E>> visited = new HashSet<>();
        visited.add(s);

        return visitDFPath(s, e, visited);
    }

    private WPath<E> visitDFPath(WVertex<E> v, WVertex<E> e, 
    Set<WVertex<E>> visited) {
    if(v == e) {
        WPath<E> path = new WPath<>(e.getValue());
        return path;
    } else {
        for(Edge<E> edge : v.edges()) {
            WVertex<E> neighbor = edge.getTo();
            if(!visited.contains(neighbor)) {
                visited.add(neighbor);
                WPath<E> path = visitDFPath(neighbor, e, visited);
                if(path != null) {
                    path.prepend(v.getValue(), edge.getWeight());
                    return path;
                }
            }
        }
        return null;
    }
}

public WPath<E> dijkstraPath (E start, E end) {
    // setup
    Map<WVertex<E>, PathTuple<E>> pred = new HashMap<>();
    TupleQueue<E> queue = new TupleQueue<>();

    for (WVertex<E> vertex : vertices.values()) {
        PathTuple<E> tuple = new PathTuple<>(vertex);
        pred.put(vertex, tuple);
        queue.enqueue(tuple);
    }

    WVertex<E> startVertex = vertices.get(start);
    PathTuple<E> startTuple = pred.get(startVertex);
    startTuple.update(null, 0);
    
    // step 2: the main loop
    while (queue.size() > 0) {
        PathTuple<E> closest = queue.dequeue();
        if (closest.getDistance() == Double.MAX_VALUE) {
            break;
        }

        WVertex<E> v = closest.getVertex();
        double distanceFromStart = closest.getDistance();
        for (Edge<E> edge : v.edges()) {
            double distance = distanceFromStart + edge.getWeight();
            WVertex<E> neighbor = edge.getTo();
            PathTuple<E> nTuple = pred.get(neighbor);
            nTuple.update(v, distance); // Update is ignored if distance > current
        }
    }

    return null;
    }
}
