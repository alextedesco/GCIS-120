package knights;

import Graphs.AdjacencyGraph;
import Graphs.Graph;

public class Square {
    int row;
    int col;
    
    public Square (int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Square) {
            Square otherSquare = (Square) other;
            if (this.row == otherSquare.row && this.col == otherSquare.col) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static Graph<Square> makeBoard (int row, int col) {
        Graph<Square> board = new AdjacencyGraph<>();
        for (int r = 0 ; r < row;r++) {
            for (int c = 0; c < col;c++) {
                Square square = new Square(r, c);
                board.add(square);
            }
        }

        for (int r = 0 ; r < row;r++) {
            for (int c = 0; c < col;c++) {
                                    
                Square square1 = new Square(r, c);
                Square square2 = new Square(r + 2, c + 1);
                if (square2.row >= row || square2.col >= col || square2.row < 0 || square2.col < 0)  {
                    continue;
                } else {
                    board.connectDirected(square1, square2);  
                }
            }
        }
        
        return board;
    }
    public static void main(String[] args) {
        System.out.println(makeBoard(3, 3));
    }
}
