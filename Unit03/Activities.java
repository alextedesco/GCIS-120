import java.util.InputMismatchException;
import java.util.Scanner;

public class Activities {
    public static double quotient () {
        Scanner s = new Scanner (System.in);

        try {
        System.out.print("Enter numerator: ");
        double x = s.nextDouble();

        System.out.print ("Enter denominator: ");
        double y = s.nextDouble();
        
        return x / y;
        } catch (InputMismatchException e) {
            System.err.println("Invalid input!");
            return 0;
        }
    }


    public static void main(String[] args) {
        System.out.println("Quotient = " + quotient());
        
    }
}