/**
 * Exercise 11 - Operator Precedence
 * Starter Code
 * 
 * Practice predicting and understanding operator precedence.
 */

public class OperatorPrecedenceExercise {
    public static void main(String[] args) {
        System.out.println("=== Operator Precedence Practice ===\n");
        
        // TODO 1: Predict the result before looking
        // Expression: 2 + 3 * 4
        System.out.println("1. 2 + 3 * 4 = " + (2 + 3 * 4));
        System.out.println("   (Expected: ?)");
        System.out.println();
        
        // TODO 2: Compare with parentheses
        System.out.println("2. (2 + 3) * 4 = " + ((2 + 3) * 4));
        System.out.println("   (Different result!)");
        System.out.println();
        
        // TODO 3: Arithmetic with division and modulo
        System.out.println("3. 20 / 4 + 3 = " + (20 / 4 + 3));
        System.out.println("   (Division before addition)");
        System.out.println();
        
        // TODO 4: Mixed arithmetic and comparison
        System.out.println("4. 5 + 3 > 7 = " + (5 + 3 > 7));
        System.out.println("   (Arithmetic before comparison)");
        System.out.println();
        
        // TODO 5: Comparison before logical AND
        System.out.println("5. 5 > 3 && 10 < 20 = " + (5 > 3 && 10 < 20));
        System.out.println();
        
        // TODO 6: AND before OR
        System.out.println("6. true || false && false = " + (true || false && false));
        System.out.println("   (AND evaluated first)");
        System.out.println();
        
        // TODO 7: Complex expression - predict first!
        System.out.println("7. 10 - 5 * 2 + 3 = " + (10 - 5 * 2 + 3));
        System.out.println("   (Step through: 10 - 10 + 3 = ?)");
        System.out.println();
        
        // TODO 8: Create your own complex expression
        // Write an expression and predict the result
        int age = 25;
        boolean hasLicense = true;
        boolean canDrive = age > 18 && hasLicense || age < 16;
        System.out.println("8. Your expression: " + canDrive);
        System.out.println();
        
        // TODO 9: Fix ambiguous expression with parentheses
        System.out.println("9. AMBIGUOUS: age > 18 && hasLicense || age < 16");
        System.out.println("   CLEAR: (age > 18 && hasLicense) || age < 16 = " + ((age > 18 && hasLicense) || age < 16));
    }
}
