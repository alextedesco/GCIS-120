package practicum;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class HeapPQTest {
    @Test
    public void helloWorld() {
        assertEquals("Hello, World!", "Hello, World!");
    }

    @Test
    public void create() {
        // setup - none

        // invoke
        Queue queue = new HeapPQ();

        // analyze
        assertEquals(0, queue.size());
    }

    @Test
    public void enqueueOne() {
        // setup
        int expected = 5;
        Queue queue = new HeapPQ();

        // invoke
        queue.enqueue(expected);

        // analyze
        assertEquals(1, queue.size());
        assertEquals(expected, queue.dequeue());
        assertEquals(0, queue.size());
    }

    @Test
    public void enqueueMany() {
        // setup
        int[] expected = {5, 3, 1, 2, 4};
        Queue queue = new HeapPQ();

        // invoke
        for(int i : expected) {
            queue.enqueue(i);
        }

        // analyze
        assertEquals(5, queue.size());
        assertEquals(1, queue.dequeue());
        assertEquals(4, queue.size());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.size());
        assertEquals(3, queue.dequeue());
        assertEquals(2, queue.size());
        assertEquals(4, queue.dequeue());
        assertEquals(1, queue.size());
        assertEquals(5, queue.dequeue());
        assertEquals(0, queue.size());
    }
}
