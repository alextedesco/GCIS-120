package queens.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import backtracker.Configuration;

public class NQueens implements Configuration {

    private final Queen[] queens;
    private final int n;

    public NQueens (Queen[] queens, int n) {
        this.queens = queens;
        this.n = n;
    }

    @Override
    public Collection<Configuration> getSuccessors() {
        ArrayList<Configuration> successors = new ArrayList<>();
        int row = queens.length;
        for (int col=0; col<n; col++) {
            Queen queen = new Queen(row, col);
            Queen[] queensCopy = Arrays.copyOf(queens, row + 1);
            queensCopy[row] = queen;
            NQueens successor = new NQueens(queensCopy, n);
            successors.add(successor);
        }

        return successors;
    }

    @Override
    public boolean isValid() {
        if (queens.length > 1) {
            Queen last = queens[queens.length - 1];
            for (int i=0; i < queens.length - 1; i++) {
                Queen queen = queens[i];
                if (queen.canAttack(last)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isGoal() {
        return isValid() && queens.length == n;
    }

    @Override
    public String toString() {
        return Arrays.toString(queens) + ", " + n;
    }

    public Queen[] getQueens() {
        return queens;
    }

    public static void main(String[] args) {
        NQueens nQueens = new NQueens(new Queen [0], 4);
        System.out.println(nQueens);
    }
}
