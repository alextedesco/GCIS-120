package parade;
import java.util.Arrays;

/**
 * Specialized chessboard for the Knight Tour problem. Only allows moves to be
 * made on each square once. Keeps track of the number of moves made.
 */
public class Chessboard {
    /**
     * The dimension (number of rows and columns) on the board.
     */
    private final int n;

    /**
     * The chessboard. A 0 indicates that no move has been made at that 
     * location.
     */
    private final int[][] board;

    /**
     * The number of moves that have been made on this chessboard.
     */
    private int moves;

    /**
     * Creates a new chessboard of the specified dimension.
     * 
     * @param n The dimension of the new chessboard.
     */
    public Chessboard(int n) {
        this.n = n;
        this.board = new int[n][n];
        moves = 0;
    }

    /**
     * Makes a deep copy of the chessboard. The new copy can be manipulated
     * without affecting the original.
     * 
     * @param template The template to copy. All current moves are copied onto
     * a new board.
     */
    public Chessboard(Chessboard template) {
        this.n = template.n;

        this.board = new int[n][];
        for(int row=0; row<n; row++) {
            this.board[row] = Arrays.copyOf(template.board[row], n);
        }
        
        this.moves = template.moves;
    }

    /**
     * Attempts to make a move at the specified row and column on the 
     * chessboard. If the move is successful, the number of moves made is 
     * incremented, and the value at that location on the chessboard is changed
     * to the move number.
     * 
     * @param row The row where the move will be attempted.
     * @param col The col where the move will be attempted.
     * @return True if the move was successful. A move may fail if the row 
     * and/or column is out of range, or a move has been made at that location
     * previously. If the move fails, the chessboard is not changed.
     */
    public boolean makeMove(int row, int col) {
        if(row < 0 || row >= n 
            || col < 0 || col >= n 
            || board[row][col] != 0) {
            return false;
        } else {
            moves++;
            board[row][col] = moves;
            return true;
        }
    }

    /**
     * Returns the number of moves made on this board.
     * 
     * @return The number of moves made on this board.
     */
    public int getMoves() {
        return moves;
    }

    /**
     * Returns true if every square has a move.
     * 
     * @return True if every square has a move, and false otherwise.
     */
    public boolean isFull() {
        return moves == (n * n);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(int row=0; row<n; row++) {
            for(int col=0; col<n; col++) {
                builder.append("[");
                builder.append(String.format("%3d", board[row][col]));
                builder.append("]");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
    
    public static void main(String[] args) {
        Chessboard board = new Chessboard(8);
        board.makeMove(5, 7);
        System.out.println(board);
    }
}
