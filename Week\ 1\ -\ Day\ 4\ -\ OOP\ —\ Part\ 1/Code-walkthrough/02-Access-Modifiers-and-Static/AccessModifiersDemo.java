/**
 * Access Modifiers Demo
 * 
 * Demonstrates:
 * - public (accessible everywhere)
 * - private (accessible only in same class)
 * - protected (accessible in same package and subclasses)
 * - default/package-private (accessible in same package)
 * - Why access modifiers matter
 * - Encapsulation through access control
 * 
 * Key Concepts:
 * - Access modifiers control visibility
 * - public = no restrictions
 * - private = most restricted
 * - protected = for inheritance
 * - default = same package only
 */

public class AccessModifiersDemo {

    // Example 1: Public vs Private fields
    public static void demonstratePublicPrivate() {
        System.out.println("=== Example 1: Public vs Private ===");

        class BankAccount {
            public String accountNumber; // Public - anyone can access
            private double balance; // Private - only this class

            public BankAccount(String number, double initialBalance) {
                accountNumber = number;
                balance = initialBalance;
            }

            // Public getter allows controlled access
            public double getBalance() {
                return balance;
            }

            // Public method controls how balance changes
            public void deposit(double amount) {
                if (amount > 0) {
                    balance = balance + amount;
                    System.out.println("Deposited: $" + amount);
                }
            }

            public void withdraw(double amount) {
                if (amount > 0 && amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Withdrew: $" + amount);
                }
            }
        }

        BankAccount account = new BankAccount("ACC123", 1000);
        System.out.println("Account: " + account.accountNumber); // Public - allowed
        System.out.println("Balance: $" + account.getBalance()); // Using public method

        // account.balance = -500; // COMPILER ERROR - balance is private!
        // We MUST use the withdrawal method instead
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Balance: $" + account.getBalance());
    }

    // Example 2: Public methods with private helpers
    public static void demonstratePublicMethodsPrivateHelpers() {
        System.out.println("\n=== Example 2: Public Methods, Private Helpers ===");

        class PasswordValidator {
            private int minLength;
            private int minDigits;

            public PasswordValidator(int len, int digits) {
                minLength = len;
                minDigits = digits;
            }

            // Public method
            public boolean isValid(String password) {
                return hasMinimumLength(password) && hasMinimumDigits(password);
            }

            // Private helper methods (implementation details)
            private boolean hasMinimumLength(String password) {
                return password.length() >= minLength;
            }

            private boolean hasMinimumDigits(String password) {
                int digitCount = 0;
                for (char c : password.toCharArray()) {
                    if (Character.isDigit(c)) {
                        digitCount++;
                    }
                }
                return digitCount >= minDigits;
            }

            public String getRequirements() {
                return "Min length: " + minLength + ", Min digits: " + minDigits;
            }
        }

        PasswordValidator validator = new PasswordValidator(8, 2);
        System.out.println("Requirements: " + validator.getRequirements());

        System.out.println("'password': " + validator.isValid("password")); // Too short
        System.out.println("'password123': " + validator.isValid("password123")); // Valid
        System.out.println("'pass12': " + validator.isValid("pass12")); // Too short
    }

    // Example 3: Protected modifier (for inheritance)
    public static void demonstrateProtected() {
        System.out.println("\n=== Example 3: Protected Access (Preview) ===");

        class Vehicle {
            protected String color; // Protected - accessible in subclasses
            private int id; // Private - NOT accessible in subclasses

            protected Vehicle(String c) {
                color = c;
                id = (int) System.currentTimeMillis() % 10000;
            }

            public void display() {
                System.out.println("Vehicle color: " + color);
            }
        }

        class Car extends Vehicle {
            String model;

            public Car(String c, String m) {
                super(c);
                model = m;
            }

            public void displayInfo() {
                // Can access protected color from parent
                System.out.println(model + " is " + color);
                // Cannot access private id: System.out.println("ID: " + id);
            }
        }

        Car car = new Car("Red", "Toyota");
        car.displayInfo();
    }

    // Example 4: Default (package-private) modifier
    public static void demonstrateDefault() {
        System.out.println("\n=== Example 4: Default Access ===");

        // These would need to be in separate files to demonstrate package privacy
        // Instead, show within same package

        class Configuration {
            int maxConnections; // Default - visible in same package only
            String databaseUrl; // Default - visible in same package only

            public void display() {
                System.out.println("Max Connections: " + maxConnections);
                System.out.println("Database URL: " + databaseUrl);
            }
        }

        Configuration config = new Configuration();
        config.maxConnections = 100; // Allowed - same package
        config.databaseUrl = "localhost"; // Allowed - same package
        config.display();

        System.out.println("(Note: Default modifier only matters across packages)");
    }

