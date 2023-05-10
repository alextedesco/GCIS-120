import java.util.Random;

public class Wheel {
    Pocket[] pockets;

    public Wheel() {
        pockets = new Pocket [38];
        pockets[0] = new Pocket (0, "Green"); pockets[1] = new Pocket (1, "Red"); pockets[2] = new Pocket (2, "Black"); pockets[3] = new Pocket (3, "Red"); pockets[4] = new Pocket (4, "Black"); pockets[5] = new Pocket (5, "Red");
        pockets[6] = new Pocket (6, "Black"); pockets[7] = new Pocket (7, "Red");  pockets[8] = new Pocket (8, "Black"); pockets[9] = new Pocket (9, "Red"); pockets[10] = new Pocket (10, "Black"); pockets[11] = new Pocket (11, "Black");
        pockets[12] = new Pocket (12, "Red"); pockets[13] = new Pocket (13, "Black"); pockets[14] = new Pocket (14, "Red"); pockets[15] = new Pocket (15, "Black"); pockets[16] = new Pocket (16, "Red"); pockets[17] = new Pocket (17, "Black");
        pockets[18] = new Pocket (18, "Red"); pockets[19] = new Pocket (19, "Red"); pockets[20] = new Pocket (20, "Black"); pockets[21] = new Pocket (21, "Red"); pockets[22] = new Pocket (22, "Black"); pockets[23] = new Pocket (23, "Red");
        pockets[24] = new Pocket (24, "Black"); pockets[25] = new Pocket (25, "Red"); pockets[26] = new Pocket (26, "Black"); pockets[27] = new Pocket (27, "Red"); pockets[28] = new Pocket (28, "Black"); pockets[29] = new Pocket (29, "Black");
        pockets[30] = new Pocket (30, "Red"); pockets[31] = new Pocket (31, "Black"); pockets[32] = new Pocket (32, "Red"); pockets[33] = new Pocket (33, "Black"); pockets[34] = new Pocket (34, "Red"); pockets[35] = new Pocket (35, "Black");
        pockets[36] = new Pocket (36, "Red"); pockets[37] = new Pocket (100, "Green");
    }

    Pocket spin () {
        int min = 0;
        int max = 37;
        Random spin = new Random ();
        int result = spin.nextInt(min, max);
        return pockets[result];
    }

public static void main(String[] args) {
    Wheel wheel_1 = new Wheel ();
    System.out.println(wheel_1.spin());
    }
}
