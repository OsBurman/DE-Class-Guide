public class SearchAndSortDemo {

    // Example 1: Linear search
    public static int linearSearch(int[] array, int target) {
        System.out.println("Linear Search for " + target);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Check index " + i + ": " + array[i] + " ");
            if (array[i] == target) {
                System.out.println("-> FOUND!");
                return i;
            } else {
                System.out.println("-> not match");
            }
        }
        System.out.println("-> NOT FOUND");
        return -1;
    }

    // Example 2: Binary search (requires sorted array)
    public static int binarySearch(int[] array, int target) {
        System.out.println("Binary Search for " + target + " (array must be sorted)");
        int left = 0;
        int right = array.length - 1;
        int iterations = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("Iteration " + (++iterations) + ": left=" + left + ", mid=" + mid + ", right=" + right
                    + ", mid value=" + array[mid]);

            if (array[mid] == target) {
                System.out.println("FOUND at index " + mid);
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("NOT FOUND");
        return -1;
    }

    // Example 3: Bubble sort
    public static void bubbleSort(int[] array) {
        System.out.println("Bubble Sort:");
        System.out.println("Original: " + java.util.Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("Pass " + (i + 1) + ":");
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    System.out.print("  Swap " + array[j + 1] + " and " + array[j] + " -> ");
                    System.out.println(java.util.Arrays.toString(array));
                }
            }
        }
        System.out.println("Sorted: " + java.util.Arrays.toString(array));
    }

    // Example 4: Selection sort
    public static void selectionSort(int[] array) {
        System.out.println("Selection Sort:");
        System.out.println("Original: " + java.util.Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
                System.out.print("  Swap index " + i + " and " + minIndex + " -> ");
                System.out.println(java.util.Arrays.toString(array));
            }
        }
        System.out.println("Sorted: " + java.util.Arrays.toString(array));
    }

    // Example 5: Insertion sort
    public static void insertionSort(int[] array) {
        System.out.println("Insertion Sort:");
        System.out.println("Original: " + java.util.Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            System.out.print("Inserting " + key + " -> ");

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
            System.out.println(java.util.Arrays.toString(array));
        }
        System.out.println("Sorted: " + java.util.Arrays.toString(array));
    }

    // Example 6: Using built-in sort
    public static void builtInSort() {
        System.out.println("Built-in Sort (Arrays.sort):");
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Original: " + java.util.Arrays.toString(array));
        java.util.Arrays.sort(array);
        System.out.println("Sorted: " + java.util.Arrays.toString(array));
    }

    // Example 7: Sorting in reverse order
    public static void sortReverse() {
        System.out.println("Sorting in Reverse:");
        Integer[] array = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Original: " + java.util.Arrays.toString(array));
        java.util.Arrays.sort(array, java.util.Collections.reverseOrder());
        System.out.println("Reversed: " + java.util.Arrays.toString(array));
    }

    // Example 8: Searching in sorted array
    public static void searchInSortedArray() {
        System.out.println("Search in Sorted Array:");
        int[] array = { 11, 12, 22, 25, 34, 64, 90 };
        System.out.println("Array: " + java.util.Arrays.toString(array));

        System.out.println("Using Arrays.binarySearch:");
        int result = java.util.Arrays.binarySearch(array, 25);
        System.out.println("Index of 25: " + result);

        result = java.util.Arrays.binarySearch(array, 50);
        System.out.println("Index of 50: " + result + " (negative means not found)");
    }

    // Example 9: Sorting Strings
    public static void sortStrings() {
        System.out.println("Sorting Strings:");
        String[] names = { "Charlie", "Alice", "Eve", "Bob", "Diana" };
        System.out.println("Original: " + java.util.Arrays.toString(names));
        java.util.Arrays.sort(names);
        System.out.println("Sorted: " + java.util.Arrays.toString(names));
    }

    // Example 10: Partial sort / range sort
    public static void partialSort() {
        System.out.println("Partial Sort (specific range):");
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Original: " + java.util.Arrays.toString(array));

        System.out.println("Sort indices 2-5:");
        java.util.Arrays.sort(array, 2, 6); // end index is exclusive
        System.out.println("Result: " + java.util.Arrays.toString(array));
    }

    public static void main(String[] args) {
        System.out.println("=== Search and Sort Examples ===\n");

        // Example 1
        System.out.println("Example 1: Linear Search");
        int[] array1 = { 5, 2, 8, 1, 9 };
        linearSearch(array1, 8);
        linearSearch(array1, 10);
        System.out.println();

        // Example 2
        System.out.println("Example 2: Binary Search");
        int[] array2 = { 1, 3, 5, 7, 9, 11, 13, 15 };
        binarySearch(array2, 7);
        binarySearch(array2, 6);
        System.out.println();

        // Example 3
        System.out.println("Example 3: Bubble Sort");
        int[] array3 = { 64, 34, 25, 12, 22 };
        bubbleSort(array3.clone());
        System.out.println();

        // Example 4
        System.out.println("Example 4: Selection Sort");
        int[] array4 = { 64, 34, 25, 12, 22 };
        selectionSort(array4.clone());
        System.out.println();

        // Example 5
        System.out.println("Example 5: Insertion Sort");
        int[] array5 = { 64, 34, 25, 12, 22 };
        insertionSort(array5.clone());
        System.out.println();

        // Example 6
        System.out.println("Example 6: Built-in Sort");
        builtInSort();
        System.out.println();

        // Example 7
        System.out.println("Example 7: Sort Reverse");
        sortReverse();
        System.out.println();

        // Example 8
        System.out.println("Example 8: Binary Search Built-in");
        searchInSortedArray();
        System.out.println();

        // Example 9
        System.out.println("Example 9: Sort Strings");
        sortStrings();
        System.out.println();

        // Example 10
        System.out.println("Example 10: Partial Sort");
        partialSort();
    }
}
