import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // TODO: Validate at least one number provided
        if (args.length == 0) {
            System.out.println("Please provide at least one number");
            return;
        }

        // TODO: Create array and parse integers
        int[] array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        // TODO: Print original array
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("\nSorting...");

        // TODO: Implement bubble sort with nested loops
        // TODO: Outer loop: passes (i from 0 to array.length - 2)
        // TODO: Inner loop: comparisons (j from 0 to array.length - i - 2)
        // TODO: If array[j] > array[j+1], swap them
        // TODO: After each pass, print current state

        // TODO: Print final sorted array
        System.out.println("\nSorted array: " + Arrays.toString(array));
    }
}
