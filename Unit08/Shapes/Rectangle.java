package Shapes;

public class Rectangle implements Shape {
    public double height;
    public double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return (this.height * 2) + (this.width * 2);
    }

    @Override
    public double area() {
        return this.height * this.width;
    }

    @Override
    public void scale(double scale) {
        this.height = this.height * scale;
        this.width = this.width * scale;
    }
    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{height=" + this.height + ", width=" + this.width + "}";
    }
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 4);
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.area());
        System.out.println(rectangle);
        rectangle.scale(2.0);
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.area());
        System.out.println(rectangle);
    }
}
