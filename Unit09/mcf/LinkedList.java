package mcf;

public class LinkedList<T> implements List<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList () {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void append(T value) {
        // Make a new node with the value
        Node<T> node = new Node<>(value);
        if (head == null && tail == null && size == 0) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    @Override
    public T get(int index) {
        return findNode(index).getValue();
    }

    @Override
    public void set(int index, T value) {
        findNode(index).setValue(value);
    }

    @Override
    public int size() {
        return size;
    }   

    @Override
    public String toString() {
        return head + ", " + size;
    }


    private Node<T> findNode (int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }

        if (index == size - 1) {
            return tail;
        }
        int count = 0;
        Node<T> node = head;
        while (count < index) {
            node = node.getNext();
            count++;
        }
        return node;
    }

    @Override
    public NodeIterator<T> iterator() {
        return new NodeIterator<>(head);
    }

    @Override
    public void insert(int index, T value) {
        int count = size;
        if (count == 0 || index == count) {
            append(value);
        } else {
            append (null);
            size--;
            while (index <= count) {
                if (count == index) {
                    set(index, value);
                    count--;
                } else {
                    set(count - 1, get (count - 1));
                    count--;
                }
            }
            size++;
        }
    }
        

    @Override
    public T remove(int index) {
        int count = size - 1;
        while (index <= count) {
            if (index == count) {
                set (index, null);
                index++;
            } else {
            set (index, get (index + 1));
            index++;
            }
        }
        size--;
        return null;
    }

    public static void main(String[] args) {
        // LinkedList<String> list_1 = new LinkedList<>();
        // System.out.println(list_1);
        // list_1.append("a");
        // System.out.println(list_1);
        // list_1.append("b");
        // System.out.println(list_1);
        // list_1.append("c");
        // System.out.println(list_1);
        // System.out.println(list_1.get(0));
        // System.out.println(list_1.get(1));
        // System.out.println(list_1.get(2));
        // System.out.println(list_1.get(3));
        // list_1.set(1, "d");
        // System.out.println(list_1);
        
        // LinkedList<Integer> list_2 = new LinkedList<>();
        // list_2.append(1);;
        // System.out.println(list_2);
        // list_2.append(2);;
        // System.out.println(list_2);
        // list_2.append(3);
        // System.out.println(list_2);

        LinkedList<String> linked_list = new LinkedList<>();
        linked_list.append("a");
        linked_list.append("b");
        linked_list.append("c");
        linked_list.append("d");
        linked_list.append("e");
        System.out.println(linked_list);
        linked_list.insert(3, "f");
        System.out.println(linked_list);

        // LinkedList<String> linked_list_remove = new LinkedList<>();
        // linked_list_remove.append("a");
        // linked_list_remove.append("b");
        // linked_list_remove.append("c");
        // linked_list_remove.append("d");
        // linked_list_remove.append("e");
        // System.out.println(linked_list_remove);
        // linked_list_remove.remove(0);
        // System.out.println(linked_list_remove);
    }
}
