/**
 * Exercise 05: Encapsulation Basics
 * 
 * TODO: Implement the Temperature class with private fields and public methods
 */
public class Temperature {

    // TODO: Declare a private celsius field
    // private double celsius;

    // TODO: Create a constructor that takes an initial temperature
    // Validate that temperature >= -273.15
    // If invalid, set to 0 or print error

    // TODO: Create getCelsius() getter method

    // TODO: Create setCelsius(double temp) setter method with validation
    // Only set if temp >= -273.15
    // Print error message if invalid

    // TODO: Create getFahrenheit() method
    // Formula: celsius * 9/5 + 32

    // TODO: Create isFreezingPoint() method
    // Returns true if celsius <= 0

    // TODO: Create isBoilingPoint() method
    // Returns true if celsius >= 100

    public static void main(String[] args) {
        // TODO: Create temperature object with 25°C
        // Display current temp in Celsius and Fahrenheit
        // Check if freezing/boiling

        System.out.println();

        // TODO: Attempt to set to -300 (invalid)
        // Verify temperature didn't change

        System.out.println();

        // TODO: Set to 0.0 (valid freezing point)
        // Display and check freezing/boiling

        System.out.println();

        // TODO: Create another temperature at 100°C
        // Display info and verify it's boiling point
    }
}
