/**
 *  HelloWorld program implements an application that 
 * simply displays "Hello World!" to the standard output.
 * 
 * @author Angel
 * @version 1.0
 * @since 2025-09-09 
 */
public final class HelloWorldStyle {

    /**
     * This is a private constructor used to satisfy the
     * style checker
     * 
     * @exception IllegalStateException Utility class
     * @se
     * e IllegalStateException
     */
    private HelloWorldStyle() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method
     * 
     * @param args Unused
     */
    public static void main(String[] args) {
        System.out.println("HelloWorld! with style");
    }
}