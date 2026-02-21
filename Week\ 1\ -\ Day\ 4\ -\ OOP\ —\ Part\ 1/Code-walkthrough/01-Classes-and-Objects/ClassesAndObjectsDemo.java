/**
 * Classes and Objects Demo
 * 
 * Demonstrates:
 * - Class definition and structure
 * - Object creation and instantiation
 * - Instance variables (state)
 * - Instance methods (behavior)
 * - Creating and using multiple objects
 * 
 * Key Concepts:
 * - A class is a blueprint for creating objects
 * - Objects are instances of a class
 * - Each object has its own state (independent variables)
 * - Methods define the behavior of objects
 */

public class ClassesAndObjectsDemo {

    // Example 1: Simple Car class
    public static void demonstrateBasicClass() {
        System.out.println("=== Example 1: Basic Class Definition ===");
        
        class Car {
            // Instance variables (state)
            String model;
            int year;
            String color;
            
            // Instance method (behavior)
            void drive() {
                System.out.println(model + " is driving");
            }
            
            void honk() {
                System.out.println(model + " says: Beep beep!");
            }
        }
        
        // Create objects (instances of Car class)
        Car car1 = new Car();
        car1.model = "Toyota";
        car1.year = 2020;
        car1.color = "Blue";
        
        Car car2 = new Car();
        car2.model = "Honda";
        car2.year = 2022;
        car2.color = "Red";
        
        // Each object maintains its own state
        System.out.println("Car 1: " + car1.model + " (" + car1.color + ")");
        System.out.println("Car 2: " + car2.model + " (" + car2.color + ")");
        
        // Call methods on objects
        car1.drive();
        car2.honk();
    }

    // Example 2: Student class with multiple methods
    public static void demonstrateMultipleMethods() {
        System.out.println("\n=== Example 2: Multiple Methods ===");
        
        class Student {
            String name;
            int studentId;
            double gpa;
            
            void introduce() {
                System.out.println("Hi, I'm " + name + " (ID: " + studentId + ")");
            }
            
            void displayGPA() {
                System.out.println("My GPA is: " + gpa);
            }
            
            void study(String subject) {
                System.out.println(name + " is studying " + subject);
            }
            
            void graduate() {
                if (gpa >= 2.0) {
                    System.out.println(name + " graduated with GPA: " + gpa);
                } else {
                    System.out.println(name + " did not graduate (GPA too low)");
                }
            }
        }
        
        Student student1 = new Student();
        student1.name = "Alice";
        student1.studentId = 12345;
        student1.gpa = 3.8;
        
        student1.introduce();
        student1.study("Java");
        student1.displayGPA();
        student1.graduate();
    }

    // Example 3: BankAccount class demonstrating state changes
    public static void demonstrateStateChanges() {
        System.out.println("\n=== Example 3: State Changes Through Methods ===");
        
        class BankAccount {
            String accountHolder;
            double balance;
            
            void deposit(double amount) {
                balance = balance + amount;
                System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
            }
            
            void withdraw(double amount) {
                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Withdrew: $" + amount + ". New balance: $" + balance);
                } else {
                    System.out.println("Insufficient funds!");
                }
            }
            
            void checkBalance() {
                System.out.println("Current balance: $" + balance);
            }
        }
        
        BankAccount account = new BankAccount();
        account.accountHolder = "John Doe";
        account.balance = 1000;
        
