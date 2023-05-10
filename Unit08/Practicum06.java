import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Practicum06 {

    public static ArrayList<Integer> arrayToList(int[] an_array) {
        ArrayList<Integer> a_list = new ArrayList<>();
        for (int i : an_array) {
            a_list.add(i);
        }
        return a_list;
    }

    public static ArrayList<Integer> uniqueValues(ArrayList<Integer> a_list) {
        HashSet<Integer> a_set = new HashSet<>();
        for (int i : a_list) {
            a_set.add (i);
        }
        ArrayList<Integer> b_list = new ArrayList<>();
        for (int i : a_set) {
            b_list.add(i);
        }
        return b_list;
        
    }

    /*
    BONUS (10%) Define a static method named "characterCount" that declares a 
   parameter for a string and returns a map containing the count of how many 
   times each character appears in the string. For example, given the string 
   "Hello, World!" the map returned would include the following values:
     */

    // public static HashMap characterCount(String a_string) {
    //     int count = 0;
    //     int letter = 0;
    //     String [] an_array = {a_string};
    //     for (int i : an_array) {
    //         char char_1 = a_string.charAt(letter);
    //         if (a_string.charAt(i) == a_string.charAt (letter)) {
    //             count += 1;
                
    //         }

    //     }
    //     return null;
        
    // }

    public static void main(String[] args) {
        int [] a_array = {};
        System.out.println(arrayToList(a_array));

        int [] b_array = {1, 1, 2, 2, 3, 3, 4, 5};
        ArrayList<Integer> a_list = arrayToList(b_array);
        System.out.println(uniqueValues(a_list));
    }
    


}
