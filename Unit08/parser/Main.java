package parser;

public class Main {

  public static void main(String[] args) {
    /*
    Constant two = new Constant (2);
    Constant three = new Constant (3);
    Constant five = new Constant (5);

    Expression addition = new Addition(two, three);
    Expression subtraction = new Subtraction(five, three);
    
    Expression multiplication = new Multiplication(addition, subtraction);

    System.out.println(multiplication);
    System.out.println(multiplication.evaluate());
    */

    Constant two = new Constant (2);
    Constant three = new Constant (3);
    Constant four = new Constant (4);
    Constant five = new Constant (5);
    Constant seven = new Constant (7);

    Expression addition = new Addition (four, two);
    Expression multiplication = new Multiplication(addition, three);
    Expression subtraction = new Subtraction (multiplication, seven);
    Expression addition_2 = new Addition (subtraction, five);
    System.out.println(addition_2);
    System.out.println(addition_2.evaluate());
  }
    
}
