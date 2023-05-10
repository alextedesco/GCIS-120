/**
 * This file is a Hangman class that plays Hangman in the terminal
 * @author Alex Tedesco
 */

// Imports:
import java.util.Scanner;

public class Hangman {
    /**
    * This class creates a Hangman game.
    */
    String secretWord;
    String guessedLetters;
    double numberOfGuesses;

    Hangman (String secretWord, String guessedLetters, double numberOfGuesses) {
        this.secretWord = secretWord;
        this.guessedLetters = guessedLetters;
        this.numberOfGuesses = 6;
    }

    public String getSecretWord () {
    /**
    * This returns the secret word.
    */
        return this.secretWord;
    }

    public String getGuessedLetters () {
    /**
    * This returns the guessed letters.
    */        
        return this.guessedLetters;
    }

    public double getNumberOfGuesses () {
    /**
    * This returns the number of guesses.
    */        
        return this.numberOfGuesses;
    }

    public static double countChar (char character, String a_string) {
    /**
    * This counts the amount of times a character appears in a string.
    */
        int length = a_string.length();
        int index = 0;
        int count = 0;
            while (index < length) {
                char c = a_string.charAt(index);
                if (c == character) {
                    count += 1;
                    index += 1;
                } else {
                    count += 0;
                    index += 1;
                }
            }
        return count;
    }

    public String gameOver (double numberOfGuesses, String guessedLetters, String secretWord) {
    /**
    * This returns if the game is over or not.
    */
        if (numberOfGuesses == 0 || getHint().equals (secretWord)) {
            this.numberOfGuesses = 0;
            return "Game Over";
        } else {
            return "Continue playing. You have " + this.numberOfGuesses + " guesses remaining.";
        }
    }

    public String getHint () {
    /**
    * This returns a hint of which letters have been gussed of the secret word.
    * Secret Word = acca
    * Gussed Letters = c
    * Hint = _ c c _
    */
        String hint = "";
        for (int index = 0; index < secretWord.length(); index++) {
            char c = secretWord.charAt(index);
            if (countChar(c, guessedLetters) > 0) {
                hint += c; 
            } else {
            hint += '_';}
                }
         return hint;
    }

    public void guess(char c) {
    /**
    * This makes a guess in the hangman game by taking a parameter for the character guessed.
    */
        if (countChar(c, guessedLetters) == 0) {
            guessedLetters = guessedLetters + c;
            numberOfGuesses -= 1;
        }
    }

    @Override
    public String toString () {
    /**
    * This returns the Hangman game in string format.
    */
        return "Hint: " + getHint() + "\n" + "Guesses: " + this.guessedLetters + "\n" + "Remaining: " + this.numberOfGuesses;
    }

    public static void main(String[] args) {
    /**
    * The main function with all the executed code.
    */
        Hangman hangman_1 = new Hangman ("cat", "", 6);
        while (0 != hangman_1.getNumberOfGuesses()) {
            Scanner letter = new Scanner (System.in);
            System.out.print("Enter Guess: ");
            String guess = letter.next();
            char guessletter = guess.charAt(0);
            hangman_1.guess (guessletter);
            System.out.println(hangman_1);
            System.out.println(hangman_1.gameOver(hangman_1.getNumberOfGuesses(), hangman_1.getGuessedLetters(), hangman_1.getSecretWord()));
            if (hangman_1.getNumberOfGuesses() == 0) {
                letter.close();
            }
        }
        // char c = 'c';
        // String a_string = "acca";
        // countChar (c, a_string);
        }
        
    }