public class NodeQueue<T> {
    private Node<T> front;
    private Node<T> back;
    private int size;
    
    public NodeQueue() {
        front = null;
        back = null;
        size = 0;
    }

    public void enqueue(T value) {
        Node<T> node = new Node<>(value);
        if(front == null) {
            front = node;
            back = node;
        } else {
            back.setNext(node);
            back = node;
        }
        size++;
    }

    public T dequeue() {
        T value = front.getValue();
        front = front.getNext();
        if(front == null) {
            back = null;
        }
        size--;
        return value;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "Queue{" + front + "}";
    }
}