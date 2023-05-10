def product ():
    product = 1
    while True:
        inp = input ("Enter A Number: ")
        if inp == "":
            break
        try:
            number = int (inp)
            product = product * number
        except:
            print ("Invalid Integer", inp)

    return product

def quotient ():
    try:
        x = float (input ("Enter numerator: "))
        y = float (input ("Enter Denominator: "))
        return x / y
    except ValueError:
        print ("Invalid Number!")
    except ZeroDivisionError:
        print ("Can't divide by 0.")

def guessing_game ():
    n = int (input ("Enter a number: "))

    if n < 1 or n > 10:
        raise ValueError ("Guess out of range!")

    print ("You picked: ", n)

def password ():
    password = input ("Enter Password: ")

    if len (password) < 10 or len (password) > 20:
        raise ValueError ("Password must be between 10 and 20 letters wrong.")
    
    confirm = input ("Confirm Password: ")
    if password != confirm:
        raise ValueError ("Passwords do not match!")
    
    return password

def main ():
    # print ("prodcut = ", product())
    # print ("Quotient = ", quotient ())
    # guessing_game ()
    password ()

if __name__ == "__main__":
    main ()