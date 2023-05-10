package graphs;

/**
 * A helper class that makes weighted graphs suitable for testing algorithms.
 * 
 * @author GCCIS Faculty
 */
public class GraphMaker {
    /**
     * Returns a small example graph with a single connectec component.
     * 
     * @return A small example graph.
     */
    public static WGraph<String> makeGraphA() {
        WAdjacencyGraph<String> graph = new WAdjacencyGraph<>();

        graph.add("A");
        graph.add("B");
        graph.add("C");
        graph.add("D");
        graph.add("E");
        graph.add("F");
        graph.add("G");

        graph.connect("A", "B", 6);
        graph.connect("A", "C", 1);
        graph.connect("A", "D", 2);
        graph.connect("B", "C", 2);
        graph.connect("B", "F", 5);
        graph.connect("B", "G", 4);
        graph.connect("C", "G", 5);
        graph.connect("D", "F", 7);
        graph.connect("E", "F", 4);
        graph.connect("E", "G", 4);
        graph.connect("G", "E", 4);

        return graph;
    } 

    /**
     * Returns a somewhat larger example graph with two connected components.
     * 
     * @return A somewhat larger example graph.
     */
    public static WGraph<String> makeGraphB() {
        WGraph<String> graph = new WAdjacencyGraph<>();

        graph.add("A");
        graph.add("B");
        graph.add("C");
        graph.add("D");
        graph.add("E");
        graph.add("F");
        graph.add("G");
        graph.add("H");
        graph.add("I");
        graph.add("J");
        graph.add("K");

        graph.connect("A", "B", 4);
        graph.connect("A", "C", 5);
        graph.connect("B", "D", 2);
        graph.connect("B", "E", 1);
        graph.connect("C", "D", 12);
        graph.connect("C", "E", 1);
        graph.connect("C", "H", 7);
        graph.connect("D", "F", 7);
        graph.connect("D", "F", 7);
        graph.connect("E", "F", 2);
        graph.connect("F", "G", 10);

        graph.connect("I", "J", 9);
        graph.connect("I", "K", 2);
        graph.connect("J", "K", 4);

        return graph;
    }
}
