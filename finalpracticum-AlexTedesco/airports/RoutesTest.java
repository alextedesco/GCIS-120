package airports;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import graphs.WGraph;


@Testable
public class RoutesTest {
    @Test
    public void helloWorld() {
        // setup
        String hello = "Hello, World!";
        ArrayList<String> list = new ArrayList<>();
        list.add(hello);

        // analyze
        assertNotNull(hello);
        assertEquals(hello, list.get(0));
        assertTrue(hello == list.get(0));
    }

    @Test
    public void makeRoutes() {
        // setup
        Collection<Flight> flights = new ArrayList<Flight>();
        flights.add(new Flight(Airport.LAS, Airport.SFO, 162));
        flights.add(new Flight(Airport.LAX, Airport.PHX, 203));
        flights.add(new Flight(Airport.SEA, Airport.BOS, 547));
        flights.add(new Flight(Airport.SFO, Airport.ORD, 487));
        flights.add(new Flight(Airport.ROC, Airport.JFK, 290));

        // invoke
        WGraph<Airport> routes = Routes.makeRoutes(flights);

        // analyze
        assertTrue(routes.connected(Airport.LAS, Airport.SFO));
        assertEquals(routes.weight(Airport.LAS, Airport.SFO), 162, 0.0);
        assertTrue(routes.connected(Airport.LAX, Airport.PHX));
        assertEquals(routes.weight(Airport.LAX, Airport.PHX), 203, 0.0);
        assertTrue(routes.connected(Airport.SEA, Airport.BOS));
        assertEquals(routes.weight(Airport.SEA, Airport.BOS), 547, 0.0);
        assertTrue(routes.connected(Airport.SFO, Airport.ORD));
        assertEquals(routes.weight(Airport.SFO, Airport.ORD), 487, 0.0);
        assertTrue(routes.connected(Airport.ROC, Airport.JFK));
        assertEquals(routes.weight(Airport.ROC, Airport.JFK), 290, 0.0);
    }
}
