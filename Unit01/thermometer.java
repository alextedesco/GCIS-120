/**
 * This file is a thermometer class that can convert temperature from one type of measurement to another.
 * @author Alex Tedesco
 */

public class thermometer {
    /**
    * This class creates a thermometer with a specific temperature.
    */
    
    private double temperature;
    /**
    * This holds the thermometer's temperature.
    */

    thermometer (double temperature) {
        this.temperature = temperature;
    }
    
    public double getTemperature() {
    /**
    * This returns the current temperature of the thermometer.
    */
        return this.temperature;
    }

    public double setTemperature(double temperature) {
    /**
    * This sets a new temperature for the thermometer.
    */
        return this.temperature;
    }

    void change_temp (String units) {
    /**
    * This converts the current temperature of a thermometer from one type of unit to another.
    */
        if (units == "F") {
            this.temperature = (this.temperature * 9/5) + 32;
        } else if (units == "C") {
            this.temperature = this.temperature;
        } else if (units == "K") {
            this.temperature = (this.temperature + 273.15);
        }
        
            
    }

    public static void main(String[] args) {
    /**
    * The main function with all the executed code.
    */
        thermometer th1 = new thermometer (100);
    
        System.out.println(th1.getTemperature() + " degrees");

        th1.change_temp("C");

        System.out.println(th1.getTemperature() + " degrees");

        th1.change_temp("F");

        System.out.println(th1.getTemperature() + " degrees");

            
            }
        
        }
        
