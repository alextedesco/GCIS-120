import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {

public static String timeLinkedInsert(int number) {
    long start = System.currentTimeMillis();
    LinkedList<Integer> a_list = new LinkedList<>();
    while (a_list.size() < number) {
        a_list.add (1);
    } long end = System.currentTimeMillis();
    long result = end - start;
    return result + " milliseconds";
    }

    public static String timeArrayInsert(int number) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> an_array = new ArrayList<>();
        while (an_array.size() < number) {
            an_array.add (1);
        } long end = System.currentTimeMillis();
        long result = end - start;
        return result + " milliseconds";
        }  

public static void main(String[] args) {
    System.out.println(timeLinkedInsert(500000));
    System.out.println(timeArrayInsert(500000));
    }  
}
