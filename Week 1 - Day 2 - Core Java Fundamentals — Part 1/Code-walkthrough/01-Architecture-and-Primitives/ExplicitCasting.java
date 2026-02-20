public class ExplicitCasting {
    public static void main(String[] args) {
        System.out.println("=== Explicit Type Conversion (Narrowing / Casting) ===\n");
        
        // double to int (loss of decimal part)
        double d1 = 9.99;
        int i1 = (int) d1;  // Explicit cast required
        System.out.println("double to int (loss of decimal):");
        System.out.println("  double value: " + d1);
        System.out.println("  int value: " + i1);
        System.out.println("  The decimal part (.99) is truncated, not rounded.\n");
        
        // long to int (danger of overflow)
        long l1 = 100000;
        int i2 = (int) l1;  // Safe, value fits
        System.out.println("long to int (safe, value fits):");
        System.out.println("  long value: " + l1);
        System.out.println("  int value: " + i2 + "\n");
        
        // int to byte (danger of overflow)
        int i3 = 300;
        byte b1 = (byte) i3;  // Overflow! 300 doesn't fit in byte
        System.out.println("int to byte (OVERFLOW WARNING):");
        System.out.println("  int value: " + i3);
        System.out.println("  byte value: " + b1);
        System.out.println("  300 exceeds byte's max (127), so it wraps around to " + b1);
        System.out.println("  This is dangerous! The value is wrong!\n");
        
        // Another overflow example
        int i4 = 1000;
        byte b2 = (byte) i4;
        System.out.println("int to byte (another overflow):");
        System.out.println("  int value: " + i4);
        System.out.println("  byte value: " + b2);
        System.out.println("  Again, overflow and data loss.\n");
        
        // float to int (loss of decimal part)
        float f1 = 7.8f;
        int i5 = (int) f1;
        System.out.println("float to int (loss of decimal):");
        System.out.println("  float value: " + f1);
        System.out.println("  int value: " + i5);
        System.out.println("  Decimal part (.8) is truncated.\n");
        
        // long to short (potential overflow)
        long l2 = 40000;
        short s1 = (short) l2;
        System.out.println("long to short (overflow):");
        System.out.println("  long value: " + l2);
        System.out.println("  short value: " + s1);
        System.out.println("  40000 exceeds short's max (32767), overflow occurs.\n");
        
        // Safe casting - checking the value first
        System.out.println("Safe casting practice - check before casting:");
        long largeNumber = 50;
        if (largeNumber >= Integer.MIN_VALUE && largeNumber <= Integer.MAX_VALUE) {
            int safeInt = (int) largeNumber;
            System.out.println("  Value " + largeNumber + " fits in int: " + safeInt);
        } else {
            System.out.println("  Value " + largeNumber + " does NOT fit in int, cannot safely cast.");
        }
        System.out.println();
        
        // Casting in expressions
        System.out.println("Casting in expressions:");
        int a = 10;
        int b = 3;
        double division1 = a / b;  // Integer division
        System.out.println("  " + a + " / " + b + " = " + division1 + " (integer division)");
        
        double division2 = (double) a / b;  // Cast to double for decimal division
        System.out.println("  (double)" + a + " / " + b + " = " + division2 + " (decimal division)");
        System.out.println("  By casting 'a' to double, the entire expression becomes double.\n");
    }
}
