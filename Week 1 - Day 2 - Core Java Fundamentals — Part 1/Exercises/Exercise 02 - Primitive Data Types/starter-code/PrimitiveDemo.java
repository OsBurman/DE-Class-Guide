/*
 * Exercise 02: Primitive Data Types - Understanding the Eight Fundamental Types
 * 
 * Starter Code
 * 
 * This exercise demonstrates all eight primitive data types.
 * Some types are complete as examples, and you need to complete the rest.
 * 
 * TODO: Complete the missing primitive types (int, long, float, double, boolean, char)
 */

public class PrimitiveDemo {
    
    public static void main(String[] args) {
        System.out.println("===== Java Primitive Data Types =====\n");
        
        // Byte type (EXAMPLE - complete)
        byte myByte = 42;
        System.out.println("Byte Type:");
        System.out.println("  Sample value: " + myByte);
        System.out.println("  Size: " + Byte.SIZE + " bits (" + Byte.BYTES + " byte)");
        System.out.println("  Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("  Use when: Memory is critical or working with binary data");
        System.out.println();
        
        // Short type (EXAMPLE - complete)
        short myShort = 10000;
        System.out.println("Short Type:");
        System.out.println("  Sample value: " + myShort);
        System.out.println("  Size: " + Short.SIZE + " bits (" + Short.BYTES + " bytes)");
        System.out.println("  Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("  Use when: Legacy API compatibility or specific need for size");
        System.out.println();
        
        // TODO: Int type
        // Declare an int variable with a value like 2000000
        // Print the value, size, range, and use case
        System.out.println("Int Type:");
        // YOUR CODE HERE
        System.out.println();
        
        // TODO: Long type
        // Declare a long variable with a value like 9000000000L (note the L suffix!)
        // Print the value, size, range, and use case
        System.out.println("Long Type:");
        // YOUR CODE HERE
        System.out.println();
        
        // TODO: Float type
        // Declare a float variable with a value like 3.14f (note the f suffix!)
        // Print the value, size, and precision notes
        System.out.println("Float Type:");
        // YOUR CODE HERE
        System.out.println();
        
        // TODO: Double type
        // Declare a double variable with a decimal value like 3.14159265359
        // Print the value, size, and precision notes
        System.out.println("Double Type:");
        // YOUR CODE HERE
        System.out.println();
        
        // TODO: Boolean type
        // Declare two boolean variables showing true and false
        System.out.println("Boolean Type:");
        // YOUR CODE HERE
        System.out.println();
        
        // TODO: Char type
        // Declare a char variable with a character like 'A'
        // Also print its Unicode numeric value using casting to int
        System.out.println("Char Type:");
        // YOUR CODE HERE
        System.out.println();
        
        // Practical Scenarios
        System.out.println("===== Practical Scenarios =====\n");
        
        // TODO: Create variables for these real-world scenarios:
        // 1. Age of a person - what type?
        System.out.println("1. Age of a person:");
        // byte age = 25;  // Or short/int?
        System.out.println();
        
        // 2. Population of a country - what type?
        System.out.println("2. Population of a large country:");
        // ??? population = 1400000000;  // What type? int or long?
        System.out.println();
        
        // 3. Price of an item - what type?
        System.out.println("3. Price of an item (in dollars with cents):");
        // ??? price = 19.99;  // What type? float or double?
        System.out.println();
        
        // 4. Whether user is logged in - what type?
        System.out.println("4. Whether a user is logged in:");
        // ??? isLoggedIn = true;  // What type? Only boolean!
        System.out.println();
    }
}
