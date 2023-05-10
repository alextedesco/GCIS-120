import java.util.Arrays;

public class ArrayHeap implements Heap {
    int[] array;
    int size;

    public ArrayHeap () {
        array = new int[3];
        size = 0;
    }

    @Override
    public void add(int value) {
        if (size == array.length) {
            array = Arrays.copyOf(array, size * 2);
        }
        array[size] = value;
        siftUp();
        size++;
    }

    @Override
    public int remove() {
        int top = array[0];

        swap(size - 1, 0);
        array[size - 1] = 0;

        size--;

        siftDown();

        return top;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(array) + ", " + size;
    }

    private void swap (int index, int otherIndex) {
        int value = array[index];
        int otherValue = array[otherIndex];

        array[index] = otherValue;
        array[otherIndex] = value;
    }

    private void siftUp() {
        int child = size;
        int parent = (child - 1) / 2;
        while(array[parent] > array[child]) {
            swap(parent, child);
            child = parent;
            parent = (child - 1) / 2;
        }
    }
    
    private void siftDown() {
        int parent = 0;
        while(parent < size) {
            int left = parent * 2 + 1;
            int right = left + 1;
            int dest = parent;
            if(left < size) {
                dest = left;
            }
            if(right < size && array[right] < array[left]) {
                dest = right;
            }
            if(array[dest] < array[parent]) {
                swap(dest, parent);
                parent = dest;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Heap heap = new ArrayHeap();
        System.out.println(heap);

        heap.add(24);
        heap.add(60);
        heap.add(68);
        heap.add(73);
        heap.add(10);
        System.out.println(heap);

        // int value = heap.remove();
        // System.out.println(value);
        // System.out.println(heap);

        while (heap.size() > 0) {
            int value = heap.remove();
            System.out.println(value);
            System.out.println(heap);

        }
    }
}
