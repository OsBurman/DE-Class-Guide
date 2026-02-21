public class BreakContinueDemo {

    // Example 1: Break - exit loop early
    public static void printUntilFound(int[] array, int target) {
        System.out.println("Breaking when found: " + target);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] == target) {
                System.out.println("<-- Found!");
                break; // Exit the loop
            }
        }
        System.out.println();
    }

    // Example 2: Continue - skip to next iteration
    public static void skipEvenNumbers(int n) {
        System.out.println("Skip even numbers:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue; // Skip the rest of this iteration
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Example 3: Break in nested loops (breaks inner loop only)
    public static void breakInNestedLoop() {
        System.out.println("Break in nested loops:");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    System.out.print("[BREAK]");
                    break; // Only breaks inner loop
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Example 4: Continue in nested loops (continues inner loop only)
    public static void continueInNestedLoop() {
        System.out.println("Continue in nested loops:");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    System.out.print("[SKIP] ");
                    continue; // Skip this j, go to next j
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Example 5: Break with label (break outer loop from inner)
    public static void breakWithLabel() {
        System.out.println("Break with label (exit outer loop):");
        outerLoop: for (int i = 1; i <= 3; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 1; j <= 5; j++) {
                if (i == 2 && j == 3) {
                    System.out.println("[BREAK OUTER]");
                    break outerLoop; // Break the outer loop
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("After loop\n");
    }

    // Example 6: Continue with label (skip to next iteration of outer loop)
    public static void continueWithLabel() {
        System.out.println("Continue with label (skip outer iteration):");
        outerLoop: for (int i = 1; i <= 3; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 1; j <= 5; j++) {
                if (i == 2 && j == 3) {
                    System.out.println("[CONTINUE OUTER]");
                    continue outerLoop; // Skip to next i
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Example 7: Break in while loop
    public static void breakInWhile() {
        System.out.println("Break in while loop:");
        int count = 0;
        while (true) { // Infinite loop, broken by break
            count++;
            System.out.print(count + " ");
            if (count == 5) {
                System.out.println("- Breaking!");
                break;
            }
        }
        System.out.println();
    }

    // Example 8: Continue in while loop
    public static void continueInWhile(int n) {
        System.out.println("Continue in while (skip multiples of 3):");
        int i = 1;
        while (i <= n) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    // Example 9: Practical use - search with early exit
    public static void findValue(int[] array, int target) {
        System.out.println("Searching for " + target);
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
        System.out.println();
    }

    // Example 10: Practical use - skip invalid data
    public static void processValidData(int[] data) {
        System.out.println("Processing valid data (skip negative):");
        int sum = 0;
        int count = 0;
        for (int value : data) {
            if (value < 0) {
                System.out.print("[-] ");
                continue; // Skip negative
            }
            System.out.print("[" + value + "] ");
            sum += value;
            count++;
        }
        System.out.println();
        if (count > 0) {
            System.out.println("Average: " + (sum / count));
        }
        System.out.println();
    }

    // Example 11: Do-while with break
    public static void doWhileBreak(int limit) {
        System.out.println("Do-while with break:");
        int i = 1;
        do {
            System.out.print(i + " ");
            if (i == limit) {
                System.out.println("- Reached limit!");
                break;
            }
            i++;
        } while (i <= 10);
        System.out.println();
    }

    // Example 12: Switch with break (always needed)
    public static void switchExample(int choice) {
        System.out.println("Switch requires break:");
        switch (choice) {
            case 1:
                System.out.println("Option 1");
                break; // Without this, falls through
            case 2:
                System.out.println("Option 2");
                break;
            default:
                System.out.println("Other");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Break and Continue Examples ===\n");

        // Example 1
        System.out.println("Example 1: Break - exit loop");
        int[] array = { 5, 10, 15, 20, 25 };
        printUntilFound(array, 15);
        System.out.println();

        // Example 2
        System.out.println("Example 2: Continue - skip iteration");
        skipEvenNumbers(10);
        System.out.println();

        // Example 3
        System.out.println("Example 3: Break in nested (breaks inner only)");
        breakInNestedLoop();
        System.out.println();

        // Example 4
        System.out.println("Example 4: Continue in nested (continues inner only)");
        continueInNestedLoop();
        System.out.println();

        // Example 5
        System.out.println("Example 5: Break with label");
        breakWithLabel();

        // Example 6
        System.out.println("Example 6: Continue with label");
        continueWithLabel();

        // Example 7
        System.out.println("Example 7: Break in while");
        breakInWhile();
        System.out.println();

        // Example 8
        System.out.println("Example 8: Continue in while");
        continueInWhile(10);
        System.out.println();

        // Example 9
        System.out.println("Example 9: Practical - search");
        findValue(array, 15);

        // Example 10
        System.out.println("Example 10: Practical - skip invalid");
        int[] data = { 5, -3, 8, -1, 10, 2 };
        processValidData(data);

        // Example 11
        System.out.println("Example 11: Do-while with break");
        doWhileBreak(3);
        System.out.println();

        // Example 12
        System.out.println("Example 12: Switch always needs break");
        switchExample(1);
        switchExample(2);
    }
}
