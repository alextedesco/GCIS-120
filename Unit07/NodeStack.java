public class NodeStack<E> {
    private Node<E> top;
    private int size;

    public NodeStack() {
        top = null;
        size = 0;
    }

    public void push(E value) {
        Node<E> node = new Node<>(value);
        node.setNext(top);
        top = node;
        size++;
    }

    public E pop() {
        E value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "Stack{" + top + "}";
    }  
}
