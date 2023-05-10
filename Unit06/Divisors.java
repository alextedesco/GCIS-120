import java.util.Scanner;

public class Divisors {

    // DO NOT MODIFY ABOVE THIS LINE

    private static String divisors(int n, int i) {
        // implement your RECURSIVE function here
        String result = "";
        if (n % i == 0) {
            result += String.valueOf(i) + " ";
            int new_I = i + 1;
            divisors(n, new_I);
        } else if (n % i != 0) {
            int new_I = i + 1;
            divisors(n, new_I);
        } else if (i == n) {
                return result;
            }
            return result;
        }


    // DO NOT MODIFY BELOW THIS LINE

    public static String divisors(int n) {
        return divisors(n, 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sentinel = true;
        System.out.println("Enter a number or a blank line to quit.");
        while(sentinel) {
            System.out.print(">> ");
            String input = scanner.nextLine();
            if(input.equals("")) {
                sentinel = false;
            } else {
                try {
                    int n = Integer.parseInt(input);
                    String divisors = divisors(n);
                    System.out.println(divisors);
                } catch(NumberFormatException nfe) {
                    System.err.println("Invalid integer. Please try again.");
                }
            }
        }
        System.out.println("Goodbye!");
        scanner.close();
    }
}
