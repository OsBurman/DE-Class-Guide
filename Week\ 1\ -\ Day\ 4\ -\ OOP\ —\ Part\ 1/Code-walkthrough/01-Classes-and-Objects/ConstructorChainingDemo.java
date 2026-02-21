/**
 * Constructor Chaining Demo
 * 
 * Demonstrates:
 * - Using 'this()' to call other constructors
 * - DRY principle in constructor design
 * - Reducing code duplication between constructors
 * - Constructor ordering and call flow
 * - Default values and optional parameters
 * 
 * Key Concepts:
 * - this() calls another constructor in the same class
 * - this() must be the FIRST statement in a constructor
 * - Only one this() call per constructor
 * - Enables code reuse in constructor initialization
 */

public class ConstructorChainingDemo {

    // Example 1: Basic constructor chaining
    public static void demonstrateBasicChaining() {
        System.out.println("=== Example 1: Basic Constructor Chaining ===");

        class Book {
            String title;
            String author;
            int pages;

            // Constructor 1: Full initialization
            Book(String t, String a, int p) {
                System.out.println("Constructor 1 (full) called");
                title = t;
                author = a;
                pages = p;
            }

            // Constructor 2: Chains to Constructor 1
            Book(String t, String a) {
                this(t, a, 0); // Calls the 3-parameter constructor
                System.out.println("Constructor 2 called");
            }

            // Constructor 3: Chains to Constructor 2
            Book(String t) {
                this(t, "Unknown"); // Calls the 2-parameter constructor
                System.out.println("Constructor 3 called");
            }

            void display() {
                System.out.println("  " + title + " by " + author + " (" + pages + " pages)");
            }
        }

        System.out.println("Creating book with title only:");
        Book book1 = new Book("Java Basics");
        book1.display();

        System.out.println("\nCreating book with title and author:");
        Book book2 = new Book("Clean Code", "Robert Martin");
        book2.display();

        System.out.println("\nCreating book with all parameters:");
        Book book3 = new Book("Effective Java", "Joshua Bloch", 416);
        book3.display();
    }

    // Example 2: Constructor chaining with validation
    public static void demonstrateChainingWithValidation() {
        System.out.println("\n=== Example 2: Constructor Chaining with Validation ===");

        class Age {
            int years;

            // Full constructor with validation
            Age(int y) {
                if (y >= 0 && y <= 150) {
                    years = y;
                } else {
                    years = 0;
                }
            }

            // Constructor that defaults to 18
            Age() {
                this(18); // Call the full constructor with default value
            }

            void display() {
                System.out.println("Age: " + years);
            }
        }

        Age age1 = new Age(25);
        Age age2 = new Age(); // Uses default of 18

        age1.display();
        age2.display();
    }

    // Example 3: Multiple levels of chaining
    public static void demonstrateMultipleLevels() {
        System.out.println("\n=== Example 3: Multiple Levels of Chaining ===");

        class Car {
            String model;
            int year;
            String color;
            double price;

            // Level 1: Full constructor
            Car(String m, int y, String c, double p) {
                System.out.println("  Level 1: Full constructor");
                model = m;
                year = y;
                color = c;
                price = p;
            }

            // Level 2: Chains to Level 1
            Car(String m, int y, String c) {
                this(m, y, c, 0); // Default price
                System.out.println("  Level 2: Price defaulted to 0");
            }

            // Level 3: Chains to Level 2
            Car(String m, int y) {
                this(m, y, "Silver"); // Default color
                System.out.println("  Level 3: Color defaulted to Silver");
            }

            // Level 4: Chains to Level 3
            Car(String m) {
                this(m, 2024); // Default year
                System.out.println("  Level 4: Year defaulted to 2024");
            }

            void display() {
                System.out.println("  " + year + " " + model + " (" + color + ") - $" + price);
            }
        }

        System.out.println("Creating car with just model:");
        Car car = new Car("Toyota");
        car.display();
    }

