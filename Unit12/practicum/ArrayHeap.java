package practicum;
import java.util.Arrays;

/**
 * An array-based implementation of a heap.
 */
public class ArrayHeap implements Heap {
    /**
     * Stores the values in the heap.
     */
    private int[] array;

    /**
     * The number of values stored in the heap.
     */
    private int size;

    /**
     * Creates a new, empty heap.
     */
    public ArrayHeap() {
        array = new int[5];
        size = 0;
    }

    @Override
    public void add(int value) {
        // add pt 1
        if(size == array.length) {
            array = Arrays.copyOf(array, size*2);
        }
        array[size] = value;
        
        // sifting up
        siftUp();

        size++; // don't forget!
    }

    @Override
    public int remove() {
        // most of part 1
        int temp = array[0];
        size--;
        swap(0, size);
        array[size] = 0;

        // sifting down
        siftDown();

        // last bit of part 1
        return temp;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(array) + ", " + size;
    }

    /**
     * Helper method that sifts the most recently added value up into the 
     * correct position in the heap.
     */
    private void siftUp() {
        int child = size;
        int parent = (child - 1) / 2;
        while(array[parent] > array[child]) {
            swap(parent, child);
            child = parent;
            parent = (child - 1) / 2;
        }
    }

    /**
     * Helper method that sifts a value from the root of the heap down into the
     * correct position.
     */
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

    /**
     * Swaps the values at index a with the value at index b.
     * 
     * @param a The first index.
     * @param b The second index.
     */
    private void swap(int a, int b) {
        if(a != b) {
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
    }

    public static void main(String[] args) {
        Heap heap = new ArrayHeap();

        System.out.println(heap);

        heap.add(5);
        heap.add(4);
        heap.add(3);
        heap.add(2);
        heap.add(1);

        System.out.println(heap);

        System.out.println(heap.remove() + ", " + heap);
        System.out.println(heap.remove() + ", " + heap);
        System.out.println(heap.remove() + ", " + heap);
        System.out.println(heap.remove() + ", " + heap);
        System.out.println(heap.remove() + ", " + heap);
    }
    
}
