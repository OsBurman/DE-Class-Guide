/**
 * This Keyword Demo
 * 
 * Demonstrates:
 * - 'this' refers to current object
 * - 'this.fieldName' accesses instance fields
 * - 'this.methodName()' calls instance methods
 * - 'this()' calls other constructors
 * - Resolving shadowing with 'this'
 * 
 * Key Concepts:
 * - 'this' is an implicit reference to the current object
 * - Used to disambiguate when names conflict
 * - Required for constructor chaining
 * - Improves code clarity and correctness
 */

public class ThisKeywordDemo {

    // Example 1: Using 'this' to access fields
    public static void demonstrateFieldAccess() {
        System.out.println("=== Example 1: Accessing Fields with 'this' ===");

        class Person {
            String name;
            int age;

            Person(String name, int age) {
                this.name = name; // 'this.name' refers to field, 'name' refers to parameter
                this.age = age;
            }

            void display() {
                System.out.println("Name: " + this.name); // 'this' is optional here
                System.out.println("Age: " + this.age);
            }

            void resetAge() {
                this.age = 0; // Clear the field
            }
        }

        Person person = new Person("Alice", 25);
        person.display();
        person.resetAge();
        person.display();
    }

    // Example 2: Resolving parameter shadowing
    public static void demonstrateShadowingResolution() {
        System.out.println("\n=== Example 2: Resolving Shadowing ===");

        class Rectangle {
            double width;
            double height;

            Rectangle(double width, double height) {
                // WITHOUT 'this', these assignments would fail!
                this.width = width; // 'this' disambiguates
                this.height = height;

                System.out.println("Rectangle created: " + this.width + " x " + this.height);
            }

            double getArea() {
                return this.width * this.height;
            }
        }

        Rectangle rect = new Rectangle(10, 5);
        System.out.println("Area: " + rect.getArea());
    }

    // Example 3: Using 'this' to call other methods
    public static void demonstrateMethodCalls() {
        System.out.println("\n=== Example 3: Calling Methods with 'this' ===");

        class Student {
            String name;
            int[] grades = { 0, 0, 0 };

            void setGrades(int g1, int g2, int g3) {
                grades[0] = g1;
                grades[1] = g2;
                grades[2] = g3;
            }

            double calculateAverage() {
                return (grades[0] + grades[1] + grades[2]) / 3.0;
            }

            void displayGradeInfo() {
                // Explicitly using 'this' to call another method
                System.out.println("Average: " + this.calculateAverage());
                this.displayIndividualGrades();
            }

            void displayIndividualGrades() {
                System.out.println("Grades: " + grades[0] + ", " + grades[1] + ", " + grades[2]);
            }
        }

        Student student = new Student();
        student.name = "Bob";
        student.setGrades(85, 90, 78);
        student.displayGradeInfo();
    }

    // Example 4: Constructor chaining with 'this()'
    public static void demonstrateConstructorChaining() {
        System.out.println("\n=== Example 4: Constructor Chaining with this() ===");

        class Book {
            String title;
            String author;
            int pages;

            // Full constructor
            Book(String title, String author, int pages) {
                this.title = title;
                this.author = author;
                this.pages = pages;
                System.out.println("Created: " + title);
            }

            // Constructor delegating to full constructor
            Book(String title, String author) {
                this(title, author, 0); // 'this()' calls 3-parameter constructor
                System.out.println("(using default pages)");
            }

            // Minimal constructor
            Book(String title) {
                this(title, "Unknown"); // 'this()' calls 2-parameter constructor
            }

            void display() {
                System.out.println(title + " by " + author + " (" + pages + " pages)");
            }
        }

        Book b1 = new Book("Java Programming");
        b1.display();

        System.out.println();

        Book b2 = new Book("Clean Code", "Robert Martin");
        b2.display();
    }

    // Example 5: 'this' returning the object
    public static void demonstrateReturningThis() {
        System.out.println("\n=== Example 5: Returning 'this' for Chaining ===");

        class StringBuilder {
            String value = "";

            StringBuilder append(String str) {
                value = value + str;
                return this; // Return the current object
            }

            StringBuilder append(int num) {
                value = value + num;
                return this;
            }

            String build() {
                return value;
            }
        }

        // Method chaining made possible by returning 'this'
        String result = new StringBuilder()
                .append("Hello")
                .append(" ")
                .append("World")
                .append(" ")
                .append(2024)
                .build();

        System.out.println("Result: " + result);
    }

