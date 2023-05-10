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

public static void main(String[] args) {
    Pocket pocket_1 = new Pocket (36, "red");
    System.out.println(pocket_1);
            }
        }
    }


