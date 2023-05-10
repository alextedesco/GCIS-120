public class Ryzen extends AbstractProcessor {

    public Ryzen (double speed) {
        super("Ryzen", speed);
    }

    @Override
    public Manufacturer getManufacturer() {
        return Manufacturer.AMD;
    }
}
