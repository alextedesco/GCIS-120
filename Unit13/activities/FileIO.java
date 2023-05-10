package activities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {
    public static void printLines () throws IOException {
        String filename = "data/alice.txt";
        FileReader in = new FileReader(filename);
        BufferedReader reader = new BufferedReader(in);
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        printLines();
    }
    
}
