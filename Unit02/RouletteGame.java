/**
 * This file is a Roulette Game class that plays Roulette in the terminal
 * @author Alex Tedesco
 */


// Imports
import java.util.Scanner;

public class RouletteGame {
    /**
    * This class creates a Roulette Game
    */
    int money = 100;
    Wheel wheel;
    String bet;
    int wager;
    String color;
    
    RouletteGame () {
        this.wheel = new Wheel ();
    }
    public Pocket spin () {
    /**
    * This method spins the wheel and returns the result.
    */
        Pocket spin = this.wheel.spin();
        return spin;
    }

    public String bet (String bet, int wager) {
    /**
    * This returns the bet called.
    */
        return bet + wager;
    }

    public void betEvens () {
    /**
    * This adds or removes money based on if the users bet was correct.
    */
        if (this.bet.equals ("Evens")) {
            this.wager = this.wager * 2;
        }
        else if (this.bet.equals ("Odds")) {
            this.money -= this.wager;
        }
    }

    public void betOdds () {
    /**
    * This adds or removes money based on if the users bet was correct.
    */
        if (this.bet.equals ("Odds")) {
            this.wager = this.wager * 2;
        }
        else if (this.bet.equals ("Evens")) {
            this.money -= this.wager;
        }
    }

    public void betRed () {
    /**
    * This adds or removes money based on if the users bet was correct.
    */
        if (this.bet.equals ("Red")) {
            this.wager = this.wager * 2;
        }
        else if (this.bet.equals ("Black")) {
            this.money -= this.wager;
        }
    }
    
    public void betBlack () {
    /**
    * This adds or removes money based on if the users bet was correct.
    */
        if (this.bet.equals ("Black")) {
            this.wager = this.wager * 2;
        }
        else if (this.bet.equals ("Red")) {
            this.money -= this.wager;
        }
    }

    public String result () {
    /**
    * This checks if the the bet was correct then calls the other methods to change the money.
    */
        if (this.bet.equals ("Red")) {
            betRed();
            return "You won!";
        }
        else if (!this.bet.equals("Red")) {
            betRed();
            return "You lost!";
        } else if (this.bet.equals ("Black")) {
            betBlack();
            return "You won!";
        } else if (!this.bet.equals ("Black")) {
                betBlack();
                return "You lost!";
        } else if (this.bet.equals ("Evens")) {
            betEvens();
            return "You won!";
        } else if (!this.bet.equals ("Evens")) {
            betEvens();
            return "You lost!";
        } else if (this.bet.equals ("Odds")) {
            betOdds();
            return "You won!";
        } else if (!this.bet.equals ("Odds")) {
            betOdds();
            return "You lost!";
        }
        return bet;
    }

    
    public String toString() {
    /**
    * This returns the class in String format.
    */
        return "The ball landed on" + this.spin(this.bet, this.wager) + this.result() + "\n" + "Balance: $" + this.money;
    }
    public int getMoney() {
        return this.money;
    }
    
    public static void main(String[] args) {
    /**
    * Main function
    */
        RouletteGame RouletteGame_1 = new RouletteGame();
        System.out.println("Welcome to Roulette!" + "\n" + "Balance: $" + RouletteGame_1.getMoney());
        while (RouletteGame_1.getMoney() > 0) {
            Scanner b = new Scanner (System.in);
            System.out.print("Place Bet: ");
            String bet = b.next();
            int amount = b.nextInt();
            RouletteGame_1.bet(bet, amount);
            RouletteGame_1.spin();
            System.out.println(RouletteGame_1);  
            if (RouletteGame_1.money == 0) {
                b.close ();
            }
        }
    }
}

