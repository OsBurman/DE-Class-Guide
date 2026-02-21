# Exercise 01: Basic Class Design - Creating Your First OOP Class

## Learning Objectives

After completing this exercise, you should be able to:
- Define a class with fields and methods
- Create objects by instantiating a class
- Understand object state and behavior
- Access object members using dot notation
- Recognize the difference between a class (blueprint) and an object (instance)

## Problem Statement

You need to design a **Book** class to represent books in a library system. Each book has properties (title, author, pages) and behaviors (display info, check if it's long).

## Requirements

### Part 1: Define the Book Class
Create a class called `Book` with:

**Fields**:
- `title`: String - the book's title
- `author`: String - the author's name
- `pages`: int - number of pages

**Methods**:
- `displayInfo()`: Prints the book details in format: "Title: [title], Author: [author], Pages: [pages]"
- `isLongBook()`: Returns true if pages > 300, false otherwise
- `getDescription()`: Returns a String describing the book (e.g., "The Great Gatsby by F. Scott Fitzgerald")

### Part 2: Test Your Class
In the `main()` method:
1. Create 3 Book objects with different data
2. Call `displayInfo()` on each book
3. Check `isLongBook()` for each and print the result
4. Print the description using `getDescription()`

### Part 3: Observations
You should observe that:
- Each object maintains its own state (its own title, author, pages)
- Multiple objects can exist at the same time
- Objects are created using the `new` keyword

## Example Output

```
--- Book 1 ---
Title: The Great Gatsby, Author: F. Scott Fitzgerald, Pages: 180
Is long book? false
Description: The Great Gatsby by F. Scott Fitzgerald

--- Book 2 ---
Title: War and Peace, Author: Leo Tolstoy, Pages: 1225
Is long book? true
Description: War and Peace by Leo Tolstoy

--- Book 3 ---
Title: Harry Potter and the Sorcerer's Stone, Author: J.K. Rowling, Pages: 309
Is long book? true
Description: Harry Potter and the Sorcerer's Stone by J.K. Rowling
```

## Hints

- Remember: A class is just a blueprint. Objects are the actual instances.
- Use `System.out.println()` to print information
- Method names should be descriptive (displayInfo, not showData)
- Think about what information each method needs to return or print

## Testing Tips

- Test with books of different page counts (< 300, > 300, exactly 300)
- Verify that each object's state is independent
- Check that the output matches the expected format

## Complexity Assessment

**Difficulty**: Easy  
**Concepts**: Classes, Objects, Fields, Methods, Object State  
**Time Estimate**: 20-30 minutes
