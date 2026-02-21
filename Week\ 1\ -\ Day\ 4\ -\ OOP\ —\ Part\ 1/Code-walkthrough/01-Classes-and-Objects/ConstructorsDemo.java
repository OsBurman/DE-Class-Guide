/**
 * Constructors Demo - Default Constructors
 * 
 * Demonstrates:
 * - Default constructor (no parameters)
 * - When constructors are called
 * - Default initialization of variables
 * - Writing explicit default constructors
 * 
 * Key Concepts:
 * - Every class has at least one constructor
 * - If you don't write a constructor, Java provides a default one
 * - Constructors are called when an object is created with 'new'
 * - Default constructors initialize fields to default values (0, false, null)
 */

public class ConstructorsDemo {

    // Example 1: Implicit default constructor
    public static void demonstrateImplicitDefaultConstructor() {
        System.out.println("=== Example 1: Implicit Default Constructor ===");
        
        class Animal {
            String species;
            int age;
            String name;
            
            // No constructor written - Java provides default constructor
            // It initializes: species = null, age = 0, name = null
        }
        
        Animal animal = new Animal();
        System.out.println("Species: " + animal.species); // null
        System.out.println("Age: " + animal.age); // 0
        System.out.println("Name: " + animal.name); // null
        
        // We can then set values manually
        animal.species = "Dog";
        animal.age = 3;
        animal.name = "Buddy";
        System.out.println("After assignment - Name: " + animal.name + " (" + animal.species + ")");
    }

    // Example 2: Explicit default constructor with initialization
    public static void demonstrateExplicitDefaultConstructor() {
        System.out.println("\n=== Example 2: Explicit Default Constructor ===");
        
        class Person {
            String name;
            int age;
            String city;
            
            // Explicit default constructor
            Person() {
                System.out.println("Person constructor called!");
                name = "Unknown";
                age = 0;
                city = "Unknown";
            }
        }
        
        System.out.println("Creating person...");
        Person person = new Person();
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("City: " + person.city);
    }

    // Example 3: Multiple objects calling default constructor
    public static void demonstrateMultipleObjects() {
        System.out.println("\n=== Example 3: Multiple Objects with Default Constructor ===");
        
        class Game {
            String title;
            int score;
            boolean isActive;
            
            Game() {
                System.out.println("Game object created");
                title = "Unnamed Game";
                score = 0;
                isActive = false;
            }
        }
        
        System.out.println("Creating three games...");
        Game game1 = new Game();
        Game game2 = new Game();
        Game game3 = new Game();
        
        System.out.println("\nEach object has independent state:");
        game1.score = 100;
        game2.score = 250;
        game3.score = 150;
        
        System.out.println("Game 1 score: " + game1.score);
        System.out.println("Game 2 score: " + game2.score);
        System.out.println("Game 3 score: " + game3.score);
    }

    // Example 4: Constructor with initialization logic
    public static void demonstrateInitializationLogic() {
        System.out.println("\n=== Example 4: Constructor with Initialization Logic ===");
        
        class BankAccount {
            String accountNumber;
            double balance;
            int transactionCount;
            
            BankAccount() {
                System.out.println("Creating new bank account...");
                accountNumber = "ACC-" + System.currentTimeMillis();
                balance = 0.0;
                transactionCount = 0;
                System.out.println("Account created with number: " + accountNumber);
            }
        }
        
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        
        System.out.println("Account 1: " + account1.accountNumber + " | Balance: $" + account1.balance);
        System.out.println("Account 2: " + account2.accountNumber + " | Balance: $" + account2.balance);
    }

    // Example 5: Boolean and numeric default values
    public static void demonstrateDefaultValues() {
        System.out.println("\n=== Example 5: Default Values in Constructor ===");
        
        class Configuration {
            boolean debugMode;
            int maxRetries;
            double timeout;
            String status;
            
            Configuration() {
                // These are default values before initialization
                System.out.println("Default values before initialization:");
                System.out.println("  debugMode: " + debugMode);
                System.out.println("  maxRetries: " + maxRetries);
                System.out.println("  timeout: " + timeout);
                System.out.println("  status: " + status);
                
                // Explicitly initialize
                debugMode = true;
                maxRetries = 3;
                timeout = 30.5;
                status = "ACTIVE";
            }
        }
        
        Configuration config = new Configuration();
        System.out.println("\nAfter constructor:");
        System.out.println("  debugMode: " + config.debugMode);
        System.out.println("  maxRetries: " + config.maxRetries);
        System.out.println("  timeout: " + config.timeout);
        System.out.println("  status: " + config.status);
    }

    // Example 6: Constructor performing setup operations
    public static void demonstrateSetupOperations() {
        System.out.println("\n=== Example 6: Constructor Performing Setup ===");
        
        class Logger {
            String logFileName;
            int logLevel;
            boolean enabled;
            
            Logger() {
                System.out.println("Setting up logger...");
                logFileName = "app.log";
                logLevel = 1; // INFO level
                enabled = true;
                System.out.println("Logger initialized");
                System.out.println("  File: " + logFileName);
                System.out.println("  Level: " + logLevel);
                System.out.println("  Enabled: " + enabled);
            }
            
            void log(String message) {
                if (enabled) {
                    System.out.println("[" + logFileName + "] " + message);
                }
            }
        }
        
        Logger logger = new Logger();
        logger.log("Application started");
        logger.log("System ready");
    }

    // Example 7: Constructor as an initialization entry point
    public static void demonstrateAsInitializationEntry() {
        System.out.println("\n=== Example 7: Constructor as Initialization Entry Point ===");
        
        class Server {
            String serverName;
            int port;
            boolean running;
            
            Server() {
                System.out.println("Initializing server...");
                serverName = "localhost";
                port = 8080;
                running = false;
                startupSequence();
            }
            
            void startupSequence() {
                System.out.println("Running startup sequence:");
                System.out.println("  1. Loading configuration...");
                System.out.println("  2. Binding to port " + port + "...");
                System.out.println("  3. Starting service...");
                running = true;
                System.out.println("Server is now running on " + serverName + ":" + port);
            }
        }
        
        Server server = new Server();
    }

    public static void main(String[] args) {
        demonstrateImplicitDefaultConstructor();
        demonstrateExplicitDefaultConstructor();
        demonstrateMultipleObjects();
        demonstrateInitializationLogic();
        demonstrateDefaultValues();
        demonstrateSetupOperations();
        demonstrateAsInitializationEntry();
    }
}