    // Example 5: Encapsulation example - protecting internal state
    public static void demonstrateEncapsulation() {
        System.out.println("\n=== Example 5: Encapsulation ===");

        class Temperature {
            private double celsius; // Hidden implementation

            public Temperature(double c) {
                if (c >= -273.15) {
                    celsius = c;
                } else {
                    celsius = -273.15; // Absolute zero
                }
            }

            public double getCelsius() {
                return celsius;
            }

            public double getFahrenheit() {
                // Convert on-the-fly, not stored
                return (celsius * 9 / 5) + 32;
            }

            public void setCelsius(double c) {
                if (c >= -273.15) {
                    celsius = c;
                } else {
                    System.out.println("Invalid temperature!");
                }
            }
        }

        Temperature temp = new Temperature(25);
        System.out.println("Celsius: " + temp.getCelsius());
        System.out.println("Fahrenheit: " + temp.getFahrenheit());

        temp.setCelsius(-300); // Rejected
        System.out.println("Celsius: " + temp.getCelsius()); // Still 25

        temp.setCelsius(0);
        System.out.println("Celsius: " + temp.getCelsius());
    }

    // Example 6: Read-only properties (getter only, no setter)
    public static void demonstrateReadOnlyProperties() {
        System.out.println("\n=== Example 6: Read-Only Properties ===");

        class User {
            private String username; // Private, only getter
            private long createdTime; // Private, only getter
            private int accessCount; // Private, controlled modification

            public User(String u) {
                username = u;
                createdTime = System.currentTimeMillis();
                accessCount = 0;
            }

            public String getUsername() {
                return username;
            }

            public long getCreatedTime() {
                return createdTime;
            }

            public int getAccessCount() {
                return accessCount;
            }

            public void recordAccess() {
                accessCount++;
            }
        }

        User user = new User("alice");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Created: " + user.getCreatedTime());

        user.recordAccess();
        user.recordAccess();
        System.out.println("Access count: " + user.getAccessCount());

        // Cannot do: user.username = "bob"; // COMPILER ERROR
        // Cannot do: user.createdTime = 0; // COMPILER ERROR
    }

    // Example 7: Write-only properties (setter only, no getter)
    public static void demonstrateWriteOnlyProperties() {
        System.out.println("\n=== Example 7: Write-Only Properties ===");

        class Logger {
            private String logLevel; // Private, only setter
            private boolean debug; // Private, only setter

            public void setLogLevel(String level) {
                if (level.equals("INFO") || level.equals("DEBUG") || level.equals("ERROR")) {
                    logLevel = level;
                }
            }

            public void enableDebug() {
                debug = true;
                System.out.println("Debug enabled");
            }

            public void log(String message) {
                if (debug) {
                    System.out.println("[" + logLevel + "] DEBUG: " + message);
                } else {
                    System.out.println("[" + logLevel + "] " + message);
                }
            }
        }

        Logger logger = new Logger();
        logger.setLogLevel("INFO");
        logger.log("Application started");

        logger.enableDebug();
        logger.setLogLevel("DEBUG");
        logger.log("This shows debug info");

        // Cannot do: System.out.println(logger.logLevel); // COMPILER ERROR
        // Cannot read write-only properties
    }

    // Example 8: Complex visibility scenario
    public static void demonstrateComplexScenario() {
        System.out.println("\n=== Example 8: Complex Visibility ===");

        class ShoppingCart {
            private double subtotal;
            private double tax;
            private boolean validated;

            public void addItem(double price) {
                subtotal = subtotal + price;
                validated = false; // Invalid when items change
            }

            public void validateCart() {
                tax = calculateTax();
                validated = true;
            }

            private double calculateTax() {
                // Private helper - implementation detail
                return subtotal * 0.08;
            }

            public double getTotal() {
                if (!validated) {
                    validateCart();
                }
                return subtotal + tax;
            }

            public double getTax() {
                return tax;
            }

            public double getSubtotal() {
                return subtotal;
            }
        }

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(50);
        cart.addItem(30);

        System.out.println("Subtotal: $" + cart.getSubtotal());
        System.out.println("Tax: $" + cart.getTax());
        System.out.println("Total: $" + cart.getTotal());
    }

    public static void main(String[] args) {
        demonstratePublicPrivate();
        demonstratePublicMethodsPrivateHelpers();
        demonstrateProtected();
        demonstrateDefault();
        demonstrateEncapsulation();
        demonstrateReadOnlyProperties();
        demonstrateWriteOnlyProperties();
        demonstrateComplexScenario();
    }
}
