public class VariablePatterns {
    public static void main(String[] args) {
        System.out.println("=== Variable Declaration and Initialization Patterns ===\n");
        
        // Pattern 1: Declare and initialize on the same line (most common)
        int age = 25;
        double salary = 50000.00;
        String name = "Alice";
        System.out.println("Pattern 1 - Declare and initialize together:");
        System.out.println("  age = " + age);
        System.out.println("  salary = " + salary);
        System.out.println("  name = " + name);
        System.out.println();
        
        // Pattern 2: Declare first, initialize later
        int count;
        count = 10;  // Initialize after declaration
        System.out.println("Pattern 2 - Declare then initialize:");
        System.out.println("  count = " + count);
        System.out.println();
        
        // Pattern 3: Declare multiple variables of the same type
        int x = 5, y = 10, z = 15;
        System.out.println("Pattern 3 - Multiple variables same type:");
        System.out.println("  x = " + x + ", y = " + y + ", z = " + z);
        System.out.println();
        
        // Pattern 4: Declare multiple, initialize some
        int a = 1, b, c = 3;
        b = 2;  // Initialize b after the declaration
        System.out.println("Pattern 4 - Mixed declare/initialize:");
        System.out.println("  a = " + a + ", b = " + b + ", c = " + c);
        System.out.println();
        
        // Pattern 5: Reassign a variable
        int number = 100;
        System.out.println("Pattern 5 - Reassignment:");
        System.out.println("  Before: number = " + number);
        number = 200;  // Change the value
        System.out.println("  After: number = " + number);
        System.out.println();
        
        // Pattern 6: Using variables in expressions
        int operand1 = 20;
        int operand2 = 30;
        int sum = operand1 + operand2;
        System.out.println("Pattern 6 - Variables in expressions:");
        System.out.println("  " + operand1 + " + " + operand2 + " = " + sum);
        System.out.println();
        
        // Pattern 7: Constants (values that should not change)
        final double PI = 3.14159;
        final int MAX_USERS = 100;
        System.out.println("Pattern 7 - Constants (using final):");
        System.out.println("  PI = " + PI);
        System.out.println("  MAX_USERS = " + MAX_USERS);
        // Uncommenting the line below would cause a compilation error:
        // MAX_USERS = 150;  // ERROR: cannot assign a value to final variable MAX_USERS
    }
}
