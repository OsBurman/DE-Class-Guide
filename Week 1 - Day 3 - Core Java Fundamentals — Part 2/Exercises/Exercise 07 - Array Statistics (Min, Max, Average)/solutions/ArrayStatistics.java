public class ArrayStatistics {
    public static void main(String[] args) {
        // Validate input
        if (args.length == 0) {
            System.out.println("Please provide at least one number");
            return;
        }

        // Create array and parse integers
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        // Initialize min, max, sum
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        // Calculate min, max, sum
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
            sum += numbers[i];
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Print results
        System.out.println("Count: " + numbers.length);
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
