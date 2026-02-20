/**
 * Exercise 05 - Autoboxing and Unboxing
 * Solution
 * 
 * Comprehensive demonstration of wrapper classes, autoboxing, and unboxing.
 */

import java.util.ArrayList;
import java.util.List;

public class WrapperClassDemo {
    public static void main(String[] args) {
        System.out.println("=== Autoboxing and Unboxing ===\n");
        
        // PART 1: Understanding Wrapper Classes
        System.out.println("PART 1: Wrapper Classes");
        System.out.println();
        System.out.println("Java has wrapper classes for each primitive type:");
        System.out.println("Primitive    Wrapper Class");
        System.out.println("int          Integer");
        System.out.println("double       Double");
        System.out.println("boolean      Boolean");
        System.out.println("char         Character");
        System.out.println("long         Long");
        System.out.println("float        Float");
        System.out.println("byte         Byte");
        System.out.println("short        Short");
        System.out.println();
        
        // Create wrapper objects (manual way - old style)
        Integer countObject = new Integer(42);
        Double priceObject = new Double(19.99);
        Boolean isActiveObject = new Boolean(true);
        
        System.out.println("Manual wrapper creation (old style - not recommended):");
        System.out.println("Integer countObject = new Integer(42): " + countObject);
        System.out.println("Double priceObject = new Double(19.99): " + priceObject);
        System.out.println("Boolean isActiveObject = new Boolean(true): " + isActiveObject);
        System.out.println();
        
        // PART 2: Autoboxing
        System.out.println("PART 2: Autoboxing (Automatic Primitive → Wrapper)");
        System.out.println();
        
        // Autoboxing: automatically convert int to Integer
        int primitiveNumber = 100;
        Integer boxedNumber = primitiveNumber;  // Autoboxing happens here
        System.out.println("int primitiveNumber = 100");
        System.out.println("Integer boxedNumber = primitiveNumber;  // Autoboxing");
        System.out.println("Result: " + boxedNumber);
        System.out.println();
        
        // Autobox different types
        double primitiveDouble = 3.14;
        Double boxedDouble = primitiveDouble;
        System.out.println("double primitiveDouble = 3.14");
        System.out.println("Double boxedDouble = primitiveDouble;  // Autoboxing");
        System.out.println("Result: " + boxedDouble);
        System.out.println();
        
        boolean primitiveBoolean = true;
        Boolean boxedBoolean = primitiveBoolean;
        System.out.println("boolean primitiveBoolean = true");
        System.out.println("Boolean boxedBoolean = primitiveBoolean;  // Autoboxing");
        System.out.println("Result: " + boxedBoolean);
        System.out.println();
        
        long primitiveLong = 1000000000L;
        Long boxedLong = primitiveLong;
        System.out.println("long primitiveLong = 1000000000L");
        System.out.println("Long boxedLong = primitiveLong;  // Autoboxing");
        System.out.println("Result: " + boxedLong);
        System.out.println();
        
        // Method that accepts wrapper object
        System.out.println("Passing primitive to method expecting wrapper:");
        printInteger(42);  // Autoboxes 42 to Integer
        System.out.println();
        
        // PART 3: Unboxing
        System.out.println("PART 3: Unboxing (Automatic Wrapper → Primitive)");
        System.out.println();
        
        // Unboxing: automatically convert Integer to int
        Integer wrappedValue = 50;
        int primitiveValue = wrappedValue;  // Unboxing happens here
        System.out.println("Integer wrappedValue = 50");
        System.out.println("int primitiveValue = wrappedValue;  // Unboxing");
        System.out.println("Result: " + primitiveValue);
        System.out.println();
        
        // Unbox different types
        Double wrappedDouble = 2.71;
        double unboxedDouble = wrappedDouble;
        System.out.println("Double wrappedDouble = 2.71");
        System.out.println("double unboxedDouble = wrappedDouble;  // Unboxing");
        System.out.println("Result: " + unboxedDouble);
        System.out.println();
        
        Boolean wrappedBoolean = false;
        boolean unboxedBoolean = wrappedBoolean;
        System.out.println("Boolean wrappedBoolean = false");
        System.out.println("boolean unboxedBoolean = wrappedBoolean;  // Unboxing");
        System.out.println("Result: " + unboxedBoolean);
        System.out.println();
        
        // Using unboxed value in arithmetic
        Integer number1 = 10;
        Integer number2 = 20;
        int sum = number1 + number2;  // Unboxes both, adds, result is primitive
        System.out.println("Integer number1 = 10");
        System.out.println("Integer number2 = 20");
        System.out.println("int sum = number1 + number2;  // Unboxes and adds");
        System.out.println("Result: " + sum);
        System.out.println();
        
        // PART 4: Using Wrappers with Collections
        System.out.println("PART 4: Collections Require Wrapper Classes");
        System.out.println();
        System.out.println("Collections (like ArrayList) need objects, not primitives");
        System.out.println("But autoboxing makes it look like we're using primitives:");
        System.out.println();
        
        // This would NOT work: List<int> numbers;
        // Collections need the wrapper class, not primitive
        
        // But thanks to autoboxing, this looks clean:
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);      // Autoboxes int 10 to Integer
        numbers.add(20);      // Autoboxes int 20 to Integer
        numbers.add(30);      // Autoboxes int 30 to Integer
        
