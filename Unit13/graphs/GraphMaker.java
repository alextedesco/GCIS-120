package graphs;

public class GraphMaker {
    static Graph<String> makeGraph01() {
        Graph<String> graph = new AdjacencyGraph<>();
        graph.add("A");
        graph.add("B");
        graph.add("C");
        graph.add("D");
        graph.add("E");
        graph.connectDirected("E", "A");
        graph.connectDirected("A", "B");
        graph.connectDirected("B", "E");
        graph.connectDirected("B", "C");
        graph.connectDirected("C", "D");

        return graph;
    }

    static Graph<String> makeGraph02() {
        Graph<String> graph = new AdjacencyGraph<>();
        graph.add("T");
        graph.add("U");
        graph.add("V");
        graph.add("W");
        graph.add("X");
        graph.add("Y");
        graph.add("Z");
        graph.connectDirected("Z", "U");
        graph.connectDirected("Z", "Y");
        graph.connectDirected("Y", "X");
        graph.connectDirected("Y", "W");
        graph.connectDirected("X", "U");
        graph.connectDirected("X", "T");
        graph.connectDirected("W", "T");
        graph.connectDirected("T", "V");

        return graph;
    }
}
