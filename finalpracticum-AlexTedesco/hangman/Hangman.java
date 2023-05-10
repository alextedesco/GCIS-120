package hangman;

import java.util.HashSet;
import java.util.Set;

/**
 * Implements a simple Hangman game.
 */
public class Hangman {
    /**
     * The state of the game.
     */
    public enum State {
        IN_PROGRESS, // game is still in progress
        WON,         // game is won
        LOST;        // game is lost
    }

    /**
     * The maximum number of misses before the game is lost.
     */
    private static final int MAX_MISSES = 6;

    /**
     * The secret phrase.
     */
    private final String secret;

    /**
     * Remaining, unguessed characters from the secret phrase.
     */
    private Set<Character> remaining;

    /**
     * Characters that have been guessed so far.
     */
    private Set<Character> guesses;

    /**
     * The current state of the game.
     */
    private State state;

    /**
     * The number of misses.
     */
    private int misses;
    
    /**
     * Makes a new hangman game with the specified secret phrase.
     * @param secret
     */
    public Hangman(String secret) {
        this.secret = secret;
        remaining = new HashSet<>();
        for(char c : secret.toCharArray()) {
            // only alphabetic characters are considered secret - any 
            // whitespace, punctuation, numbers, or special characters will not
            // be concealed.
            if(Character.isAlphabetic(c)) {
                remaining.add(Character.toLowerCase(c));
            }
        }
        this.guesses = new HashSet<>();
        this.misses = 0;
        this.state = State.IN_PROGRESS;
    }

    /**
     * Copy constructor = creates a deep copy of the hangman game.
     * 
     * @param original The original game being copied.
     */
    private Hangman(Hangman original) {
        this.secret = original.secret;
        this.remaining = new HashSet<>(original.remaining);
        this.guesses = new HashSet<>(original.guesses);
        this.misses = original.misses;
        this.state = original.state;
    }

    /**
     * Creates a deep copy of this hangman and returns it.
     * 
     * @return A deep copy of this hangman.
     */
    public Hangman deepCopy() {
        return new Hangman(this);
    }

    /**
     * Attempts to make a guess if the game is still in progress. If the guess
     * is a duplicate or the game is over, the guess is ignored.
     * 
     * @param guess The character being guessed.
     * 
     * @return True if the guess was accepted (right or wrong), false if it was
     * ignored.
     */
    public boolean guess(char guess) {
        boolean accepted = false;
        if(state == State.IN_PROGRESS) {
            char lower = Character.toLowerCase(guess);
            if(misses < MAX_MISSES && !guesses.contains(lower)) {
                guesses.add(lower);
                misses += remaining.remove(lower) ? 0 : 1;
                if(misses < MAX_MISSES && remaining.size() == 0) {
                    state = State.WON;
                } else if(misses >= MAX_MISSES) {
                    state = State.LOST;
                }
                accepted = true;
            }
        }
        return accepted;
    }

    /**
     * Returns the state of the game.
     * 
     * @return The state of the game; ongoing, won, or lost.
     */
    public State getState() {
        return state;
    }

    /**
     * Returns a hint, with all of the guessed characters filled in. Any
     * characters that have not been guessed will be '_'.
     * 
     * @return A hint.
     */
    public String getHint() {
        StringBuilder hint = new StringBuilder();
        for(char c : secret.toCharArray()) {
            if(remaining.contains(Character.toLowerCase(c))) {
                hint.append('_');
            } else {
                hint.append(c);
            }
        }
        return hint.toString();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getHint());
        builder.append("\n");
        for(char c : guesses) {
            builder.append(c);
            builder.append(" ");
        }
        builder.append("\n");
        builder.append("remaining: " + (MAX_MISSES - misses));
        return builder.toString();
    }

    /**
     * Allows the user to play hangman from the command line.
     * 
     * @param args The command line arguments. These are not used.
     */
    public static void main(String[] args) {
        String secret = "this, my friend, is the secret phrase!";
        Hangman hangman = new Hangman(secret);
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println(hangman);
        while(hangman.getState() == State.IN_PROGRESS) {
            System.out.print(">> ");
            char c = scanner.nextLine().charAt(0);
            hangman.guess(c);
            System.out.println(hangman);
        }
        scanner.close();
        if(hangman.getState() == State.WON) {
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("You lost. Too bad!");
        }
    }
}
