package parade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import backtracker.Configuration;

public class KnightParade implements Configuration {
    Chessboard board;
    int startRow;
    int startColumn;

    public KnightParade (Chessboard board, int startRow, int startColumn) {
        this.board = board;
        this.startRow = startRow;
        this.startColumn = startColumn;
    }

    @Override
    public Collection<Configuration> getSuccessors() {
        ArrayList<Configuration> successors = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                KnightParade successor = new KnightParade(board, startRow + 1, startColumn + 2);
                successors.add(successor);
            }
            if (i == 1) {
                KnightParade successor = new KnightParade(board, startRow + 1, startColumn - 2);
                successors.add(successor);
            }
            if (i == 2) {
                KnightParade successor = new KnightParade(board, startRow - 1, startColumn + 2);
                successors.add(successor);
            }
            if (i == 3) {
                KnightParade successor = new KnightParade(board, startRow - 1, startColumn - 2);
                successors.add(successor);
            }
            if (i == 4) {
                KnightParade successor = new KnightParade(board, startRow + 2, startColumn + 1);
                successors.add(successor);
            }
            if (i == 5) {
                KnightParade successor = new KnightParade(board, startRow + 2, startColumn - 1);
                successors.add(successor);
            }
            if (i == 6) {
                KnightParade successor = new KnightParade(board, startRow - 2, startColumn + 1);
                successors.add(successor);
            }
            if (i == 7) {
                KnightParade successor = new KnightParade(board, startRow - 2, startColumn - 1);
                successors.add(successor);
            }      
        }
        return successors;
    }

    @Override
    public boolean isValid() {
        // If the move is one of the possible 8 moves, it is valid (Up/Down 2 or 1, Left or Right 2 or 1)
        // return false;
        Collection<Configuration> successors = getSuccessors();
        ArrayList<Configuration> newList = new ArrayList<>(successors);
        for (Configuration i : newList) {
        }
        return false;
    }

    @Override
    public boolean isGoal() {
        // If list != n -1, then return false
        // Otherwise the knight has gone to every square : return true
        // return false;
        return isValid() && board.isFull();
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter N: ");
        int boardSize = n.nextInt();
        Chessboard board = new Chessboard(boardSize);
        System.out.println("Enter starting Position: ");
    
    }
}
