public class Fruit {
    private String name;
    private double price;
    private String color;

    Fruit (String name, double price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    void discount (int percent) {
        this.price = this.price * (percent / 100.0);
    }

    public String getName () {
        return this.name;
    }

    public double getPrice () {
        return price;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public String getColor () {
        return color;
    }

    @Override
    public String toString () {
        return "A " + this.color + " " + this.name + " for $" + this.price;
    }

    @Override
    public boolean equals (Object other) {
        if (other instanceof Fruit) {
            Fruit f = (Fruit)other;
            return this.name.equals (f.name) && this.color.equals(f.color);
        } else {
            return false;
        }
   }
    
public static void main (String[] args) {
    Fruit apple1 = new Fruit ("Apple", 2.0, "Red");

    apple1.discount (50);

    System.out.println(apple1);

    // Fruit orange = new Fruit ("Orange", 1.25, "Orange");
    // System.out.println(orange);

    Fruit apple2 = new Fruit ("Apple", 2.0, "Red");

    apple2.discount (50);

    System.out.println(apple2);

    System.out.println(apple1 == apple2);
    System.out.println (apple1.equals(apple2));
    System.out.println (apple1.equals(apple1));
    
    }

}
