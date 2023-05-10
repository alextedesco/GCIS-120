import java.util.Random;

public class RandomExample {
    private static int random (int min, int max) {
        Random RNG = new Random ();

        int upperBound = max - min + 1;

        int rand = RNG.nextInt(upperBound);

        int result = rand + min;

        return result;
    }

}