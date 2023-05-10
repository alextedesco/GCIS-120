package activities;

import java.util.ArrayList;
import java.util.Collections;

public class Cat implements Comparable<Cat> {

    private final String name;
    private final String furColor;
    private final int evilRating;

    public Cat (String name, String furColor, int evilRating) {
        this.name = name;
        this.furColor = furColor;
        this.evilRating = evilRating;
    }

    public String getName() {
        return name;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getEvilRating() {
        return evilRating;
    }

    @Override
    public int compareTo(Cat otherCat) {
        return name.compareTo(otherCat.name);
    }

    @Override
    public String toString() {
        return name + "{furColor = " + furColor + ", evilRating" + evilRating + "}";
    }
    
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("CatA", "Orange", 8));
        cats.add(new Cat("CatC", "White", 3));
        cats.add(new Cat("CatB", "Black", 10));

        System.out.println(cats); // CatA, CatC, CatB
        Collections.sort(cats);
        System.out.println(cats); // CatA, CatB, CatC

        Collections.sort(cats, new CatComparator()); // Sorts by evilRating
        System.out.println(cats); // CatB, CatA, CatC
    }
}
