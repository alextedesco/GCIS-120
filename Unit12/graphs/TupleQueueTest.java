package graphs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class TupleQueueTest {
    @Test
    public void create() {
        // setup - none

        // invoke
        TupleQueue<String> queue = new TupleQueue<>();

        // analyze
        assertEquals(0, queue.size());        
    }

    @Test
    public void enqueueOne() {
        // setup
        TupleQueue<String> queue = new TupleQueue<>();
        WVertex<String> vertex = new WVertex<String>("abc");
        PathTuple<String> tuple = new PathTuple<>(vertex);

        // invoke
        queue.enqueue(tuple);

        // analyze
        assertEquals(1, queue.size());
        assertEquals(tuple, queue.dequeue());
        assertEquals(0, queue.size());
    }

    @Test
    public void enqueueTwo() {
        // setup
        TupleQueue<String> queue = new TupleQueue<>();
        WVertex<String> start = new WVertex<>("start");
        WVertex<String> vertexOne = new WVertex<String>("abc");
        PathTuple<String> tupleOne = new PathTuple<>(vertexOne);
        tupleOne.update(start, 100);
        WVertex<String> vertexTwo = new WVertex<String>("abc");
        PathTuple<String> tupleTwo = new PathTuple<>(vertexTwo);
        tupleTwo.update(start, 50);


        // invoke
        queue.enqueue(tupleOne);
        queue.enqueue(tupleTwo);

        // analyze
        assertEquals(2, queue.size());
        assertEquals(tupleTwo, queue.dequeue());
        assertEquals(1, queue.size());
        assertEquals(tupleOne, queue.dequeue());
        assertEquals(0, queue.size());
    }
}
