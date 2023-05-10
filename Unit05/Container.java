public class Container<T> {
    private T value;

    public Container (T value) {
        this.value = value;
    }
    
public T getValue () {
    return this.value;
    }

public void setValue (T value) {
    this.value = value;
    }

public static void main(String[] args) {
    Container<String> strings = new Container<> ("foobar");
    String v = strings.getValue ();
    System.out.println(v);
    strings.setValue("barfoo");
    System.out.println(strings.getValue());

    // Container<int> i = new Container<>(123);

    Container<Double> i = new Container<> (12.34);
    i.setValue(45.67);
    }
}
