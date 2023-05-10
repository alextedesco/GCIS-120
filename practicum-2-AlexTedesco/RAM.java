/**
 * Enumeration that represents a stick of RAM.
 */
public enum RAM {
    FOUR_GB(4),         // 4GB
    EIGHT_GB(8),        // 8GB
    SIXTEEN_GB(16),     // 16GB
    THIRTYTWO_GB(32);   // 32GB

    /**
     * The size (in gigabytes) of the stick of RAM.
     */
    private final int size;

    /**
     * Private constructor used by the enum to make the values above.
     * 
     * @param size The size of the stick of RAM.
     */
    private RAM(int size) {
        this.size = size;
    }

    /**
     * Returns the size of the stick of RAM, e.g. int size = FOUR_GB.getSize();
     * 
     * @return The size of the stick of RAM - this can be called on any 
     * non-null stick of RAM.
     */
    public int getSize() {
        return size;
    }
}
