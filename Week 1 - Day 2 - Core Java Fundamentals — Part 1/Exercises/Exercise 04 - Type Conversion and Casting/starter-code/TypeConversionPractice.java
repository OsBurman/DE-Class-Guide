/**
 * Exercise 04 - Type Conversion and Casting
 * Starter Code
 * 
 * In this exercise, you'll practice:
 * - Implicit type conversion (automatic, safe)
 * - Explicit type casting (manual, can lose data)
 * - Understanding overflow and underflow
 * - Safe casting practices
 * 
 * TODO: Complete the exercises to practice type conversion
 */

public class TypeConversionPractice {
    public static void main(String[] args) {
        System.out.println("=== Type Conversion and Casting ===\n");
        
        // PART 1: Implicit Conversion (Automatic, Safe)
        System.out.println("PART 1: Implicit Conversion (Widening)");
        System.out.println("(Smaller type automatically converts to larger type)");
        System.out.println();
        
        // int → long (safe, no data loss)
        int age = 25;
        long ageAsLong = age;  // Automatic conversion
        System.out.println("int to long: " + age + " → " + ageAsLong);
        
        // int → double (safe, no data loss)
        int count = 100;
        double countAsDouble = count;  // Automatic conversion
        System.out.println("int to double: " + count + " → " + countAsDouble);
        System.out.println();
        
        // TODO 1: Try implicit conversions
        // byte → short
        // short → int
        // int → float
        
        System.out.println();
        
        // PART 2: Explicit Casting (Manual, Requires Care)
        System.out.println("PART 2: Explicit Casting (Narrowing)");
        System.out.println("(Larger type manually converted to smaller type - can lose data)");
        System.out.println();
        
        // double → int (loses decimal part)
        double price = 19.99;
        int priceAsInt = (int) price;  // Explicit cast with (int)
        System.out.println("double to int: " + price + " → " + priceAsInt);
        System.out.println("(Notice: decimal part is lost!)");
        System.out.println();
        
        // long → int (can lose data if number is too large)
        long largeNumber = 50000;
        int smallerNumber = (int) largeNumber;
        System.out.println("long to int: " + largeNumber + " → " + smallerNumber);
        System.out.println();
        
        // TODO 2: Perform explicit casts
        // Cast a double value to int
        // Cast a long value to short
        // Show what data is lost
        
        System.out.println();
        
        // PART 3: Overflow and Data Loss
        System.out.println("PART 3: Overflow - What Happens with Too Large Numbers");
        System.out.println();
        
        // Show the maximum values
        System.out.println("Type limits:");
        System.out.println("byte max: " + Byte.MAX_VALUE + ", min: " + Byte.MIN_VALUE);
        System.out.println("int max: " + Integer.MAX_VALUE);
        System.out.println("long max: " + Long.MAX_VALUE);
        System.out.println();
        
        // TODO 3: Demonstrate overflow
        // Create a value just under Integer.MAX_VALUE
        // Cast it to byte and show overflow
        // int largeValue = Integer.MAX_VALUE - 5;
        // byte overflowed = (int) largeValue;
        
        System.out.println();
        
        // PART 4: Safe Conversion Practices
        System.out.println("PART 4: Safe Conversion Practices");
        System.out.println();
        
        // Check before converting
        long valueToConvert = 1000;
        if (valueToConvert <= Integer.MAX_VALUE && valueToConvert >= Integer.MIN_VALUE) {
            int safeConversion = (int) valueToConvert;
            System.out.println("Safe: Can convert " + valueToConvert + " to int: " + safeConversion);
        }
        System.out.println();
        
        // TODO 4: Write safe conversion checks
        // Before casting, check if value is in range
        long largeValue = 50000000;
        // if (largeValue fits in int range) then cast
        
        System.out.println();
        
        // PART 5: String and Number Conversions
        System.out.println("PART 5: Converting Between Strings and Numbers");
        System.out.println();
        
        // String → int using Integer.parseInt()
        String numberString = "42";
        int parsedNumber = Integer.parseInt(numberString);
        System.out.println("String \"" + numberString + "\" → int " + parsedNumber);
        
        // int → String using String.valueOf()
        int originalNumber = 42;
        String convertedString = String.valueOf(originalNumber);
        System.out.println("int " + originalNumber + " → String \"" + convertedString + "\"");
        System.out.println();
        
        // TODO 5: Try string conversions
        // Convert a string to double
        // Convert a double back to string
        // What happens if string isn't a valid number?
        
        System.out.println();
        
        // PART 6: Chaining Conversions
        System.out.println("PART 6: Chaining Multiple Conversions");
        System.out.println();
        
        // double → int → short
        double originalPrice = 99.99;
        int priceInt = (int) originalPrice;
        short priceShort = (short) priceInt;
        
        System.out.println("Original (double): " + originalPrice);
        System.out.println("After casting to int: " + priceInt);
        System.out.println("After casting to short: " + priceShort);
        System.out.println();
        
        System.out.println("=== REFLECTION QUESTIONS ===");
        System.out.println("1. Why is implicit conversion safe but explicit casting risky?");
        System.out.println("2. What data is lost when casting double to int?");
        System.out.println("3. How can you safely cast a large number to a smaller type?");
        System.out.println("4. Why do we need Integer.parseInt() to convert string to int?");
        System.out.println("5. What happens if you try to parse an invalid number string?");
    }
}
