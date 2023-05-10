public class Roulette {


    public class Pocket {
        double number;
        String color;

        Pocket (double number, String color) {
            this.number = number;
            this.color = color;
        }
        
        public double getNumber () {
            return this.number;
        }

        public String getColor () {
            return this.color;
        }

        @Override
        public String toString() {
            //  "<#> <color>" e.g. "36 red"
            return this.number + " " + this.color;
        }

    public class Wheel {
    /*
    A Roulette wheel has 38 pockets. Each time the dealer spins the wheel, the white ball
    ends up in one of the pockets. 
    Implement a class that represents a Roulette wheel and
    meets at least these requirements:
        a. A parameterless constructor that creates and fills an array of 38 pockets. Use the
        image above as a guide to the numbers and colors of each pocket. Use 0 and
        100 for the green pockets . You don't have to do anything fancy here: you can1
        hard code the colors/numbers if you'd like.

        b. A spin method that randomly selects a pocket from the array and returns it
    */

        Wheel () {

        }

public static void main(String[] args) {
    Pocket pocket_1 = new Pocket (36, "red");
    System.out.println(pocket_1);
            }
        }
    }
}

