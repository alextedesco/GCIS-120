package graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class WAdjacencyGraph<E> implements WGraph<E> {
    private final Map<E, WVertex<E>> vertices;
    
    public WAdjacencyGraph() {
        vertices = new HashMap<>();
    }

    @Override
    public void add(E value) {
        if(!vertices.containsKey(value)) {
            WVertex<E> vertex = new WVertex<>(value);
            vertices.put(value, vertex);
        }
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
    public Set<E> values() {
        return new TreeSet<>(vertices.keySet());
    }

    @Override
    public WPath<E> nearestNeighbors(E start, E end) {
        WVertex<E> s = vertices.get(start);
        WVertex<E> e = vertices.get(end);

        Set<WVertex<E>> visited = new HashSet<>();
        visited.add(s);

        return visitNearestNeighbor(s, e, visited);
    }

    private WPath<E> visitNearestNeighbor(WVertex<E> v, WVertex<E> e, 
        Set<WVertex<E>> visited) {
        if(v == e) {
            WPath<E> path = new WPath<>(e.getValue());
            return path;
        } else {
            for(Edge<E> edge : v.edges()) {
                WVertex<E> neighbor = edge.getTo();
                if(!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    WPath<E> path = visitNearestNeighbor(neighbor, e, visited);
                    if(path != null) {
                        path.prepend(v.getValue(), edge.getWeight());
                        return path;
                    }
                }
            }
            return null;
        }
    }

    @Override
    public WPath<E> dijkstrasPath(E start, E end) {
        // step 1: setup
        WVertex<E> startV = vertices.get(start);
        WVertex<E> endV = vertices.get(end);

        Map<WVertex<E>, PathTuple<E>> tuples = new HashMap<>();
        TupleQueue<E> queue = new TupleQueue<>();

        for(E value : vertices.keySet()) {
            WVertex<E> vertex = vertices.get(value);
            PathTuple<E> tuple = new PathTuple<>(vertex);
            tuples.put(vertex, tuple);
            queue.enqueue(tuple);
        }

        tuples.get(startV).update(null, 0);

        // step 2: the main loop
        while(queue.size() > 0) {
            PathTuple<E> tuple = queue.dequeue();
            if(tuple.getDistance() == Double.MAX_VALUE) {
                // unreachable
                break;
            } else {
                WVertex<E> v = tuple.getVertex();
                for(Edge<E> edge : v.edges()) {
                    WVertex<E> n = edge.getTo();
                    double distanceToN = tuple.getDistance() + edge.getWeight();
                    PathTuple<E> nTuple = tuples.get(n);
                    if(distanceToN < nTuple.getDistance()) {
                        nTuple.update(v, distanceToN);
                    }
                }
            }
        }

        // step 3: build the path (distance hack)
        PathTuple<E> tuple = tuples.get(endV);
        double distance = tuple.getDistance();
        if(distance < Double.MAX_VALUE) {
            WPath<E> path = new WPath<>(endV.getValue());
            WVertex<E> v = tuple.getPredecessor();
            while(v != null) {
                path.prepend(v.getValue(), distance);
                distance = 0; // hack!
                tuple = tuples.get(v);
                v = tuple.getPredecessor();
            }
            return path;
        } else {
            return null;
        }
    }

    public List<E> bfPath(E start, E end) {
        WVertex<E> s = vertices.get(start);
        WVertex<E> e = vertices.get(end);

        Queue<WVertex<E>> queue = new LinkedList<>();
        Map<WVertex<E>, WVertex<E>> predecessors = new HashMap<>();

        queue.add(s);
        predecessors.put(s, null);

        while(!queue.isEmpty()) {
            WVertex<E> v = queue.poll();
            if(v == e) {
                break;
            } else {
                for(Edge<E> edge : v.edges()) {
                    if(!predecessors.containsKey(edge.getTo())) {
                        predecessors.put(edge.getTo(), v);
                        queue.add(edge.getTo());
                    }
                }
            }
        }

        return makePath(predecessors, e);
    }

    private List<E> makePath(Map<WVertex<E>, WVertex<E>> predecessors, WVertex<E> end) {
        if(predecessors.containsKey(end)) {
            List<E> path = new LinkedList<>();
            WVertex<E> current = end;
            while(current != null) {
                path.add(0, current.getValue());
                current = predecessors.get(current);
            }
            return path;
        }
        return null;
    }

    @Override
    public List<E> dfPath(E start, E end) {
        WVertex<E> s = vertices.get(start);
        WVertex<E> e = vertices.get(end);

        Set<WVertex<E>> visited = new HashSet<>();
        visited.add(s);

        return visitDFPath(s, e, visited);
    }

    private List<E> visitDFPath(WVertex<E> v, WVertex<E> e, Set<WVertex<E>> visited) {
        if(v == e) {
            List<E> path = new LinkedList<>();
            path.add(e.getValue());
            return path;
        } else {
            for(Edge<E> edge : v.edges()) {
                if(!visited.contains(edge.getTo())) {
                    visited.add(edge.getTo());
                    List<E> path = visitDFPath(edge.getTo(), e, visited);
                    if(path != null) {
                        path.add(0, v.getValue());
                        return path;
                    }
                }
            }
            return null;
        }
    }

}