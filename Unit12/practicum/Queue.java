package practicum;
/**
 * The abstract data type that defines the functionality provided by a queue.
 */
public interface Queue {
    /**
     * Adds a value to the back of the queue.
     * 
     * @param value The value to add to the back of the queue.
     */
    void enqueue(int value);

    /**
     * Removes the value at the front of the queue.
     * 
     * @return The value at the front of the queue.
     */
    int dequeue();

    /**
     * Returns the number of values stored in the queue.
     * 
     * @return The number of value in the queue.
     */
    int size();
}
