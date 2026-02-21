/**
 * Exercise 06: Static Members
 * 
 * TODO: Implement the User class with static members for shared data
 */
public class User {

    // TODO: Declare static members
    // static int totalUsers = 0; // Count of all users
    // static int nextId = 1000; // Counter for generating IDs
    // static final int MAX_USERNAME_LENGTH = 20; // Constant

    // TODO: Declare instance members
    // int userId;
    // String username;
    // String email;

    // TODO: Create a static method generateUsername()
    // Returns a generic username like "User_1003"

    // TODO: Create constructor that takes username and email
    // Increments totalUsers
    // Assigns userId from nextId
    // Increments nextId

    // TODO: Create displayUser() method that prints user info

    // TODO: Create static method getTotalUsers()
    // Returns current total user count

    // TODO: Create static method getNextId()
    // Returns the next ID to be assigned

    public static void main(String[] args) {
        // TODO: Display initial total users
        System.out.println("Initial total users: " + getTotalUsers());
        System.out.println();

        // TODO: Create 3 users
        System.out.println("Creating users...");
        User user1 = new User("alice_wonder", "alice@example.com");
        System.out.println("User 1 created: ID " + user1.userId);

        User user2 = new User("bob_builder", "bob@example.com");
        System.out.println("User 2 created: ID " + user2.userId);

        User user3 = new User("carol_music", "carol@example.com");
        System.out.println("User 3 created: ID " + user3.userId);

        System.out.println("Total users: " + getTotalUsers());
        System.out.println();

        // TODO: Display all users
        System.out.println("--- All Users ---");
        user1.displayUser();
        user2.displayUser();
        user3.displayUser();
        System.out.println();

        // TODO: Show static utility method
        System.out.println("Utility: Generic username = " + generateUsername());
    }
}
