package activities;

import java.util.ArrayList;
import java.util.Iterator;

public class TraditionalCat implements Concatenator, Iterable<String> {
    private final ArrayList<String> list;

    public TraditionalCat () {
        list = new ArrayList<>();
    }


    @Override
    public void add(String value) {
        list.add (value);
    }

    @Override
    public void remove(String value) {
        list.remove(value);
    }

    @Override
    public String concatenate() {
        String string = "";
        for (String value : list) {
            string += value;
        }
        return string;
    }


    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }
    public static void main(String[] args) {
        Concatenator cat = new TraditionalCat();
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
