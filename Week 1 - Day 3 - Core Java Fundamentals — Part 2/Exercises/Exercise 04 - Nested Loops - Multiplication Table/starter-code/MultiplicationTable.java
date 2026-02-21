public class MultiplicationTable {
    public static void main(String[] args) {
        // TODO: Parse table size from command line
        int size = 0; // REPLACE THIS

        // TODO: Validate that size is between 1 and 12
        // TODO: If invalid, print "Invalid size" and exit

        System.out.println("Multiplication Table (" + size + "x" + size + "):");

        // TODO: Print header row (numbers 1 to size)
        System.out.print("     "); // Spacing for row labels
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // TODO: Use nested for loops
        // TODO: Outer loop: rows (i from 1 to size)
        // TODO: Inner loop: columns (j from 1 to size)
        // TODO: Print row number at start, then multiply i * j
        // TODO: Use printf to format: System.out.printf("%4d", i * j);
        // TODO: println() after each row
    }
}
