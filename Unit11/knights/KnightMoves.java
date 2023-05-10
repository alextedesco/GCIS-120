package knights;

import java.util.InputMismatchException;
import java.util.Scanner;

import Graphs.Graph;

public class KnightMoves {

    public static void main(String[] args) {
        Scanner size = new Scanner (System.in);
        while (true) {
            System.out.print("Enter Size: ");
            try {
            size.nextInt();
            if (size.hasNextInt()) {
                break;
                }
        } catch (InputMismatchException e) {
                System.err.println("Enter Integer!"); 
                size.nextLine();
                continue;   
                }
            }
        while (size.nextInt() < 3) {
                System.out.println("Size must be greater than 3!");
                System.out.print("Enter Size: ");
                size.nextLine();
            }
            
        Graph<Square> board = Square.makeBoard(size.nextInt(), size.nextInt());
        size.close();
        System.out.println(board);


    }
}