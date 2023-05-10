package Shapes;
import java.lang.Math;

public class EquilateralTriangle implements Shape {
    public double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    @Override
    public double perimeter() {
        return (this.side * 3);
    }

    @Override
    public double area() {
        return (Math.sqrt(3)/4) * (Math.pow(this.side, 2));
    }

    @Override
    public void scale(double scale) {
        this.side = this.side * scale;
    }

    @Override
    public String toString() {
        return "Equilateral Triangle{side=" + this.side + "}";
    }
    public static void main(String[] args) {
        Shape triangle = new EquilateralTriangle(3);
        System.out.println(triangle.perimeter());
        System.out.println(triangle.area());
        System.out.println(triangle);
        triangle.scale(2.0);
        System.out.println(triangle.perimeter());
        System.out.println(triangle.area());
        System.out.println(triangle);
    }
}
