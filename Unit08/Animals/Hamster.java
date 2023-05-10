package Animals;

public class Hamster extends Animal {

    public Hamster (String name, double weight) {
        super(name, weight, Category.PREY);
    }

    @Override
    public void eat(FoodType food) {
        if (food.equals (FoodType.SEED) || food.equals(FoodType.KIBBLE)) {
            updateWeight(0.03);
            System.out.println(this.name + " eats the " + food);
        } else {
            System.out.println(this.name + " ignore the " + food);
        }  
    }

    @Override
    public void exercise() {
        System.out.println(this.name + " is running on the hamster wheel");
        updateWeight(0.02);    
    }
    
}
