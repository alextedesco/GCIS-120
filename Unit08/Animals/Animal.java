package Animals;

public abstract class Animal {
    String name;
    double weight;
    Category category;
    
    public Animal (String name, double weight, Category category) {
        this.name = name;
        this.weight = weight;
        this.category = category;
    }

   public String getName() {
       return name;
    }
   
   public double getWeight() {
       return weight;
    }

   public Category getCategory() {
       return category;
    }

   public abstract void eat (FoodType food);

   public abstract void exercise ();

   public void updateWeight (double amount) {
    if (weight * amount == 0) {
        this.weight = weight;
    } else {
        this.weight = weight - (weight * amount);
       }
   }

   @Override
   public String toString() {
       return this.name + "(" + this.category + "," + this.weight + "lbs)"; 
   }
}
