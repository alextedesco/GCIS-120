package mcf;

/**
 * A linked-node. Useful for building node-based data structures.
 */
class Node<E> {
    /**
     * The value.
     */
    private E value;

    /**
     * The next node in the linked-node sequence.
     */
    private Node<E> next;

    /**
     * Makes a new node with the specified value.
     * 
     * @param value The value.
     */
    Node(E value) {
        this(value, null);
    }

    /**
     * Makes a new node with the specified value next node in the sequence.
     * 
     * @param value The value.
     * @param next The next node in the sequence.
     */
    Node(E value, Node<E> next) {
        this.value = value;
        this.next = next;
    }

    /**
     * Returns the value from the node.
     * 
     * @return The value.
     */
    E getValue() {
        return value;
    }

    /**
     * Sets the value in the node.
     * 
     * @param value The value.
     */
    public void setValue(E value) {
        this.value = value;
    }

    /**
     * Gets the next node in the linked sequence. May be null.
     * 
     * @return The next node in the linked sequence.
     */
    public Node<E> getNext() {
        return next;
    }

    /**
     * Sets the next node in the linked sequence.
     * 
     * @param next The next node in the linked sequence.
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.value + " -> " + this.next;
    }
}
