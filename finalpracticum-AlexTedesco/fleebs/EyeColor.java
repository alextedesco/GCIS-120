package fleebs;

/**
 * Defines the available eye colors for a Fleeb.
 */
public enum EyeColor {
    TIE_DYE(5, "Tie-Dye"),
    YELLOW(1, "Yellow"),
    PURPLE(4, "Purple"),
    PUCE(3, "Puce"),
    CHARTREUSE(2, "Charteuse");

    /**
     * The intensity of the eye color.
     */
    private final int intensity;

    /**
     * The name of the eye color.
     */
    private final String name;

    /**
     * Makes a new eye color.
     * 
     * @param intensity The intensity of the eye color.
     * @param name The name of the eye color.
     */
    private EyeColor(int intensity, String name) {
        this.intensity = intensity;
        this.name = name;
    }

    /**
     * Returns the intensity of this eye color.
     * 
     * @return The intensity.
     */
    public int getIntensity() {
        return this.intensity;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
