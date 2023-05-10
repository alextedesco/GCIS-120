package examPractice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class AmusementParkTest {
    // Testing Child
    @Test
    public void testChildTicketPrice() {
        Child child = new Child("Bob", 55);
        assertEquals(10.99, child.ticketPrice());
    }

    @Test
    public void testChildToString() {
        Child child = new Child("Bob", 55);
        assertEquals("Bob", child.toString());
    }

    @Test
    public void testChildGetHeight() {
        Child child = new Child("Bob", 33);
        assertEquals(33, child.getHeight());
    }

    @Test
    public void testChildCanRide1() {
        Child child = new Child("Bob", 55);
        assertTrue(child.canRide());
    }

    @Test
    public void testChildCanRide2() {
        Child child = new Child("Bob", 40);
        assertFalse(child.canRide());
    }

    @Test
    public void testChildCanRide3() {
        Child child = new Child("Bob", 30);
        assertFalse(child.canRide());
    }

    @Test
    public void testChildCanRide4() {
        Adult adult = new Adult("Jill", 50);
        Child child = new Child("Bob", 38);
        child.assignChaperone(adult);
        assertTrue(child.canRide());
    }

    @Test
    public void testChildCanRide5() {
        Adult adult = new Adult("Jill", 40);
        Child child = new Child("Bob", 30);
        child.assignChaperone(adult);
        assertFalse(child.canRide());
    }

    // Testing Adult
    @Test
    public void testAdultTicketPrice() {
        Adult adult = new Adult("Bob", 55);
        assertEquals(15.99, adult.ticketPrice());
    }

    @Test
    public void testAdultToString() {
        Adult adult = new Adult("Bob", 55);
        assertEquals("Bob", adult.toString());
    }

    @Test
    public void testAdultGetHeight() {
        Adult adult = new Adult("Bob", 55);
        assertEquals(55, adult.getHeight());
    }

    @Test
    public void testAdultCanRide1() {
        Adult adult = new Adult("Bob", 55);
        assertTrue(adult.canRide());
    }

    @Test
    public void testAdultCanRide2() {
        Adult adult = new Adult("Bob", 30);
        assertFalse(adult.canRide());
    }

    @Test
    public void testAdultCanRide3() {
        Adult adult = new Adult("Bob", 40);
        assertFalse(adult.canRide());
    }
} 
