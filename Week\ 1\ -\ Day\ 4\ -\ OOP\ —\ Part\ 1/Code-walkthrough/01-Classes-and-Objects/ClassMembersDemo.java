/**
 * Class Members Demo - Fields and Methods
 * 
 * Demonstrates:
 * - Instance fields (data members)
 * - Instance methods (behavior)
 * - Accessing and modifying fields
 * - Method parameters and return values
 * - Getters and setters pattern
 * 
 * Key Concepts:
 * - Fields hold the state of an object
 * - Methods define the behavior of an object
 * - Each object has independent copies of fields
 * - Methods can access and modify fields
 */

public class ClassMembersDemo {

    // Example 1: Fields and basic methods
    public static void demonstrateBasicMembers() {
        System.out.println("=== Example 1: Fields and Basic Methods ===");
        
        class Circle {
            // Fields (instance variables - state)
            double radius;
            String color;
            
            // Method that uses fields
            double calculateArea() {
                return 3.14159 * radius * radius;
            }
            
            double calculateCircumference() {
                return 2 * 3.14159 * radius;
            }
            
            void displayInfo() {
                System.out.println("Circle: " + color + " | Radius: " + radius + 
                                 " | Area: " + calculateArea() + " | Circumference: " + calculateCircumference());
            }
        }
        
        Circle circle1 = new Circle();
        circle1.radius = 5;
        circle1.color = "Red";
        circle1.displayInfo();
        
        Circle circle2 = new Circle();
        circle2.radius = 10;
        circle2.color = "Blue";
        circle2.displayInfo();
    }

    // Example 2: Method with parameters
    public static void demonstrateMethodsWithParameters() {
        System.out.println("\n=== Example 2: Methods with Parameters ===");
        
        class Temperature {
            double celsius;
            
            double convertToFahrenheit() {
                return (celsius * 9/5) + 32;
            }
            
            boolean isFreezingPoint() {
                return celsius <= 0;
            }
            
            void addDegrees(double amount) {
                celsius = celsius + amount;
            }
            
            void display() {
                System.out.println("Celsius: " + celsius + " | Fahrenheit: " + convertToFahrenheit());
            }
        }
        
        Temperature temp = new Temperature();
        temp.celsius = -10;
        System.out.println("Is freezing? " + temp.isFreezingPoint());
        temp.display();
        
        temp.addDegrees(15);
        System.out.println("After adding 15 degrees:");
        System.out.println("Is freezing? " + temp.isFreezingPoint());
        temp.display();
    }

    // Example 3: Getters and setters
    public static void demonstrateGettersAndSetters() {
        System.out.println("\n=== Example 3: Getters and Setters ===");
        
        class BankAccount {
            private double balance; // Private field
            
            // Getter
            double getBalance() {
                return balance;
            }
            
            // Setter with validation
            void setBalance(double amount) {
                if (amount >= 0) {
                    balance = amount;
                } else {
                    System.out.println("Cannot set negative balance");
                }
            }
            
            void deposit(double amount) {
                if (amount > 0) {
                    balance = balance + amount;
                }
            }
            
            boolean withdraw(double amount) {
                if (amount > 0 && amount <= balance) {
                    balance = balance - amount;
                    return true;
                }
                return false;
            }
        }
        
        BankAccount account = new BankAccount();
        account.setBalance(1000);
        System.out.println("Initial balance: $" + account.getBalance());
        
        account.deposit(500);
        System.out.println("After deposit: $" + account.getBalance());
        
        if (account.withdraw(200)) {
            System.out.println("After withdrawal: $" + account.getBalance());
        }
        
        account.setBalance(-500); // This won't work
        System.out.println("Final balance: $" + account.getBalance());
    }

    // Example 4: Methods that modify state
    public static void demonstrateStateModification() {
        System.out.println("\n=== Example 4: State Modification ===");
        
        class Game {
            int score;
            int level;
            int health;
            
            void increaseScore(int points) {
                score = score + points;
            }
            
            void decreaseHealth(int damage) {
                health = health - damage;
                if (health < 0) {
                    health = 0;
                }
            }
            
            void levelUp() {
                level = level + 1;
                health = 100; // Restore health on level up
            }
            
            boolean isAlive() {
                return health > 0;
            }
            
            void displayStatus() {
                String alive = isAlive() ? "ALIVE" : "DEAD";
                System.out.println("Level: " + level + " | Score: " + score + " | Health: " + health + " | Status: " + alive);
            }
        }
        
        Game game = new Game();
        game.score = 0;
        game.level = 1;
        game.health = 100;
        
        game.displayStatus();
        game.increaseScore(100);
        game.displayStatus();
        
        game.decreaseHealth(30);
        game.decreaseHealth(40);
        game.displayStatus();
        
        game.levelUp();
        game.displayStatus();
    }

