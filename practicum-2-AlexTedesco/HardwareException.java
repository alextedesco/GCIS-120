/**
 * An exception that is thrown if any number of problems result from trying to
 * assemble computer hardware.
 */
public class HardwareException extends Exception {
    /**
     * Creates a new exception with the specified message describing the error.
     * For example "Cannot install incompatible processor."
     * 
     * @param message The message describing the error.
     */
    public HardwareException(String message) {
        super(message);
    }
    
}
