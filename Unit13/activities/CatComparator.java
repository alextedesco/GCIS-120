package activities;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat> {

    @Override
    public int compare (Cat a, Cat b) {
        return b.getEvilRating() - a.getEvilRating();
    }   
}
