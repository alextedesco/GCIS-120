package practicum;
/**
 * The abstract data type that defines the functionality provided by a heap.
 */
public interface Heap {
    /**
     * Adds a value to the heap.
     * 
     * @param value The value to add to the heap.
     */
    void add(int value);

    /**
     * Removes a value from the heap.
     * 
     * @return The value to remove.
     */
    int remove();

    /**
     * Returns the number of values currently stored in the heap.
     * 
     * @return The number of values in the heap.
     */
    int size();
}
