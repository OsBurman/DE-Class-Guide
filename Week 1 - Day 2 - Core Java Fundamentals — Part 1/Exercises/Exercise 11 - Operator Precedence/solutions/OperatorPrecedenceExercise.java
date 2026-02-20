/**
 * Exercise 11 - Operator Precedence
 * Solution
 */

public class OperatorPrecedenceExercise {
    public static void main(String[] args) {
        System.out.println("=== Operator Precedence Practice ===\n");

        // 1. Arithmetic precedence: multiplication before addition
        System.out.println("1. 2 + 3 * 4 = " + (2 + 3 * 4));
        System.out.println("   Step: 2 + (3 * 4) = 2 + 12 = 14");
        System.out.println("   (NOT 5 * 4 = 20)");
        System.out.println();

        // 2. Parentheses change the evaluation order
        System.out.println("2. (2 + 3) * 4 = " + ((2 + 3) * 4));
        System.out.println("   Step: (2 + 3) * 4 = 5 * 4 = 20");
        System.out.println("   (Parentheses force addition first)");
        System.out.println();

        // 3. Division and addition: division first (left to right for same precedence)
        System.out.println("3. 20 / 4 + 3 = " + (20 / 4 + 3));
        System.out.println("   Step: (20 / 4) + 3 = 5 + 3 = 8");
        System.out.println();

        // 4. Arithmetic before comparison
        System.out.println("4. 5 + 3 > 7 = " + (5 + 3 > 7));
        System.out.println("   Step: (5 + 3) > 7 = 8 > 7 = true");
        System.out.println();

        // 5. Both comparisons evaluate first, then AND
        System.out.println("5. 5 > 3 && 10 < 20 = " + (5 > 3 && 10 < 20));
        System.out.println("   Step: (5 > 3) && (10 < 20) = true && true = true");
        System.out.println();

        // 6. AND before OR
        System.out.println("6. true || false && false = " + (true || false && false));
        System.out.println("   Step: true || (false && false) = true || false = true");
        System.out.println("   (NOT (true || false) && false = true && false = false)");
        System.out.println();

        // 7. Complex arithmetic: left to right for same precedence
        System.out.println("7. 10 - 5 * 2 + 3 = " + (10 - 5 * 2 + 3));
        System.out.println("   Step 1: 10 - (5 * 2) + 3 = 10 - 10 + 3");
        System.out.println("   Step 2: (10 - 10) + 3 = 0 + 3 = 3");
        System.out.println();

        // 8. Real-world complex expression
        int age = 25;
        boolean hasLicense = true;
        System.out.println("8. Real-world: Can drive if (age > 18 AND hasLicense) OR under 16");
        boolean canDrive = (age > 18 && hasLicense) || age < 16;
        System.out.println("   age = " + age + ", hasLicense = " + hasLicense);
        System.out.println("   (25 > 18 && true) || 25 < 16");
        System.out.println("   = (true && true) || false");
        System.out.println("   = true || false = " + canDrive);
        System.out.println();

        // 9. Why parentheses matter - ambiguous vs clear
        System.out.println("9. Ambiguous: age > 18 && hasLicense || age < 16");
        System.out.println("   (Does OR apply to whole thing? Or just the right side?)");
        System.out.println();
        System.out.println("   Clear interpretation 1: (age > 18 && hasLicense) || age < 16");
        System.out.println("   Result: " + ((age > 18 && hasLicense) || age < 16));
        System.out.println();
        System.out.println("   Clear interpretation 2: age > 18 && (hasLicense || age < 16)");
        System.out.println("   Result: " + (age > 18 && (hasLicense || age < 16)));
        System.out.println("   (Same result here, but shows why parentheses help!)");
        System.out.println();

        // 10. More complex precedence practice
        System.out.println("10. Challenging: 2 * 3 + 4 * 5 - 6 / 2");
        System.out.println("    Step 1: (2*3) + (4*5) - (6/2)");
        System.out.println("    Step 2: 6 + 20 - 3");
        System.out.println("    Step 3: (6 + 20) - 3 = 26 - 3 = " + (2 * 3 + 4 * 5 - 6 / 2));
        System.out.println();

        System.out.println("=== KEY PRECEDENCE ORDER ===");
        System.out.println("1. Parentheses ()");
        System.out.println("2. *, /, % (left to right)");
        System.out.println("3. +, - (left to right)");
        System.out.println("4. <, >, <=, >=");
        System.out.println("5. ==, !=");
        System.out.println("6. && (AND)");
        System.out.println("7. || (OR)");
    }
}
