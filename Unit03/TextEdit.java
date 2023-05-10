import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextEdit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter filename: ");
        String filename = scanner.nextLine();

        try (FileWriter fw = new FileWriter(filename);
            PrintWriter writer = new PrintWriter (fw)) {

                while (true) {
                    System.out.println(">> ");
                    String line = scanner.nextLine();
                    if (line.equals("")) {
                        break;
                    } else {
                        writer.println(line);
                    }
                }
            } catch (IOException e) {
                System.err.println("Enter writing to file!");
            }
            scanner.close();
        }
}
