/**
 * Exercise 07: Constructor Chaining - SOLUTION
 * 
 * This solution demonstrates:
 * - Using this() to delegate to other constructors
 * - Avoiding duplication in initialization logic
 * - Constructor chain from full to simple
 * - Default values for optional parameters
 */
public class Person {
    
    String name;
    int age;
    String address;
    
    // Full constructor - primary constructor with all parameters
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    // Constructor with name and age - delegates to full constructor
    public Person(String name, int age) {
        this(name, age, "Unknown");
    }
    
    // Constructor with name only - delegates to 2-param constructor
    public Person(String name) {
        this(name, 0);
    }
    
    // Default constructor - delegates to 1-param constructor
    public Person() {
        this("No Name");
    }
    
    // Display person information
    void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
    
    // Check if person is adult
    boolean isAdult() {
        return age >= 18;
    }
    
    public static void main(String[] args) {
        // Test default constructor
        System.out.println("--- Default Person (no arguments) ---");
        Person person1 = new Person();
        person1.displayPerson();
        System.out.println("Is Adult? " + (person1.isAdult() ? "Yes" : "No"));
        System.out.println();
        
        // Test 1-param constructor
        System.out.println("--- Person with name only ---");
        Person person2 = new Person("John Smith");
        person2.displayPerson();
        System.out.println("Is Adult? " + (person2.isAdult() ? "Yes" : "No"));
        System.out.println();
        
        // Test 2-param constructor
        System.out.println("--- Person with name and age ---");
        Person person3 = new Person("Jane Doe", 25);
        person3.displayPerson();
        System.out.println("Is Adult? " + (person3.isAdult() ? "Yes" : "No"));
        System.out.println();
        
        // Test full constructor
        System.out.println("--- Full Person ---");
        Person person4 = new Person("Bob Johnson", 35, "123 Main St");
        person4.displayPerson();
        System.out.println("Is Adult? " + (person4.isAdult() ? "Yes" : "No"));
    }
}