        System.out.println("ArrayList<Integer> numbers = new ArrayList<>();");
        System.out.println("numbers.add(10);  // 10 is autoboxed to Integer");
        System.out.println("numbers.add(20);  // 20 is autoboxed to Integer");
        System.out.println("numbers.add(30);  // 30 is autoboxed to Integer");
        System.out.println("Content: " + numbers);
        System.out.println();
        
        // Unboxing when retrieving from collection
        System.out.println("Retrieving from collection (with unboxing):");
        for (int i = 0; i < numbers.size(); i++) {
            Integer wrappedNum = numbers.get(i);  // Get Integer
            int primitiveNum = wrappedNum;         // Unbox to int
            System.out.println("  Index " + i + ": " + primitiveNum);
        }
        System.out.println();
        
        // ArrayList of Double
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(19.99);   // Autobox to Double
        prices.add(24.50);   // Autobox to Double
        prices.add(15.75);   // Autobox to Double
        
        System.out.println("ArrayList<Double> prices = new ArrayList<>();");
        System.out.println("prices.add(19.99);");
        System.out.println("prices.add(24.50);");
        System.out.println("prices.add(15.75);");
        System.out.println("Content: " + prices);
        
        System.out.println("Retrieving prices (with unboxing):");
        double totalPrice = 0;
        for (Double price : prices) {
            totalPrice += price;  // Unbox and add
            System.out.println("  Price: $" + price + " (unboxed to primitive)");
        }
        System.out.println("Total: $" + totalPrice);
        System.out.println();
        
        // PART 5: Wrapper Class Methods
        System.out.println("PART 5: Useful Wrapper Class Methods");
        System.out.println();
        
        // Integer methods
        System.out.println("Integer methods:");
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Integer.parseInt(\"123\"): " + Integer.parseInt("123"));
        System.out.println("Integer.toBinaryString(42): " + Integer.toBinaryString(42));
        System.out.println("Integer.toHexString(255): " + Integer.toHexString(255));
        System.out.println();
        
        // Double methods
        System.out.println("Double methods:");
        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("Double.parseDouble(\"3.14\"): " + Double.parseDouble("3.14"));
        System.out.println("Double.isNaN(0/0.0): " + Double.isNaN(0.0/0.0));
        System.out.println();
        
        // Boolean methods
        System.out.println("Boolean methods:");
        System.out.println("Boolean.parseBoolean(\"true\"): " + Boolean.parseBoolean("true"));
        System.out.println("Boolean.parseBoolean(\"false\"): " + Boolean.parseBoolean("false"));
        System.out.println("Boolean.parseBoolean(\"xyz\"): " + Boolean.parseBoolean("xyz"));
        System.out.println();
        
        // Float methods
        System.out.println("Float methods:");
        System.out.println("Float.parseFloat(\"2.5\"): " + Float.parseFloat("2.5"));
        System.out.println("Float.MAX_VALUE: " + Float.MAX_VALUE);
        System.out.println();
        
        // PART 6: Null Reference Gotcha
        System.out.println("PART 6: Important: Null References");
        System.out.println();
        
        Integer nullableNumber = null;
        System.out.println("Integer nullableNumber = null");
        System.out.println("Value: " + nullableNumber);
        System.out.println();
        
        System.out.println("WARNING: Unboxing null causes NullPointerException!");
        System.out.println();
        
        // Safe way to handle null
        Integer potentiallyNull = null;
        if (potentiallyNull != null) {
            int result = potentiallyNull;  // Safe to unbox
            System.out.println("Unboxed safely: " + result);
        } else {
            System.out.println("Value was null, didn't unbox");
        }
        System.out.println();
        
        // PART 7: Autoboxing in Methods
        System.out.println("PART 7: Autoboxing in Method Parameters");
        System.out.println();
        
        processInteger(42);    // Autoboxes
        processDouble(3.14);   // Autoboxes
        processBoolean(true);  // Autoboxes
        System.out.println();
        
        System.out.println("=== REFLECTION QUESTIONS ===");
        System.out.println("1. Why do wrapper classes exist if we have primitives?");
        System.out.println("   Answer: Collections need objects. Wrappers add methods");
        System.out.println("   like parseInt(), MAX_VALUE, etc.");
        System.out.println();
        System.out.println("2. What is autoboxing and when does it happen automatically?");
        System.out.println("   Answer: Java automatically converts primitives to wrappers");
        System.out.println("   when needed (assignment, method parameters).");
        System.out.println();
        System.out.println("3. What is unboxing and when does it happen automatically?");
        System.out.println("   Answer: Java automatically converts wrappers to primitives");
        System.out.println("   when needed (arithmetic, comparisons).");
        System.out.println();
        System.out.println("4. Why do collections require wrapper classes?");
        System.out.println("   Answer: Collections hold objects. ArrayList<Integer>");
        System.out.println("   works, but ArrayList<int> doesn't exist.");
        System.out.println();
        System.out.println("5. What happens if you try to unbox a null reference?");
        System.out.println("   Answer: NullPointerException is thrown.");
        System.out.println("   Always check for null before unboxing!");
    }
    
    // Method that accepts Integer wrapper class
    static void printInteger(Integer value) {
        System.out.println("Received wrapped value: " + value);
    }
    
    static void processInteger(Integer value) {
        System.out.println("Processing Integer: " + value);
    }
    
    static void processDouble(Double value) {
        System.out.println("Processing Double: " + value);
    }
    
    static void processBoolean(Boolean value) {
        System.out.println("Processing Boolean: " + value);
    }
}
