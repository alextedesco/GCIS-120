package Animals;

public class Dog extends Domesticated {

    public Dog (String name, double weight) {
        super(name, weight, Category.PLAYFUL);
    }

    @Override
    public void eat(FoodType food) {
        updateWeight(0.05);
        System.out.println(this.name + " eats the " + food); 
    }

    @Override
    public void exercise() {
        System.out.println(this.name + " is running around like a maniac");
        updateWeight(0.05); 
    }

    @Override
    public void meet(Animal animal) {
        System.out.println(this.name + " plays with " + animal.getName());
    }



    

    

    


    
}
