def print_lines (filename):
    with open (filename) as file:
        for line in file:
            print (line.strip())

def word_search (filename):
    word = input ("Enter a word: ")
    word_lower = word.lower()
    with open (filename) as file:
        for line in file:
            line = line.strip ()
            line_lower = line.lower ()
            if word_lower == line_lower:
                print ("Word was found!")
                file.close ()
                return
    
    print ("Word was not found!")
    file.close ()

def longest_word (a_string):
    tokens = a_string.split()
    longest = ""
    for word in tokens:
        if len(word) > len(longest):
            longest = word
    print (longest)
    return longest

def longest_words (filename):
    longest = ""
    with open (filename) as file:
        for line in file:
            stripped = line.strip()
            if stripped != "":
                word = longest_word (line)
            if len(word) > len (longest):
                print (word)

def prompt_and_write ():
    filename = input ("Enter a filename: ")
    with open (filename, "w") as file:
        while True:
            line = input (">> ")
            if line == "":
                break
            else:
                file.write (line)
                file.write ("\n")

def main ():
    # print_lines ("data/alice.txt")
    # word_search ("data/words.txt")
    # longest_word ("The quick brown fox jumped over the lazy dog.")
    # longest_words ("data/alice.txt")
    prompt_and_write ()
        
if __name__ == "__main__":
    main ()
