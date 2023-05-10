# Alex Tedesco

class Clock:
    __slots__ = ["__hours", "__minutes", "__seconds", "__am_or_pm"]
    def __init__(self, hours=12, minutes=0, seconds=1, am_or_pm="AM"):
        self.__hours = hours
        self.__minutes = minutes
        self.__seconds = seconds
        self.__am_or_pm = am_or_pm

    def get_hours (self):
        return self.__hours

    def get_minutes (self):
        return self.__minutes

    def get_seconds (self):
        return self.__seconds
    
    def get_am_or_pm (self):
        return self.__am_or_pm

    def __str__ (self):
        # <hours>:<minutes>:<seconds> *M
        return str (self.__hours) + ":" + f'{self.__minutes:02}' + ":" + f'{self.__seconds:02}' + " " + self.__am_or_pm

    def tick (self):
        self.__seconds += 1

        if self.__seconds == 60:
            self.__seconds = 0
            self.__minutes += 1

            if self.__minutes == 60:
                self.__minutes = 0
                self.__hours += 1

                if self.__hours == 12:
                    if self.__am_or_pm == "AM":
                        self.__am_or_pm = "PM"
                    else:
                        self.__am_or_pm = "AM"

                elif self.__hours == 13:
                    self.__hours = 1


def main ():
    clock = Clock (11, 59, 59, "PM")
    print (clock)
    clock.tick ()
    print (clock)

    clock.advance_time (15)
    print (clock)

if __name__ == "__main__":
    main ()