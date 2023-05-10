"""
This file is a thermometer class that can convert temperature from one type of measurement to another.
author: Alex Tedesco
"""

class Thermometer:
    """
    This class creates a thermometer with a specific temperature.
    """
    __slots__ = ["__temperature"]
    def __init__(self, temperature):
        self.__temperature = temperature

    def get_temperature (self):
        '''Returns the current temperature of a created thermometer.'''
        return self.__temperature

    def set_temperature (self, temperature):
        '''Sets the temperature of a created thermometer.'''
        self.__temperature = temperature

    def convert_temp (self, units):
        '''Method that converts the default celsius temperature to the specified temperature units (C, F, K).'''
        if units == "F":
            self.__temperature = (self.__temperature * 9/5) + 32
        elif units == "C":
            self.__temperature = self.__temperature
        elif units == "K":
            self.__temperature = (self.__temperature + 273.15)

    def __str__ (self):
        celsius = self.__temperature
        self.convert_temp ("F")
        fahrenheit = self.__temperature
        self.set_temperature (celsius)
        self.convert_temp ("K")
        kelvin = self.__temperature
        self.convert_temp ("C")
        self.set_temperature (celsius)
        return "Thermometer: {}C {}F {}K".format(str (celsius), str (fahrenheit), str (kelvin))

    def __eq__(self, other):
        if type (self) == type (other):
            return self.__temperature == other.__temperature
        return False

def main ():
    """
    The only executed code in the moduel
    """
    th1 = Thermometer (100)
    # print (th1.get_temperature (), "degrees")

    # th1.convert_temp ("F")
    # print (th1.get_temperature (), "degrees")

    # print (th1)
    th2 = Thermometer (100)
    th3 = Thermometer (101)
    print (th1 == th2) # True
    print (th1 == th3) # False


'''
Used to make sure that, if this program is imported into another module, the
main method will not be executed.
'''
if __name__ == "__main__":
    main ()




