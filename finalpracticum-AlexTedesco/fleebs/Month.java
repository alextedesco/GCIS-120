package fleebs;

/**
 * An enumeration that represents the months on the planet Fleebotron.
 */
public enum Month {
    SMARCH(1),
    JUNTH(2),
    BRAUGUST(3),
    SEPTEMBRUARY(4),
    NOVEMBRIL(5),
    FLEEBTOBER(6);

    /**
     * The order of the month in the Fleebotron calendar year.
     */
    private final int order;

    /**
     * Makes a new month with the specified order number.
     * 
     * @param order The order in which this month occurs in the Fleebotron 
     * calendar year.
     */
    private Month(int order) {
        this.order = order;
    }

    /**
     * Returns the order in which this month occurs in the Fleebotron calendar
     * year.
     * 
     * @return The order.
     */
    public int getOrder() {
        return this.order;
    }
    
}
