/**
 * Exercise 05: Encapsulation Basics - SOLUTION
 * 
 * This solution demonstrates:
 * - Private fields for data protection
 * - Public getters and setters for controlled access
 * - Validation in setters to maintain object integrity
 * - Calculations based on protected state
 */
public class Temperature {
    
    // Private field - only this class can directly access
    private double celsius;
    
    // Constructor with validation
    public Temperature(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
        } else {
            System.out.println("Invalid temperature! Setting to 0°C");
            this.celsius = 0;
        }
    }
    
    // Getter - public read access
    public double getCelsius() {
        return celsius;
    }
    
    // Setter - public write access WITH validation
    public void setCelsius(double temp) {
        if (temp >= -273.15) {
            celsius = temp;
        } else {
            System.out.println("Invalid temperature! Must be >= -273.15°C. Not changed.");
        }
    }
    
    // Calculate Fahrenheit from Celsius
    public double getFahrenheit() {
        return celsius * 9.0 / 5.0 + 32;
    }
    
    // Check if at freezing point
    public boolean isFreezingPoint() {
        return celsius <= 0;
    }
    
    // Check if at boiling point
    public boolean isBoilingPoint() {
        return celsius >= 100;
    }
    
    public static void main(String[] args) {
        // Create Temperature 1
        System.out.println("--- Temperature 1 ---");
        Temperature temp1 = new Temperature(25.0);
        System.out.printf("Initial: %.1f°C = %.1f°F%n", temp1.getCelsius(), temp1.getFahrenheit());
        System.out.println("Is freezing? " + (temp1.isFreezingPoint() ? "Yes" : "No"));
        System.out.println("Is boiling? " + (temp1.isBoilingPoint() ? "Yes" : "No"));
        
        System.out.println();
        
        // Attempt invalid set
        System.out.println("Attempt to set to -300 (invalid)");
        temp1.setCelsius(-300);
        System.out.printf("Current: %.1f°C (unchanged)%n", temp1.getCelsius());
        
        System.out.println();
        
        // Set to valid freezing point
        System.out.println("Set to 0.0 (valid)");
        temp1.setCelsius(0.0);
        System.out.printf("Current: %.1f°C = %.1f°F%n", temp1.getCelsius(), temp1.getFahrenheit());
        System.out.println("Is freezing? " + (temp1.isFreezingPoint() ? "Yes" : "No"));
        System.out.println("Is boiling? " + (temp1.isBoilingPoint() ? "Yes" : "No"));
        
        System.out.println();
        
        // Create Temperature 2
        System.out.println("--- Temperature 2 ---");
        Temperature temp2 = new Temperature(100.0);
        System.out.printf("Initial: %.1f°C = %.1f°F%n", temp2.getCelsius(), temp2.getFahrenheit());
        System.out.println("Is boiling? " + (temp2.isBoilingPoint() ? "Yes" : "No"));
    }
}
