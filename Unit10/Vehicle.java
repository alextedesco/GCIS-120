public abstract class Vehicle implements Moveable {
    String vin;
    String color;
    double fuelCapacity;
    double currentFuel;

    public Vehicle(String vin, String color, double fuelCapacity) {
        this.vin = vin;
        this.color = color;
        this.fuelCapacity = fuelCapacity;
    } 
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getFuelLevel() {
        return fuelCapacity;
    }

    public void refuel (double amount) {
        this.fuelCapacity = this.fuelCapacity + amount;
    }

    @Override
    public void move(double distance) {
    }
}
