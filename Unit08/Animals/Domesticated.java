package Animals;

public abstract class Domesticated extends Animal {
     
    public Domesticated (String name, double weight, Category category) {
        super(name, weight, category);
    }

    public abstract void meet (Animal animal);
    
}

