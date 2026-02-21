/**
 * Exercise 01: Basic Class Design - SOLUTION
 * 
 * This solution demonstrates:
 * - Defining a class with fields and methods
 * - Creating multiple objects with independent state
 * - Using object members via dot notation
 */
public class Book {

    // Fields - state of each book object
    String title;
    String author;
    int pages;

    // Method to display book information
    void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    }

    // Method to check if book is considered "long"
    boolean isLongBook() {
        return pages > 300;
    }

    // Method to get a description string
    String getDescription() {
        return title + " by " + author;
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Create Book 1
        System.out.println("--- Book 1 ---");
        Book book1 = new Book();
        book1.title = "The Great Gatsby";
        book1.author = "F. Scott Fitzgerald";
        book1.pages = 180;
        book1.displayInfo();
        System.out.println("Is long book? " + book1.isLongBook());
        System.out.println("Description: " + book1.getDescription());

        System.out.println();

        // Create Book 2
        System.out.println("--- Book 2 ---");
        Book book2 = new Book();
        book2.title = "War and Peace";
        book2.author = "Leo Tolstoy";
        book2.pages = 1225;
        book2.displayInfo();
        System.out.println("Is long book? " + book2.isLongBook());
        System.out.println("Description: " + book2.getDescription());

        System.out.println();

        // Create Book 3
        System.out.println("--- Book 3 ---");
        Book book3 = new Book();
        book3.title = "Harry Potter and the Sorcerer's Stone";
        book3.author = "J.K. Rowling";
        book3.pages = 309;
        book3.displayInfo();
        System.out.println("Is long book? " + book3.isLongBook());
        System.out.println("Description: " + book3.getDescription());
    }
}
