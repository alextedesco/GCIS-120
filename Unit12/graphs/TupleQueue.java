package graphs;

import java.util.LinkedList;
import java.util.List;

/**
 * A priority queue of path tuples - always returns the tuple with the shortest 
 * distance from start.
 */
public class TupleQueue<E> {
    /**
     * The list of path tuples.
     */
    private final List<PathTuple<E>> queue;

    /**
     * Creates a new, empty tuple queue.
     */
    public TupleQueue() {
        queue = new LinkedList<>();
    }

    /**
     * Adds a new path tuple to the queue.
     * 
     * @param element The tuple being added to the queue.
     */
    public void enqueue(PathTuple<E> element) {
        queue.add(element);
    }

    /**
     * Returns the tuple with the shortest known distance from start.
     * 
     * @return The tuple with the shortest distance form start.
     */
    public PathTuple<E> dequeue() {
        int index = 0;
        PathTuple<E> closest = queue.get(index);

        for(int i=0; i<queue.size(); i++) {
            PathTuple<E> candidate = queue.get(i);
            if(candidate.getDistance() < closest.getDistance()) {
                closest = candidate;
                index = i;
            }
        }

        queue.remove(index);

        return closest;
    }

    /**
     * The number of tuples in the queue.
     * 
     * @return The number of tupples in the queue.
     */
    public int size() {
        return queue.size();
    }
    
}
