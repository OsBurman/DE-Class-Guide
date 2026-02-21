public class PyramidPrinter {
    public static void main(String[] args) {
        int height = Integer.parseInt(args[0]);

        // Validate height
        if (height < 1 || height > 20) {
            System.out.println("Invalid height. Must be between 1 and 20.");
            return;
        }

        // Print pyramid
        for (int row = 1; row <= height; row++) {
            // Print spaces for alignment
            for (int space = 0; space < height - row; space++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int asterisk = 0; asterisk < row; asterisk++) {
                System.out.print("*");
            }

            // New line after each row
            System.out.println();
        }
    }
}
