public class ForLoopDemo {

    // Example 1: Traditional for loop - basic counting
    public static void printNumbers(int n) {
        System.out.println("Numbers from 1 to " + n);
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Example 2: For loop with step (increment by more than 1)
    public static void printEvenNumbers(int n) {
        System.out.println("Even numbers from 2 to " + n);
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Example 3: Counting backwards
    public static void printCountdown(int n) {
        System.out.println("Countdown from " + n);
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Example 4: Nested loops - multiplication table
    public static void printMultiplicationTable(int size) {
        System.out.println("Multiplication Table (" + size + "x" + size + ")");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    // Example 5: Nested loops - triangle pattern
    public static void printTrianglePattern(int rows) {
        System.out.println("Triangle Pattern");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Example 6: For loop iterating over array
    public static void sumArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);
    }

    // Example 7: Multiple variables in for loop
    public static void twoIterators() {
        System.out.println("Two iterators:");
        for (int i = 0, j = 10; i < 5; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
    }

    // Example 8: Factorial calculation using for loop
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Example 9: String concatenation in loop
    public static String buildString(int times, String character) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += character;
        }
        return result;
    }

    // Example 10: For loop with break
    public static void findNumber(int[] array, int target) {
        System.out.println("Looking for " + target);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Found at index " + i);
                break; // Exit loop early
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("=== For Loop Examples ===\n");

        // Example 1
        System.out.println("Example 1: Basic counting");
        printNumbers(5);
        System.out.println();

        // Example 2
        System.out.println("Example 2: Step increment");
        printEvenNumbers(20);
        System.out.println();

        // Example 3
        System.out.println("Example 3: Countdown");
        printCountdown(5);
        System.out.println();

        // Example 4
        System.out.println("Example 4: Nested loops - Multiplication Table");
        printMultiplicationTable(5);
        System.out.println();

        // Example 5
        System.out.println("Example 5: Nested loops - Pattern");
        printTrianglePattern(4);
        System.out.println();

        // Example 6
        System.out.println("Example 6: Iterating array");
        int[] nums = { 10, 20, 30, 40 };
        sumArray(nums);
        System.out.println();

        // Example 7
        System.out.println("Example 7: Multiple variables");
        twoIterators();
        System.out.println();

        // Example 8
        System.out.println("Example 8: Factorial");
        System.out.println("5! = " + factorial(5));
        System.out.println("10! = " + factorial(10));
        System.out.println();

        // Example 9
        System.out.println("Example 9: String building");
        System.out.println(buildString(5, "*"));
        System.out.println(buildString(3, "="));
        System.out.println();

        // Example 10
        System.out.println("Example 10: Break in loop");
        int[] array = { 5, 12, 8, 15, 3 };
        findNumber(array, 15);
        findNumber(array, 20);
    }
}
