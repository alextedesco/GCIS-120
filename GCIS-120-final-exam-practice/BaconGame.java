import graphs.AdjacencyGraph;
import graphs.Graph;

public class BaconGame {

    public static boolean hasConnection (Actor a1, Actor a2, Graph<Actor> graph) {
        return graph.connected(a1, a2);
    }

    public static void createConnections (Graph<Actor> graph, Movie movie) {
        for (Actor a1 : movie) {
            for (Actor a2 : movie) {
                if (!a1.equals(a2) && !graph.connected(a1, a2)) {
                    graph.connectUndirected(a1, a2);
                }
                /** Alternate Way
                if (!a1.equals(a2)) {
                    graph.connectDirected(a1, a2);
                }
                */
            }
        }
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("The Matrix");
        Movie movie2 = new Movie("V for Vendetta");
        Movie movie3 = new Movie("John Wick");

        Actor actor1 = new Actor("Keanu Reeves");
        Actor actor2 = new Actor("Carrie-Anne Moss");
        Actor actor3 = new Actor("Hugo Weaving");
        Actor actor4 = new Actor("Natalie Portman");
        Actor actor5 = new Actor("Rupert Graves");
        Actor actor6 = new Actor("Laurence Fishburne");
        Actor actor7 = new Actor("Dean Winters");

        movie1.addActor(actor1);
        movie1.addActor(actor2);
        movie1.addActor(actor3);

        movie2.addActor(actor6);
        movie2.addActor(actor3);

        movie3.addActor(actor4);
        movie3.addActor(actor5);
        movie3.addActor(actor1);
        movie3.addActor(actor6);
        movie3.addActor(actor7);

        // Create a graph
        Graph<Actor> graph = new AdjacencyGraph<>();
        graph.add(actor1);
        graph.add(actor2);
        graph.add(actor3);
        graph.add(actor4);
        graph.add(actor5);
        graph.add(actor6);
        graph.add(actor7);

        // Connect all the actors who appear movie
        createConnections(graph, movie1);
        createConnections(graph, movie2);
        createConnections(graph, movie3);

        System.out.println(actor3.getName() + " has connection with " + actor5.getName() + " ? - " + hasConnection(actor3, actor5, graph));
    }
}
