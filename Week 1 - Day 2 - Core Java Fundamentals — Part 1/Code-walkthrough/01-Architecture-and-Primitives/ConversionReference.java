public class ConversionReference {
    public static void main(String[] args) {
        System.out.println("=== Type Conversion Scenarios Reference ===\n");
        
        System.out.println("IMPLICIT CONVERSIONS (Automatic - widening):");
        System.out.println("byte → short, int, long, float, double");
        System.out.println("short → int, long, float, double");
        System.out.println("char → int, long, float, double");
        System.out.println("int → long, float, double");
        System.out.println("long → float, double");
        System.out.println("float → double");
        System.out.println();
        
        System.out.println("EXPLICIT CONVERSIONS (Manual - narrowing):");
        System.out.println("Anything → anything else (with possible information loss)");
        System.out.println("Common narrowing conversions:");
        System.out.println("- double/float → int/long (loss of decimal part)");
        System.out.println("- long → int/short/byte (overflow risk)");
        System.out.println("- int → byte/short (overflow risk)");
        System.out.println();
        
        System.out.println("EXAMPLES:\n");
        
        // Rule: smaller int type → larger int type (implicit)
        System.out.println("1. byte 100 → int");
        byte b = 100;
        int i = b;  // Implicit
        System.out.println("   Result: " + i + " (automatic)\n");
        
        // Rule: any type → smaller type (explicit)
        System.out.println("2. int 100 → byte");
        int i2 = 100;
        byte b2 = (byte) i2;  // Explicit - required even though it fits
        System.out.println("   Result: " + b2 + " (manual cast required)\n");
        
        // Rule: decimal → int (explicit)
        System.out.println("3. double 9.9 → int");
        double d = 9.9;
        int i3 = (int) d;  // Explicit
        System.out.println("   Result: " + i3 + " (decimal truncated, manual cast required)\n");
        
        // Rule: int → decimal (implicit)
        System.out.println("4. int 5 → double");
        int i4 = 5;
        double d2 = i4;  // Implicit
        System.out.println("   Result: " + d2 + " (automatic)\n");
        
        // Rule: literal suffix matters
        System.out.println("5. Literal suffixes matter");
        // long l = 100000000000;  // Error! Too large for int literal
        long l = 100000000000L;  // Must have L suffix
        System.out.println("   100000000000L is recognized as long literal\n");
        
        System.out.println("6. Casting in operations affects the result");
        int a = 10;
        int b_var = 3;
        System.out.println("   10 / 3 = " + (a / b_var) + " (integer division)");
        System.out.println("   (double)10 / 3 = " + ((double)a / b_var) + " (decimal division)");
    }
}
