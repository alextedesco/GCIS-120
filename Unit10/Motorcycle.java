public class Motorcycle extends Vehicle {
    boolean sidecar;

    public Motorcycle (String vin, String color, double fuelCapacity, boolean sidecar) {
        super(vin, color, fuelCapacity);
        this.sidecar = sidecar;
    }

    public boolean isManual() {
        return sidecar;
    }

    @Override
    public void move(double distance) {
        if (sidecar == true) {
            double mpg = 45.0;
            double miles = this.currentFuel * mpg;
            double loss = miles - (distance * mpg);
            this.currentFuel = loss / mpg;
        } else {
            double mpg = 60.0;
            double miles = this.currentFuel * mpg;
            double loss = miles - (distance * mpg);
            this.currentFuel = loss / mpg;
        }
    }
}
