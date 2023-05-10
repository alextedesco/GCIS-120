package ds;

/**
 * A node-based implementation of a queue.
 */
public class NodeQueue<E> implements Queue<E> {
    /**
     * The node at the front of the queue.
     */
    private Node<E> front;

    /**
     * The node at the back of the queue.
     */
    private Node<E> back;

    /**
     * The number of elements stored in the queue.
     */
    private int size;
    
    public NodeQueue() {
        front = null;
        back = null;
        size = 0;
    }

    @Override
    public void enqueue(E value) {
        Node<E> node = new Node<>(value);
        if(front == null) {
            front = node;
            back = node;
        } else {
            back.setNext(node);
            back = node;
        }
        size++;
    }

    @Override
    public E dequeue() {
        E value = front.getValue();
        front = front.getNext();
        if(front == null) {
            back = null;
        }
        size--;
        return value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "Queue{" + front + "}";
    }
}
