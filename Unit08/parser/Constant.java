package parser;

public class Constant implements Expression {
    private final double value;
    
    public Constant (double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}
