# Alex Tedesco

class Mug:
    '''This is a class for mugs'''
    __slots__ = ["__size", "__color", "__fill_level", "__phrase"]
    def __init__(self, size, color, phrase):
        self.__size = size 
        self.__color = color
        self.__phrase = phrase
        self.__fill_level = 0

    def get_size (self):
        return self.__size

    def get_color (self):
        return self.__color

    def get_phrase (self):
        return self.__phrase

    def get_fill_level (self):
        return self.__fill_level

    def set_phrase (self, phrase):
        self.__phrase = phrase

    def fill (self, ounces):
        if self.__fill_level + ounces > self.__size:
            self.__fill_level = self.__size
        else:
            self.__fill_level += ounces

    def drain (self, ounces):
        drained = 0
        if self.__fill_level - ounces < 0:
            drained = self.__fill_level
            self.__fill_level = 0
        else:
            drained = ounces
            self.__fill_level -= ounces
        return drained

    def __str__(self) -> str:
        # A <color> <size>oz mug that says <phrase>
        return "A " + self.__color + " " + str (self.__size) + "oz mug that says " + self.__phrase

    def __eq__(self, other):
        if type (self) == type (other):
            return self.__color == other.__color and self.__size == other.__size
        return False
    
def main ():
    mug_1 = Mug (24, "Red", "I Hate Mondays!")
    # mug_1.color = "Red"

    # print (mug_1.get_color (), mug_1.get_size (), mug_1.get_fill_level (), mug_1.get_phrase ())
    mug_2 = Mug (12, "Red", "Mondays, am I right")
    mug_3 = Mug (24, "Red", "TGIF")

    mug_1.fill (10)
    mug_1.fill (100)

    # print (mug_1.get_color (), mug_1.get_size (), mug_1.get_fill_level (), mug_1.get_phrase ())

    drained = mug_1.drain (15)
    # print ("drained", drained)
    drained = mug_1.drain (15)
    mug_1.drain (15)

    # print (mug_1.get_color (), mug_1.get_size (), mug_1.get_fill_level (), mug_1.get_phrase ())

    mug_1.set_phrase ("I love Mondays!")

    # print (mug_1.get_color (), mug_1.get_size (), mug_1.get_fill_level (), mug_1.get_phrase ())
    print (mug_1)
    print (mug_2)
    print (mug_3)
    print (mug_1 == mug_2)
    print (mug_1 == mug_3)

if __name__ == "__main__":
    main ()
