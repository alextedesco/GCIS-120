/**
 * This file loads a shipment of Sodas into a Soda Factory and counts the total amount of
 * sodas in the shipment, the total amount of a certain flavor of soda, and the total cost
 * of the shipment. It asks the user to input a file and a flavor
 * @author Alex Tedesco
 */


// Imports:
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SodaFactory {
    public static Soda [] loadShipment(String filename) throws NumberFormatException, IOException {
    File file = new File(filename);
    FileReader fr = new FileReader(file);
    BufferedReader reader = new BufferedReader(fr);
    int size = Integer.parseInt(reader.readLine());
    Soda [] sodas = new Soda [size];
    int index = 0;
    String nextLine = reader.readLine();
    while (nextLine != null) {
        String [] lines = nextLine.split(" ");
        int flavor = Integer.parseInt(lines[0]);
        sodas[index] = new Soda (flavor, lines[1]);
        index++;
        nextLine = reader.readLine();
    } reader.close();
    return sodas;
    }

public static int countFlavor(Soda [] shipment, String flavor) {
    int count = 0;
    for (int index = 0; index < shipment.length; index++) {
        Soda soda = shipment [index];
        if (soda.getFlavor().equals(flavor)) {
            count += 1;
        }
    } 
    return count;
}

public static double totalPrice (Soda [] shipment) {
    double price = 0;
    for (int index = 0; index < shipment.length; index++) {
        price += shipment [index].getPrice();
        }
        return price;
    } 

    public static void main(String[] args) throws NumberFormatException, IOException {  
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter Filename: ");
            String filename = s.nextLine();
            System.out.print("Enter Flavor: ");
            String flavor = s.nextLine();
            Soda [] shipment = loadShipment(filename);
            System.out.println("Shipment of " + shipment.length + " sodas loaded.");
            System.out.println(countFlavor(shipment, flavor));
            System.out.println(totalPrice(shipment));
        } catch (InputMismatchException e) {
            System.err.println("Invalid Input!");
            }
        s.close();
        }
    }


