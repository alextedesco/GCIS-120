public class Car extends Vehicle {
    boolean manual;

    public Car(String vin, String color, double fuelCapacity, boolean manuel) {
        super(vin, color, fuelCapacity);
        this.manual = manuel;
    }

    public boolean isManual() {
        return manual;
    }

    @Override
    public void move(double distance) {
        if (manual == true) {
            double mpg = 35.0;
            double miles = this.currentFuel * mpg;
            double loss = miles - (distance * mpg);
            this.currentFuel = loss / mpg;
        } else {
            double mpg = 30.0;
            double miles = this.currentFuel * mpg;
            double loss = miles - (distance * mpg);
            this.currentFuel = loss / mpg;
        }
    }  
}
