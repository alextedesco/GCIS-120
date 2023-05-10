/**
 * This file is a Roulette Game class that plays Roulette in the terminal
 * @author Alex Tedesco
 */

//  Imports:
import java.lang.Math;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class BinaryConverter {
    /**
    * This class creates a Binary convertor
    */    

public static int[] stringToArray (String a_string) {
    /**
    * This methods turns a binary in string format into an int array
    */
    int len = a_string.length();
    int[] array = new int [len];
    for (int index = 0; index < len; index++) {
        char num = a_string.charAt (index);
        if (num == 49) {
            num = 1;
        } else {
            num = 0;
        }
        array[index] = num;
    }
    return array;
    }

public static int arrayToInt(int [] an_array) {
    /**
    * This converts a binary int array in a int decimal result.
    */
    int int_result = 0;
    int new_len = an_array.length;
    for (int index = new_len - 1; index >= 0; index = index - 1) {
        int number = an_array[index];
        double result = number * Math.pow(2, new_len - 1);
        int_result = int_result + (int)result;
        new_len = new_len - 1;
        }
        return int_result;
    }
 
public static void main(String[] args) {
    /**
    * Main function with all executed code.
    */
    int [] an_array_1 = stringToArray("0111111101011111");
    System.out.println(an_array_1);
    System.out.println(arrayToInt(an_array_1));
    Scanner f = new Scanner (System.in);
    System.out.print("Enter Filename: ");
    String filename = f.next();
    File file = new File (filename);

    {try (FileReader file_reader = new FileReader(file);
        BufferedReader reader = new BufferedReader(file_reader);) {
            
        String line = reader.readLine();

        while (line != null) {
            System.out.print(line);
            String string [] = line.split(" ");
            int[] binary_array = stringToArray(string[0]);
            int answer = arrayToInt(binary_array);
            String int_answer = Integer.toString(answer);
            if (int_answer.equals (string [1])) {
                System.out.println(" Correct!");
            } else {
                System.out.println(" Incorrect");
            }
            line = reader.readLine();

        }
    } catch (IOException e) {
            System.out.println("Failed!");
        }

        }
    f.close();
    }
    
}