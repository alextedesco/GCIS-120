import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Activities {
    public static ArrayList<Integer> arrayLists() {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add (123);
        ints.add (456);
        ints.add (789);

        ints.add (0, 0);
        ints.add (0, 100);
        // ints.add (1, 200);
        // ints. add (1000, 5);

        for (int i : ints) {
            System.out.println(i);
        }
        return ints;
    }
    public static LinkedList<Character> linkedLists() {
        LinkedList<Character> chars = new LinkedList<>();
        chars.add ('a');
        chars.add ('b');
        chars.add ('c');

        for (int index=0; index < chars.size (); index++) {
            System.out.println(index + ": " + chars.get(index));
        }
        return chars;
    }

    public static HashSet<String> uniqueWords (String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fr);
        
        HashSet<String> uniqueWords = new HashSet<>();

        String line = reader.readLine();
        while (line != null) {
            String [] words = line.split (" "); // ["The", "Quick", "Brown", "Fox"]
            for (String word : words) {
                word = word.toLowerCase();
                uniqueWords.add (word);
            }
            line = reader.readLine();
        }  
        reader.close ();
        return uniqueWords;
    }
    public static void main(String[] args) {
        try {
            HashSet<String> uniqueWords = uniqueWords("alice.txt");
            System.out.println(uniqueWords);
            System.out.println(uniqueWords.size());
        } catch (IOException ioe) {
            System.err.println("Couldn't read the file");
        }
        // ArrayList<Integer> ints = arrayLists();
        // System.out.println(ints);
        // while (ints.size() > 0) {
        //     int v = ints.remove (0);
        //     System.out.println(v + ", " + ints);
        // }
        // LinkedList<Character> chars = linkedLists();
        // System.out.println(chars);
    }
}
