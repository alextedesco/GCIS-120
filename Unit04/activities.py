import array_utils

def print_range (a_range):
    for value in a_range:
        print (value, end=" ")
    print ()

def sum (a_range):
    # Return a sum of the values in the range without using a for loop
    s = 0
    length = len (a_range)
    index = 0
    while index < length:
        value = a_range [index]
        s += value
        index += 1
    return s

def print_odds (an_array):
    length = len (an_array)
    for index in range (length):
        value = an_array [index]
        if value % 2 == 1:
            print (value, end = " ")
    print ()

def print_odds_rec (an_array, index = 0):

    if index == len (an_array):
        return
    else:
        value = an_array [index]
        if value % 2 == 1:
            print (value, end = " ")

    print_odds_rec (an_array, index + 1)

def main ():
    # a = range (10)
    # print_range (a) # Prints the range of 0 to 10 (0, 1, 2...)
    # b = range (5, 15)
    # print_range (b) # Prints the range of 5 to 15 (5, 6, 7...)
    # c = range (20, 80, 4)
    # print_range (c) # Prints every 4th value (20, 24, 28...)
    # a = range (0, 11)
    # print_range (a)
    # b = range (0, 21, 2)
    # print_range (b)
    # c = range (5, 16, 2)
    # print_range (c)
    # d = range (10, -1, -1)
    # print_range(d)
    # a = array_utils.range_array (5, 80, 3)
    # print_odds (a)
    a = array_utils.range_array (6, 80, 3)
    print_odds_rec (a)

if __name__ == "__main__":
    main ()
