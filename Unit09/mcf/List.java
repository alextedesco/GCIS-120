package mcf;
import java.lang.Iterable;
import java.util.Iterator;

public interface List<T> extends Iterable<T> {
    void append (T value);
    T get (int index);
    void set (int index, T value);
    int size ();
    void insert (int index, T value);
    T remove (int index);


    @Override
    default Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }
}
