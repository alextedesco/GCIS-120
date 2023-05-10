package Shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return "Square{Side=" + this.getHeight() + "}";
    }
    public static void main(String[] args) {
        Shape square = new Square(5);
        System.out.println(square.perimeter());
        System.out.println(square.area());
        System.out.println(square);
        square.scale(2.0);
        System.out.println(square.perimeter());
        System.out.println(square.area());
        System.out.println(square);
    }
}

