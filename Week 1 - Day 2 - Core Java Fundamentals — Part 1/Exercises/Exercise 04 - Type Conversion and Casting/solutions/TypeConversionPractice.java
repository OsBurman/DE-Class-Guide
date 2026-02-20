/**
 * Exercise 04 - Type Conversion and Casting
 * Solution
 * 
 * Demonstrates proper type conversion and safe casting practices.
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
        
        // Additional implicit conversions
        byte smallNumber = 50;
        short asShort = smallNumber;
        System.out.println("byte to short: " + smallNumber + " → " + asShort);
        
        short mediumNumber = 1000;
        int asInt = mediumNumber;
        System.out.println("short to int: " + mediumNumber + " → " + asInt);
        
        int wholeNumber = 42;
        float asFloat = wholeNumber;
        System.out.println("int to float: " + wholeNumber + " → " + asFloat);
        System.out.println();
        
        // PART 2: Explicit Casting (Manual, Requires Care)
        System.out.println("PART 2: Explicit Casting (Narrowing)");
        System.out.println("(Larger type manually converted to smaller type - can lose data)");
        System.out.println();
        
        // double → int (loses decimal part)
        double price = 19.99;
        int priceAsInt = (int) price;  // Explicit cast with (int)
        System.out.println("double to int: " + price + " → " + priceAsInt);
        System.out.println("(Notice: decimal part .99 is lost!)");
        System.out.println();
        
        // long → int (can lose data if number is too large)
        long largeNumber = 50000;
        int smallerNumber = (int) largeNumber;
        System.out.println("long to int: " + largeNumber + " → " + smallerNumber);
        System.out.println();
        
        // Additional explicit casts
        double temperature = 98.6;
        int tempInt = (int) temperature;
        System.out.println("double to int: " + temperature + " → " + tempInt + " (lost decimal)");
        
        long milliseconds = 1500;
        short asShortValue = (short) milliseconds;
        System.out.println("long to short: " + milliseconds + " → " + asShortValue);
        System.out.println();
        
        // PART 3: Overflow and Data Loss
        System.out.println("PART 3: Overflow - What Happens with Too Large Numbers");
        System.out.println();
        
        // Show the maximum values
        System.out.println("Type limits:");
        System.out.println("byte max: " + Byte.MAX_VALUE + " (127), min: " + Byte.MIN_VALUE + " (-128)");
        System.out.println("int max: " + Integer.MAX_VALUE);
        System.out.println("long max: " + Long.MAX_VALUE);
        System.out.println();
        
        // Demonstrate overflow
        System.out.println("Demonstrating overflow:");
        int largeValue = Integer.MAX_VALUE - 5;  // 2147483642
        byte overflowed = (byte) largeValue;  // Cast to byte
        System.out.println("int value: " + largeValue);
        System.out.println("Same value as byte: " + overflowed);
        System.out.println("(Data wrapped around due to overflow!)");
        System.out.println();
        
        System.out.println("PART 4: Safe Conversion Practices");
        System.out.println();
        
        // Check before converting
        long valueToConvert = 1000;
        if (valueToConvert <= Integer.MAX_VALUE && valueToConvert >= Integer.MIN_VALUE) {
            int safeConversion = (int) valueToConvert;
            System.out.println("Safe: Can convert " + valueToConvert + " to int: " + safeConversion);
        }
        System.out.println();
        
        // Safe conversion check with unsafe value
        long dangerousValue = 10000000000L;  // Too large for int
        if (dangerousValue <= Integer.MAX_VALUE && dangerousValue >= Integer.MIN_VALUE) {
            int unsafeConversion = (int) dangerousValue;
            System.out.println("This would overflow");
        } else {
            System.out.println("Unsafe: Cannot safely convert " + dangerousValue + 
                             " to int (exceeds max value of " + Integer.MAX_VALUE + ")");
        }
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
        
        // String → double
        String doubleString = "3.14";
        double parsedDouble = Double.parseDouble(doubleString);
        System.out.println("String \"" + doubleString + "\" → double " + parsedDouble);
        
        // double → String
        double originalDouble = 3.14;
        String doubleAsString = String.valueOf(originalDouble);
        System.out.println("double " + originalDouble + " → String \"" + doubleAsString + "\"");
        System.out.println();
        
        // What happens with invalid input?
        System.out.println("Attempting to parse invalid string:");
        try {
            String invalidString = "hello";
            int invalidNumber = Integer.parseInt(invalidString);
            System.out.println("This won't print");
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Cannot parse \"hello\" as a number");
            System.out.println("This is called a NumberFormatException");
        }
        System.out.println();
        
        // PART 6: Chaining Conversions
        System.out.println("PART 6: Chaining Multiple Conversions");
        System.out.println();
        
        // double → int → short
        double originalPrice = 99.99;
        int priceInt = (int) originalPrice;
        short priceShort = (short) priceInt;
        
        System.out.println("Original (double): " + originalPrice);
        System.out.println("After casting to int: " + priceInt + " (lost decimal)");
        System.out.println("After casting to short: " + priceShort);
        System.out.println("(Chain conversions with caution - data loss at each step!)");
        System.out.println();
        
        System.out.println("=== REFLECTION QUESTIONS ===");
        System.out.println("1. Why is implicit conversion safe but explicit casting risky?");
        System.out.println("   Answer: Implicit only happens from smaller to larger type,");
        System.out.println("   guaranteeing no data loss. Explicit can shrink values, losing data.");
        System.out.println();
        System.out.println("2. What data is lost when casting double to int?");
        System.out.println("   Answer: The fractional part (everything after decimal point).");
        System.out.println("   99.99 becomes 99, 3.14 becomes 3.");
        System.out.println();
        System.out.println("3. How can you safely cast a large number to a smaller type?");
        System.out.println("   Answer: Check if the value is in range first:");
        System.out.println("   if (value <= MAX_VALUE && value >= MIN_VALUE) { cast }");
        System.out.println();
        System.out.println("4. Why do we need Integer.parseInt() to convert string to int?");
        System.out.println("   Answer: Strings and integers are different types.");
        System.out.println("   parseInt() converts string content to numeric value.");
        System.out.println();
        System.out.println("5. What happens if you try to parse an invalid number string?");
        System.out.println("   Answer: A NumberFormatException is thrown.");
        System.out.println("   Example: Integer.parseInt(\"hello\") causes error.");
    }
}
