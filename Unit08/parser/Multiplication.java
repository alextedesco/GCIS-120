package parser;

public class Multiplication implements Expression {
    private final Expression a;
    private final Expression b;

    public Multiplication (Expression a, Expression b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double evaluate() {
        return a.evaluate() * b.evaluate();
    }

    @Override
    public String toString() {
        return "* " + a + " " + b;
    }
}
