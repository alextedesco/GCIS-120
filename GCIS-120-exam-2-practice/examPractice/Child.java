package examPractice;
public class Child extends Person {
    private Adult chaperone;

    public Child(String name, int height) {
        super(name, height);
    }

    @Override
    public double ticketPrice() {
        return 10.99;
    }

    public void assignChaperone(Adult chaperone) {
        this.chaperone = chaperone;
    }

    public boolean hasValidChaperone () {
       if (chaperone.canRide() == true && chaperone != null) {
           return true;
       } else {
           return false;
       }
    }

    @Override
    public boolean canRide() {
        if (getHeight() >= 48) {
            return true;
        } else if (getHeight() >= 36 && chaperone != null && chaperone.canRide()) {
            return true;
        } else {
            return false;
        }
    } 
}
