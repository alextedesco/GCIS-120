public class Soda {

   private int size;
   private String flavor;
   private double price;

   public Soda (int size, String flavor) {
       this.size = size;
       this.flavor = flavor;
   }

   public int getSize() {
       return size;
   }

   public String getFlavor() {
       return flavor;
   }

   public double getPrice() {
       price = (0.11 * getSize());
       return price;
   }

   @Override
   public String toString() {
       return "A " + this.size + "oz " + this.flavor + " soda for $" + getPrice();
   }

   @Override
   public boolean equals(Object other) {
       if (other instanceof Soda) {
           Soda otherSoda = (Soda) other;
           return this.size == otherSoda.size && this.flavor.equals (otherSoda.flavor);
       } else {
           return false;
       }
    }

   public static void main(String[] args) {
       Soda soda_1 = new Soda(16, "Cherry-Cola");
       Soda soda_2 = new Soda(16, "Sprite");
       Soda soda_3 = new Soda(16, "Cherry-Cola");
       System.out.println(soda_1);
       System.out.println(soda_2);
       System.out.println(soda_3);
       System.out.println(soda_1.equals(soda_2)); // Expected: False
       System.out.println(soda_1.equals (soda_3)); // Expected: True:
   }
}
