package Shape;

public class Circle implements Shape {
    String name;
    int radius;

    public Circle (String name, int radius) {
        this.name = name;
        this.radius = radius;

    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double area() {
        return 2 * 3.14 * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 3.14 * Math.pow(radius, 2);
    }
    
}
