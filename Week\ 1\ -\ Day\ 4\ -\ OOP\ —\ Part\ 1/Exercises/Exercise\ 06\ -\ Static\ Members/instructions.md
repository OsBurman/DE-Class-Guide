# Exercise 06: Static Members - Shared Data and Utility Methods

## Learning Objectives

After completing this exercise, you should be able to:
- Understand the difference between instance and static members
- Create and use static variables for shared data
- Create static methods for utility functions
- Use static constants in classes
- Know when to use static vs instance members

## Problem Statement

You're building a **User** class for a social media platform. The system needs to:
- Track total users created (shared across all instances)
- Generate unique user IDs for each user (static counter)
- Provide utility methods that don't need a specific user
- Share configuration constants

## Requirements

### Part 1: Define the User Class
Create a class called `User` with:

**Static Members**:
- `totalUsers`: static int - count of all users created
- `nextId`: static int - counter for generating unique IDs (starts at 1000)
- `MAX_USERNAME_LENGTH`: static final int = 20
- `generateUsername()`: static method that returns generic username

**Instance Members**:
- `userId`: int - unique ID (assigned from nextId in constructor)
- `username`: String - user's name
- `email`: String - user's email
- `accountCreated`: static field to track creation time/date

**Methods**:
- `User(String username, String email)`: Constructor that increments totalUsers and assigns unique ID
- `displayUser()`: Prints user information
- `getTotalUsers()`: Returns totalUsers count
- `getNextId()`: Returns nextId

### Part 2: Test Your Class
In the `main()` method:
1. Display initial totalUsers count
2. Create 3 users and see totalUsers increment
3. Verify each has unique ID
4. Display user information
5. Show static utility methods
6. Verify totalUsers is shared

## Example Output

```
Initial total users: 0

Creating users...
User 1 created: ID 1000
User 2 created: ID 1001
User 3 created: ID 1002
Total users: 3

--- All Users ---
User ID: 1000, Name: alice_wonder, Email: alice@example.com
User ID: 1001, Name: bob_builder, Email: bob@example.com
User ID: 1002, Name: carol_music, Email: carol@example.com

Utility: Generic username = User_1003
```

## Hints

- Static variables are shared by all instances
- Static methods don't use instance data
- Every time you create an instance, increment totalUsers
- Use static counter to generate unique IDs
- Static final fields are constants

## Testing Tips

- Create multiple users and verify ID uniqueness
- Check that totalUsers increments correctly
- Call static methods without creating objects
- Verify static data is shared (not copied per instance)

## Complexity Assessment

**Difficulty**: Medium  
**Concepts**: Static Variables, Static Methods, Shared Data, Unique ID Generation  
**Time Estimate**: 25-35 minutes