    // Example 4: DRY principle with constructor chaining
    public static void demonstrateDRYPrinciple() {
        System.out.println("\n=== Example 4: DRY Principle ===");

        class Rectangle {
            double width;
            double height;

            Rectangle(double w, double h) {
                // Common initialization logic here
                if (w <= 0)
                    w = 1;
                if (h <= 0)
                    h = 1;
                width = w;
                height = h;
            }

            Rectangle(double side) {
                // Reuse the full constructor instead of duplicating validation
                this(side, side); // Square: width = height
            }

            Rectangle() {
                // Default square 1x1
                this(1);
            }

            void display() {
                System.out.println("  Rectangle: " + width + " x " + height);
            }
        }

        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5);
        Rectangle rect3 = new Rectangle(4, 7);

        rect1.display();
        rect2.display();
        rect3.display();
    }

    // Example 5: Constructor chaining with complex initialization
    public static void demonstrateComplexInitialization() {
        System.out.println("\n=== Example 5: Complex Initialization with Chaining ===");

        class User {
            String username;
            String email;
            boolean active;
            String role;
            long createdTime;

            // Full constructor
            User(String u, String e, String r) {
                System.out.println("Initializing user: " + u);
                username = u;
                email = e;
                active = true;
                role = r;
                createdTime = System.currentTimeMillis();
            }

            // Admin shortcut
            User(String u, String e) {
                this(u, e, "USER"); // Default role
            }

            // Guest user
            User() {
                this("guest_" + System.currentTimeMillis(), "guest@example.com");
            }

            void display() {
                System.out.println("  User: " + username + " | Email: " + email + " | Role: " + role);
            }
        }

        User user1 = new User("alice", "alice@example.com", "ADMIN");
        User user2 = new User("bob", "bob@example.com");
        User user3 = new User();

        user1.display();
        user2.display();
        user3.display();
    }

    // Example 6: Constructor chaining with method calls
    public static void demonstrateChainingWithMethods() {
        System.out.println("\n=== Example 6: Constructor Chaining with Methods ===");

        class Logger {
            String logLevel;
            String logFile;

            Logger(String level, String file) {
                logLevel = level;
                logFile = file;
                initializeLogger();
            }

            Logger(String file) {
                this("INFO", file); // Default log level
            }

            Logger() {
                this("app.log"); // Default file
            }

            void initializeLogger() {
                System.out.println("Logger initialized: " + logFile + " [" + logLevel + "]");
            }

            void log(String message) {
                System.out.println("[" + logLevel + "] " + message);
            }
        }

        Logger logger1 = new Logger("DEBUG", "debug.log");
        Logger logger2 = new Logger("output.log");
        Logger logger3 = new Logger();

        logger1.log("Debug message");
        logger2.log("Info message");
        logger3.log("Another message");
    }

    // Example 7: Common pattern - Optional parameters
    public static void demonstrateOptionalParameters() {
        System.out.println("\n=== Example 7: Optional Parameters Pattern ===");

        class Employee {
            String name;
            int id;
            double salary;
            String department;

            // Full constructor
            Employee(String n, int id, double sal, String dept) {
                name = n;
                this.id = id;
                salary = sal;
                department = dept;
            }

            // Without department (optional)
            Employee(String n, int id, double sal) {
                this(n, id, sal, "General");
            }

            // Without salary and department
            Employee(String n, int id) {
                this(n, id, 0, "General");
            }

            void display() {
                System.out.println("  " + name + " (ID: " + id + ") | Dept: " + department + " | $" + salary);
            }
        }

        Employee emp1 = new Employee("Alice", 101, 75000, "Engineering");
        Employee emp2 = new Employee("Bob", 102, 65000);
        Employee emp3 = new Employee("Charlie", 103);

        emp1.display();
        emp2.display();
        emp3.display();
    }

    public static void main(String[] args) {
        demonstrateBasicChaining();
        demonstrateChainingWithValidation();
        demonstrateMultipleLevels();
        demonstrateDRYPrinciple();
        demonstrateComplexInitialization();
        demonstrateChainingWithMethods();
        demonstrateOptionalParameters();
    }
}
