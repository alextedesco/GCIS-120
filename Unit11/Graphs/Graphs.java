package Graphs;

import java.util.List;

public class Graphs {

    public static Graph<String> makeGraph () {
        Graph<String> adjacencyGraph = new AdjacencyGraph<>();

        adjacencyGraph.add("a");
        adjacencyGraph.add("b");
        adjacencyGraph.add("c");
        adjacencyGraph.add("d");
        adjacencyGraph.add("e");
        adjacencyGraph.add("f");
        adjacencyGraph.add("g");
        adjacencyGraph.add("h");
        adjacencyGraph.add("i");
        adjacencyGraph.add("j");
        adjacencyGraph.add("k");

        adjacencyGraph.connectDirected("a", "c");
        adjacencyGraph.connectUndirected("a", "b");
        adjacencyGraph.connectUndirected("b", "e");
        adjacencyGraph.connectUndirected("b", "e");
        adjacencyGraph.connectUndirected("c", "d");
        adjacencyGraph.connectUndirected("c", "e");
        adjacencyGraph.connectDirected("c", "h");
        adjacencyGraph.connectDirected("d", "b");
        adjacencyGraph.connectUndirected("d", "f");
        adjacencyGraph.connectDirected("e", "f");
        adjacencyGraph.connectUndirected("f", "g");

        adjacencyGraph.connectUndirected("i", "k");
        adjacencyGraph.connectDirected("j", "i");
        adjacencyGraph.connectUndirected("j", "k");
        

        return adjacencyGraph;
    }

    public static void main(String[] args) {
        Graph<String> graph = makeGraph();
        boolean pathExists = graph.dfSearch("a", "d");
        System.out.println(pathExists);

        List<String> path = graph.dfPath("a", "d");
        System.out.println(path);
    }
}
