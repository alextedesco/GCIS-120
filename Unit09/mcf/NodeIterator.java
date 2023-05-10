package mcf;

import java.util.Iterator;

public class NodeIterator<T> implements Iterator<T> {
    Node<T> node;

    public NodeIterator (Node<T> node) {
        this.node = node;
    }

    @Override
    public boolean hasNext() {
        return node != null;
    }
    @Override
    public T next () {
        T value = node.getValue();
        node = node.getNext();
        return value;
    }    
}
