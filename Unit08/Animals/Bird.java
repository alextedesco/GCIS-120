package Animals;

public class Bird extends Animal {

    public Bird (String name, double weight) {
        super(name, weight, Category.PREY);
    }

    @Override
    public void eat(FoodType food) {
        if (food.equals (FoodType.SEED)) {
            updateWeight(0.05);
            System.out.println(this.name + " eats the " + food);
        } else {
            System.out.println(this.name + " ignore the " + food);
        }  
    }

    @Override
    public void exercise() {
        System.out.println(this.name + " is flying around the cage.");
        updateWeight(0.01);    
    }
    
}
