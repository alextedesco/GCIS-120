package Shapes;

public class Shapes {
    /**
     * 
     * @param shape - Type of shape
     * @param factor - Amount that the shape is being scaled by
     * This method is an example of polymorphism because it uses the Shape
     * class which inherits all of the other shapes that implement the shape
     * class.
     */

    public static void manipulate (Shape shape, double factor) {
        System.out.println(shape);
        shape.scale(factor);
        System.out.println(shape);
    }

    public static void main(String[] args) {
        Shape circle = new Circles (5.0);
        manipulate(circle, 2.0);
    }
    
}