    // Example 5: Methods returning values
    public static void demonstrateReturnValues() {
        System.out.println("\n=== Example 5: Methods Returning Values ===");
        
        class Student {
            String name;
            int exam1;
            int exam2;
            int exam3;
            
            int calculateTotal() {
                return exam1 + exam2 + exam3;
            }
            
            double calculateAverage() {
                return calculateTotal() / 3.0;
            }
            
            char calculateGrade() {
                double average = calculateAverage();
                if (average >= 90) return 'A';
                if (average >= 80) return 'B';
                if (average >= 70) return 'C';
                if (average >= 60) return 'D';
                return 'F';
            }
            
            void display() {
                System.out.println(name + " | Total: " + calculateTotal() + 
                                 " | Average: " + calculateAverage() + " | Grade: " + calculateGrade());
            }
        }
        
        Student s1 = new Student();
        s1.name = "Alice";
        s1.exam1 = 95;
        s1.exam2 = 92;
        s1.exam3 = 88;
        s1.display();
        
        Student s2 = new Student();
        s2.name = "Bob";
        s2.exam1 = 75;
        s2.exam2 = 78;
        s2.exam3 = 72;
        s2.display();
    }

    // Example 6: Methods calling other methods
    public static void demonstrateMethodCallChain() {
        System.out.println("\n=== Example 6: Methods Calling Other Methods ===");
        
        class ShoppingCart {
            double subtotal;
            double taxRate;
            
            double calculateTax() {
                return subtotal * taxRate;
            }
            
            double calculateTotal() {
                // Method calling another method
                return subtotal + calculateTax();
            }
            
            void applyDiscount(double discountPercent) {
                double discountAmount = subtotal * (discountPercent / 100.0);
                subtotal = subtotal - discountAmount;
            }
            
            void displayCart() {
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Tax: $" + calculateTax());
                System.out.println("Total: $" + calculateTotal());
            }
        }
        
        ShoppingCart cart = new ShoppingCart();
        cart.subtotal = 100;
        cart.taxRate = 0.08;
        
        System.out.println("Before discount:");
        cart.displayCart();
        
        cart.applyDiscount(10);
        System.out.println("\nAfter 10% discount:");
        cart.displayCart();
    }

    // Example 7: Complex member interactions
    public static void demonstrateComplexInteractions() {
        System.out.println("\n=== Example 7: Complex Member Interactions ===");
        
        class Library {
            String name;
            int totalBooks;
            int borrowedBooks;
            
            int getAvailableBooks() {
                return totalBooks - borrowedBooks;
            }
            
            void borrowBook() {
                if (borrowedBooks < totalBooks) {
                    borrowedBooks = borrowedBooks + 1;
                }
            }
            
            void returnBook() {
                if (borrowedBooks > 0) {
                    borrowedBooks = borrowedBooks - 1;
                }
            }
            
            double getUtilizationPercent() {
                if (totalBooks == 0) return 0;
                return (borrowedBooks / (double) totalBooks) * 100;
            }
            
            void displayStatus() {
                System.out.println(name + " | Total: " + totalBooks + " | Borrowed: " + borrowedBooks + 
                                 " | Available: " + getAvailableBooks() + " | Utilization: " + 
                                 String.format("%.1f", getUtilizationPercent()) + "%");
            }
        }
        
        Library library = new Library();
        library.name = "Central Library";
        library.totalBooks = 1000;
        library.borrowedBooks = 250;
        
        library.displayStatus();
        library.borrowBook();
        library.borrowBook();
        library.displayStatus();
        
        library.returnBook();
        library.displayStatus();
    }

    public static void main(String[] args) {
        demonstrateBasicMembers();
        demonstrateMethodsWithParameters();
        demonstrateGettersAndSetters();
        demonstrateStateModification();
        demonstrateReturnValues();
        demonstrateMethodCallChain();
        demonstrateComplexInteractions();
    }
}
