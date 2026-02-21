/**
 * Method Overloading Demo
 * 
 * Demonstrates:
 * - Multiple methods with same name but different parameters
 * - Parameter type differences
 * - Parameter count differences
 * - Method resolution by signature
 * - Compile-time polymorphism
 * 
 * Key Concepts:
 * - Overloading: same method name, different signatures
 * - Signature = method name + parameters (type, count, order)
 * - Return type alone does NOT create overload
 * - Java compiler determines which method to call based on arguments
 */

public class MethodOverloadingDemo {

    // Example 1: Overloading by parameter count
    public static void demonstrateParameterCount() {
        System.out.println("=== Example 1: Overloading by Parameter Count ===");
        
        class Calculator {
            int add(int a, int b) {
                return a + b;
            }
            
            int add(int a, int b, int c) {
                return a + b + c;
            }
            
            int add(int a, int b, int c, int d) {
                return a + b + c + d;
            }
        }
        
        Calculator calc = new Calculator();
        System.out.println("add(2, 3) = " + calc.add(2, 3));
        System.out.println("add(2, 3, 4) = " + calc.add(2, 3, 4));
        System.out.println("add(2, 3, 4, 5) = " + calc.add(2, 3, 4, 5));
    }

    // Example 2: Overloading by parameter type
    public static void demonstrateParameterType() {
        System.out.println("\n=== Example 2: Overloading by Parameter Type ===");
        
        class Printer {
            void print(int value) {
                System.out.println("Integer: " + value);
            }
            
            void print(double value) {
                System.out.println("Double: " + value);
            }
            
            void print(String value) {
                System.out.println("String: " + value);
            }
            
            void print(boolean value) {
                System.out.println("Boolean: " + value);
            }
        }
        
        Printer printer = new Printer();
        printer.print(42);
        printer.print(3.14);
        printer.print("Hello");
        printer.print(true);
    }

    // Example 3: Overloading with mixed types
    public static void demonstrateMixedTypes() {
        System.out.println("\n=== Example 3: Overloading with Mixed Types ===");
        
        class Area {
            double calculate(double side) {
                // Square
                return side * side;
            }
            
            double calculate(double length, double width) {
                // Rectangle
                return length * width;
            }
            
            double calculate(double radius, String shape) {
                // Circle (String parameter distinguishes it)
                if (shape.equals("circle")) {
                    return 3.14159 * radius * radius;
                }
                return 0;
            }
        }
        
        Area area = new Area();
        System.out.println("Square (5): " + area.calculate(5));
        System.out.println("Rectangle (5 x 4): " + area.calculate(5, 4));
        System.out.println("Circle (5): " + area.calculate(5, "circle"));
    }

    // Example 4: Overloading with different type orders
    public static void demonstrateTypeOrder() {
        System.out.println("\n=== Example 4: Overloading with Different Type Orders ===");
        
        class SwapDemo {
            void process(int a, String b) {
                System.out.println("int, String: " + a + ", " + b);
            }
            
            void process(String a, int b) {
                System.out.println("String, int: " + a + ", " + b);
            }
            
            void process(String a, String b) {
                System.out.println("String, String: " + a + ", " + b);
            }
        }
        
        SwapDemo demo = new SwapDemo();
        demo.process(10, "hello");
        demo.process("hello", 10);
        demo.process("hello", "world");
    }

    // Example 5: Practical overloading - constructor pattern
    public static void demonstrateConstructorPattern() {
        System.out.println("\n=== Example 5: Overloading Pattern (Practical) ===");
        
        class Person {
            String name;
            int age;
            String city;
            
            Person(String n, int a, String c) {
                name = n;
                age = a;
                city = c;
            }
            
            Person(String n, int a) {
                name = n;
                age = a;
                city = "Unknown";
            }
            
            Person(String n) {
                name = n;
                age = 0;
                city = "Unknown";
            }
            
            void display() {
                System.out.println(name + " | Age: " + age + " | City: " + city);
            }
        }
        
        Person p1 = new Person("Alice", 25, "New York");
        Person p2 = new Person("Bob", 30);
        Person p3 = new Person("Charlie");
        
        p1.display();
        p2.display();
        p3.display();
    }

    // Example 6: Overloading with method behavior differences
    public static void demonstrateMethodBehavior() {
        System.out.println("\n=== Example 6: Overloading with Behavior Differences ===");
        
        class StringUtils {
            String reverse(String str) {
                String result = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    result = result + str.charAt(i);
                }
                return result;
            }
            
            int reverse(int num) {
                int result = 0;
                while (num > 0) {
                    result = result * 10 + (num % 10);
                    num = num / 10;
                }
                return result;
            }
            
            void reverse(int[] arr) {
                System.out.print("Reversed array: [");
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i]);
                    if (i > 0) System.out.print(", ");
                }
                System.out.println("]");
            }
        }
        
        StringUtils utils = new StringUtils();
        System.out.println("Reverse string: " + utils.reverse("hello"));
        System.out.println("Reverse number: " + utils.reverse(12345));
        utils.reverse(new int[]{1, 2, 3, 4, 5});
    }

    // Example 7: Important - Return type alone is NOT overloading
    public static void demonstrateReturnTypeNotEnough() {
        System.out.println("\n=== Example 7: Return Type Alone ===");
        
        class BadExample {
            // These TWO would cause COMPILATION ERROR if both existed:
            // int getValue() { return 5; }
            // double getValue() { return 5.0; }
            // Reason: Compiler can't distinguish which one to call
            
            // Correct approach: Different parameters
            int getValue() {
                System.out.println("getValue() returning int");
                return 5;
            }
            
            double getValue(String type) {
                System.out.println("getValue(String) returning double");
                return 5.0;
            }
        }
        
        BadExample ex = new BadExample();
        System.out.println("Result 1: " + ex.getValue());
        System.out.println("Result 2: " + ex.getValue("double"));
    }

    // Example 8: Common pitfall - autoboxing in overloading
    public static void demonstrateAutoboxing() {
        System.out.println("\n=== Example 8: Autoboxing in Overloading ===");
        
        class TypeConverter {
            void convert(int value) {
                System.out.println("Converting int: " + value);
            }
            
            void convert(Integer value) {
                System.out.println("Converting Integer object: " + value);
            }
        }
        
        TypeConverter converter = new TypeConverter();
        converter.convert(10);           // Calls convert(int)
        converter.convert(Integer.valueOf(10)); // Calls convert(Integer)
    }

    public static void main(String[] args) {
        demonstrateParameterCount();
        demonstrateParameterType();
        demonstrateMixedTypes();
        demonstrateTypeOrder();
        demonstrateConstructorPattern();
        demonstrateMethodBehavior();
        demonstrateReturnTypeNotEnough();
        demonstrateAutoboxing();
    }
}
