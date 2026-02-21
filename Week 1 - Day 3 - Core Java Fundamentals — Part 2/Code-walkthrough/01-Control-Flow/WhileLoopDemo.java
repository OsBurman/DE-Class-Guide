public class WhileLoopDemo {

    // Example 1: Simple while loop
    public static void printNumbersWhile(int n) {
        System.out.println("Numbers using while loop:");
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    // Example 2: While loop with condition (user input simulation)
    public static void validateInput(int attempts) {
        System.out.println("Validating with attempts: " + attempts);
        int count = 0;
        while (count < attempts && count < 3) {
            count++;
            System.out.println("Attempt " + count);
        }
        System.out.println("Validation complete\n");
    }

    // Example 3: While loop for summing (similar to accumulator pattern)
    public static int sumNumbers(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }

    // Example 4: While loop - process until condition (event-driven)
    public static void generateRandomNumbers() {
        System.out.println("Generating random numbers until > 90:");
        int random;
        int count = 0;
        do {
            random = (int) (Math.random() * 100) + 1;
            System.out.println("Generated: " + random);
            count++;
        } while (random <= 90 && count < 20); // safety limit
        System.out.println();
    }

    // Example 5: While loop - processing array
    public static void processArray(int[] array) {
        System.out.println("Processing array with while loop:");
        int index = 0;
        while (index < array.length) {
            System.out.print(array[index] + " ");
            index++;
        }
        System.out.println();
    }

    // Example 6: While loop with break (early exit)
    public static void searchInArray(int[] array, int target) {
        System.out.println("Searching for " + target + " in array");
        int index = 0;
        boolean found = false;
        while (index < array.length) {
            if (array[index] == target) {
                System.out.println("Found at index: " + index);
                found = true;
                break;
            }
            index++;
        }
        if (!found) {
            System.out.println("Not found in array");
        }
    }

    // Example 7: While loop with continue (skip iterations)
    public static void printOddNumbers(int n) {
        System.out.println("Odd numbers from 1 to " + n);
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                i++;
                continue; // Skip even numbers
            }
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    // Example 8: Nested while loops
    public static void printGrid(int rows, int cols) {
        System.out.println("Grid with while loops:");
        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < cols) {
                System.out.print("# ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    // Example 9: While loop - digit sum
    public static int sumDigits(int number) {
        System.out.println("Summing digits of " + number);
        int sum = 0;
        int num = Math.abs(number);
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Example 10: While loop with complex condition
    public static void complexCondition() {
        System.out.println("Complex while condition:");
        int x = 5;
        int count = 0;
        while (x > 0 && count < 5) {
            System.out.println("x = " + x + ", count = " + count);
            x--;
            count++;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== While Loop Examples ===\n");

        // Example 1
        System.out.println("Example 1: Simple while loop");
        printNumbersWhile(5);
        System.out.println();

        // Example 2
        System.out.println("Example 2: While with condition");
        validateInput(5);

        // Example 3
        System.out.println("Example 3: Summing with while");
        System.out.println("Sum of 1 to 10: " + sumNumbers(10));
        System.out.println();

        // Example 4
        System.out.println("Example 4: Process until condition");
        generateRandomNumbers();

        // Example 5
        System.out.println("Example 5: Processing array");
        int[] array = { 5, 10, 15, 20 };
        processArray(array);
        System.out.println();

        // Example 6
        System.out.println("Example 6: Search with break");
        searchInArray(array, 15);
        searchInArray(array, 25);
        System.out.println();

        // Example 7
        System.out.println("Example 7: Skip with continue");
        printOddNumbers(10);
        System.out.println();

        // Example 8
        System.out.println("Example 8: Nested while loops");
        printGrid(3, 4);
        System.out.println();

        // Example 9
        System.out.println("Example 9: Digit sum");
        System.out.println("Sum of digits in 12345: " + sumDigits(12345));
        System.out.println();

        // Example 10
        System.out.println("Example 10: Complex condition");
        complexCondition();
    }
}
