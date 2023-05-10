// Alex Tedesco

// Imports:
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Files {
public static int countWords(String filename, int number_of_letters) {
    int word_count = 0;
    File file = new File (filename);
    try (FileReader filereader = new FileReader(file)) {
        BufferedReader reader = new BufferedReader(filereader);
        String line = reader.readLine();
        while (line != null) {
            if (line.length() == number_of_letters) {
            word_count += 1;
            }
            reader.close();
        }
    } catch (IOException e) {
        System.out.println("File not found!");;
    }
    return word_count;
}

public static void main(String[] args) {
    String filename = "data/words.txt";
    int number_of_letters = 8;
    System.out.println(countWords(filename, number_of_letters));   // Expected: 61019
    }    
}
