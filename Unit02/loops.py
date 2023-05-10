# Alex Tedesco

def countdown (number):
    sum = 0
    while number >= 0:
        print (number)
        sum = sum + number
        number = number - 1
    return sum

def count_up (number):
    sum = 0
    count = 0
    while count <= 10:
        print (count)
        sum += count
        count += 1
    return sum

def print_chars_while_loop (a_string):
    index = 0
    length = len (a_string)
    while index < length:
        char = a_string [index]
        print (index, char)
        index += 1

def print_chars_for_loop (a_string):
    for each_char in a_string:
        print (each_char)

def main ():
    # print (countdown (10))
    # print (count_up (1))
    print (print_chars_while_loop ("Skywalker"))
    print (print_chars_for_loop ("Skywalker"))


if __name__ == "__main__":
    main ()