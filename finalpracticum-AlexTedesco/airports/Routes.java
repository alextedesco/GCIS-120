package airports;

import java.util.ArrayList;
import java.util.Collection;

import graphs.WAdjacencyGraph;
import graphs.WGraph;

public class Routes {
    
    public static WGraph<Airport> makeRoutes (Collection<Flight> flights) {
        WGraph<Airport> graph = new WAdjacencyGraph<>();
        for (Flight flight : flights) {
            graph.add(flight.getDestination());
            graph.add(flight.getOrigin());
            graph.connect(flight.getOrigin(), flight.getDestination(), flight.getCost());
        }
        return graph;
    }

    public static void main(String[] args) {
        /**
         * BONUS (up to 10 points): Define a main method with the appropriate signature 
        that displays the cheapest flight from ROC to every other airport in the graph
        of routes AND display the flight from ROC to every other airport with the
        fewest layovers. Your output should match the example_output.txt that has been
        provided to you in the data directory.
         */
        Collection<Flight> flights = new ArrayList<Flight>();
        flights.add(new Flight(Airport.LAS, Airport.SFO, 162));
        flights.add(new Flight(Airport.LAX, Airport.PHX, 203));
        flights.add(new Flight(Airport.SEA, Airport.BOS, 547));
        flights.add(new Flight(Airport.SFO, Airport.ORD, 487));
        flights.add(new Flight(Airport.ROC, Airport.JFK, 290));
        WGraph<Airport> graph = makeRoutes(flights);
        System.out.println(graph.nearestNeighbors(Airport.ROC, Airport.JFK));
        System.out.println(graph.nearestNeighbors(Airport.ROC, Airport.IAD));
        System.out.println(graph.nearestNeighbors(Airport.ROC, Airport.SEA));
        System.out.println(graph.nearestNeighbors(Airport.ROC, Airport.SFO));
        System.out.println(graph.nearestNeighbors(Airport.ROC, Airport.LAX));
        System.out.println(graph.nearestNeighbors(Airport.ROC, Airport.BOS));
        System.out.println(graph.nearestNeighbors(Airport.ROC, Airport.MCO));
        System.out.println(graph.nearestNeighbors(Airport.ROC, Airport.DFW));
        System.out.println(graph.nearestNeighbors(Airport.ROC, Airport.LAS));
        System.out.println(graph.nearestNeighbors(Airport.ROC, Airport.ORD));
        System.out.println(graph.nearestNeighbors(Airport.ROC, Airport.ATL));
        System.out.println(graph.nearestNeighbors(Airport.ROC, Airport.PIT));        
    }
}
