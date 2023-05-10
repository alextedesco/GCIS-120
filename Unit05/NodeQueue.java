public class NodeQueue<T> {
    private Node<T> front_node; 
    private Node<T> back_node; 
    private int size;
    
    public NodeQueue() {
        front_node = null;
        back_node = null;
        size = 0;
    }

public int getSize() {
    return size;
    }

public boolean isEmpty () {
    return size == 0;
    }

public void enqueue(T value) {
    // make a new node
    Node<T> node = new Node<> (value);

    // if front is null or back is null or size is 0
    // set front and back to the new node
    if (front_node == null) {
        front_node = node;
        back_node = node;
    }

    // otherwise, set the new node next after the back
    else {
        back_node.setNext (node);

    // change back to the new node
    back_node = node;
    }
    // increment size
    size++;
    }

public T dequeue() {
    T value = front_node.getValue ();
    front_node = front_node.getNext();

    if (front_node == null) {
        back_node = null;
    }

    return value;
    }

@Override
public String toString() {
    return "Queue{" + front_node + "}";
    }
public static void main(String[] args) {
    NodeQueue<String> queue = new NodeQueue<>();
    System.out.println(queue);
    queue.enqueue("abc");
    System.out.println(queue);
    queue.enqueue("def");
    System.out.println(queue);
    queue.enqueue("ghi");
    System.out.println(queue);
    queue.enqueue("jkl");
    System.out.println(queue);
    }
}
