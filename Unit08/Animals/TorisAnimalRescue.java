package Animals;

public class TorisAnimalRescue {
/**
 * @param animal - Animal Type
 * @param food - Food Type
 * This method uses polymorphism because the specific animal is a child of the
 * Animal class. That child has its own overridden methods that make it unique and
 * act differently compared to any other child. In this case it's whether the animal
 * will eat the specified food type and how much weight it gains.
 */ 
    public static void feed (Animal animal, FoodType food) {
        System.out.println(animal);
        animal.eat(food);
        System.out.println(animal);
    }

/**
 * @param animal - Animal Type
 * @param food - Food Type
 * This method uses polymorphism because the specific animal is a child of the
 * Animal class. That child has its own overridden methods that make it unique and
 * act differently compared to any other child. In this case it's how the animal exercises
 * and the amount of weight it loses.
 */ 
    public static void exercise (Animal animal) {
        System.out.println(animal);
        animal.exercise();
        System.out.println(animal);
    }

/**
 * @param animal - Animal Type
 * @param food - Food Type
 *  * This method uses polymorphism because the specific animal is a child of the
 * Animal class. That child has its own overridden methods that make it unique and
 * act differently compared to any other child. In this case it's whether the domesticated
 * animal will meet the other animal. This depends on the animals category type.
 */ 
    public static void introduce (Domesticated domesticated, Animal animal) {
        domesticated.meet(animal);
    }

/**
 * Main function 
 */ 
    public static void main(String[] args) {
        // Animal bird = new Bird("Tweety", 15.0);
        Animal hamster = new Hamster ("Hammy", 12.0);
        // Domesticated dog =  new Dog("Sparky", 25.0);
        // Domesticated cat =  new Dog("Tinkles", 20.0);
        Animal cat = new Cat("Tinkles", 20.0);
        // feed(bird, FoodType.SEED);
        // feed(bird, FoodType.KIBBLE);
        // exercise(dog);
        // exercise(bird);
        exercise(hamster);
        exercise(cat);
        // introduce(cat, hamster);
        // introduce(cat, bird);
    }
    
}
