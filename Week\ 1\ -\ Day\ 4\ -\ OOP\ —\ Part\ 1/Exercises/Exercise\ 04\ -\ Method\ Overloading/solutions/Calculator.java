/**
 * Exercise 04: Method Overloading - SOLUTION
 * 
 * This solution demonstrates:
 * - Overloading by parameter count (add with 2 vs 3 params)
 * - Overloading by parameter type (int vs double vs mixed)
 * - Same method name, different behaviors
 */
public class Calculator {

    // Overloaded add methods

    // Add two ints
    static int add(int a, int b) {
        return a + b;
    }

    // Add two doubles
    static double add(double a, double b) {
        return a + b;
    }

    // Add three ints
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded multiply methods

    // Multiply two ints
    static int multiply(int a, int b) {
        return a * b;
    }

    // Multiply two doubles
    static double multiply(double a, double b) {
        return a * b;
    }

    // Multiply int and double
    static double multiply(int a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Test addition methods
        System.out.println("--- Addition ---");
        System.out.println("add(5, 10) = " + add(5, 10));
        System.out.println("add(3.5, 2.5) = " + add(3.5, 2.5));
        System.out.println("add(10, 20, 30) = " + add(10, 20, 30));

        System.out.println();

        // Test multiplication methods
        System.out.println("--- Multiplication ---");
        System.out.println("multiply(4, 7) = " + multiply(4, 7));
        System.out.println("multiply(2.5, 4.0) = " + multiply(2.5, 4.0));
        System.out.println("multiply(5, 3.5) = " + multiply(5, 3.5));
    }
}
