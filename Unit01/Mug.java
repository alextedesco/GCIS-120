public class Mug {
    private double size;
    private String color;
    private double fillLevel;
    private String phrase;

    Mug (double size, String color, double fillLevel, String phrase) {
        this.size = size;
        this.color = color;
        this.fillLevel = 0;
        this.phrase = phrase;
    }

    public double getSize() {
        return this.size;
    }
    public String getColor() {
        return this.color;
    }
    public String getPhrase() {
        return this.phrase;
    }
    public String setPhrase(String phrase) {
        return this.phrase;
    }
    public double getFillLevel() {
        return this.fillLevel;
    }
    
    

    void fill (double ounces) {
        if (ounces + this.fillLevel > this.size) {
            this.fillLevel = this.size;
    } else {
        this.fillLevel += ounces;
        }
    }

    double drain (double ounces) {
        double drained = 0;
        if (this.fillLevel - ounces < 0) {
            drained = this.fillLevel;
            this.fillLevel = 0;
        } else {
            drained = ounces;
            this.fillLevel -= ounces;
        }
        return drained;
    }

    @Override
    public String toString () {
        return "A " + this.color + " " + this.size + "oz mug that says " + this.phrase;
    }

    @Override
    public boolean equals (Object other) {
        if (other instanceof Mug) {
            Mug m = (Mug)other;
            return this.color.equals (m.color) && this.size == m.size;
        } else {
            return false;
        }
   }

public static void main(String[] args) {
    Mug mug1 = new Mug (24, "pink", 0, "I Hate Mondays!");

    System.out.println(mug1);

    Mug mug2 = new Mug (12, "Black", 0, "Mondays, am i right?");

    System.out.println(mug2);

    Mug mug3 = new Mug (100, "Purple", 0, "");

    System.out.println(mug3);
        
        }
    
    }