package activities;

import java.util.HashSet;
import java.util.Iterator;

public class FastCat implements Concatenator {

    private final HashSet<String> set;

    public FastCat () {
        set = new HashSet<>();
    }

    @Override
    public Iterator<String> iterator() {
        return set.iterator();
    }

    @Override
    public void add(String value) {
     set.add(value);
    }

    @Override
    public void remove(String value) {
    set.remove(value);
    }

    @Override
    public String concatenate() {
        String string = "";
        for (String value : set) {
            string += value;
        }
        return string;
    }

    public static void main(String[] args) {
        Concatenator cat = new FastCat();
        cat.add("abc");
        cat.add("def");
        cat.add("ghi");
        cat.add("jkl");
        cat.remove("def");

        for (String value : cat) {
            System.out.println(value);
        }

        System.out.println(cat.concatenate());
    }
}
