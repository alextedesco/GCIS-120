package mcf;

import java.util.Random;

public class Lists {

    public static void listMaker (List<Integer> list) {
        Random RNG = new Random();
        while (list.size() < 100) {
            int number = RNG.nextInt(1, 101);
            list.append(number);
        }
    }
}
