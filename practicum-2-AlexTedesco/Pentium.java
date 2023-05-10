public class Pentium extends AbstractProcessor {

    public Pentium(double speed) {
        super("Pentium", speed);
    }

    @Override
    public Manufacturer getManufacturer() {
        return Manufacturer.INTEL;
    }
}
