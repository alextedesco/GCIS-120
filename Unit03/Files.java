import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Files {

    public static void printFile (String filename) throws IOException {

        try (FileReader fr = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fr);) {

        // do this in a loop, and stop when readLine return null
        String line = reader.readLine();

        while (line != null) {
            System.out.print(line);
            line = reader.readLine();
        }
    }

        // reader.close();
        // fr.close();
/*
Python Equivalent
reader = open (filename)
for line in reader:
    print (line)
reader.close ()
*/
    }


    public static void info (String filename) {
        File file = new File (filename);
        System.out.println(file.getName());
        System.out.println(file.getPath());
        if (file.exists()) {
            System.out.println("File exists.");
            System.out.println(file.length());
        } else {
            System.out.println("File does not exist.");
        }
    }

public static void main(String[] args) {
    info("Wheel.java");
    info("data/alice.txt");
    info("not_a_real_file.java");

    try {
        printFile("data/alice.txt");
    } catch (IOException e) {
        System.out.println("Failed to print file");
        }
    }
}
