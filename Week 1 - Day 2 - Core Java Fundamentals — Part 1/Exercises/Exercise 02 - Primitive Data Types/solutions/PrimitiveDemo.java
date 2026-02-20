/*
 * Exercise 02: Primitive Data Types - Understanding the Eight Fundamental Types
 * 
 * COMPLETE SOLUTION
 */

public class PrimitiveDemo {
    
    public static void main(String[] args) {
        System.out.println("===== Java Primitive Data Types =====\n");
        
        // Byte type
        byte myByte = 42;
        System.out.println("Byte Type:");
        System.out.println("  Sample value: " + myByte);
        System.out.println("  Size: " + Byte.SIZE + " bits (" + Byte.BYTES + " byte)");
        System.out.println("  Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("  Use when: Memory is critical or working with binary data");
        System.out.println();
        
        // Short type
        short myShort = 10000;
        System.out.println("Short Type:");
        System.out.println("  Sample value: " + myShort);
        System.out.println("  Size: " + Short.SIZE + " bits (" + Short.BYTES + " bytes)");
        System.out.println("  Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("  Use when: Legacy API compatibility or specific need for size");
        System.out.println();
        
        // Int type
        int myInt = 2000000;
        System.out.println("Int Type:");
        System.out.println("  Sample value: " + myInt);
        System.out.println("  Size: " + Integer.SIZE + " bits (" + Integer.BYTES + " bytes)");
        System.out.println("  Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("  Use when: Default whole number type - most common");
        System.out.println();
        
        // Long type
        long myLong = 9000000000L;  // L suffix for long literals
        System.out.println("Long Type:");
        System.out.println("  Sample value: " + myLong);
        System.out.println("  Size: " + Long.SIZE + " bits (" + Long.BYTES + " bytes)");
        System.out.println("  Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("  Use when: Very large whole numbers (timestamps, IDs, large calculations)");
        System.out.println();
        
        // Float type
        float myFloat = 3.14f;  // f suffix for float literals
        System.out.println("Float Type:");
        System.out.println("  Sample value: " + myFloat);
        System.out.println("  Size: " + Float.SIZE + " bits (" + Float.BYTES + " bytes)");
        System.out.println("  Precision: ~7 significant decimal digits");
        System.out.println("  Use when: Memory is critical (graphics, large arrays of decimals)");
        System.out.println();
        
        // Double type
        double myDouble = 3.14159265359;
        System.out.println("Double Type:");
        System.out.println("  Sample value: " + myDouble);
        System.out.println("  Size: " + Double.SIZE + " bits (" + Double.BYTES + " bytes)");
        System.out.println("  Precision: ~15 significant decimal digits");
        System.out.println("  Use when: Default decimal type - high precision needed");
        System.out.println();
        
        // Boolean type
        boolean isJavaFun = true;
        boolean isProgrammingHard = false;
        System.out.println("Boolean Type:");
        System.out.println("  Sample value 1: " + isJavaFun);
        System.out.println("  Sample value 2: " + isProgrammingHard);
        System.out.println("  Use when: Conditional logic, flags, true/false values");
        System.out.println();
        
        // Char type
        char myChar = 'A';
        System.out.println("Char Type:");
        System.out.println("  Sample value: '" + myChar + "'");
        System.out.println("  Unicode value: " + (int)myChar);  // Cast to int to see numeric value
        System.out.println("  Size: " + Character.SIZE + " bits (" + Character.BYTES + " bytes)");
        System.out.println("  Use when: Single character values, Unicode characters");
        System.out.println();
        
        // Practical Scenarios
        System.out.println("===== Practical Scenarios =====\n");
        
        // 1. Age of a person
        System.out.println("1. Age of a person:");
        byte age = 25;  // byte is appropriate: 0-127 covers all realistic ages
        System.out.println("   byte age = " + age + " (good choice: saves memory, covers 0-127)");
        System.out.println();
        
        // 2. Population of a country
        System.out.println("2. Population of a large country:");
        long population = 1400000000L;  // Must use long: 1.4 billion exceeds int range
        System.out.println("   long population = " + population);
        System.out.println("   (int only goes to ~2.1 billion, using long is safer for future growth)");
        System.out.println();
        
        // 3. Price of an item
        System.out.println("3. Price of an item (in dollars with cents):");
        double price = 19.99;  // double is best practice for money (though BigDecimal is better)
        System.out.println("   double price = " + price + " (double for precision)");
        System.out.println("   (Note: for financial apps, use BigDecimal instead of double for exact precision)");
        System.out.println();
        
        // 4. Whether user is logged in
        System.out.println("4. Whether a user is logged in:");
        boolean isLoggedIn = true;  // Only boolean works for true/false
        System.out.println("   boolean isLoggedIn = " + isLoggedIn);
        System.out.println("   (boolean is the ONLY type for true/false values)");
        System.out.println();
        
        /*
         * REFLECTION QUESTION ANSWERS:
         * 
         * 1. Whole Numbers: When to use byte, short, int, long?
         *    - Use byte: Only when memory is extremely critical (e.g., array of millions of values)
         *                Range 0-127 is very limited. Most applications use int instead.
         *    - Use short: Rarely in modern code. Sometimes for legacy compatibility.
         *                  Range -32,768 to 32,767 is still quite limited.
         *    - Use int: DEFAULT for whole numbers. Range of ~2.1 billion handles most cases.
         *    - Use long: When you need very large numbers (timestamps, IDs, file sizes, very large calculations)
         *                 Timestamps in milliseconds require long. IDs that exceed int range require long.
         *    
         *    Problem with byte for world population:
         *    World population is ~8 billion, but byte max is only 127. You'd need int or long.
         * 
         * 2. Decimal Numbers: float vs double?
         *    - Float: 32-bit, ~7 significant digits of precision
         *    - Double: 64-bit, ~15 significant digits of precision
         *    - Double is usually default because it provides sufficient precision for most applications.
         *    - Use float only when: memory is critical (graphics, huge arrays), or performance is critical.
         *    - For financial applications, use BigDecimal, not float or double.
         * 
         * 3. Real-World Scenarios:
         *    - Years since birth (age): byte (0-127 covers all realistic ages)
         *    - Temperature reading: double (for precision with decimals)
         *    - Salary amount: double (for precision), or BigDecimal (for money)
         *    - Whether a light is on/off: boolean (only two states)
         * 
         * 4. Memory Implications:
         *    - byte = 1 byte, int = 4 bytes
         *    - 1 million bytes = 1 MB, 1 million ints = 4 MB
         *    - The int array uses 4x more memory
         *    - In large applications, this can matter significantly (especially in memory-constrained systems)
         * 
         * 5. Default Values:
         *    - Default int at class level = 0
         *    - Default boolean at class level = false
         *    - Default char at class level = '\u0000' (the null character, Unicode value 0)
         */
    }
}
