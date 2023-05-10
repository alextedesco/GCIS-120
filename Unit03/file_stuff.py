"""
This file counts the amount of lines in a specified file and can copy those line into an array.
author: Alex Tedesco
"""

# Imports
import arrays

def count_lines (filename):
    '''
    Counts the amount of lines in a given file
    '''
    count = 0
    try:
        with open(filename) as file:
            try:
                for line in file:
                    if line.strip():
                        count += 1
                return count
            except IOError:
                return None
    except FileNotFoundError:
        return ("File not found")

def copy_lines (filename, num):
    '''
    Copies the lines of a file into an_array the size of the returned value from count_lines.
    '''
    number_of_lines = count_lines (filename)
    an_array = arrays.Array (number_of_lines)
    count = 0
    with open (filename) as file:
        for line in file:
            line.strip ()
            an_array[count] = line
            count += 1
        a = 0
        while a < num:
            print (an_array [a])
            a += 1

def main ():
    '''
    Main function.
    '''
    # print (count_lines ("data/alice.txt"))
    # print (count_lines ("filenotfound.txt"))
    # print (copy_lines ("data/words.txt"))
    filename = input ("Enter filename: ")
    print (copy_lines (filename, 10))
    
'''
Used to make sure that, if this program is imported into another module, the
main method will not be executed.
'''
if __name__ == "__main__":
    main ()