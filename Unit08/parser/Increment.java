package parser;

public class Increment implements Expression {
    private final Expression operand;

    public Increment (Expression operand) {
        this.operand = operand;

    }

    @Override
    public double evaluate() {
        return operand.evaluate() + 1;
    }
    @Override
    public String toString() {
        return "++" + operand;
    }
}
