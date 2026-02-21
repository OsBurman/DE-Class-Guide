public class ArrayBasicsDemo {

    // Example 1: Declaring and initializing arrays
    public static void declarationExamples() {
        System.out.println("Array Declaration Examples:");

        // Size specified
        int[] numbers1 = new int[5];
        System.out.println("Created int array of size 5: " + java.util.Arrays.toString(numbers1));

        // With initialization
        int[] numbers2 = { 10, 20, 30, 40, 50 };
        System.out.println("Created with values: " + java.util.Arrays.toString(numbers2));

        // Strings
        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        System.out.println("String array: " + java.util.Arrays.toString(names));

        // Double
        double[] prices = { 9.99, 19.99, 29.99 };
        System.out.println("Double array: " + java.util.Arrays.toString(prices));
    }

    // Example 2: Accessing array elements
    public static void accessElements() {
        System.out.println("\nAccessing Array Elements:");
        int[] array = { 100, 200, 300, 400, 500 };

        System.out.println("First element: " + array[0]);
        System.out.println("Last element: " + array[array.length - 1]);
        System.out.println("Middle element: " + array[array.length / 2]);
    }

    // Example 3: Array length property
    public static void arrayLength(int[] array) {
        System.out.println("\nArray Length:");
        System.out.println("Array: " + java.util.Arrays.toString(array));
        System.out.println("Length: " + array.length);
    }

    // Example 4: Modifying array elements
    public static void modifyElements() {
        System.out.println("\nModifying Array Elements:");
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println("Original: " + java.util.Arrays.toString(array));

        array[0] = 100;
        array[2] = 300;
        System.out.println("Modified: " + java.util.Arrays.toString(array));
    }

    // Example 5: Default values in arrays
    public static void defaultValues() {
        System.out.println("\nDefault Values in Arrays:");

        int[] intArray = new int[3];
        System.out.println("int array (default 0): " + java.util.Arrays.toString(intArray));

        double[] doubleArray = new double[3];
        System.out.println("double array (default 0.0): " + java.util.Arrays.toString(doubleArray));

        boolean[] boolArray = new boolean[3];
        System.out.println("boolean array (default false): " + java.util.Arrays.toString(boolArray));

        String[] stringArray = new String[3];
        System.out.println("String array (default null): " + java.util.Arrays.toString(stringArray));
    }

    // Example 6: Looping through array
    public static void loopArray() {
        System.out.println("\nLooping Through Array:");
        int[] array = { 10, 20, 30, 40, 50 };

        System.out.print("For loop: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Enhanced for: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Example 7: Copying arrays
    public static void copyArrays() {
        System.out.println("\nCopying Arrays:");
        int[] original = { 1, 2, 3, 4, 5 };
        System.out.println("Original: " + java.util.Arrays.toString(original));

        // Method 1: Manual copy
        int[] copy1 = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy1[i] = original[i];
        }
        System.out.println("Manual copy: " + java.util.Arrays.toString(copy1));

        // Method 2: System.arraycopy
        int[] copy2 = new int[original.length];
        System.arraycopy(original, 0, copy2, 0, original.length);
        System.out.println("System.arraycopy: " + java.util.Arrays.toString(copy2));

        // Method 3: Arrays.copyOf
        int[] copy3 = java.util.Arrays.copyOf(original, original.length);
        System.out.println("Arrays.copyOf: " + java.util.Arrays.toString(copy3));
    }

    // Example 8: Finding min/max
    public static void findMinMax(int[] array) {
        System.out.println("\nFinding Min/Max:");
        System.out.println("Array: " + java.util.Arrays.toString(array));

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    // Example 9: Calculating sum and average
    public static void sumAndAverage(int[] array) {
        System.out.println("\nSum and Average:");
        System.out.println("Array: " + java.util.Arrays.toString(array));

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    // Example 10: Comparing arrays
    public static void compareArrays() {
        System.out.println("\nComparing Arrays:");
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        int[] arr3 = { 1, 2, 3 };
        int[] arr4 = { 1, 2, 4 };

        System.out.println("arr1: " + java.util.Arrays.toString(arr1));
        System.out.println("arr2: " + java.util.Arrays.toString(arr2));
        System.out.println("arr3: " + java.util.Arrays.toString(arr3));
        System.out.println("arr4: " + java.util.Arrays.toString(arr4));

        System.out.println("arr1 == arr2 (reference): " + (arr1 == arr2)); // false
        System.out.println("Arrays.equals(arr1, arr2): " + java.util.Arrays.equals(arr1, arr2)); // true
        System.out.println("Arrays.equals(arr1, arr4): " + java.util.Arrays.equals(arr1, arr4)); // false
    }

    public static void main(String[] args) {
        System.out.println("=== Array Basics Examples ===\n");

        // Example 1
        declarationExamples();

        // Example 2
        accessElements();

        // Example 3
        int[] testArray = { 5, 10, 15, 20 };
        arrayLength(testArray);

        // Example 4
        modifyElements();

        // Example 5
        defaultValues();

        // Example 6
        loopArray();

        // Example 7
        copyArrays();

        // Example 8
        int[] nums = { 45, 23, 89, 12, 56 };
        findMinMax(nums);

        // Example 9
        sumAndAverage(nums);

        // Example 10
        compareArrays();
    }
}
