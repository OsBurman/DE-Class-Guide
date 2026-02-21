/**
 * Static vs Instance Demo - Direct Comparison
 * 
 * Demonstrates:
 * - Side-by-side comparison of static and instance
 * - When to use each
 * - Memory implications
 * - Access patterns
 * 
 * Key Concepts:
 * - Instance: each object gets its own copy
 * - Static: all objects share one copy
 * - Instance methods: can access instance + static
 * - Static methods: can ONLY access static
 */

public class StaticVsInstanceDemo {

    // Example 1: Direct comparison
    public static void demonstrateDirectComparison() {
        System.out.println("=== Example 1: Static vs Instance - Direct Comparison ===");
        
        class Employee {
            // Instance variable - each employee has own salary
            int salary;
            
            // Static variable - all employees share company rule
            static double taxRate;
            
            // Instance method - operates on this employee
            void raiseSalary(int amount) {
                salary = salary + amount;
                System.out.println("New salary: " + salary);
            }
            
            // Static method - operates on company rule
            static void setTaxRate(double rate) {
                taxRate = rate;
                System.out.println("Tax rate updated to: " + (taxRate * 100) + "%");
            }
            
            // Instance method using both
            double calculateTax() {
                return salary * taxRate;
            }
        }
        
        Employee.setTaxRate(0.25);  // Call static method
        
        Employee emp1 = new Employee();
        emp1.salary = 50000;
        
        Employee emp2 = new Employee();
        emp2.salary = 60000;
        
        System.out.println("Emp1 salary: " + emp1.salary);
        System.out.println("Emp2 salary: " + emp2.salary);
        System.out.println("Emp1 tax: " + emp1.calculateTax());
        System.out.println("Emp2 tax: " + emp2.calculateTax());
        
        // Change tax rate for all
        Employee.setTaxRate(0.30);
        System.out.println("After rate change:");
        System.out.println("Emp1 tax: " + emp1.calculateTax());
        System.out.println("Emp2 tax: " + emp2.calculateTax());
    }

    // Example 2: Singleton pattern (static method returning single instance)
    public static void demonstrateSingletonPattern() {
        System.out.println("\n=== Example 2: Singleton Pattern ===");
        
        class Database {
            // Static variable holds single instance
            private static Database instance;
            private String connectionString;
            
            // Private constructor - can't instantiate normally
            private Database() {
                connectionString = "Connected to DB";
            }
            
            // Static method to get the single instance
            static Database getInstance() {
                if (instance == null) {
                    instance = new Database();
                }
                return instance;
            }
            
            void query(String sql) {
                System.out.println("Executing: " + sql);
            }
        }
        
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        
        db1.query("SELECT * FROM users");
        db2.query("SELECT * FROM products");
        
        System.out.println("db1 and db2 are same object: " + (db1 == db2));
    }

    // Example 3: Static utility class vs instance class
    public static void demonstrateUtilityVsInstance() {
        System.out.println("\n=== Example 3: Static Utility vs Instance ===");
        
        // Utility class - all static
        class MathUtils {
            static int max(int a, int b) {
                return a > b ? a : b;
            }
            
            static int min(int a, int b) {
                return a < b ? a : b;
            }
        }
        
        // Instance class - tracks state
        class Temperature {
            double celsius;
            
            void set(double c) {
                celsius = c;
            }
            
            double getCelsius() {
                return celsius;
            }
            
            double getFahrenheit() {
                return (celsius * 9/5) + 32;
            }
        }
        
        // Use utility without creating object
        System.out.println("Max(5, 10): " + MathUtils.max(5, 10));
        System.out.println("Min(5, 10): " + MathUtils.min(5, 10));
        
        // Need instance for temperature
        Temperature temp = new Temperature();
        temp.set(25);
        System.out.println("Celsius: " + temp.getCelsius() + "°C");
        System.out.println("Fahrenheit: " + temp.getFahrenheit() + "°F");
    }

    // Example 4: Static counter vs instance tracking
    public static void demonstrateTracking() {
        System.out.println("\n=== Example 4: Static Tracking ===");
        
        class FileHandler {
            static int totalFilesOpened = 0;  // Tracks across all instances
            int filesOpenedByMe;              // Tracks per instance
            String name;
            
            FileHandler(String n) {
                name = n;
                filesOpenedByMe = 0;
            }
            
            void openFile(String filename) {
                filesOpenedByMe++;
                totalFilesOpened++;
                System.out.println(name + " opened " + filename);
            }
            
            void displayStats() {
                System.out.println(name + " | My files: " + filesOpenedByMe + 
                                 " | Total: " + FileHandler.totalFilesOpened);
            }
        }
        
        FileHandler handler1 = new FileHandler("Handler1");
        FileHandler handler2 = new FileHandler("Handler2");
        
        handler1.openFile("file1.txt");
        handler1.openFile("file2.txt");
        handler2.openFile("file3.txt");
        
        handler1.displayStats();
        handler2.displayStats();
    }

