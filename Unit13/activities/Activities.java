package activities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Activities {

    public static void sayHello() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = s.nextLine();
        System.out.println("Hello, " + name);
        s.close();
    }

    public static void forLoops () {
        for (int i=0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int x=50; x <= 100; x++) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int q=100; q >= 0; q = q - 2) {
            System.out.print(q + " ");
        }
    }

    public static void fillArray (int[] array, int start, int step) {
        for (int i = 0; i < array.length; i++) {
            array[i] = start + (step * i);
        }
        System.out.println(Arrays.toString(array));
    }

    public static boolean arraysEquals (int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        } else {

            for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
        }
    }

    public static String chopChop (String string) {

        String copy = "";
        int index = 0;
        while (index < string.length()) {
            char c = string.charAt(index);
            copy += c;
            index += 2;
        }
        int newIndex = 1;
        while (newIndex < string.length()) {
            char c = string.charAt(newIndex);
            copy += c;
            newIndex += 2;
        }
        return copy;
    }

    public static String unchop (String string) {
        String copy = "";
        int length = string.length();
        char c = string.charAt(length / 2);
        String value = String.valueOf(c);
        String[] split = string.split(value);
        String left = split[0];
        String right = split[1];
        for (int i = 0; i < left.length(); i++) {
                char l = left.charAt(i);
                copy += l;
                char r = right.charAt(i);
                copy += r;
        }
        return copy;
    }

    public static int startsWith (String filename, char letter) throws IOException {
        int count = 0;
        FileReader fr = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        while (line != null) {
            if (line.length() > 0) {
            line = line.toLowerCase();
            String[] words = line.split(" ");
            for (String word : words) {
                if (word.length() > 0 && word.charAt(0) == letter) {
                    count++;
                    }
                }
            }
        line = reader.readLine();
            }
        reader.close();
        return count;
    }

    public static void main(String[] args) throws IOException {
        // sayHello();
        // forLoops();
        // fillArray(new int [10], 1, 1);
        // fillArray(new int [10], 3, 4);
        // fillArray(new int [10], 5, 10);
        // int[] a = new int[10];
        // fillArray(a, 1, 1);
        // int[] b = new int[10];
        // fillArray(b, 1, 1);
        // int[] c = new int[11];
        // fillArray(c, 1, 1);
        // int[] d = new int[10];
        // fillArray(d, 2, 1);
        // System.out.println(arraysEquals(a, b));
        // System.out.println(arraysEquals(b, c));
        // System.out.println(arraysEquals(c, d));
        // System.out.println(chopChop("Making Sausage!"));
        // String chopped = chopChop("Making Sausage!");
        // System.out.println(unchop(chopped));
        System.out.println(startsWith("data/atotc.txt", 'a'));
    }  
}
