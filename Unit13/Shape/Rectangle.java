package Shape;

public class Rectangle implements Shape {
    String name;
    int sideA;
    int sideB;

    public Rectangle (String name, int sideA, int sideB) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;

    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        return sideA * 2 + sideB * 2;
    }
    
}
