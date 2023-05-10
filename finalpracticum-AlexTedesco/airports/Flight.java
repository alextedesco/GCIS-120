package airports;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Flight {
    private final Airport origin;
    private final Airport destination;
    private final int cost;

    public Flight(Airport origin, Airport destination, int cost) {
        this.origin = origin;
        this.destination = destination;
        this.cost = cost;
    }

    public Airport getOrigin() {
        return origin;
    }

    public Airport getDestination() {
        return destination;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return origin + ":" + destination + " $" + cost;
    }

    public static Collection<Flight> readFlights(String filename) {
        List<Flight> flights = new ArrayList<>();

        try(FileReader fr = new FileReader(filename);
            BufferedReader reader = new BufferedReader(fr)) {
            String line = reader.readLine();
            while(line != null) {
                String[] tokens = line.split(" ");
                Airport origin = Airport.valueOf(tokens[0]);
                Airport destination = Airport.valueOf(tokens[1]);
                int cost = Integer.parseInt(tokens[2]);
                Flight flight = new Flight(origin, destination, cost);
                flights.add(flight);
                line = reader.readLine();
            }

        } catch(Exception e) {
            System.err.println("Something went wrong: " + e.getMessage());
        }

        return flights;
    }

    public static void main(String[] args) {
        Collection<Flight> flights = readFlights("data//flights.txt");
        for(Flight flight : flights) {
            System.out.println(flight);
        }
    }
    
}
