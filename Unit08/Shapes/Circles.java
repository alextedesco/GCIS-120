package Shapes;
import java.lang.Math;

public class Circles implements Shape {
    private double radius;

    public Circles(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return (2 * Math.PI * this.radius);
    }

    @Override
    public double area() {
        return (Math.PI * (Math.pow(radius, 2)));
    }

    @Override
    public void scale(double scale) {
        this.radius = this.radius * scale;
    }

    @Override
    public String toString() {
        return "Circle{radius=" + this.radius + "}";
    }
    public static void main(String[] args) {
        Shape circle = new Circles(5);
        System.out.println(circle.perimeter());
        System.out.println(circle.area());
        System.out.println(circle);
        circle.scale(2.0);
        System.out.println(circle.perimeter());
        System.out.println(circle.area());
        System.out.println(circle);

    }
}
