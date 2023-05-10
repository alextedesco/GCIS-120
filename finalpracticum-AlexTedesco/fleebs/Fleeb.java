package fleebs;

/**
 * A class representing a Fleeb from the planet of Flubbotron.
 */
public class Fleeb implements Comparable<Fleeb> {
    /**
     * The Fleeb's eye color.
     */
    private final EyeColor eyeColor;

    /**
     * The Fleeb's birth month.
     */
    public final Month birthMonth;

    /**
     * The Fleeb's birth day.
     */
    public final int birthDay;

    /**
     * Creates a new Fleeb with the specified attributes.
     * 
     * @param eyeColor The new Fleeb's eye color.
     * @param birthMonth The new Fleeb's birth month.
     * @param birthDay The new Fleeb's birth day.
     */
    public Fleeb(EyeColor eyeColor, Month birthMonth, int birthDay) {
        this.eyeColor = eyeColor;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
    }
    
    @Override
    public String toString() {
        return "A " + eyeColor + "-eyed Fleeb that was born on " 
            + birthDay + " " + birthMonth; 
    }

    @Override
    public int compareTo(Fleeb o) {
        return o.eyeColor.getIntensity() - this.eyeColor.getIntensity();
    }

}
