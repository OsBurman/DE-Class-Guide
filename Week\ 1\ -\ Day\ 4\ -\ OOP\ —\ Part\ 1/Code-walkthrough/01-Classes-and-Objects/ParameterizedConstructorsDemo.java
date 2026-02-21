/**
 * Parameterized Constructors Demo
 * 
 * Demonstrates:
 * - Constructors with parameters
 * - Passing values when creating objects
 * - Multiple parameters of different types
 * - Parameter names and shadowing
 * - Initialization with specific values
 * 
 * Key Concepts:
 * - Parameters allow customization during object creation
 * - Each parameter can have a different type
 * - Parameters are local to the constructor
 * - Allows objects to be created with different initial states
 */

public class ParameterizedConstructorsDemo {

    // Example 1: Single parameter constructor
    public static void demonstrateSingleParameter() {
        System.out.println("=== Example 1: Single Parameter Constructor ===");
        
        class Book {
            String title;
            
            Book(String t) {
                title = t;
            }
            
            void display() {
                System.out.println("Book: " + title);
            }
        }
        
        Book book1 = new Book("Java Programming");
        Book book2 = new Book("Clean Code");
        Book book3 = new Book("Design Patterns");
        
        book1.display();
        book2.display();
        book3.display();
    }

    // Example 2: Multiple parameters
    public static void demonstrateMultipleParameters() {
        System.out.println("\n=== Example 2: Multiple Parameters ===");
        
        class Student {
            String name;
            int id;
            double gpa;
            
            Student(String n, int i, double g) {
                name = n;
                id = i;
                gpa = g;
            }
            
            void display() {
                System.out.println("Student: " + name + " | ID: " + id + " | GPA: " + gpa);
            }
        }
        
        Student s1 = new Student("Alice", 101, 3.8);
        Student s2 = new Student("Bob", 102, 3.5);
        Student s3 = new Student("Charlie", 103, 3.2);
        
        s1.display();
        s2.display();
        s3.display();
    }

    // Example 3: Different parameter types
    public static void demonstrateDifferentTypes() {
        System.out.println("\n=== Example 3: Different Parameter Types ===");
        
        class Car {
            String model;
            int year;
            String color;
            double price;
            boolean automatic;
            
            Car(String m, int y, String c, double p, boolean a) {
                model = m;
                year = y;
                color = c;
                price = p;
                automatic = a;
            }
            
            void displayInfo() {
                String transmission = automatic ? "Automatic" : "Manual";
                System.out.println(year + " " + model + " | " + color + " | $" + price + " | " + transmission);
            }
        }
        
        Car car1 = new Car("Toyota Camry", 2022, "Blue", 28000, true);
        Car car2 = new Car("Honda Civic", 2021, "Red", 24000, false);
        
        car1.displayInfo();
        car2.displayInfo();
    }

    // Example 4: Constructor performing calculations
    public static void demonstrateConstructorCalculations() {
        System.out.println("\n=== Example 4: Constructor Performing Calculations ===");
        
        class Rectangle {
            double width;
            double height;
            double area;
            double perimeter;
            
            Rectangle(double w, double h) {
                width = w;
                height = h;
                area = width * height;
                perimeter = 2 * (width + height);
            }
            
            void display() {
                System.out.println("Rectangle: " + width + "x" + height + 
                                 " | Area: " + area + " | Perimeter: " + perimeter);
            }
        }
        
        Rectangle rect1 = new Rectangle(5, 3);
        Rectangle rect2 = new Rectangle(10, 8);
        
        rect1.display();
        rect2.display();
    }

    // Example 5: Parameter shadowing
    public static void demonstrateParameterShadowing() {
        System.out.println("\n=== Example 5: Parameter Shadowing (Without 'this') ===");
        
        class Person {
            String name;
            int age;
            
            // Parameters have same names as fields
            Person(String name, int age) {
                // This assignment uses the parameter, NOT the field
                name = name; // WRONG! This doesn't do what we want
                age = age;   // WRONG! This doesn't do what we want
            }
            
            void display() {
                System.out.println("Name: " + name + " | Age: " + age);
            }
        }
        
        Person person = new Person("John", 25);
        person.display(); // Name and age will be null and 0 (default values)
        
        System.out.println("Notice: name and age weren't initialized!");
        System.out.println("This is why we need the 'this' keyword (shown in next example)");
    }

    // Example 6: Using different parameter names to avoid shadowing
    public static void demonstrateAvoidingShadowing() {
        System.out.println("\n=== Example 6: Avoiding Shadowing with Different Names ===");
        
        class Employee {
            String name;
            int employeeId;
            double salary;
            
            // Using different parameter names
            Employee(String n, int id, double sal) {
                name = n;
                employeeId = id;
                salary = sal;
            }
            
            void display() {
                System.out.println("Employee: " + name + " | ID: " + employeeId + " | Salary: $" + salary);
            }
        }
        
        Employee emp1 = new Employee("Alice", 1001, 75000);
        Employee emp2 = new Employee("Bob", 1002, 80000);
        
        emp1.display();
        emp2.display();
    }

    // Example 7: Constructor with validation
    public static void demonstrateConstructorValidation() {
        System.out.println("\n=== Example 7: Constructor with Validation ===");
        
        class Age {
            int years;
            
            Age(int y) {
                if (y >= 0 && y <= 150) {
                    years = y;
                    System.out.println("Valid age: " + y);
                } else {
                    years = 0;
                    System.out.println("Invalid age provided: " + y + " (set to 0)");
                }
            }
            
            void display() {
                System.out.println("Age: " + years + " years");
            }
        }
        
        Age age1 = new Age(25);
        Age age2 = new Age(150);
        Age age3 = new Age(200); // Invalid, set to 0
        Age age4 = new Age(-5);  // Invalid, set to 0
        
        age1.display();
        age2.display();
        age3.display();
        age4.display();
    }

    // Example 8: Constructor with complex initialization
    public static void demonstrateComplexInitialization() {
        System.out.println("\n=== Example 8: Complex Initialization ===");
        
        class BankAccount {
            String accountNumber;
            String accountHolder;
            double balance;
            int transactionCount;
            
            BankAccount(String holder, double initialDeposit) {
                accountHolder = holder;
                accountNumber = "ACC" + System.currentTimeMillis();
                balance = initialDeposit;
                transactionCount = 1;
                
                System.out.println("New account created:");
                System.out.println("  Account Number: " + accountNumber);
                System.out.println("  Holder: " + accountHolder);
                System.out.println("  Initial Balance: $" + balance);
            }
            
            void displayInfo() {
                System.out.println(accountHolder + " | " + accountNumber + " | Balance: $" + balance);
            }
        }
        
        BankAccount acc1 = new BankAccount("Alice", 5000);
        BankAccount acc2 = new BankAccount("Bob", 10000);
        
        System.out.println();
        acc1.displayInfo();
        acc2.displayInfo();
    }

    public static void main(String[] args) {
        demonstrateSingleParameter();
        demonstrateMultipleParameters();
        demonstrateDifferentTypes();
        demonstrateConstructorCalculations();
        demonstrateParameterShadowing();
        demonstrateAvoidingShadowing();
        demonstrateConstructorValidation();
        demonstrateComplexInitialization();
    }
}
