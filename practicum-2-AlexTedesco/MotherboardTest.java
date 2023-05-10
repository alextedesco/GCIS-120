import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class MotherboardTest {
    @Test
    public void testIsCompatibleTrue() {
        // setup
        ArrayList<RAM> list = new ArrayList<>();
        Motherboard motherboard = new Motherboard("Motherboard", Manufacturer.INTEL, list);
        Processor processor = new Pentium(3.5);

        // invoke
        boolean expected = true;
        boolean actual = motherboard.isCompatible(processor);

        // analysis
        assertEquals(expected, actual);
    }

    @Test
    public void testIsCompatibleFalse() {
        // setup
        ArrayList<RAM> list = new ArrayList<>();
        Motherboard motherboard = new Motherboard("Motherboard", Manufacturer.INTEL, list);
        Processor processor = new Ryzen (3.5);

        // invoke
        boolean expected = false;
        boolean actual = motherboard.isCompatible(processor);

        // analysis
        assertEquals(expected, actual);
    }

    @Test
    public void testProcessorInstalledTrue() {
        // setup
        ArrayList<RAM> list = new ArrayList<>();
        Motherboard motherboard = new Motherboard("Motherboard", Manufacturer.INTEL, list);
        Processor processor = new Pentium(3.5);
        motherboard.install(processor);

        // invoke
        boolean expected = true;
        boolean actual = motherboard.processorInstalled();

        // analysis
        assertEquals(expected, actual);
    }

    @Test
    public void testProcessorInstalledFalse() {
        // setup
        ArrayList<RAM> list = new ArrayList<>();
        Motherboard motherboard = new Motherboard("Motherboard", Manufacturer.INTEL, list);
        Processor processor = new Pentium(3.5);
        motherboard.install(processor);

        // invoke
        boolean expected = true;
        boolean actual = motherboard.processorInstalled();

        // analysis
        assertEquals(expected, actual);
    }

    @Test
    public void testInstallCompatible() {
        // setup
        ArrayList<RAM> list = new ArrayList<>();
        Motherboard motherboard = new Motherboard("Motherboard", Manufacturer.INTEL, list);
        Processor processor = new Pentium(3.5);
        motherboard.install(processor);

        // invoke
        motherboard.install(processor);

        // analysis
        assertEquals("INTEL Pentium Speed: 3.5Ghz", motherboard.processor.toString());
    }

    @Test
    public void testInstallNotCompatible() {
        // setup
        ArrayList<RAM> list = new ArrayList<>();
        Motherboard motherboard = new Motherboard("Motherboard", Manufacturer.INTEL, list);
        Processor processor = new Ryzen (3.5);

        // invoke
        motherboard.install(processor);

        // analysis
        assertEquals(null, motherboard.processor);
    }

    @Test
    public void testUninstall() {
        // setup
        ArrayList<RAM> list = new ArrayList<>();
        Motherboard motherboard = new Motherboard("Motherboard", Manufacturer.INTEL, list);
        Processor processor = new Ryzen (3.5);
        motherboard.install(processor);
        

        // invoke
        motherboard.uninstall();

        // analysis
        assertEquals(null, motherboard.processor);
    }

    @Test
    public void TestAddRam () {
        // setup
        ArrayList<RAM> list = new ArrayList<>();
        Motherboard motherboard = new Motherboard("Motherboard", Manufacturer.INTEL, list);
        RAM stick = RAM.FOUR_GB;
        motherboard.addRAM(stick);
        

        // invoke
        int expected = 1;
        int actual = motherboard.ram.size();

        // analysis
        assertEquals(expected, actual);
    }

    @Test
    public void TestAddRamException () {
        // setup
        ArrayList<RAM> list = new ArrayList<>();
        Motherboard motherboard = new Motherboard("Motherboard", Manufacturer.INTEL, list);
        RAM stick = RAM.FOUR_GB;
        motherboard.addRAM(stick);
        motherboard.addRAM(stick);
        motherboard.addRAM(stick);
        motherboard.addRAM(stick);
        motherboard.addRAM(stick);
        

        // invoke
        int expected = 4;
        int actual = motherboard.ram.size();

        // analysis
        assertEquals(expected, actual);
    }

    @Test
    public void removeRAM () {
        // setup
        ArrayList<RAM> list = new ArrayList<>();
        Motherboard motherboard = new Motherboard("Motherboard", Manufacturer.INTEL, list);
        RAM stick = RAM.FOUR_GB;
        motherboard.addRAM(stick);
        motherboard.removeRAM();
        

        // invoke
        int expected = 0;
        int actual = motherboard.ram.size();

        // analysis
        assertEquals(expected, actual);
    }

    @Test
    public void TestGoodToGoTrue () {
        // setup
        ArrayList<RAM> list = new ArrayList<>();
        Motherboard motherboard = new Motherboard("Motherboard", Manufacturer.INTEL, list);
        Processor processor = new Pentium(3.5);
        motherboard.install(processor);
        RAM stick = RAM.FOUR_GB;
        motherboard.addRAM(stick);
    
        // invoke
        boolean expected = true;
        boolean actual = motherboard.goodToGo();

        // analysis
        assertEquals(expected, actual);
    }

    @Test
    public void TestGoodToGoFalse () {
        // setup
        ArrayList<RAM> list = new ArrayList<>();
        Motherboard motherboard = new Motherboard("Motherboard", Manufacturer.INTEL, list);
    
        // invoke
        boolean expected = false;
        boolean actual = motherboard.goodToGo();

        // analysis
        assertEquals(expected, actual);
    }
}