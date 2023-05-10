import java.util.Random;

public class ArrayUtils {
    private static Random RNG = new Random();

    public static int random(int min, int max) {
        int upperBound = max - min + 1;
        int rand = RNG.nextInt(upperBound);
        return rand + min;
    }

    public static int[] randomArray(int size, int min, int max) {
        int[] random = new int[size];

        for(int index=0; index<random.length; index++) {
            random[index] = random(min, max);
        }

        return random;
    }
}