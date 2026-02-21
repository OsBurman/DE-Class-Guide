public class MultiplicationTable {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);

        // Validate size
        if (size < 1 || size > 12) {
            System.out.println("Invalid size");
            return;
        }

        System.out.println("Multiplication Table (" + size + "x" + size + "):");

        // Print header row
        System.out.print("     ");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // Nested loops for multiplication table
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i); // Row label
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
