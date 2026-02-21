/**
 * Exercise 04: Method Overloading
 * 
 * TODO: Create overloaded add() and multiply() methods
 */
public class Calculator {

    // TODO: Create add(int a, int b) - returns sum of two ints

    // TODO: Create add(double a, double b) - returns sum of two doubles

    // TODO: Create add(int a, int b, int c) - returns sum of three ints

    // TODO: Create multiply(int a, int b) - returns product of two ints

    // TODO: Create multiply(double a, double b) - returns product of two doubles

    // TODO: Create multiply(int a, double b) - returns product of int and double

    public static void main(String[] args) {
        // TODO: Test addition methods
        System.out.println("--- Addition ---");
        System.out.println("add(5, 10) = " + add(5, 10));
        System.out.println("add(3.5, 2.5) = " + add(3.5, 2.5));
        System.out.println("add(10, 20, 30) = " + add(10, 20, 30));

        System.out.println();

        // TODO: Test multiplication methods
        System.out.println("--- Multiplication ---");
        System.out.println("multiply(4, 7) = " + multiply(4, 7));
        System.out.println("multiply(2.5, 4.0) = " + multiply(2.5, 4.0));
        System.out.println("multiply(5, 3.5) = " + multiply(5, 3.5));
    }
}
