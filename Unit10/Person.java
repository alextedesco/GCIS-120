public class Person implements Moveable {
    private String name;
    private double weight;

    public Person (String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void move(double distance) {
        double calories = this.weight * 3500;
        double loss = calories - (distance * 100);
        this.weight = loss / 3500;
    }
    
        public static void main(String[] args) {
            Person person = new Person("Jerry", 100);
            System.out.println(person.getWeight());
            person.move(1.0);
            System.out.println(person.getWeight());
        }
}
