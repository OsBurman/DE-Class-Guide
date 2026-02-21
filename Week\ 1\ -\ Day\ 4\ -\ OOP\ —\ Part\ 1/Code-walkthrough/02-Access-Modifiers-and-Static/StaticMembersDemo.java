/**
 * Static Members Demo
 * 
 * Demonstrates:
 * - Static variables (class-level data)
 * - Static methods (class-level behavior)
 * - Static initialization
 * - Accessing static members
 * - Static vs instance distinction
 * 
 * Key Concepts:
 * - Static members belong to CLASS, not instances
 * - All instances share the same static members
 * - Access with: ClassName.staticMember
 * - No 'this' in static context (no current object)
 */

public class StaticMembersDemo {

    // Example 1: Static variable - shared by all instances
    public static void demonstrateStaticVariable() {
        System.out.println("=== Example 1: Static Variable ===");

        class User {
            static int totalUsers = 0; // Shared by all User objects
            String name;

            User(String n) {
                name = n;
                totalUsers++; // Increment shared counter
            }

            void display() {
                System.out.println(name + " | Total users: " + totalUsers);
            }
        }

        User user1 = new User("Alice");
        user1.display();

        User user2 = new User("Bob");
        user2.display();

        User user3 = new User("Charlie");
        user3.display();

        // All instances see the same totalUsers value
        System.out.println("Via class: User.totalUsers = " + User.totalUsers);
    }

    // Example 2: Static method - operates without instance
    public static void demonstrateStaticMethod() {
        System.out.println("\n=== Example 2: Static Method ===");

        class MathUtils {
            static int add(int a, int b) {
                return a + b;
            }

            static int multiply(int a, int b) {
                return a * b;
            }

            static double squareRoot(double num) {
                return Math.sqrt(num);
            }
        }

        // Call static methods without creating object
        System.out.println("5 + 3 = " + MathUtils.add(5, 3));
        System.out.println("5 * 3 = " + MathUtils.multiply(5, 3));
        System.out.println("√16 = " + MathUtils.squareRoot(16));
    }

    // Example 3: Static variable tracks state across instances
    public static void demonstrateStaticTracking() {
        System.out.println("\n=== Example 3: Static Tracking ===");

        class BankAccount {
            static double totalDeposits = 0; // All accounts together
            String accountHolder;
            double balance;

            BankAccount(String holder, double initial) {
                accountHolder = holder;
                balance = initial;
                totalDeposits = totalDeposits + initial; // Add to total
            }

            static void displayTotalDeposits() {
                System.out.println("Total deposits across all accounts: $" + totalDeposits);
            }

            void deposit(double amount) {
                balance = balance + amount;
                totalDeposits = totalDeposits + amount;
            }
        }

        BankAccount acc1 = new BankAccount("Alice", 5000);
        BankAccount acc2 = new BankAccount("Bob", 3000);

        BankAccount.displayTotalDeposits();

        acc1.deposit(1000);
        BankAccount.displayTotalDeposits();

        acc2.deposit(2000);
        BankAccount.displayTotalDeposits();
    }

    // Example 4: Static constants
    public static void demonstrateStaticConstants() {
        System.out.println("\n=== Example 4: Static Constants ===");

        class Circle {
            static final double PI = 3.14159; // Constant - shared, unchangeable
            double radius;

            Circle(double r) {
                radius = r;
            }

            double getArea() {
                return PI * radius * radius;
            }

            double getCircumference() {
                return 2 * PI * radius;
            }
        }

        System.out.println("PI = " + Circle.PI);

        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);

        System.out.println("Circle 1 area: " + c1.getArea());
        System.out.println("Circle 2 area: " + c2.getArea());
    }

    // Example 5: Static method performing utility operations
    public static void demonstrateStaticUtility() {
        System.out.println("\n=== Example 5: Static Utility Methods ===");

        class StringUtils {
            static boolean isEmpty(String str) {
                return str == null || str.length() == 0;
            }

            static String repeat(String str, int times) {
                String result = "";
                for (int i = 0; i < times; i++) {
                    result = result + str;
                }
                return result;
            }

            static String reverse(String str) {
                String result = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    result = result + str.charAt(i);
                }
                return result;
            }
        }

        System.out.println("isEmpty(''): " + StringUtils.isEmpty(""));
        System.out.println("isEmpty('hello'): " + StringUtils.isEmpty("hello"));
        System.out.println("repeat('ab', 3): " + StringUtils.repeat("ab", 3));
        System.out.println("reverse('hello'): " + StringUtils.reverse("hello"));
    }

    // Example 6: Static initialization block
    public static void demonstrateStaticInitialization() {
        System.out.println("\n=== Example 6: Static Initialization ===");

        class DatabaseConfig {
            static String connectionString;
            static int maxConnections;
            static boolean autoConnect;

            // Static initialization block - runs once when class loads
            static {
                System.out.println("(Initializing static variables...)");
                connectionString = "jdbc:mysql://localhost:3306/mydb";
                maxConnections = 100;
                autoConnect = true;
            }

            static void displayConfig() {
                System.out.println("Connection: " + connectionString);
                System.out.println("Max connections: " + maxConnections);
                System.out.println("Auto-connect: " + autoConnect);
            }
        }

        DatabaseConfig.displayConfig();
    }

    // Example 7: Accessing static members from instance
    public static void demonstrateAccessingStatic() {
        System.out.println("\n=== Example 7: Accessing Static Members ===");

        class Counter {
            static int total = 0;
            int id;

            Counter() {
                total++;
                id = total;
            }

            void display() {
                // Both ways work (but static way is clearer)
                System.out.println("ID: " + this.id + " | Total: " + Counter.total);
            }

            static void displayTotal() {
                System.out.println("Total counters created: " + total);
            }
        }

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c1.display();
        Counter.displayTotal(); // Preferred way to call static method
    }

    // Example 8: Static member with instance members
    public static void demonstrateStaticWithInstance() {
        System.out.println("\n=== Example 8: Static with Instance Members ===");

        class Product {
            static int nextId = 1000; // Shared counter
            int productId; // Instance-specific
            String name; // Instance-specific
            double price; // Instance-specific

            Product(String n, double p) {
                productId = nextId;
                nextId++; // Increment shared counter
                name = n;
                price = p;
            }

            void display() {
                System.out.println("ID: " + productId + " | " + name + " | $" + price);
            }

            static int getNextId() {
                return nextId;
            }
        }

        Product p1 = new Product("Laptop", 999.99);
        Product p2 = new Product("Mouse", 29.99);
        Product p3 = new Product("Keyboard", 79.99);

        p1.display();
        p2.display();
        p3.display();

        System.out.println("Next ID will be: " + Product.getNextId());
    }

    public static void main(String[] args) {
        demonstrateStaticVariable();
        demonstrateStaticMethod();
        demonstrateStaticTracking();
        demonstrateStaticConstants();
        demonstrateStaticUtility();
        demonstrateStaticInitialization();
        demonstrateAccessingStatic();
        demonstrateStaticWithInstance();
    }
}