        System.out.println("Account owner: " + account.accountHolder);
        account.checkBalance();
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(2000); // This will fail
    }

    // Example 4: Multiple objects with independent state
    public static void demonstrateMultipleObjects() {
        System.out.println("\n=== Example 4: Multiple Independent Objects ===");
        
        class Rectangle {
            double width;
            double height;
            
            double calculateArea() {
                return width * height;
            }
            
            double calculatePerimeter() {
                return 2 * (width + height);
            }
            
            void displayDimensions() {
                System.out.println("Width: " + width + ", Height: " + height);
            }
        }
        
        // Create multiple rectangles with different dimensions
        Rectangle rect1 = new Rectangle();
        rect1.width = 5;
        rect1.height = 3;
        
        Rectangle rect2 = new Rectangle();
        rect2.width = 10;
        rect2.height = 4;
        
        // Each object maintains its own state
        System.out.println("Rectangle 1:");
        rect1.displayDimensions();
        System.out.println("Area: " + rect1.calculateArea());
        System.out.println("Perimeter: " + rect1.calculatePerimeter());
        
        System.out.println("\nRectangle 2:");
        rect2.displayDimensions();
        System.out.println("Area: " + rect2.calculateArea());
        System.out.println("Perimeter: " + rect2.calculatePerimeter());
    }

    // Example 5: Book class with display methods
    public static void demonstrateComplexClass() {
        System.out.println("\n=== Example 5: Complex Class (Book) ===");
        
        class Book {
            String title;
            String author;
            int pages;
            double price;
            
            void displayInfo() {
                System.out.println("Title: " + title);
                System.out.println("Author: " + author);
                System.out.println("Pages: " + pages);
                System.out.println("Price: $" + price);
            }
            
            void applyDiscount(double discountPercent) {
                double discountAmount = price * (discountPercent / 100);
                price = price - discountAmount;
                System.out.println("Applied " + discountPercent + "% discount. New price: $" + price);
            }
            
            void printSummary() {
                System.out.println("\"" + title + "\" by " + author + " (" + pages + " pages)");
            }
        }
        
        Book book1 = new Book();
        book1.title = "Java Programming";
        book1.author = "John Smith";
        book1.pages = 850;
        book1.price = 49.99;
        
        Book book2 = new Book();
        book2.title = "Clean Code";
        book2.author = "Robert Martin";
        book2.pages = 464;
        book2.price = 35.00;
        
        System.out.println("Book 1:");
        book1.displayInfo();
        book1.applyDiscount(10);
        
        System.out.println("\nBook 2:");
        book2.displayInfo();
        book2.printSummary();
    }

    // Example 6: Objects using calculated properties
    public static void demonstrateCalculatedProperties() {
        System.out.println("\n=== Example 6: Calculated Properties ===");
        
        class Employee {
            String name;
            double hourlyRate;
            double hoursWorked;
            
            double calculateWeeklyPay() {
                return hourlyRate * hoursWorked;
            }
            
            void giveRaise(double raisePercent) {
                double raiseAmount = hourlyRate * (raisePercent / 100);
                hourlyRate = hourlyRate + raiseAmount;
                System.out.println(name + " received a raise. New hourly rate: $" + hourlyRate);
            }
            
            void displayPayInfo() {
                System.out.println(name + " - Weekly Pay: $" + calculateWeeklyPay());
            }
        }
        
        Employee emp1 = new Employee();
        emp1.name = "Alice";
        emp1.hourlyRate = 25.00;
        emp1.hoursWorked = 40;
        
        emp1.displayPayInfo();
        emp1.giveRaise(10);
        emp1.hoursWorked = 45;
        emp1.displayPayInfo();
    }

    // Example 7: Demonstrating object references
    public static void demonstrateObjectReferences() {
        System.out.println("\n=== Example 7: Object References ===");
        
        class Dog {
            String name;
            
            void bark() {
                System.out.println(name + " says: Woof!");
            }
        }
        
        Dog dog1 = new Dog();
        dog1.name = "Buddy";
        
        // dog2 references the same object as dog1
        Dog dog2 = dog1;
        dog2.name = "Max"; // This changes the object that both dog1 and dog2 refer to
        
        System.out.println("dog1.name: " + dog1.name); // Prints "Max"
        System.out.println("dog2.name: " + dog2.name); // Prints "Max"
        
        dog1.bark(); // Both variables refer to the same object
        dog2.bark();
        
        // dog3 is a new object
        Dog dog3 = new Dog();
        dog3.name = "Charlie";
        
        System.out.println("\ndog1 and dog2 refer to same object: " + (dog1 == dog2));
        System.out.println("dog1 and dog3 refer to different objects: " + (dog1 == dog3));
    }

    public static void main(String[] args) {
        demonstrateBasicClass();
        demonstrateMultipleMethods();
        demonstrateStateChanges();
        demonstrateMultipleObjects();
        demonstrateComplexClass();
        demonstrateCalculatedProperties();
        demonstrateObjectReferences();
    }
}
