package activities;

public interface Concatenator extends Iterable<String> {
    void add (String value);
    void remove (String value);
    String concatenate ();
}
