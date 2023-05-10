package ds;

/**
 * A node-based implementation of a stack.
 */
public class NodeStack<E> implements Stack<E> {
    /**
     * The node at the top of the stack.
     */
    private Node<E> top;

    /**
     * The number of elements on the stack.
     */
    private int size;

    /**
     * Creates an empty stack.
     */
    public NodeStack() {
        top = null;
        size = 0;
    }

    @Override
    public void push(E value) {
        Node<E> node = new Node<>(value);
        node.setNext(top);
        top = node;
        size++;
    }

    @Override
    public E pop() {
        E value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "Stack{" + top + "}";
    }  
}
