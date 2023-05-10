package Graphs;

import java.util.List;

public interface Graph<T> {
    void add (T value);
    boolean contains (T value);
    int size ();
    void connectUndirected (T a, T b);
    void connectDirected (T a, T b);
    boolean connected (T a, T b);   
    
    default boolean bfSearch (T start, T end) {
        throw new UnsupportedOperationException();
    }

    default List<T> bfPath (T start, T end) {
        throw new UnsupportedOperationException();
    }

    default boolean dfSearch (T start, T end) {
        throw new UnsupportedOperationException();
    }

    default List<T> dfPath (T start, T end) {
        throw new UnsupportedOperationException();
    }

    default int countConnectedComponents () {
        throw new UnsupportedOperationException();
    }
}
