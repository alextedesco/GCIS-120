public abstract class AbstractProcessor implements Processor {
    String name;
    double speed;

    public AbstractProcessor (String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }
    
    @Override
    public String toString() {
        return getManufacturer() + " " + getName() + " Speed: " + getSpeed() + "Ghz";
    }
}
