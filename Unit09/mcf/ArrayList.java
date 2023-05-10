package mcf;

import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    private Object[] elements;
    private int size;
    
    public ArrayList() {
        elements = new Object [2];
        size = 0;
    }

    @Override
    public void append (T value) {
        if (size == elements.length) {
            Object [] bigger = Arrays.copyOf(elements, size * 2);
            elements = bigger;
        }
        
        elements[size] = value;
        size++;
    }

    @Override
    @SuppressWarnings ("unchecked")
    public T get (int index) {
        validateIndex(index);
        return (T)elements [index];
    }

    public void set (int index, T value) {
        validateIndex(index);
        elements[index] = value;
    }

    public int size () {
        return size;
    }

    @Override
    public void insert(int index, T value) {
        int count = size;
        if (count == index) {
            append(value);
        } else {
            while (count >= index) {
                if (count != index) {
                    elements[count] = elements[count - 1];
                    count--;
                } else {
                    elements[index] = value;
                    count--;
                }
            }
            size++;
        }
    }

    @Override
    public T remove(int index) {
        int count = size;
        while (true) {
            elements[index] = elements[index + 1];
            index++;
            if (index == count) {
                elements[count - 1] = null;
                break;
                }
            }
        size--;
        return null;
    }
    

    @Override
    public String toString() {
        return Arrays.toString(elements) + ", " + size;
    }

    private void validateIndex (int index) {
        if (index < 0 | index >= size) {
            throw new IndexOutOfBoundsException (index);
        }
    }

    @Override
    public ArrayIterator<T> iterator () {
        return new ArrayIterator<>(elements, size);
    }

    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<>();
        // System.out.println(list);
        // list.append("abc");
        // System.out.println(list);
        // list.append("def");
        // System.out.println(list);
        // list.append("ghi");
        // System.out.println(list);
        // System.out.println(list.get(3));

        // ArrayList<Integer> ints = new ArrayList<>();
        // ints.append(123);
        // System.out.println(ints);

        // ArrayList<Integer> ints_1 = new ArrayList<>();
        // Lists.listMaker (ints_1);
        // System.out.println(ints_1);
        // System.out.println(ints);
        // ints.insert(0, 1);
        // System.out.println(ints);

        ArrayList<String> array_list = new ArrayList<>();
        array_list.append("a");
        array_list.append("b");
        array_list.append("c");
        array_list.append("d");
        array_list.append("e");
        array_list.remove(2);
        System.out.println(array_list);
    }
}
