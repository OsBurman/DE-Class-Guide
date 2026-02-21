public class EnhancedForLoopDemo {

    // Example 1: Enhanced for loop with array of primitives
    public static void printArray(int[] numbers) {
        System.out.println("Array values:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Example 2: Enhanced for loop with array of Strings
    public static void printNames(String[] names) {
        System.out.println("Names:");
        for (String name : names) {
            System.out.println("  - " + name);
        }
    }

    // Example 3: Enhanced for loop with 2D array
    public static void print2DArray(int[][] matrix) {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    // Example 4: Summing array with enhanced for
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Example 5: Finding maximum with enhanced for
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Example 6: Enhanced for with ArrayList (Collections)
    public static void printList(java.util.ArrayList<String> list) {
        System.out.println("List contents:");
        for (String item : list) {
            System.out.println("  * " + item);
        }
    }

    // Example 7: Limitation - no index access in enhanced for
    public static void demonstrateIndexLimitation() {
        System.out.println("Limitation - no index with enhanced for:");
        String[] colors = { "Red", "Green", "Blue" };

        System.out.println("Can't access index directly:");
        for (String color : colors) {
            // System.out.println("Index: ?, Color: " + color); // Can't do this
            System.out.println("Color: " + color);
        }

        System.out.println("Need traditional for if you need index:");
        for (int i = 0; i < colors.length; i++) {
            System.out.println("Index: " + i + ", Color: " + colors[i]);
        }
    }

    // Example 8: Enhanced for with double array
    public static double averageArray(double[] values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return values.length > 0 ? sum / values.length : 0;
    }

    // Example 9: Enhanced for with boolean array
    public static int countTrue(boolean[] flags) {
        int count = 0;
        for (boolean flag : flags) {
            if (flag) {
                count++;
            }
        }
        return count;
    }

    // Example 10: Enhanced for with character array
    public static void printCharacters(char[] chars) {
        System.out.println("Characters:");
        for (char c : chars) {
            System.out.print(c);
        }
        System.out.println();
    }

    // Example 11: Nested enhanced for (2D array iteration)
    public static void processGrid(String[][] grid) {
        System.out.println("Processing 2D array:");
        int row = 0;
        for (String[] line : grid) {
            int col = 0;
            for (String cell : line) {
                System.out.println("Position [" + row + "][" + col + "]: " + cell);
                col++;
            }
            row++;
        }
    }

    // Example 12: Enhanced for with break (still works)
    public static void findAndStop(int[] array, int target) {
        System.out.println("Looking for " + target + ":");
        for (int num : array) {
            if (num == target) {
                System.out.println("Found: " + num);
                break;
            }
            System.out.println("Checking: " + num);
        }
    }

    // Example 13: When to use enhanced for vs traditional for
    public static void whenToUse() {
        System.out.println("When to use enhanced for:\n");
        System.out.println("USE Enhanced For when:");
        System.out.println("  - You don't need the index");
        System.out.println("  - Reading all elements");
        System.out.println("  - Iterating through collections");
        System.out.println("\nUSE Traditional For when:");
        System.out.println("  - You need the index");
        System.out.println("  - You need to modify array elements by index");
        System.out.println("  - You need to skip elements");
        System.out.println("  - You need to iterate backwards");
    }

    public static void main(String[] args) {
        System.out.println("=== Enhanced For Loop Examples ===\n");

        // Example 1
        System.out.println("Example 1: Array of primitives");
        int[] numbers = { 10, 20, 30, 40, 50 };
        printArray(numbers);
        System.out.println();

        // Example 2
        System.out.println("Example 2: Array of Strings");
        String[] names = { "Alice", "Bob", "Charlie", "Diana" };
        printNames(names);
        System.out.println();

        // Example 3
        System.out.println("Example 3: 2D Array");
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        print2DArray(matrix);
        System.out.println();

        // Example 4
        System.out.println("Example 4: Sum array");
        System.out.println("Sum: " + sumArray(numbers));
        System.out.println();

        // Example 5
        System.out.println("Example 5: Find max");
        System.out.println("Max: " + findMax(numbers));
        System.out.println();

        // Example 6
        System.out.println("Example 6: ArrayList iteration");
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        printList(list);
        System.out.println();

        // Example 7
        System.out.println("Example 7: Index limitation");
        demonstrateIndexLimitation();
        System.out.println();

        // Example 8
        System.out.println("Example 8: Average of array");
        double[] values = { 85.5, 90.0, 78.5, 92.0 };
        System.out.println("Average: " + averageArray(values));
        System.out.println();

        // Example 9
        System.out.println("Example 9: Count true values");
        boolean[] flags = { true, false, true, true, false };
        System.out.println("True count: " + countTrue(flags));
        System.out.println();

        // Example 10
        System.out.println("Example 10: Character array");
        char[] chars = { 'H', 'e', 'l', 'l', 'o' };
        printCharacters(chars);
        System.out.println();

        // Example 11
        System.out.println("Example 11: Process grid");
        String[][] grid = { { "A", "B" }, { "C", "D" } };
        processGrid(grid);
        System.out.println();

        // Example 12
        System.out.println("Example 12: Break in enhanced for");
        findAndStop(numbers, 30);
        System.out.println();

        // Example 13
        System.out.println("Example 13: When to use");
        whenToUse();
    }
}
