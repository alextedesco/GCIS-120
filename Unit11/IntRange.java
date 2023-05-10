public class IntRange implements Range<Integer> {

    int start;
    int stop;

    public IntRange (int start, int stop) {
        this.start = start;
        this.stop = stop;
    }

    public IntRange (int stop) {
        this.start = 0;
        this.stop = stop;
    }


    @Override
    public Integer get(int index) {
        try {
            return start + index;
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index out of range: " + -1);
        }
        return index;
    }

    @Override
    public int size() {
        return stop - start;
    }
}
