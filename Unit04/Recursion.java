// Alex Tedesco

public class Recursion {

public static int multiples (int n, int divisor, int product) {
    if (n % divisor == 0 && n > 0) {
        int newProduct = product *= n;
        // System.out.println(n);
        int newN = n - 1;
        multiples(newN, divisor, newProduct);
    } else if (n % divisor != 0 && n > 0) {
    int newN = n - 1;
    int newProduct = product;
    multiples(newN, divisor, newProduct);
    } else if (n == 0) {
        }
        return product;
    }

public static boolean isPalindrome (String a_string) {
    return true;
}

 public static void main(String[] args) {
    System.out.println(multiples(10, 3, 1));
    }
}
