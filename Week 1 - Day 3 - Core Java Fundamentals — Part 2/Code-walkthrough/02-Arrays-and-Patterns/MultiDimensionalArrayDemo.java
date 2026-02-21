public class MultiDimensionalArrayDemo {

    // Example 1: 2D array declaration and initialization
    public static void twoDArrayBasics() {
        System.out.println("2D Array Basics:");

        // Size specified
        int[][] matrix1 = new int[3][3];
        System.out.println("Created 3x3 array (default values):");
        print2DArray(matrix1);

        // With initialization
        int[][] matrix2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Created with values:");
        print2DArray(matrix2);
    }

    // Example 2: Accessing 2D array elements
    public static void accessTwoDElements() {
        System.out.println("Accessing 2D Array Elements:");
        int[][] array = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };

        System.out.println("Element [0][0]: " + array[0][0]);
        System.out.println("Element [1][1]: " + array[1][1]);
        System.out.println("Element [2][2]: " + array[2][2]);
        System.out.println("Row count: " + array.length);
        System.out.println("Column count: " + array[0].length);
    }

    // Example 3: Jagged arrays (rows of different sizes)
    public static void jaggedArray() {
        System.out.println("Jagged Array (variable row sizes):");
        int[][] jagged = {
                { 1, 2, 3, 4 },
                { 5, 6, 7 },
                { 8, 9 },
                { 10, 11, 12, 13, 14 }
        };

        for (int i = 0; i < jagged.length; i++) {
            System.out.print("Row " + i + " (size " + jagged[i].length + "): ");
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Example 4: 2D array of Strings
    public static void twoDStringArray() {
        System.out.println("2D String Array:");
        String[][] grid = {
                { "Alice", "Bob", "Charlie" },
                { "Diana", "Eve", "Frank" },
                { "Grace", "Henry", "Iris" }
        };

        System.out.println("Classroom seating:");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Example 5: Modifying 2D array
    public static void modifyTwoD() {
        System.out.println("Modifying 2D Array:");
        int[][] array = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Original:");
        print2DArray(array);

        array[1][1] = 100;
        array[0][2] = 999;

        System.out.println("After modifications:");
        print2DArray(array);
    }

    // Example 6: 3D array
    public static void threeDArray() {
        System.out.println("3D Array (cube):");
        int[][][] cube = new int[2][2][2];

        // Fill the cube
        int value = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    cube[i][j][k] = value++;
                }
            }
        }

        System.out.println("Layer 0:");
        print2DArray(cube[0]);
        System.out.println("Layer 1:");
        print2DArray(cube[1]);
    }

    // Example 7: Sum all elements in 2D array
    public static int sum2DArray(int[][] array) {
        System.out.println("Sum of all elements:");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    // Example 8: Transpose matrix (swap rows and columns)
    public static int[][] transposeMatrix(int[][] matrix) {
        System.out.println("Transpose Matrix:");
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    // Example 9: Diagonal elements
    public static void diagonalElements(int[][] square) {
        System.out.println("Diagonal elements:");
        System.out.print("Main diagonal: ");
        for (int i = 0; i < square.length; i++) {
            System.out.print(square[i][i] + " ");
        }
        System.out.println();
    }

    // Example 10: 2D array as matrix operations
    public static int[][] addMatrices(int[][] a, int[][] b) {
        System.out.println("Adding two matrices:");
        int[][] result = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }

    // Helper method to print 2D array
    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Helper method to print 2D String array
    public static void print2DStringArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Multidimensional Array Examples ===\n");

        // Example 1
        twoDArrayBasics();
        System.out.println();

        // Example 2
        accessTwoDElements();
        System.out.println();

        // Example 3
        jaggedArray();
        System.out.println();

        // Example 4
        twoDStringArray();
        System.out.println();

        // Example 5
        modifyTwoD();
        System.out.println();

        // Example 6
        threeDArray();
        System.out.println();

        // Example 7
        int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Array: ");
        print2DArray(nums);
        System.out.println("Sum: " + sum2DArray(nums));
        System.out.println();

        // Example 8
        System.out.println("Original matrix:");
        print2DArray(nums);
        System.out.println("Transposed:");
        int[][] transposed = transposeMatrix(nums);
        print2DArray(transposed);
        System.out.println();

        // Example 9
        diagonalElements(nums);
        System.out.println();

        // Example 10
        int[][] matrix1 = { { 1, 2 }, { 3, 4 } };
        int[][] matrix2 = { { 5, 6 }, { 7, 8 } };
        System.out.println("Matrix 1:");
        print2DArray(matrix1);
        System.out.println("Matrix 2:");
        print2DArray(matrix2);
        int[][] sum = addMatrices(matrix1, matrix2);
        System.out.println("Sum:");
        print2DArray(sum);
    }
}
