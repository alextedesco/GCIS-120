package activities;

import java.util.Iterator;
import java.util.TreeSet;

public class SortedCat implements Concatenator {
    
    private final TreeSet<String> treeSet;

    public SortedCat () {
        treeSet = new TreeSet<>();
    }

    @Override
    public Iterator<String> iterator() {
        return treeSet.iterator();
    }

    @Override
    public void add(String value) {
        treeSet.add(value);
    }

    @Override
    public void remove(String value) {
        treeSet.remove(value);
    }

    @Override
    public String concatenate() {
        String string = "";
        for (String value : treeSet) {
            string += value;
        }
        return string;
    }

    public static void main(String[] args) {
        Concatenator cat = new SortedCat();
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
