import Graphs.Graph;

public class Main {

    public static void main(String[] args) {
        Graph<String> graph1 = GraphReader.readGraph("data/a_22_3.txt");
        Graph<String> graph2 = GraphReader.readGraph("data/a_26_4.txt");
        Graph<String> graph3 = GraphReader.readGraph("data/a_6_1.txt");
        Graph<String> graph4 = GraphReader.readGraph("data/a_7_3.txt");
        Graph<String> graph5 = GraphReader.readGraph("data/bipartite.txt");
        Graph<String> graph6 = GraphReader.readGraph("data/k2.txt");
        Graph<String> graph7 = GraphReader.readGraph("data/k2_2.txt");
        Graph<String> graph8 = GraphReader.readGraph("data/k3.txt");
        Graph<String> graph9 = GraphReader.readGraph("data/k4.txt");
        Graph<String> graph10 = GraphReader.readGraph("data/k5.txt");
        Graph<String> graph11 = GraphReader.readGraph("non_bipartite.txt");
        Graph<String> graph12 = GraphReader.readGraph("v2.txt");
        System.out.println(graph1);
        System.out.println(graph2);
        System.out.println(graph3);
        System.out.println(graph4);
        System.out.println(graph5);
        System.out.println(graph6);
        System.out.println(graph7);
        System.out.println(graph8);
        System.out.println(graph9);
        System.out.println(graph10);
        System.out.println(graph11);
        System.out.println(graph12);
    }
    
}
