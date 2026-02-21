/**
 * Exercise 06: Static Members - SOLUTION
 * 
 * This solution demonstrates:
 * - Static variables shared across all instances
 * - Static methods for utilities and generation
 * - Unique ID generation using static counters
 * - Difference between instance and static data
 */
public class User {
    
    // Static members - shared by all User instances
    static int totalUsers = 0;
    static int nextId = 1000;
    static final int MAX_USERNAME_LENGTH = 20;
    
    // Instance members - each user has their own
    int userId;
    String username;
    String email;
    
    // Static method to generate generic username
    static String generateUsername() {
        return "User_" + nextId;
    }
    
    // Constructor
    public User(String username, String email) {
        this.userId = nextId;
        this.username = username;
        this.email = email;
        
        // Update static counters
        totalUsers++;
        nextId++;
    }
    
    // Display user information
    void displayUser() {
        System.out.printf("User ID: %d, Name: %s, Email: %s%n", userId, username, email);
    }
    
    // Static method to get total users
    static int getTotalUsers() {
        return totalUsers;
    }
    
    // Static method to get next ID
    static int getNextId() {
        return nextId;
    }
    
    public static void main(String[] args) {
        // Display initial state
        System.out.println("Initial total users: " + getTotalUsers());
        System.out.println();
        
        // Create users
        System.out.println("Creating users...");
        User user1 = new User("alice_wonder", "alice@example.com");
        System.out.println("User 1 created: ID " + user1.userId);
        
        User user2 = new User("bob_builder", "bob@example.com");
        System.out.println("User 2 created: ID " + user2.userId);
        
        User user3 = new User("carol_music", "carol@example.com");
        System.out.println("User 3 created: ID " + user3.userId);
        
        System.out.println("Total users: " + getTotalUsers());
        System.out.println();
        
        // Display all users
        System.out.println("--- All Users ---");
        user1.displayUser();
        user2.displayUser();
        user3.displayUser();
        System.out.println();
        
        // Show static utility
        System.out.println("Utility: Generic username = " + generateUsername());
    }
}
