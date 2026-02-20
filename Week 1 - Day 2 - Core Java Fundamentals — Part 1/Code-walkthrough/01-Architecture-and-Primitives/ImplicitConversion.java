public class ImplicitConversion {
    public static void main(String[] args) {
        System.out.println("=== Implicit Type Conversion (Widening) ===\n");
        
        // byte to short
        byte b = 50;
        short s = b;  // Implicit conversion, no cast needed
        System.out.println("byte to short:");
        System.out.println("  byte value: " + b);
        System.out.println("  short value: " + s);
        System.out.println("  Same value, no information loss.\n");
        
        // short to int
        short s2 = 10000;
        int i = s2;  // Implicit conversion
        System.out.println("short to int:");
        System.out.println("  short value: " + s2);
        System.out.println("  int value: " + i);
        System.out.println("  Same value, no information loss.\n");
        
        // int to long
        int i2 = 100000;
        long l = i2;  // Implicit conversion
        System.out.println("int to long:");
        System.out.println("  int value: " + i2);
        System.out.println("  long value: " + l);
        System.out.println("  Same value, no information loss.\n");
        
        // long to float (possible, but might lose precision)
        long l2 = 123456789L;
        float f = l2;  // Implicit conversion
        System.out.println("long to float:");
        System.out.println("  long value: " + l2);
        System.out.println("  float value: " + f);
        System.out.println("  Float has fewer significant digits, might lose precision.\n");
        
        // float to double
        float f2 = 3.14f;
        double d = f2;  // Implicit conversion
        System.out.println("float to double:");
        System.out.println("  float value: " + f2);
        System.out.println("  double value: " + d);
        System.out.println("  Double has more precision, no information loss.\n");
        
        // char to int (char's numeric value)
        char c = 'A';
        int charAsInt = c;  // Implicit conversion
        System.out.println("char to int:");
        System.out.println("  char value: '" + c + "'");
        System.out.println("  int value (Unicode): " + charAsInt);
        System.out.println("  Character 'A' has Unicode value 65.\n");
        
        // Using in expressions
        int x = 5;
        double y = 2.5;
        double result = x + y;  // x is implicitly converted to double, then added
        System.out.println("Using in expressions:");
        System.out.println("  int: " + x);
        System.out.println("  double: " + y);
        System.out.println("  int + double = " + result);
        System.out.println("  The int is automatically converted to double for the operation.\n");
    }
}
