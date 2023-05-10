# Alex Tedesco

class Fruit:
    '''A class named fruit'''
    __slots__ = ["__name", "__price", "__color"]
    def __init__(self, name, price, color):
        self.__name = name
        self.__price = price
        self.__color = color

    def discount (self, percent):
        self.__price = self.__price * (percent / 100)

    def get_name (self):
        return self.__name

    def get_price (self):
        return self.__price
    
    def get_color (self):
        return self.__color

    def __str__ (self):
        # A Red Apple for $1.25
        return "A " + self.__color + " " + self.__name + " $" + str (self.__price)


    def __eq__(self, other):
        if type (self) == type (other):
            return self.__name == other.__name and self.__color == other.__color
        return False

def main ():
    apple = Fruit ("Apple", 1.25, "Red")
    # apple.name = "Apple"
    # apple.price = 1.25
    # apple.color = "Red"

    orange = Fruit ("Orange", "2.00", "Orange")
    # orange.name = "Orange"
    # orange.price = 2.00
    # orange.color = "Orange"

    # print(apple.get_name (), apple.get_price (), apple.get_color ())
    # print(orange.get_name (), orange.get_price (), orange.get_color ())
    print (apple)
    print (orange)

    apple.discount (25)
    # print (apple.get_price ())
    # print (orange.get_price ())

    print (apple == orange)
    print (apple == "Hello!")

if __name__ == "__main__":
    main ()