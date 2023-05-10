import java.util.Arrays;
import java.util.Random;

public class Activities {
    private static Random RNG = new Random();

    public static int rollTheDie(int sides) { // 6
        int n = RNG.nextInt(sides); // 0 - 5
        return n + 1;
    }

    public static void main(String[] args) {
        int[] ints = new int[5];

        String[] strings = new String[4];

        ints[3] = 5;
        int x = ints[4];

        String y = Arrays.toString(ints);
        System.out.println(y);

        System.out.println(Arrays.toString(strings));
    }
}