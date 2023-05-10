import random
import arrays

def random_numbers ():
    count = 0
    while count < 25:
        rand = random.randint (10, 20)
        print (rand)
        count += 1

def main ():
    # random.seed (1)
    # random_numbers ()
    # s = input ("PLease Enter A Thing: ")
    # print (s)

    # x = input ("Enter X: ")
    # y = input ("Enter Y: ")

    # print ("x + y =", (x ** y))
    a = arrays.Array(5, 127)
    print (a)

    length = len (a)
    print (length)

    x = a[3]
    print (x)

    a[3] = "boo"
    print (a[3])

    print (a)

    a[0] = "Hello"
    a[1] = False
    a[4] = 123456

    index = 0
    while index < length:
        print (index, a[index])
        index += 1

if __name__ == "__main__":
    main ()