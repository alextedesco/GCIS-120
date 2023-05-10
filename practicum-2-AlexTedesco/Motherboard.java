import java.util.ArrayList;

public class Motherboard {

    String name;
    Manufacturer socket;
    Processor processor;
    ArrayList<RAM> ram;

    public Motherboard (String name, Manufacturer socket, ArrayList<RAM> ram) {
        this.name = name;
        this.socket = socket;
        this.ram = ram;
    }

    public boolean isCompatible (Processor processor) {
        if (processor.getManufacturer().equals(socket)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean processorInstalled () {
        if (processor == null) {
            return false;
        } else {
            return true;
        }
    }

    public void install (Processor processor) {
        if (isCompatible(processor) == true) {
        this.processor = processor;
        } else {
            HardwareException exception = new HardwareException("This processor cannot be installed");
            System.out.println(exception);
        }
    }

    public Processor uninstall () {
        if (this.processor == null) {
            HardwareException exception = new HardwareException("There is no processor currently installed");
            System.out.println(exception);
        } else {
        }
        return processor;
    }

    public void addRAM (RAM stick) {
        if (ram.size() == 4) {
            HardwareException exception = new HardwareException("RAM slots are full!");
            System.out.println(exception);
        } else {
            ram.add (stick);
        }
    }

    public void removeRAM () {
        if (ram.size() == 0) {
            HardwareException exception = new HardwareException("There is not RAM installed");
            System.out.println(exception);
        } else {
        int ramAmount = ram.size();
        ram.remove(ramAmount - 1);
        }
    }

    public int ramInstalled () {
        int count = 0;
        int amount = 0;
        while (true) {
        RAM stick = ram.get(count);
        if (stick == null) {
            break;
        } else {
        amount = amount + stick.getSize();
            }
        }
        return amount;
    }

    public boolean goodToGo () {
        if (this.processor != null && this.ram != null) {
            return true;
        } else {
            return false;
        }
    }


}
    
