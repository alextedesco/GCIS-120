import random
import arrays

def roll_the_dice (sides):
    return random.randint (1, sides)

def making_arrays ():
    a = arrays.Array (5)
    print (a)

    b = arrays.Array (1, 0)
    print (b)

    c = arrays.Array (10, "")
    print (c)

    d = arrays.Array (20, False)
    print (d)

def linear_search (an_array, target):
    index = 0
    while index < len (an_array):
        if an_array [index] == target:
            return index
        index += 1

    return None

def main ():
    # count = 0
    # random.seed (1)
    # while count < 10:
    #     print (roll_the_dice (6))
    #     count += 1
    # making_arrays ()
    an_array = arrays.Array (5)
    index = 0
    while index < len (an_array):
        an_array[index] = index + 1
        index += 1
    print (an_array)

    s = linear_search (an_array, 3)
    print (s)
    s = linear_search (an_array, 10)
    print (s)

main ()
