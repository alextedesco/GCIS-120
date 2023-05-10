package ds;

/**
 * A simple, singly-linked node suitable for building linked-node sequences.
 */
public class Node<E> {
    /**
     * The value stored in the node.
     */
    private E value;

    /**
     * The next node; may be null.
     */
    private Node<E> next;

    /**
     * Creates a new node with the specified attributes.
     * 
     * @param value The value stored by the node.
     * @param next The next node in the sequence/
     */
    public Node(E value, Node<E> next) {
        this.value = value;
        this.next = next;
    }

    /**
     * Creates a new node with the specified value and a null next node.
     * 
     * @param value The value stored by the node.
     */
    public Node(E value) {
        this(value, null);
    }

    /**
     * Returns the value stored by the node.
     * 
     * @return The value stored by the node.
     */
    public E getValue() {
        return value;
    }

    /**
     * Changes the value in the node to the specified value.
     * 
     * @param value The new value.
     */
    public void setValue(E value) {
        this.value = value;
    }

    /**
     * Returns the next node in the sequence.
     * 
     * @return The next node in the sequence.
     */
    public Node<E> getNext() {
        return next;
    }

    /**
     * Changes the next node in the sequence.
     * 
     * @param next The next node in the sequence.
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.value + " -> " + this.next;
    }
}
