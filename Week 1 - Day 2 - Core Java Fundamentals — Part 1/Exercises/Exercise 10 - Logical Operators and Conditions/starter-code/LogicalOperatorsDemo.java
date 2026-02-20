/**
 * Exercise 11 - Logical Operators and Conditions
 * Starter Code
 */

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        System.out.println("=== Logical Operators ===\n");
        
        // TODO 1: AND operator (&&)
        System.out.println("AND (&&) - both must be true:");
        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));
        
        // TODO 2: OR operator (||)
        System.out.println("\nOR (||) - at least one must be true:");
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));
        
        // TODO 3: NOT operator (!)
        System.out.println("\nNOT (!) - inverts:");
        System.out.println("!true = " + !true);
        System.out.println("!false = " + !false);
    }
}
