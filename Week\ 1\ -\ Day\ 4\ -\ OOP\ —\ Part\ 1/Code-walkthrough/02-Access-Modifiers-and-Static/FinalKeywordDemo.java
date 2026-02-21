/**
 * Final Keyword Demo
 * 
 * Demonstrates:
 * - Final variables (constants)
 * - Final methods (can't override)
 * - Final classes (can't extend)
 * - Final in different contexts
 * 
 * Key Concepts:
 * - final = cannot be changed/overridden/extended
 * - final variable = constant
 * - final method = can't be overridden in subclass
 * - final class = can't be extended
 */

public class FinalKeywordDemo {

    // Example 1: Final variables (constants)
    public static void demonstrateFinalVariables() {
        System.out.println("=== Example 1: Final Variables ===");

        class Circle {
            final double PI = 3.14159; // Constant - can't change
            final int radius;

            Circle(int r) {
                radius = r; // Can set in constructor
                // radius = 10; // ERROR - can't change after
            }

            double getArea() {
                // PI = 3.14; // ERROR - can't modify final
                return PI * radius * radius;
            }
        }

        Circle circle = new Circle(5);
        System.out.println("PI = " + circle.PI);
        System.out.println("Radius = " + circle.radius);
        System.out.println("Area = " + circle.getArea());

        // circle.PI = 3.14; // COMPILER ERROR
        // circle.radius = 10; // COMPILER ERROR
    }

    // Example 2: Final with primitives vs objects
    public static void demonstrateFinalWithTypes() {
        System.out.println("\n=== Example 2: Final with Different Types ===");

        class Container {
            final int count = 100; // Value can't change
            final String message = "Final"; // Reference can't change
            final int[] array = { 1, 2, 3 }; // Reference can't change

            void modify() {
                // count = 200; // ERROR - can't reassign
                // message = "New"; // ERROR - can't reassign
                // array = new int[5]; // ERROR - can't reassign

                // But can modify contents!
                array[0] = 99; // OK - changing array contents
                System.out.println("Modified array[0] to: " + array[0]);
            }
        }

        Container cont = new Container();
        cont.modify();
        System.out.println("Array contents can change, but reference cannot");
    }

    // Example 3: Static final constants
    public static void demonstrateStaticFinalConstants() {
        System.out.println("\n=== Example 3: Static Final Constants ===");

        class Configuration {
            static final String VERSION = "1.0.0";
            static final int MAX_USERS = 1000;
            static final double EPSILON = 0.0001;

            static void displayConfig() {
                System.out.println("Version: " + VERSION);
                System.out.println("Max users: " + MAX_USERS);
                System.out.println("Epsilon: " + EPSILON);

                // All can be read, none can be changed
            }
        }

        Configuration.displayConfig();
        System.out.println("All are constants: " + Configuration.VERSION);
    }

    // Example 4: Final local variables
    public static void demonstrateFinalLocalVariables() {
        System.out.println("\n=== Example 4: Final Local Variables ===");

        class Calculator {
            void calculate() {
                final int result = 42; // Final local variable

                System.out.println("Result: " + result);
                // result = 100; // ERROR - can't change

                // Can create new final for different purpose
                final int newValue = 50;
                System.out.println("New value: " + newValue);
            }
        }

        Calculator calc = new Calculator();
        calc.calculate();
    }

    // Example 5: Final method (can't override)
    public static void demonstrateFinalMethod() {
        System.out.println("\n=== Example 5: Final Methods ===");

        class Animal {
            void eat() {
                System.out.println("Animal eats");
            }

            final void sleep() {
                System.out.println("All animals sleep");
                // This method can't be overridden in subclasses
            }
        }

        class Dog extends Animal {
            @Override
            void eat() {
                System.out.println("Dog eats dog food");
            }

            // Cannot override sleep() because it's final
            // @Override
            // void sleep() { // COMPILER ERROR
            // System.out.println("Dogs sleep");
            // }
        }

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
    }

    // Example 6: Final class (can't extend)
    public static void demonstrateFinalClass() {
        System.out.println("\n=== Example 6: Final Classes ===");

        final class ImmutableString {
            private String value;

            ImmutableString(String s) {
                value = s;
            }

            String getValue() {
                return value;
            }
        }

        // Cannot extend final class
        // class MyString extends ImmutableString { // COMPILER ERROR
        // }

        ImmutableString str = new ImmutableString("Hello");
        System.out.println("Value: " + str.getValue());
        System.out.println("(ImmutableString is final - can't extend)");
    }

    // Example 7: When to use final
    public static void demonstrateWhenToUseFinal() {
        System.out.println("\n=== Example 7: When to Use Final ===");

        class BankAccount {
            static final double INTEREST_RATE = 0.04; // Constant
            final String accountNumber; // Immutable after creation
            private double balance;

            BankAccount(String num, double initial) {
                accountNumber = num;
                balance = initial;
            }

            final void printStatement() {
                // Final - banks don't want this overridden
                System.out.println("Account: " + accountNumber);
                System.out.println("Balance: $" + balance);
            }

            void deposit(double amount) {
                if (amount > 0) {
                    balance = balance + amount;
                }
            }
        }

        BankAccount account = new BankAccount("ACC123", 5000);
        account.printStatement();
        account.deposit(1000);
        account.printStatement();
    }

    // Example 8: Final with method parameters
    public static void demonstrateFinalParameters() {
        System.out.println("\n=== Example 8: Final Method Parameters ===");

        class Processor {
            void process(final int value) {
                System.out.println("Processing: " + value);
                // value = 100; // ERROR - parameter is final
            }

            void process(final String[] items) {
                // items = new String[10]; // ERROR - can't reassign
                items[0] = "Modified"; // OK - modify contents
                System.out.println("Items[0]: " + items[0]);
            }
        }

        Processor proc = new Processor();
        proc.process(42);
        proc.process(new String[] { "item1", "item2" });
    }

    // Example 9: Common use case - configuration
    public static void demonstrateConfiguration() {
        System.out.println("\n=== Example 9: Configuration Pattern ===");

        final class AppConfig {
            static final String DATABASE_URL = "jdbc:mysql://localhost/mydb";
            static final String API_KEY = "secret123";
            static final int TIMEOUT = 30000;
            static final boolean DEBUG_MODE = true;

            static void displayConfig() {
                System.out.println("Database: " + DATABASE_URL);
                System.out.println("Timeout: " + TIMEOUT + "ms");
                System.out.println("Debug: " + DEBUG_MODE);
            }
        }

        AppConfig.displayConfig();
        System.out.println("Config is final - ensures immutability");
    }

    public static void main(String[] args) {
        demonstrateFinalVariables();
        demonstrateFinalWithTypes();
        demonstrateStaticFinalConstants();
        demonstrateFinalLocalVariables();
        demonstrateFinalMethod();
        demonstrateFinalClass();
        demonstrateWhenToUseFinal();
        demonstrateFinalParameters();
        demonstrateConfiguration();
    }
}
