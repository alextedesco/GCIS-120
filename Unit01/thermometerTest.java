/**
 * This file tests thermometer.java and confirms it works as expected.
 * @author Alex Tedesco
 */

// Imports:
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class thermometerTest {

    @Test
    public void testChangeTemperatureFarenheight () {
        /**
        * Tests the thermometer changing its temperature from Celsius to Farenheight
        */

        // setup
        thermometer th1 = new thermometer(100);
        String units = "F";

        // invoke
        th1.change_temp(units);
        double new_temperature = 212;
        
        // analyze
        assertEquals(new_temperature, th1.getTemperature());
    }
    @Test
    public void testChangeTemperatureKelvin () {
        /**
        * Tests the thermometer changing its temperature from Celsius to Kelvin
        */

        // setup
        thermometer th1 = new thermometer(100);
        String units = "K";

        // invoke
        th1.change_temp(units);
        double new_temperature = 373.15;
        
        // analyze
        assertEquals(new_temperature, th1.getTemperature());
    }
    
}

