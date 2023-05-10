import java.util.Scanner;

public class scanner_example {
    
    public static void main(String[] args) {
        System.out.println ("Hello, World!");

        Scanner s = new Scanner (System.in);

        // System.out.print("Enter X: ");
        // int x = s.nextInt();
        // System.out.print("Enter Y: ");
        // int y = s.nextInt();

        System.out.print("Enter Some Words: ");
        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(s.next());

        s.close();
    }
}
