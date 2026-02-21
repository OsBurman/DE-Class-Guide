public class ArrayStatistics {
    public static void main(String[] args) {
        // TODO: Validate that at least one argument provided
        if (args.length == 0) {
            System.out.println("Please provide at least one number");
            return;
        }

        // TODO: Create array and parse integers from args
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        // TODO: Initialize min, max, sum
        int min = 0; // REPLACE THIS
        int max = 0; // REPLACE THIS
        int sum = 0; // REPLACE THIS

        // TODO: Loop through array to calculate min, max, sum
        // Hint: initialize min and max to first element

        // TODO: Calculate average as double
        double average = 0; // REPLACE THIS

        // TODO: Print results with proper formatting
        // Print count, sum, average (2 decimals), min, max
    }
}
