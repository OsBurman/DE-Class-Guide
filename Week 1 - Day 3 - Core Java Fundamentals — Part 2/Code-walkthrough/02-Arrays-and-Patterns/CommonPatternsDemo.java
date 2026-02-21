public class CommonPatternsDemo {

    // Example 1: Count pattern (count occurrences)
    public static int countOccurrences(int[] array, int target) {
        System.out.println("Count Pattern - counting " + target);
        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    // Example 2: Accumulator pattern (sum, product)
    public static int accumulatorSum(int[] array) {
        System.out.println("Accumulator Pattern - summing");
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Example 3: Max/Min pattern
    public static int findMax(int[] array) {
        System.out.println("Max Pattern");
        if (array.length == 0)
            return Integer.MIN_VALUE;

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Example 4: Search pattern (find index)
    public static int searchPattern(int[] array, int target) {
        System.out.println("Search Pattern - finding " + target);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Example 5: Two-pointer pattern (from both ends)
    public static boolean isMirror(int[] array) {
        System.out.println("Two-Pointer Pattern - check mirror/palindrome");
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Example 6: Filter pattern (create new filtered array)
    public static int[] filterEven(int[] array) {
        System.out.println("Filter Pattern - getting even numbers");

        // Count evens first
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }

        // Create filtered array
        int[] result = new int[count];
        int index = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }
        return result;
    }

    // Example 7: Transform pattern (modify array)
    public static int[] doubleEachElement(int[] array) {
        System.out.println("Transform Pattern - doubling values");
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * 2;
        }
        return result;
    }

    // Example 8: Sliding window pattern (moving subarray)
    public static int[] slidingWindowSum(int[] array, int windowSize) {
        System.out.println("Sliding Window Pattern - sum of windows (size " + windowSize + ")");
        int[] result = new int[array.length - windowSize + 1];

        // Calculate first window
        int windowSum = 0;
        for (int i = 0; i < windowSize; i++) {
            windowSum += array[i];
        }
        result[0] = windowSum;

        // Slide the window
        for (int i = 1; i < result.length; i++) {
            windowSum = windowSum - array[i - 1] + array[i + windowSize - 1];
            result[i] = windowSum;
        }
        return result;
    }

    // Example 9: Prefix sum pattern
    public static int[] prefixSum(int[] array) {
        System.out.println("Prefix Sum Pattern");
        int[] prefix = new int[array.length];
        prefix[0] = array[0];

        for (int i = 1; i < array.length; i++) {
            prefix[i] = prefix[i - 1] + array[i];
        }
        return prefix;
    }

    // Example 10: Rearrange pattern (move elements)
    public static void moveNegativesToFront(int[] array) {
        System.out.println("Rearrange Pattern - negatives to front");
        int swapIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                int temp = array[i];
                array[i] = array[swapIndex];
                array[swapIndex] = temp;
                swapIndex++;
            }
        }
    }

    // Example 11: Frequency count pattern
    public static void frequencyCount(String[] array) {
        System.out.println("Frequency Count Pattern");
        java.util.Map<String, Integer> freq = new java.util.HashMap<>();

        for (String item : array) {
            freq.put(item, freq.getOrDefault(item, 0) + 1);
        }

        System.out.println("Frequencies: " + freq);
    }

    // Example 12: Find duplicates pattern
    public static boolean hasDuplicates(int[] array) {
        System.out.println("Duplicates Pattern");
        java.util.Set<Integer> seen = new java.util.HashSet<>();

        for (int num : array) {
            if (seen.contains(num)) {
                System.out.println("Found duplicate: " + num);
                return true;
            }
            seen.add(num);
        }
        System.out.println("No duplicates");
        return false;
    }

    // Helper: print array
    static void printArray(int[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }

    static void printArray(String[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }

    public static void main(String[] args) {
        System.out.println("=== Common Array Patterns ===\n");

        // Example 1
        System.out.println("Example 1: Count Pattern");
        int[] arr1 = { 1, 2, 3, 2, 4, 2, 5 };
        System.out.println("Array: " + java.util.Arrays.toString(arr1));
        System.out.println("Count of 2: " + countOccurrences(arr1, 2));
        System.out.println();

        // Example 2
        System.out.println("Example 2: Accumulator Pattern");
        int[] arr2 = { 10, 20, 30, 40 };
        System.out.println("Array: " + java.util.Arrays.toString(arr2));
        System.out.println("Sum: " + accumulatorSum(arr2));
        System.out.println();

        // Example 3
        System.out.println("Example 3: Max Pattern");
        int[] arr3 = { 45, 23, 89, 12, 56 };
        System.out.println("Array: " + java.util.Arrays.toString(arr3));
        System.out.println("Max: " + findMax(arr3));
        System.out.println();

        // Example 4
        System.out.println("Example 4: Search Pattern");
        int[] arr4 = { 5, 10, 15, 20, 25 };
        System.out.println("Array: " + java.util.Arrays.toString(arr4));
        System.out.println("Index of 15: " + searchPattern(arr4, 15));
        System.out.println();

        // Example 5
        System.out.println("Example 5: Two-Pointer Pattern");
        int[] arr5 = { 1, 2, 3, 2, 1 };
        System.out.println("Array: " + java.util.Arrays.toString(arr5));
        System.out.println("Is mirror: " + isMirror(arr5));
        System.out.println();

        // Example 6
        System.out.println("Example 6: Filter Pattern");
        int[] arr6 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("Array: " + java.util.Arrays.toString(arr6));
        printArray(filterEven(arr6));
        System.out.println();

        // Example 7
        System.out.println("Example 7: Transform Pattern");
        int[] arr7 = { 1, 2, 3, 4, 5 };
        System.out.println("Array: " + java.util.Arrays.toString(arr7));
        printArray(doubleEachElement(arr7));
        System.out.println();

        // Example 8
        System.out.println("Example 8: Sliding Window Pattern");
        int[] arr8 = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Array: " + java.util.Arrays.toString(arr8));
        printArray(slidingWindowSum(arr8, 3));
        System.out.println();

        // Example 9
        System.out.println("Example 9: Prefix Sum Pattern");
        int[] arr9 = { 1, 2, 3, 4, 5 };
        System.out.println("Array: " + java.util.Arrays.toString(arr9));
        printArray(prefixSum(arr9));
        System.out.println();

        // Example 10
        System.out.println("Example 10: Rearrange Pattern");
        int[] arr10 = { 3, -2, 5, -1, 4, -3 };
        System.out.println("Array: " + java.util.Arrays.toString(arr10));
        moveNegativesToFront(arr10);
        System.out.println("After rearrange: " + java.util.Arrays.toString(arr10));
        System.out.println();

        // Example 11
        System.out.println("Example 11: Frequency Count");
        String[] arr11 = { "apple", "banana", "apple", "cherry", "banana", "apple" };
        System.out.println("Array: " + java.util.Arrays.toString(arr11));
        frequencyCount(arr11);
        System.out.println();

        // Example 12
        System.out.println("Example 12: Duplicates Pattern");
        int[] arr12 = { 1, 2, 3, 4, 5 };
        System.out.println("Array: " + java.util.Arrays.toString(arr12));
        hasDuplicates(arr12);
        int[] arr12b = { 1, 2, 3, 2, 5 };
        System.out.println("Array: " + java.util.Arrays.toString(arr12b));
        hasDuplicates(arr12b);
    }
}
