public class DoWhileLoopDemo {

    // Example 1: Simple do-while loop
    public static void printWithDoWhile(int n) {
        System.out.println("Numbers using do-while:");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);
        System.out.println();
    }

    // Example 2: Do-while executes at least once (key difference)
    public static void executeAtLeastOnce() {
        System.out.println("Do-while executes at least once:");
        int count = 0;
        do {
            System.out.println("This executes even though condition is false");
            count++;
        } while (count < 0);
    }

    // Example 3: Do-while for menu/input validation pattern
    public static void simulateUserMenu() {
        System.out.println("Menu pattern (simulated):");
        int choice = 0;
        int iteration = 0;
        do {
            System.out.println("1. Start  2. Exit");
            iteration++;
            choice = (iteration == 1) ? 1 : 2; // Simulate user choices
            System.out.println("User chose: " + choice);
        } while (choice != 2); // Continue until user chooses Exit
        System.out.println("Menu closed\n");
    }

    // Example 4: Comparing for vs while vs do-while with same condition
    public static void compareLoops() {
        System.out.println("Comparing loops (all print 1-3):\n");

        System.out.println("For loop:");
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("While loop:");
        int i = 1;
        while (i <= 3) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        System.out.println("Do-while loop:");
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 3);
        System.out.println();
    }

    // Example 5: Do-while with false condition (demonstrates at-least-once)
    public static void falseConditionComparison() {
        System.out.println("False condition comparison:\n");

        System.out.println("While loop (doesn't execute):");
        int i = 5;
        while (i < 0) {
            System.out.println("Never prints");
        }
        System.out.println("(Nothing printed)\n");

        System.out.println("Do-while loop (executes once):");
        i = 5;
        do {
            System.out.println("This prints even though condition is false");
        } while (i < 0);
    }

    // Example 6: Do-while with break
    public static void doWhileWithBreak() {
        System.out.println("Do-while with break:");
        int count = 0;
        do {
            count++;
            System.out.println("Count: " + count);
            if (count == 3) {
                System.out.println("Breaking out!");
                break;
            }
        } while (count < 10);
    }

    // Example 7: Do-while with continue
    public static void doWhileWithContinue() {
        System.out.println("Do-while with continue (skip evens):");
        int i = 1;
        do {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println();
    }

    // Example 8: Nested do-while loops
    public static void nestedDoWhile() {
        System.out.println("Nested do-while (3x3 grid):");
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print("(" + i + "," + j + ") ");
                j++;
            } while (j <= 3);
            System.out.println();
            i++;
        } while (i <= 3);
    }

    // Example 9: Practical use - input validation (simulated)
    public static void validateNumber(int input) {
        System.out.println("Validating number (simulated input: " + input + "):");
        int attempts = 0;
        int number;
        do {
            number = input; // In real program: Scanner.nextInt()
            attempts++;
            if (number < 0 || number > 100) {
                System.out.println("Invalid. Attempt " + attempts + " - Please enter 0-100");
                input = 50; // Simulate next attempt
            } else {
                System.out.println("Valid number: " + number);
            }
        } while ((number < 0 || number > 100) && attempts < 3);
    }

    // Example 10: Practical use - process at least once
    public static void processTransaction() {
        System.out.println("Process transaction (at least once):");
        int processCount = 0;
        do {
            processCount++;
            System.out.println("Processing transaction attempt " + processCount);
            // In real: try sending, if failed retry
        } while (processCount < 1); // Just shows it runs at least once
    }

    public static void main(String[] args) {
        System.out.println("=== Do-While Loop Examples ===\n");

        // Example 1
        System.out.println("Example 1: Simple do-while");
        printWithDoWhile(5);
        System.out.println();

        // Example 2
        System.out.println("Example 2: Executes at least once");
        executeAtLeastOnce();
        System.out.println();

        // Example 3
        System.out.println("Example 3: Menu pattern");
        simulateUserMenu();

        // Example 4
        System.out.println("Example 4: Comparing loops");
        compareLoops();
        System.out.println();

        // Example 5
        System.out.println("Example 5: False condition");
        falseConditionComparison();
        System.out.println();

        // Example 6
        System.out.println("Example 6: Do-while with break");
        doWhileWithBreak();
        System.out.println();

        // Example 7
        System.out.println("Example 7: Do-while with continue");
        doWhileWithContinue();
        System.out.println();

        // Example 8
        System.out.println("Example 8: Nested do-while");
        nestedDoWhile();
        System.out.println();

        // Example 9
        System.out.println("Example 9: Practical validation");
        validateNumber(50);
        System.out.println();

        // Example 10
        System.out.println("Example 10: Process at least once");
        processTransaction();
    }
}