    // Example 6: Comparing objects with 'this'
    public static void demonstrateComparison() {
        System.out.println("\n=== Example 6: Comparing with 'this' ===");

        class Employee {
            String id;
            String name;

            Employee(String id, String name) {
                this.id = id;
                this.name = name;
            }

            boolean isSameEmployee(Employee other) {
                // Compare 'this' employee with another
                return this.id.equals(other.id);
            }

            boolean isEqual(Employee other) {
                return this.id.equals(other.id) && this.name.equals(other.name);
            }
        }

        Employee emp1 = new Employee("E001", "Alice");
        Employee emp2 = new Employee("E001", "Alice");
        Employee emp3 = new Employee("E002", "Bob");

        System.out.println("emp1 same as emp2: " + emp1.isSameEmployee(emp2));
        System.out.println("emp1 equal to emp2: " + emp1.isEqual(emp2));
        System.out.println("emp1 same as emp3: " + emp1.isSameEmployee(emp3));
    }

    // Example 7: 'this' in complex scenarios
    public static void demonstrateComplexScenario() {
        System.out.println("\n=== Example 7: Complex Scenario ===");

        class BankAccount {
            String accountNumber;
            double balance;

            BankAccount(String num, double initial) {
                this.accountNumber = num;
                this.balance = initial;
            }

            void transfer(BankAccount recipient, double amount) {
                // 'this' is the source, 'recipient' is the destination
                if (this.balance >= amount) {
                    this.balance = this.balance - amount;
                    recipient.balance = recipient.balance + amount;
                    System.out.println("Transferred $" + amount +
                            " from " + this.accountNumber +
                            " to " + recipient.accountNumber);
                } else {
                    System.out.println("Insufficient funds in " + this.accountNumber);
                }
            }

            void displayBalance() {
                System.out.println(this.accountNumber + ": $" + this.balance);
            }
        }

        BankAccount acc1 = new BankAccount("A001", 1000);
        BankAccount acc2 = new BankAccount("A002", 500);

        acc1.displayBalance();
        acc2.displayBalance();

        acc1.transfer(acc2, 200);

        System.out.println("After transfer:");
        acc1.displayBalance();
        acc2.displayBalance();
    }

    // Example 8: 'this' vs without 'this'
    public static void demonstrateOptionalUse() {
        System.out.println("\n=== Example 8: 'this' is Optional (Usually) ===");

        class Counter {
            int count;

            void increment() {
                // All these are equivalent:
                count++; // Direct access
                this.count++; // Explicit with 'this'
                // Both work, but explicit is clearer sometimes
            }

            void getStatus() {
                System.out.println("Count: " + count); // Works
                System.out.println("Count: " + this.count); // Also works
            }
        }

        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.getStatus();
    }

    // Example 9: 'this' requirement in constructor chaining
    public static void demonstrateChainingRequirement() {
        System.out.println("\n=== Example 9: 'this()' Must Be First ===");

        class Configuration {
            String host;
            int port;
            boolean ssl;

            Configuration(String host, int port, boolean ssl) {
                this.host = host;
                this.port = port;
                this.ssl = ssl;
            }

            Configuration(String host, int port) {
                this(host, port, false); // 'this()' must be FIRST
                System.out.println("SSL disabled by default");
            }

            // THIS WOULD BE WRONG:
            // Configuration(String host) {
            // System.out.println("Creating config"); // Can't do this first!
            // this(host, 8080); // 'this()' must be first
            // }
        }

        Configuration config = new Configuration("localhost", 8080);
    }

    public static void main(String[] args) {
        demonstrateFieldAccess();
        demonstrateShadowingResolution();
        demonstrateMethodCalls();
        demonstrateConstructorChaining();
        demonstrateReturningThis();
        demonstrateComparison();
        demonstrateComplexScenario();
        demonstrateOptionalUse();
        demonstrateChainingRequirement();
    }
}