    // Example 5: When instance methods can use static
    public static void demonstrateInstanceUsingStatic() {
        System.out.println("\n=== Example 5: Instance Method Using Static ===");
        
        class ConfiguredService {
            static String apiKey;
            static int timeout;
            
            String serviceName;
            
            static void configure(String key, int t) {
                apiKey = key;
                timeout = t;
            }
            
            ConfiguredService(String name) {
                serviceName = name;
            }
            
            void callService() {
                // Instance method uses static values
                System.out.println(serviceName + " calling with key=" + apiKey + 
                                 " timeout=" + timeout);
            }
        }
        
        ConfiguredService.configure("SECRET_KEY_123", 5000);
        
        ConfiguredService svc1 = new ConfiguredService("PaymentService");
        ConfiguredService svc2 = new ConfiguredService("NotificationService");
        
        svc1.callService();
        svc2.callService();
        
        System.out.println("All instances use same static configuration");
    }

    // Example 6: Static method CANNOT access instance
    public static void demonstrateStaticLimitations() {
        System.out.println("\n=== Example 6: Static Method Limitations ===");
        
        class Account {
            int balance;
            
            Account(int b) {
                balance = b;
            }
            
            // Instance method - can access balance
            void displayBalance() {
                System.out.println("Balance: " + balance);
            }
            
            // Static method - CANNOT access balance or 'this'
            static void systemMessage() {
                // System.out.println("Balance: " + balance);  // ERROR!
                // System.out.println(this.balance);          // ERROR!
                System.out.println("This is a system-wide message");
            }
        }
        
        Account account = new Account(5000);
        account.displayBalance();
        Account.systemMessage();
        
        System.out.println("(Static method can't access instance variables)");
    }

    // Example 7: Memory illustration
    public static void demonstrateMemory() {
        System.out.println("\n=== Example 7: Memory - Instance vs Static ===");
        
        class DataHolder {
            int instanceData;                 // Each object gets own copy
            static String sharedData;        // ALL objects share one copy
            
            DataHolder(int id) {
                instanceData = id;
            }
        }
        
        System.out.println("Creating three objects:");
        DataHolder obj1 = new DataHolder(1);
        DataHolder obj2 = new DataHolder(2);
        DataHolder obj3 = new DataHolder(3);
        
        System.out.println("Each has own instanceData:");
        System.out.println("obj1.instanceData = " + obj1.instanceData);
        System.out.println("obj2.instanceData = " + obj2.instanceData);
        System.out.println("obj3.instanceData = " + obj3.instanceData);
        
        DataHolder.sharedData = "Shared";
        System.out.println("\nAll share same sharedData:");
        System.out.println("obj1.sharedData = " + obj1.sharedData);
        System.out.println("obj2.sharedData = " + obj2.sharedData);
        System.out.println("obj3.sharedData = " + obj3.sharedData);
        
        System.out.println("\nChange static:");
        DataHolder.sharedData = "Updated";
        System.out.println("All see the change: " + obj1.sharedData);
    }

    // Example 8: Comparison matrix
    public static void demonstrateComparisonMatrix() {
        System.out.println("\n=== Example 8: Quick Reference ===");
        
        System.out.println("STATIC                          | INSTANCE");
        System.out.println("-".repeat(60));
        System.out.println("Shared by all instances         | Each object has own");
        System.out.println("Accessed via ClassName.member   | Accessed via object.member");
        System.out.println("Exists before any objects       | Exists only with object");
        System.out.println("Can't access 'this'             | Can access 'this'");
        System.out.println("Can't access instance vars      | Can access static + instance");
        System.out.println("Use: Constants, utilities       | Use: Object state");
        System.out.println("Memory: Single copy             | Memory: One per object");
    }

    public static void main(String[] args) {
        demonstrateDirectComparison();
        demonstrateSingletonPattern();
        demonstrateUtilityVsInstance();
        demonstrateTracking();
        demonstrateInstanceUsingStatic();
        demonstrateStaticLimitations();
        demonstrateMemory();
        demonstrateComparisonMatrix();
    }
}
