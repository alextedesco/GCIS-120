public class Activities {
    public static void printOdds (int[] array) {
    for (int index = 0; index < array.length; index++) {
            int value = array[index];
            if (value % 2 != 0) {
                System.out.println(value + " ");
            }
        }
    }

    public static int threeAndFives (int [] array) {
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            int value = array [index];
            if (value % 3 == 0) { // With both 3 and 5 - if (value % 3 == 0 || value % 5 == 0)
                sum = sum + value;
            }
        }
            return sum;
        }

    public static int printIntegers (int n, int c) {
        // We are trying to only print integers from 0 to N
        // One unit of work is printing a single integer
        // We need to know what integer to print
        // To prepare for the next step we eed to add one to our integer call
        // We know to stop working when our integer call is equal to N
        if (n < 0) {
            return -1;
        }
        if (c == n) {
            System.out.println (c);
            return c;
        } else {
            System.out.println (c); // Unit of work
            int nextC = c + 1; // Prepare for the recursive call
            return c + printIntegers(n, nextC); 
        }
    }

    public static int printIntegers (int n) {
        return printIntegers(n, 0);
    }

    public static int factorial (int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            int result = factorial (n-1);
            int factorial = n * result;
            return factorial;
        }
    }


    public static int gcd(int a, int b) {
        if (a < 1 || b < 1) {
            return -1;
        } else if (a == b){
            return b;
        } else if (a > b) {
            return gcd (a - b, b);
        } else {
            return gcd (b - a, a);
        }
    }
        
public static void main(String[] args) {
    // int [] array = ArrayUtils.rangeArray (50, 75);
    // // printOdds(array);
    // System.out.println(threeAndFives(array));
    // int total = printIntegers(100000);
    // int total = printIntegers(10);
    // System.out.println((total));
    int i = 0;
    while (i < 21) {
        System.out.println("factorial(" + i + ") = " + factorial(i));
        i += 1;
        }
    }
}