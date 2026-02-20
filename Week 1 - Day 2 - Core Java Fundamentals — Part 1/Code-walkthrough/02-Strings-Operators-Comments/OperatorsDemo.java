/**
 * OperatorsDemo.java
 * 
 * Comprehensive demonstration of Java operators:
 * - Arithmetic operators: +, -, *, /, %
 * - Comparison operators: ==, !=, <, >, <=, >=
 * - Logical operators: &&, ||, !
 * 
 * Key concepts:
 * - Operator types and what they return
 * - Operator precedence
 * - Short-circuit evaluation
 * - Real-world use cases
 */

public class OperatorsDemo {
    public static void main(String[] args) {
        System.out.println("=== JAVA OPERATORS COMPREHENSIVE GUIDE ===\n");
        
        // ARITHMETIC OPERATORS
        System.out.println("1. ARITHMETIC OPERATORS");
        System.out.println("   (Work with numbers, return numbers)\n");
        
        int a = 17;
        int b = 5;
        
        System.out.println("   Given: a = " + a + ", b = " + b);
        System.out.println("   a + b = " + (a + b) + " (addition)");
        System.out.println("   a - b = " + (a - b) + " (subtraction)");
        System.out.println("   a * b = " + (a * b) + " (multiplication)");
        System.out.println("   a / b = " + (a / b) + " (integer division - truncates!)");
        System.out.println("   a % b = " + (a % b) + " (modulo - remainder)");
        System.out.println();
        
        // Modulo use case
        System.out.println("   MODULO (%) - Common Uses:");
        System.out.println("   Is 10 even? (10 % 2 == 0): " + (10 % 2 == 0));
        System.out.println("   Is 17 odd? (17 % 2 != 0): " + (17 % 2 != 0));
        System.out.println("   What's every 3rd number? (counter % 3 == 0)");
        System.out.println();
        
        // Integer division truncation
        System.out.println("   INTEGER DIVISION - Important!");
        System.out.println("   5 / 2 = " + (5 / 2) + " (not 2.5 - truncates to 2)");
        System.out.println("   For decimal result: 5.0 / 2 = " + (5.0 / 2));
        System.out.println();
        
        // COMPARISON OPERATORS
        System.out.println("2. COMPARISON OPERATORS");
        System.out.println("   (Compare values, return true or false)\n");
        
        int x = 10;
        int y = 5;
        
        System.out.println("   Given: x = " + x + ", y = " + y);
        System.out.println("   x == y: " + (x == y) + " (equal to)");
        System.out.println("   x != y: " + (x != y) + " (not equal to)");
        System.out.println("   x < y:  " + (x < y) + " (less than)");
        System.out.println("   x > y:  " + (x > y) + " (greater than)");
        System.out.println("   x <= y: " + (x <= y) + " (less than or equal)");
        System.out.println("   x >= y: " + (x >= y) + " (greater than or equal)");
        System.out.println();
        
        // String comparison warning
        System.out.println("   IMPORTANT - String Comparison:");
        String name1 = "Alice";
        String name2 = "Alice";
        System.out.println("   name1 == name2: " + (name1 == name2) + " (compares references)");
        System.out.println("   name1.equals(name2): " + name1.equals(name2) + " (compares content)");
        System.out.println("   ALWAYS use .equals() for string comparison!");
        System.out.println();
        
        // LOGICAL OPERATORS
        System.out.println("3. LOGICAL OPERATORS");
        System.out.println("   (Combine boolean values, return true or false)\n");
        
        // AND operator
        System.out.println("   AND (&&) - Both must be true:");
        System.out.println("   true && true   = " + (true && true));
        System.out.println("   true && false  = " + (true && false));
        System.out.println("   false && true  = " + (false && true));
        System.out.println("   false && false = " + (false && false));
        System.out.println();
        
        // OR operator
        System.out.println("   OR (||) - At least one must be true:");
        System.out.println("   true || true   = " + (true || true));
        System.out.println("   true || false  = " + (true || false));
        System.out.println("   false || true  = " + (false || true));
        System.out.println("   false || false = " + (false || false));
        System.out.println();
        
        // NOT operator
        System.out.println("   NOT (!) - Inverts the value:");
        System.out.println("   !true  = " + !true);
        System.out.println("   !false = " + !false);
        System.out.println();
        
        // Real-world logical examples
        System.out.println("   REAL-WORLD EXAMPLES:");
        int age = 25;
        int score = 85;
        boolean isAdmin = true;
        
        System.out.println("   Given: age = " + age + ", score = " + score + ", isAdmin = " + isAdmin);
        System.out.println("   Is adult AND high score? (age >= 18 && score >= 80): " + 
                          (age >= 18 && score >= 80));
        System.out.println("   Is low score OR not admin? (score < 50 || !isAdmin): " + 
                          (score < 50 || !isAdmin));
        System.out.println();
        
        // Short-circuit evaluation
        System.out.println("4. SHORT-CIRCUIT EVALUATION");
        System.out.println("   (Java stops checking as soon as it knows the answer)\n");
        
        System.out.println("   Example: false && (anything)");
        System.out.println("   Java evaluates: false && ... → result is false");
        System.out.println("   The second part doesn't matter, so it's skipped!");
        System.out.println();
        
        System.out.println("   Example: true || (anything)");
        System.out.println("   Java evaluates: true || ... → result is true");
        System.out.println("   The second part doesn't matter, so it's skipped!");
        System.out.println();
        
        System.out.println("   BENEFIT: Efficiency!");
        System.out.println("   In a login check: if (isLoggedIn && hasPermission)");
        System.out.println("   If not logged in, permission check is skipped entirely");
        System.out.println();
        
        // OPERATOR PRECEDENCE
        System.out.println("5. OPERATOR PRECEDENCE");
        System.out.println("   (Order matters when multiple operators are used)\n");
        
        int result1 = 2 + 3 * 4;
        System.out.println("   2 + 3 * 4 = " + result1);
        System.out.println("   (Multiplication happens first, so: 2 + 12 = 14)");
        System.out.println();
        
        int result2 = (2 + 3) * 4;
        System.out.println("   (2 + 3) * 4 = " + result2);
        System.out.println("   (Parentheses first, so: 5 * 4 = 20)");
        System.out.println();
        
        System.out.println("   PRECEDENCE ORDER (highest to lowest):");
        System.out.println("   1. Parentheses ()");
        System.out.println("   2. Multiplication, Division, Modulo (*, /, %)");
        System.out.println("   3. Addition, Subtraction (+, -)");
        System.out.println("   4. Comparison (<, >, <=, >=)");
        System.out.println("   5. Equality (==, !=)");
        System.out.println("   6. Logical AND (&&)");
        System.out.println("   7. Logical OR (||)");
        System.out.println();
        
        // Complex expression example
        System.out.println("6. COMPLEX EXPRESSION");
        boolean complex = 5 > 3 && (10 < 5 || 7 == 7);
        System.out.println("   5 > 3 && (10 < 5 || 7 == 7)");
        System.out.println("   = true && (false || true)");
        System.out.println("   = true && true");
        System.out.println("   = " + complex);
        System.out.println();
        
        System.out.println("   WHEN UNSURE: Use parentheses to be explicit!");
        System.out.println();
        
        // Increment/Decrement operators
        System.out.println("7. INCREMENT AND DECREMENT");
        int counter = 5;
        System.out.println("   Given: counter = " + counter);
        System.out.println("   counter++ = " + counter++);
        System.out.println("   (Now counter = " + counter + ")");
        System.out.println("   ++counter = " + ++counter);
        System.out.println("   (Now counter = " + counter + ")");
        System.out.println();
        System.out.println("   Difference:");
        System.out.println("   - counter++ uses current value, then increments");
        System.out.println("   - ++counter increments first, then uses value");
        System.out.println();
        
        System.out.println("=== KEY TAKEAWAYS ===");
        System.out.println("1. Operators return values: arithmetic → numbers, comparison/logical → boolean");
        System.out.println("2. Operator precedence matters: use parentheses when unsure");
        System.out.println("3. Use .equals() for string comparison, NOT ==");
        System.out.println("4. Short-circuit evaluation improves efficiency");
    }
}
