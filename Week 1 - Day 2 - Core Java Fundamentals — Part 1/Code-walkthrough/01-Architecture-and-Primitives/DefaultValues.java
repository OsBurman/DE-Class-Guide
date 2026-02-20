public class DefaultValues {
    // Class-level (static) primitives get default values
    static byte staticByte;
    static short staticShort;
    static int staticInt;
    static long staticLong;
    static float staticFloat;
    static double staticDouble;
    static boolean staticBoolean;
    static char staticChar;
    
    public static void main(String[] args) {
        System.out.println("=== Default Values for Primitives ===\n");
        
        System.out.println("Class-level (static) primitives have default values:");
        System.out.println("Default byte: " + staticByte);
        System.out.println("Default short: " + staticShort);
        System.out.println("Default int: " + staticInt);
        System.out.println("Default long: " + staticLong);
        System.out.println("Default float: " + staticFloat);
        System.out.println("Default double: " + staticDouble);
        System.out.println("Default boolean: " + staticBoolean);
        System.out.println("Default char: '" + staticChar + "' (empty/null character)");
        
        System.out.println("\nLocal primitives (in methods) do NOT have default values.");
        System.out.println("You must initialize them before use.");
        
        // Uncommenting the line below would cause a compilation error:
        // System.out.println(uninitialized);  // ERROR: variable uninitialized might not have been initialized
    }
}
