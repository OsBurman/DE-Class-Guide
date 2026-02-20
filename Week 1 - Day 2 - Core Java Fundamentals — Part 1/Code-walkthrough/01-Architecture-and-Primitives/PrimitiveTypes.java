public class PrimitiveTypes {
    public static void main(String[] args) {
        System.out.println("=== Java Primitive Data Types ===\n");
        
        // Byte type
        byte myByte = 100;
        System.out.println("Byte:");
        System.out.println("  Value: " + myByte);
        System.out.println("  Min value: " + Byte.MIN_VALUE);
        System.out.println("  Max value: " + Byte.MAX_VALUE);
        System.out.println("  Size: " + Byte.SIZE + " bits (" + Byte.BYTES + " bytes)\n");
        
        // Short type
        short myShort = 30000;
        System.out.println("Short:");
        System.out.println("  Value: " + myShort);
        System.out.println("  Min value: " + Short.MIN_VALUE);
        System.out.println("  Max value: " + Short.MAX_VALUE);
        System.out.println("  Size: " + Short.SIZE + " bits (" + Short.BYTES + " bytes)\n");
        
        // Int type (most common)
        int myInt = 2000000;
        System.out.println("Int:");
        System.out.println("  Value: " + myInt);
        System.out.println("  Min value: " + Integer.MIN_VALUE);
        System.out.println("  Max value: " + Integer.MAX_VALUE);
        System.out.println("  Size: " + Integer.SIZE + " bits (" + Integer.BYTES + " bytes)\n");
        
        // Long type
        long myLong = 9000000000000L;  // Note the L suffix
        System.out.println("Long:");
        System.out.println("  Value: " + myLong);
        System.out.println("  Min value: " + Long.MIN_VALUE);
        System.out.println("  Max value: " + Long.MAX_VALUE);
        System.out.println("  Size: " + Long.SIZE + " bits (" + Long.BYTES + " bytes)\n");
        
        // Float type
        float myFloat = 3.14f;  // Note the f suffix
        System.out.println("Float:");
        System.out.println("  Value: " + myFloat);
        System.out.println("  Size: " + Float.SIZE + " bits (" + Float.BYTES + " bytes)\n");
        
        // Double type (default for decimals)
        double myDouble = 3.14159265359;
        System.out.println("Double:");
        System.out.println("  Value: " + myDouble);
        System.out.println("  Size: " + Double.SIZE + " bits (" + Double.BYTES + " bytes)\n");
        
        // Boolean type
        boolean isJavaFun = true;
        boolean isProgrammingHard = false;
        System.out.println("Boolean:");
        System.out.println("  Value 1: " + isJavaFun);
        System.out.println("  Value 2: " + isProgrammingHard);
        System.out.println("  Only two values: true or false\n");
        
        // Char type
        char myChar = 'A';
        System.out.println("Char:");
        System.out.println("  Value: " + myChar);
        System.out.println("  Unicode value: " + (int)myChar);
        System.out.println("  Size: " + Character.SIZE + " bits (" + Character.BYTES + " bytes)\n");
    }
}
