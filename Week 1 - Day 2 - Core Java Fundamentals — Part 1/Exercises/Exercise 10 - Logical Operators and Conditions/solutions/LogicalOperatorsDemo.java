/**
 * Exercise 11 - Logical Operators and Conditions
 * Solution
 */

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        System.out.println("=== Logical Operators ===\n");
        
        // AND operator (&&) - both must be true
        System.out.println("AND (&&) - both must be true:");
        System.out.println("true && true = " + (true && true) + " ✓");
        System.out.println("true && false = " + (true && false) + " ✗");
        System.out.println("false && true = " + (false && true) + " ✗");
        System.out.println("false && false = " + (false && false) + " ✗");
        
        // OR operator (||) - at least one must be true
        System.out.println("\nOR (||) - at least one must be true:");
        System.out.println("true || true = " + (true || true) + " ✓");
        System.out.println("true || false = " + (true || false) + " ✓");
        System.out.println("false || true = " + (false || true) + " ✓");
        System.out.println("false || false = " + (false || false) + " ✗");
        
        // NOT operator (!) - inverts
        System.out.println("\nNOT (!) - inverts:");
        System.out.println("!true = " + !true);
        System.out.println("!false = " + !false);
        
        // Real-world example
        System.out.println("\nReal-world example:");
        int age = 25;
        boolean hasLicense = true;
        boolean isIntoxicated = false;
        
        boolean canDrive = age >= 18 && hasLicense && !isIntoxicated;
        System.out.println("Can drive? " + canDrive);
    }
}
