import random
import arrays

def random_array (size, min_value, max_value):
    an_array = arrays.Array (size)
    
    index = 0
    while index < size:
        an_array[index] = random.randint (min_value, max_value)
        index += 1

    return an_array

def main ():
    a = random_array (10, 50, 100)
    print (a)

    b = random_array (5, 1000, 10000)
    print (b)

if __name__ == "__main__":
    main ()