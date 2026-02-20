/**
 * Exercise 05 - Autoboxing and Unboxing
 * Starter Code
 * 
 * In this exercise, you'll practice:
 * - Understanding wrapper classes (Integer, Double, Boolean, etc.)
 * - Autoboxing: automatic conversion of primitives to wrapper objects
 * - Unboxing: automatic conversion of wrapper objects to primitives
 * - Using wrapper classes with collections
 * 
 * TODO: Complete the exercises to practice autoboxing and unboxing
 */

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

        System.out.println("Manual wrapper creation (old style):");
        System.out.println("Integer countObject = new Integer(42): " + countObject);
        System.out.println("Double priceObject = new Double(19.99): " + priceObject);
        System.out.println("Boolean isActiveObject = new Boolean(true): " + isActiveObject);
        System.out.println();

        // PART 2: Autoboxing
        System.out.println("PART 2: Autoboxing (Automatic Primitive → Wrapper)");
        System.out.println();

        // Autoboxing: automatically convert int to Integer
        int primitiveNumber = 100;
        Integer boxedNumber = primitiveNumber; // Autoboxing happens here
        System.out.println("int primitiveNumber = 100");
        System.out.println("Integer boxedNumber = primitiveNumber;  // Autoboxing");
        System.out.println("Result: " + boxedNumber);
        System.out.println();

        // TODO 1: Practice autoboxing with different types
        // Autobox a double to Double
        // Autobox a boolean to Boolean
        // Autobox a long to Long

        // Method that accepts wrapper object
        System.out.println("Passing primitive to method expecting wrapper:");
        printInteger(42); // Autoboxes 42 to Integer
        System.out.println();

        // PART 3: Unboxing
        System.out.println("PART 3: Unboxing (Automatic Wrapper → Primitive)");
        System.out.println();

        // Unboxing: automatically convert Integer to int
        Integer wrappedValue = 50;
        int primitiveValue = wrappedValue; // Unboxing happens here
        System.out.println("Integer wrappedValue = 50");
        System.out.println("int primitiveValue = wrappedValue;  // Unboxing");
        System.out.println("Result: " + primitiveValue);
        System.out.println();

        // TODO 2: Practice unboxing
        // Unbox a Double to double
        // Unbox a Boolean to boolean

        // Using unboxed value in arithmetic
        Integer number1 = 10;
        Integer number2 = 20;
        int sum = number1 + number2; // Unboxes both, adds, result is primitive
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
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();
        numbers.add(10); // Autoboxes int 10 to Integer
        numbers.add(20); // Autoboxes int 20 to Integer
        numbers.add(30); // Autoboxes int 30 to Integer

        System.out.println("ArrayList<Integer> numbers = new ArrayList<>();");
        System.out.println("numbers.add(10);  // 10 is autoboxed to Integer");
        System.out.println("numbers.add(20);  // 20 is autoboxed to Integer");
        System.out.println("Content: " + numbers);
        System.out.println();

        // Unboxing when retrieving from collection
        for (int i = 0; i < numbers.size(); i++) {
            Integer wrappedNum = numbers.get(i); // Get Integer
            int primitiveNum = wrappedNum; // Unbox to int
            System.out.println("  Index " + i + ": " + primitiveNum);
        }
        System.out.println();

        // TODO 3: Create an ArrayList of Double
        // Add several values using autoboxing
        // Retrieve and print them using unboxing

        // PART 5: Wrapper Class Methods
        System.out.println("PART 5: Useful Wrapper Class Methods");
        System.out.println();

        // Integer methods
        System.out.println("Integer methods:");
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Integer.parseInt(\"123\"): " + Integer.parseInt("123"));
        System.out.println();

        // Double methods
        System.out.println("Double methods:");
        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("Double.parseDouble(\"3.14\"): " + Double.parseDouble("3.14"));
        System.out.println();

        // TODO 4: Use wrapper class methods
        // Find the maximum integer value
        // Parse a string to get a float value
        // Use Boolean.valueOf() to convert string

        // PART 6: Null Reference Gotcha
        System.out.println("PART 6: Important: Null References");
        System.out.println();

        Integer nullableNumber = null;
        System.out.println("Integer nullableNumber = null");
        System.out.println("Value: " + nullableNumber);
        System.out.println();

        System.out.println("WARNING: Unboxing null causes NullPointerException!");
        System.out.println("int result = nullableNumber;  // ERROR if nullableNumber is null");
        System.out.println();

        System.out.println("=== REFLECTION QUESTIONS ===");
        System.out.println("1. Why do wrapper classes exist if we have primitives?");
        System.out.println("2. What is autoboxing and when does it happen automatically?");
        System.out.println("3. What is unboxing and when does it happen automatically?");
        System.out.println("4. Why do collections require wrapper classes?");
        System.out.println("5. What happens if you try to unbox a null reference?");
    }

    // Method that accepts Integer wrapper class
    static void printInteger(Integer value) {
        System.out.println("Received wrapped value: " + value);
    }
}
