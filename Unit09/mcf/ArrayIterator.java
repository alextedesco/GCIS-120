package mcf;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private Object [] elements;
    private int index;
    private int size;

    public ArrayIterator (Object[] elements, int size) {
        this.elements = elements;
        this.size = size;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

    @SuppressWarnings ("unchecked")
    @Override
    public T next() {
        T value = (T) elements[index];
        index++;
        return value;
    }

}