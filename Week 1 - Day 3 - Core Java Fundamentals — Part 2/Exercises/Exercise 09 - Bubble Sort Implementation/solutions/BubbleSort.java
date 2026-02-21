import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Validate input
        if (args.length == 0) {
            System.out.println("Please provide at least one number");
            return;
        }

        // Create and parse array
        int[] array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        // Print original array
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("\nSorting...");

        // Bubble sort algorithm
        for (int i = 0; i < array.length - 1; i++) {
            // Inner loop for each pass
            for (int j = 0; j < array.length - i - 1; j++) {
                // Compare adjacent elements
                if (array[j] > array[j + 1]) {
                    // Swap if in wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            // Print progress after each pass
            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(array));
        }

        // Print final sorted array
        System.out.println("\nSorted array: " + Arrays.toString(array));
    }
}
