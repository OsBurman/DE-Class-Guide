public class LinearSearch {
    public static void main(String[] args) {
        // Validate input
        if (args.length < 2) {
            System.out.println("Usage: java LinearSearch target number1 number2...");
            return;
        }

        // Parse target
        int target = Integer.parseInt(args[0]);

        // Create array from remaining arguments
        int[] array = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            array[i - 1] = Integer.parseInt(args[i]);
        }

        // Perform linear search
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i;
                break;
            }
        }

        // Print results
        System.out.println("Searching for: " + target);
        if (index != -1) {
            System.out.println("Found at index: " + index);
            System.out.println("Position: " + (index + 1) + " (1-based)");
        } else {
            System.out.println("Not found");
        }
    }
}
