package Animals;

public class Cat extends Domesticated {

    public Cat (String name, double weight) {
        super(name, weight, Category.PREDATOR);
    }

    @Override
    public void eat(FoodType food) {
        if (food.equals (FoodType.PATE)) {
            updateWeight(0.03);
            System.out.println(this.name + " eats the " + food);
        } else {
            System.out.println(this.name + " ignore the " + food);
        }  
    }

    @Override
    public void exercise() {
        System.out.println(this.name + " is playing with a catnip-filled toy");
        updateWeight(0.01); 
    }

    @Override
    public void meet(Animal animal) {
        if (animal.getCategory().equals (Category.PREY)) {
            System.out.println(this.name + " chases " + animal.getName());
        } else if (animal.getCategory().equals (Category.PLAYFUL)) {
            System.out.println(this.name + " ignores " + animal.getName());
        } else if (animal.getCategory().equals (Category.PREDATOR)) {
            System.out.println(this.name + " nods at " + animal.getName() + " with respect");
        }
    }



    

    

    


    
}
