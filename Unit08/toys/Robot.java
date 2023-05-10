public class Robot extends Toys {
    public int charge;
    public RobotSoundType sound;

    public Robot (RobotSoundType sound, int charge) {
        super ("Robot", 5.0);
        this.sound = RobotSoundType.Beep;
        this.charge = 0; 
    }

    public boolean isCharged () {
        return charge > 0;
    }

    public void increaseCharge () {
        this.charge = 100;
    }

    public void play () {
        System.out.println(this.sound + "[*Walks in Circles*]");
        this.charge = this.charge - 20;
    }

    @Override
    public String toString() {
        return "A Robot that is " + this.charge + "% charged and says " + this.sound;
    }
}
