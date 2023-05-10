package practicum;

import java.util.Arrays;

public class HeapPQ implements Queue {
    int[] heap;
    int size;

    public HeapPQ () {
        heap = new int [1];
        this.size = 0;
        
    }
    
    @Override
    public void enqueue(int value) {
        if (size == heap.length) {
            heap = Arrays.copyOf(heap, size + 1);
        }
        heap[size] = value;
        size++; 
    }

    @Override
    public int dequeue() {
        int value = heap[heap.length / 2];
        for (int i = heap.length / 2; i < heap.length - 1; i++) {
            heap[i] = heap[i + 1];
        }
        size--;
        return value;
    }

    @Override
    public int size() {
        return size;
    }

}