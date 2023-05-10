package Shape;

public class ShapePrinter {

    public static void printShape (Shape shape) {
        System.out.println(shape);
    }

    public static void main(String[] args) {
        Shape shape = new Rectangle ("Rectangle", 5, 4);
        printShape(shape);
        
    }
    
}
