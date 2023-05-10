import random

count = 0

def tuples (a_tuple):
    length = len (a_tuple)
    print ("Length: ", length)
    for i in a_tuple:
        print (i)

def lists ():
    a_list = [1, 2, "abc", 12.34, False]
    print ("Length =",len(a_list))
    for i in range (len(a_list)):
        print (i, ": ", a_list[i], sep="")
    a_list[2] = 37
    return a_list

def make_list (a_sequence):
    a_list = []
    print (len (a_list))
    for i in a_sequence:
        a_list.append (i)
        print (len(a_list))
    return a_list

def cat (a_list, b_list):
    c_list = a_list + b_list
    print (c_list)

def extender (a_list, b_list):
    a_list += b_list
    print (a_list)

def inserter (a_list, value):
    length = len (a_list)
    mid = length // 2
    a_list.insert (mid, value)
    
def popper (a_list):
    length = len (a_list)
    if length == 0:
        return
    else:
        value = a_list.pop()
        print (value)
        popper (a_list)

def sets ():
    set_1 = {1, "a", False}
    print (set_1)
    set_1.add (1)
    set_1.add (True)
    set_1.add ("a")
    set_1.add ("A")
    print (set_1)
    set_2 = set ([1, 2, 3, 2, 3, 4, 1, 2, 5, 6, 4])
    print (set_2)

def mixup ():
    set_1 = set ("Testing... 1, 2, 3.")
    for c in set_1:
        print (c, end="")
    print ()

def count_random (n):
    i = random.randint (1, n)
    # count how many times you need to call random.randint (a, b)
    # to generate every number from 1 to n
    # and return it

    '''
    Recursive Attempt
    set_1 = set ()
    set_1.add (i)
    if len(set_1) != 1000:
        count += 1
        count_random ()
    else:
        print (count)
    '''
    # set_1 = set()
    # counter = 0
    # while len (set_1) < n:
    #     number = random.randint (1, n)
    #     set_1.add (number)
    #     counter += 1
    # return counter


def main ():
    # a_tuple = "a", 12, True
    # tuples (a_tuple)
    # b_tuple  = tuple (range (10))
    # tuples (b_tuple)

    # lists ()

    # list = make_list ("abcdef")
    # print (list)
    # list = make_list ("abcdef")

    # a_list = ["a", "b", "c"]
    # b_list = [1, 2, 3]
    # # c_list = cat (a_list, b_list)
    # c_list = extender (a_list, b_list)
    # print (a_list)
    # print (b_list)
    # print (c_list)

    # a_list = []
    # for i in range(5):
    #     inserter (a_list, i)
    #     print (a_list)
    # popper (a_list)

    # sets()
    
    # mixup()
    # mixup()
    # mixup()

    count = count_random (1000)
    print (count)


if __name__ == "__main__":
    main ()