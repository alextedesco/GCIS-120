public class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    private String amOrPm;

    Clock (int hours, int minutes, int seconds, String amOrPm) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.amOrPm = amOrPm;
    }

    public int getHours () {
        return this.hours;
    }

    public int getMinutes () {
        return this.minutes;
    }

    public int getSeconds () {
        return this.seconds;
    }

    public String getAmOrPM () {
        return this.amOrPm;
    }

    @Override
    public String toString () {
        return this.hours +  ":" + this.minutes + ":" + this.seconds + ":" + this.amOrPm;
    }

    public void tick() {
        this.seconds += 1;
    
        if(this.seconds == 60) {
            this.seconds = 0;
            this.minutes += 1;
    
            if(this.minutes == 60) {
                this.minutes = 0;
                this.hours += 1;
        
                if(this.hours == 12) {
                    if(this.amOrPm.equals("AM")) {
                        this.amOrPm = "PM";
                    } else {
                        this.amOrPm = "AM";
                    }
                } else if(this.hours == 13) {
                    this.hours = 1;
                }
            }
        }
    }
    
    public void advanceTime (int seconds) {
        while (seconds > 0) {
            tick ();
            System.out.println(this);
            seconds = seconds - 1;
        }
    }

    public static void main(String [] arg) {
        Clock clock = new Clock (11, 59, 59, "PM");
        System.out.println (clock);
        clock.tick();
        System.out.println(clock);
        clock.advanceTime(10);

    }
}
