package fleebs;

import java.util.Comparator;

public class BirthdaySorter implements Comparator<Fleeb> {

    @Override
    public int compare(Fleeb o1, Fleeb o2) {
        if (o1.birthMonth.getOrder() == o2.birthMonth.getOrder()) {
            return o1.birthDay - o2.birthDay;
        } else {
            return o1.birthMonth.getOrder() - o2.birthMonth.getOrder();
        }
    }
}
