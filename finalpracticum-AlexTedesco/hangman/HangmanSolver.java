package hangman;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import backtracker.Backtracker;
import backtracker.Configuration;
import hangman.Hangman.State;

/**
 * Backtracking configuration used to try to solve a hangman puzzle.
 */
public class HangmanSolver implements Configuration {
    private final Hangman hangman;
    // you may add more fields as needed!

    /**
     * Creates a new configuration with the specified hangman puzzle.
     * 
     * @param hangman The hangman puzzle to solve.
     */
    public HangmanSolver(Hangman hangman) {
        this.hangman = hangman;   
    }

    // you may add additional constructors as needed here. 

    @Override
    public Collection<Configuration> getSuccessors() {
        // return the successor configurations. There may be up to 26 (one for
        // each letter in the alphabet). You can try to optimize by skipping
        // letters that have been guessed previously, but your solution should
        // run quickly even if you do not.
        // make sure that each successor gets a deep copy of the hangman
        // game! do not try to make more than one additional move per game!
        Set<Configuration> guesses = new HashSet<>();
        for(char c='a'; c<='z'; c++) {
            Hangman hangman = new Hangman("be");
            Hangman copy = hangman.deepCopy();
            hangman.guess(c);
            guesses.add((Configuration) copy);
        }
        return guesses;
    }

    @Override
    public boolean isValid() {
        // A successor is valid if the last move succeeded (returned true) and the 
        // game is not lost. Remember: a wrong guess IS considered a successful move,
        // and so the player may lose afterwards.
        // this should return true if the move made was accepted (returned true

        // A successor is invalid if the move failed (returned false) or the game is
        // lost.
        if (hangman.getState() == State.IN_PROGRESS) {
            return true;
        } else {
        return false;
        }
    }

    @Override
    public boolean isGoal() {
        // A successor is the goal if the game is won.
        if (hangman.getState() == State.WON) {
            return true;
        } else {
        return false;
        }
    }

    @Override
    public String toString() {
        return hangman.toString();
    }

    public static void main(String[] args) {
        // short phrase suitable for debugging
        Hangman hangman = new Hangman("be"); 
        boolean debug = true;                 

        // very long phrase - DO NOT USE DEBUGGING!
        // Hangman hangman = new Hangman("Humpty Dumpty sat on a wall. Humpty Dumpty had a great fall.");
        // boolean debug = false;

        System.out.println(hangman);
        Backtracker backtracker = new Backtracker(debug);
        HangmanSolver solver = new HangmanSolver(hangman);
        
        Configuration solution = backtracker.solve(solver);
        if(solution !=null) {
            System.out.println(solution);
        } else {
            System.out.println("No solution...");
        }
    }
}
