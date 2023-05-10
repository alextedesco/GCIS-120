package activities;

public class Recursion {

    public static boolean isPower (int a, int b) {
        if (a == 1) {
            return true;
        } else if (a % b == 0) {
            return true;
        } else {
            isPower(b, a);
        }
        return false;
    }

    public static int whatPower (int a, int b) throws IllegalArgumentException{
        int x = 0;
        if (a == 1) {
            return 0;
        }
        if (b*x != b) {
            
        }
        return x;
    }

    
}
