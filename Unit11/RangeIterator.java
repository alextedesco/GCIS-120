public class RangeIterator<E> {
    Range<E> range;
    int index;

    public RangeIterator (Range<E> range) {
        this.range = range;
    }

    public boolean hasNext() {
        return true;
    }

    public E next () {
        return null;
    }    
}
