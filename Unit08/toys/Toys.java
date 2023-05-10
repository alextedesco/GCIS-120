public class Toys {
    private int productCode;
    private String name;
    private double MSRP = 1000000;
    static int counter = 1000000;

    public Toys (String name, double MSRP) {
        this.name = name;
        this.MSRP = counter;
        counter++;
    }

    @Override
    public String toString() {
        return "A " + this.name + " that costs " + this.MSRP + " and has a product code of " + this.productCode;
    }
}
