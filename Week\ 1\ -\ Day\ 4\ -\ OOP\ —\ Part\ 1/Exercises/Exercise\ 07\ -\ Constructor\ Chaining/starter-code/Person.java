/**
 * Exercise 07: Constructor Chaining
 * 
 * TODO: Implement 4 constructors that chain together with this()
 */
public class Person {

    // TODO: Declare three fields
    // String name;
    // int age;
    // String address;

    // TODO: Create full constructor - Person(String name, int age, String address)
    // This is the "primary" constructor

    // TODO: Create Person(String name, int age)
    // Use this() to call the full constructor with address = "Unknown"

    // TODO: Create Person(String name)
    // Use this() to call the 2-param constructor with age = 0

    // TODO: Create Person()
    // Use this() to call the 1-param constructor with name = "No Name"

    // TODO: Create displayPerson() method

    // TODO: Create isAdult() method - returns true if age >= 18

    public static void main(String[] args) {
        // TODO: Test default constructor
        System.out.println("--- Default Person (no arguments) ---");
        Person person1 = new Person();
        person1.displayPerson();
        System.out.println("Is Adult? " + (person1.isAdult() ? "Yes" : "No"));
        System.out.println();

        // TODO: Test 1-param constructor
        System.out.println("--- Person with name only ---");
        Person person2 = new Person("John Smith");
        person2.displayPerson();
        System.out.println("Is Adult? " + (person2.isAdult() ? "Yes" : "No"));
        System.out.println();

        // TODO: Test 2-param constructor
        System.out.println("--- Person with name and age ---");
        Person person3 = new Person("Jane Doe", 25);
        person3.displayPerson();
        System.out.println("Is Adult? " + (person3.isAdult() ? "Yes" : "No"));
        System.out.println();

        // TODO: Test full constructor
        System.out.println("--- Full Person ---");
        Person person4 = new Person("Bob Johnson", 35, "123 Main St");
        person4.displayPerson();
        System.out.println("Is Adult? " + (person4.isAdult() ? "Yes" : "No"));
    }
}
