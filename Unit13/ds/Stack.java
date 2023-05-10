package ds;

/**
 * The abstract data type that defines the behaviors of a stack.
 */
public interface Stack<E> {
    /**
     * Pushes a new value on to the top of the stack.
     * 
     * @param value The value being pushed onto the stack.
     */
    void push(E value);

    /**
     * Removes and returns the value at the top of the stack.
     * 
     * @return The value at the top of the stack.
     */
    E pop();

    /**
     * Returns the number of elements on the stack.
     * 
     * @return The number of elements on the stack.
     */
    int size();
}
