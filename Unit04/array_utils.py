import arrays
import random


def random_array(size, min_value=0, max_value=None):
    an_array = arrays.Array(size, 0)
    if max_value is None:
        max_value = size

    for index in range(size):
        an_array[index] = random.randint(min_value, max_value)
    
    return an_array

def range_array (start, stop, step=1):
    a_range = range (start, stop, step)
    length = len (a_range)
    index = 0
    an_array = arrays.Array (length)
    while index < length:
        an_array[index] = a_range [index]
        index += 1
    return an_array

def main ():
    a = range_array (5, 57, 3)
    print (a)

if __name__ == "__main__":
    main ()