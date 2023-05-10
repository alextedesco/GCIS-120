package Graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class AdjacencyGraph<T> implements Graph<T> {

    private final Map<T, Vertex<T>> vertices;

    public AdjacencyGraph () {
        vertices = new HashMap<>();
    }

    @Override
    public void add(T value) {
        Vertex<T> vertex = new Vertex<T>(value);
        vertices.put (value, vertex);

        
    }

    @Override
    public boolean contains(T value) {
        return vertices.containsKey(value);
    }

    @Override
    public int size() {
        return vertices.size();
    }

    @Override
    public void connectUndirected(T a, T b) {
        Vertex<T> vertexA = vertices.get (a);
        Vertex<T> vertexB = vertices.get (b);
        vertexA.connect(vertexB); 
        vertexB.connect(vertexA); 
        
    }

    @Override
    public void connectDirected(T a, T b) {
        Vertex<T> vertexA = vertices.get (a);
        Vertex<T> vertexB = vertices.get (b);
        vertexA.connect(vertexB);  
    }

    @Override
    public boolean connected(T a, T b) {
        Vertex<T> vertexA = vertices.get (a);
        Vertex<T> vertexB = vertices.get (b);
        return vertexA.connected(vertexB);  
    }

    @Override
    public boolean bfSearch (T start, T end) {
        Vertex<T> vertexStart = vertices.get (start);
        Vertex<T> vertexEnd = vertices.get (end);

        LinkedList<Vertex<T>> queue = new LinkedList<>();
        HashSet<Vertex<T>> visited = new HashSet<>();

        queue.add (vertexStart);
        visited.add (vertexEnd);

        while (queue.size() > 0) {
            Vertex<T> v = queue.remove();
            if (v == vertexEnd) {
                return true;
            } else {
                Set<Vertex<T>> neighbors = v.getNeighbors();
                for (Vertex<T> n : neighbors) {
                    if (visited.contains(n)) {
                        visited.add(n);
                        queue.add(n);
                    }
                }
            }
        }

        return false;

    }

    @Override
    public boolean dfSearch (T start, T end) {
        Vertex<T> vertexStart = vertices.get (start);
        Vertex<T> vertexEnd = vertices.get (end);

        Set<Vertex<T>> visited = new HashSet<>();
        visited.add(vertexStart);

        visitDFS(vertexStart, vertexEnd, visited);

        return visited.contains(vertexEnd);
    }

    private void visitDFS(Vertex<T> v, Vertex<T> end, Set<Vertex<T>> visited) {
        if (v!= end) {
        for (Vertex<T> n : v.getNeighbors()) {
            if (visited.contains(n)) {
                visited.add (n);
                visitDFS(v, end, visited);
                }
            }
        }
    }

    public List<T> dfPath (T start, T end) {
        Vertex<T> vertexStart = vertices.get (start);
        Vertex<T> vertexEnd = vertices.get (end);

        Set<Vertex<T>> visited = new HashSet<>();
        return visitDfPath(vertexStart, vertexEnd, visited);
    }

    private LinkedList<T> visitDfPath(Vertex<T> v, Vertex<T> end , Set<Vertex<T>> visited) {
        if (v == end) {
            LinkedList<T> path = new LinkedList<>();
            path.add(v.getValue());
            return path;
        } else {
            for (Vertex<T> n : v.getNeighbors()) {
                if (!visited.contains(n)) {
                    visited.add(n);
                    LinkedList<T> path = visitDfPath(n, end, visited);
                    if (path != null) {
                        path.add(0, v.getValue());
                        return path;
                    }
                }
            }
            return null;
        }
    }

    @Override
    public List<T> bfPath(T start, T end) {
        Vertex<T> s = vertices.get(start);
        Vertex<T> e = vertices.get(end);

        Queue<Vertex<T>> queue = new LinkedList<>();
        Map<Vertex<T>, Vertex<T>> predecessors = new HashMap<>();

        queue.add(s);
        predecessors.put(s, null);

        while(!queue.isEmpty()) {
            Vertex<T> v = queue.poll();
            if(v == e) {
                break;
            } else {
                for(Vertex<T> n : v.getNeighbors()) {
                    if(!predecessors.containsKey(n)) {
                        predecessors.put(n, v);
                        queue.add(n);
                    }
                }
            }
        }

        return makePath(predecessors, e);
    }

    private List<T> makePath(Map<Vertex<T>, Vertex<T>> predecessors,
                            Vertex<T> end) {
        if(predecessors.containsKey(end)) {
            List<T> path = new LinkedList<>();
            Vertex<T> current = end;
            while(current != null) {
                path.add(0, current.getValue());
                current = predecessors.get(current);
            }
            return path;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (T value : vertices.keySet()) {
            Vertex<T> vertex = vertices.get (value);
            s += vertex;
            s += "\n";
        }
        return s;
    }

    
}
