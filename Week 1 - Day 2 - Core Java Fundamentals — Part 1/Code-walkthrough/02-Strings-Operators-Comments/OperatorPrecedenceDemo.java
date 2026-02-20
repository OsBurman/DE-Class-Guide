/**
 * OperatorPrecedenceDemo.java
 * 
 * Detailed demonstration of operator precedence with emphasis on:
 * - How Java evaluates complex expressions
 * - Why parentheses matter
 * - Common mistakes and how to avoid them
 */

public class OperatorPrecedenceDemo {
    public static void main(String[] args) {
        System.out.println("=== OPERATOR PRECEDENCE - DETAILED GUIDE ===\n");
        
        System.out.println("PRECEDENCE ORDER (highest to lowest):");
        System.out.println("1. Parentheses ()");
        System.out.println("2. *, /, % (left to right)");
        System.out.println("3. +, - (left to right)");
        System.out.println("4. <, >, <=, >=");
        System.out.println("5. ==, !=");
        System.out.println("6. &&");
        System.out.println("7. ||");
        System.out.println();
        
        // Example 1: Arithmetic precedence
        System.out.println("EXAMPLE 1: Arithmetic Precedence");
        int expr1 = 2 + 3 * 4;
        System.out.println("Expression: 2 + 3 * 4");
        System.out.println("Evaluation: 2 + (3 * 4) = 2 + 12 = " + expr1);
        System.out.println("NOT (2 + 3) * 4 = 5 * 4 = 20");
        System.out.println("(Multiplication happens before addition)");
        System.out.println();
        
        // Example 2: Left-to-right associativity
        System.out.println("EXAMPLE 2: Left-to-Right Evaluation");
        int expr2 = 20 - 5 - 3;
        System.out.println("Expression: 20 - 5 - 3");
        System.out.println("Evaluation: (20 - 5) - 3 = 15 - 3 = " + expr2);
        System.out.println("NOT 20 - (5 - 3) = 20 - 2 = 18");
        System.out.println("(Operators of same precedence go left to right)");
        System.out.println();
        
        // Example 3: Mixed arithmetic
        System.out.println("EXAMPLE 3: Mixed Arithmetic Operations");
        int expr3 = 10 + 6 / 2 * 3;
        System.out.println("Expression: 10 + 6 / 2 * 3");
        System.out.println("Step 1: 6 / 2 = 3 (division first)");
        System.out.println("Step 2: 3 * 3 = 9 (multiplication, left to right)");
        System.out.println("Step 3: 10 + 9 = " + expr3 + " (addition last)");
        System.out.println();
        
        // Example 4: Comparison with arithmetic
        System.out.println("EXAMPLE 4: Comparison with Arithmetic");
        boolean expr4 = 5 + 3 > 7;
        System.out.println("Expression: 5 + 3 > 7");
        System.out.println("Step 1: 5 + 3 = 8 (arithmetic first)");
        System.out.println("Step 2: 8 > 7 = " + expr4 + " (comparison second)");
        System.out.println();
        
        // Example 5: Comparison before logical AND
        System.out.println("EXAMPLE 5: Comparisons Before Logical AND");
        boolean expr5 = 5 > 3 && 10 < 20;
        System.out.println("Expression: 5 > 3 && 10 < 20");
        System.out.println("Step 1: 5 > 3 = true (comparison)");
        System.out.println("Step 2: 10 < 20 = true (comparison)");
        System.out.println("Step 3: true && true = " + expr5 + " (logical AND)");
        System.out.println();
        
        // Example 6: NOT has high precedence
        System.out.println("EXAMPLE 6: NOT Operator (High Precedence)");
        boolean expr6a = !true && true;
        boolean expr6b = !(true && true);
        System.out.println("Expression 1: !true && true");
        System.out.println("Evaluation: (!true) && true = false && true = " + expr6a);
        System.out.println();
        System.out.println("Expression 2: !(true && true)");
        System.out.println("Evaluation: !(true && true) = !true = " + expr6b);
        System.out.println("(Parentheses change the result!)");
        System.out.println();
        
        // Example 7: Complex real-world expression
        System.out.println("EXAMPLE 7: Real-World Complex Expression");
        int age = 25;
        int score = 85;
        boolean isPremium = true;
        
        boolean expr7 = age >= 18 && score > 80 || isPremium;
        System.out.println("Expression: age >= 18 && score > 80 || isPremium");
        System.out.println("Given: age = " + age + ", score = " + score + ", isPremium = " + isPremium);
        System.out.println("Step 1: age >= 18 = " + (age >= 18) + " (comparison)");
        System.out.println("Step 2: score > 80 = " + (score > 80) + " (comparison)");
        System.out.println("Step 3: " + (age >= 18) + " && " + (score > 80) + " = " + ((age >= 18) && (score > 80)) + " (AND)");
        System.out.println("Step 4: " + ((age >= 18) && (score > 80)) + " || " + isPremium + " = " + expr7 + " (OR)");
        System.out.println("(AND has higher precedence than OR)");
        System.out.println();
        
        // Example 8: Ambiguous without parentheses
        System.out.println("EXAMPLE 8: Use Parentheses for Clarity!");
        int x = 5;
        int y = 10;
        int z = 3;
        
        int result1 = x + y / z;
        int result2 = (x + y) / z;
        
        System.out.println("Given: x = " + x + ", y = " + y + ", z = " + z);
        System.out.println();
        System.out.println("WITHOUT clear parentheses: x + y / z = " + result1);
        System.out.println("Interpretation: " + x + " + (" + y + " / " + z + ") = " + x + " + " + (y/z) + " = " + result1);
        System.out.println();
        System.out.println("WITH parentheses: (x + y) / z = " + result2);
        System.out.println("Interpretation: (" + x + " + " + y + ") / " + z + " = " + (x+y) + " / " + z + " = " + result2);
        System.out.println();
        System.out.println("SAME EXPRESSION - DIFFERENT RESULTS!");
        System.out.println("Use parentheses to make your intent clear!");
        System.out.println();
        
        // Example 9: Common mistake
        System.out.println("EXAMPLE 9: Common Mistake");
        int a = 5;
        int b = 10;
        
        // Wrong way - ambiguous
        System.out.println("Ambiguous: a * b + 2");
        System.out.println("Result: " + (a * b + 2));
        System.out.println("(Did you mean a * (b + 2)? That would be " + (a * (b + 2)) + ")");
        System.out.println();
        
        // Right way - clear
        System.out.println("Clear with parentheses:");
        System.out.println("(a * b) + 2 = " + (a * b + 2));
        System.out.println("a * (b + 2) = " + (a * (b + 2)));
        System.out.println();
        
        // Example 10: Boolean precedence
        System.out.println("EXAMPLE 10: Boolean Operator Precedence");
        boolean p = true;
        boolean q = false;
        boolean r = true;
        
        // AND before OR
        boolean expr10 = p && q || r;
        System.out.println("Expression: p && q || r");
        System.out.println("Given: p = " + p + ", q = " + q + ", r = " + r);
        System.out.println("Evaluation: (p && q) || r = (" + p + " && " + q + ") || " + r);
        System.out.println("           = " + (p && q) + " || " + r + " = " + expr10);
        System.out.println("(AND evaluated before OR)");
        System.out.println();
        
        System.out.println("=== BEST PRACTICE ===");
        System.out.println("When unsure about precedence, use parentheses!");
        System.out.println("It makes your code:");
        System.out.println("  • Clearer to read");
        System.out.println("  • Easier to debug");
        System.out.println("  • Less prone to mistakes");
        System.out.println();
        System.out.println("Example:");
        System.out.println("  Bad:  if (age > 18 && score > 80 || isPremium)");
        System.out.println("  Good: if ((age > 18 && score > 80) || isPremium)");
    }
}
