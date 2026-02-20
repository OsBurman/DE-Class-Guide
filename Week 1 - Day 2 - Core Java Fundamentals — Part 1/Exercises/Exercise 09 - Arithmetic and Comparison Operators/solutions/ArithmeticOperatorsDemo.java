/**
 * Exercise 10 - Arithmetic and Comparison Operators
 * Solution
 */

public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        System.out.println("=== Arithmetic and Comparison Operators ===\n");
        
        int a = 10;
        int b = 3;
        
        // Arithmetic operations
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b) + " (addition)");
        System.out.println("a - b = " + (a - b) + " (subtraction)");
        System.out.println("a * b = " + (a * b) + " (multiplication)");
        System.out.println("a / b = " + (a / b) + " (division, truncates)");
        System.out.println("a % b = " + (a % b) + " (modulo, remainder)");
        
        // Comparison operations
        System.out.println("\nComparisons:");
        System.out.println("a > b: " + (a > b) + " (greater than)");
        System.out.println("a < b: " + (a < b) + " (less than)");
        System.out.println("a == b: " + (a == b) + " (equal)");
        System.out.println("a != b: " + (a != b) + " (not equal)");
        System.out.println("a >= b: " + (a >= b) + " (greater or equal)");
        System.out.println("a <= b: " + (a <= b) + " (less or equal)");
    }
}
