package practicum;

import java.util.ArrayList;

public class ListPQ implements Queue {
    ArrayList<Integer> list;
    int size;

    public ListPQ () {
        this.size = 0;
        this.list = new ArrayList<>();
    }

    @Override
    public void enqueue(int value) {
        list.add(value);
        this.size = size + 1;
        
    }

    @Override
    public int dequeue() {
        int value = list.remove(size - 1);
        return value;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
