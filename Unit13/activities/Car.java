package activities;

public class Car {
    private String color;
    private int year;
    private String make;
    private double gas;

    public Car (String color, int year, String make, double gas) {
        this.color = color;
        this.year = year;
        this.make = make;
        this.gas = 0;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public void changeColor (String newColor) {
        this.color = newColor;
    }

    public void addGas (double amount) {
        this.gas = gas + amount;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    @Override
    public boolean equals(Object otherCar) {
        if (otherCar instanceof Car) {
            Car car = (Car) otherCar;
            return this.make.equals(car.make) && this.color.equals(car.color) && this.year == car.year;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return "A " + color + year + make + "that has " + gas + "gallons of gas.";
    }
}
