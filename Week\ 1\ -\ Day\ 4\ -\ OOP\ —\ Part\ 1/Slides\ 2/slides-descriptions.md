# Week 1 - Day 4: OOP Part 2 - Access Modifiers, Static, Final, This
## Slide Descriptions (Visual Content)

---

## Slide 1: Title Slide
**Main Title**: Week 1 - Day 4: Object-Oriented Programming Part 2
**Subtitle**: Access Modifiers, Static, Final, and Advanced Techniques
**Visuals**: 
- Lock icon for "access control"
- Connected nodes for "static/shared"
- Immutable symbol for "final"
- Pointing arrow for "this"

---

## Slide 2: Learning Objectives
**Content**:
- Control access to class members with access modifiers
- Distinguish between instance and static members
- Create constants with the final keyword
- Use 'this' to resolve ambiguities
- Design professional-grade OOP classes
- Implement encapsulation best practices

**Visuals**: Checklist with security, sharing, and protection icons

---

## Slide 3: Access Modifiers Overview
**Content**:
```
Least Restrictive          Most Restrictive
    public    <----->    private
   default   <----->    protected
```

**Four Levels**:
1. `public` - Accessible everywhere
2. `protected` - Same package + subclasses
3. `default` - Same package only
4. `private` - Same class only

**Visuals**: Concentric circles showing restriction levels

---

## Slide 4: Private - The Gatekeeper
**Content**:
```java
class BankAccount {
    private double balance;  // 🔒 Protected
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) balance += amount;  // Validated
    }
}
```

**Benefits**:
- Protects invariants (balance ≥ 0)
- Hides implementation details
- Enables validation

**Visuals**: Lock icon, fields hidden behind methods

---

## Slide 5: Public - Full Access
**Content**:
```java
class Configuration {
    public String apiKey;      // Anyone can access
    public int timeout;
    
    public void reload() {     // Anyone can call
        // ...
    }
}
```

**When to Use Public**:
- Safe data (constants)
- Primary API methods
- Intentionally shared

**Visuals**: Open door/no barriers icon

---

## Slide 6: Protected - For Inheritance
**Content**:
```java
class Vehicle {
    protected String color;     // Accessible in subclasses
    private int id;             // NOT accessible
}

class Car extends Vehicle {
    void paint(String newColor) {
        this.color = newColor;  // ✅ Can access protected
        // this.id = 5;          // ❌ Can't access private
    }
}
```

**When to Use Protected**:
- Inheritance-related data
- Controlled parent-child communication

**Visuals**: Arrow pointing from child to parent

---

## Slide 7: Default (Package-Private)
**Content**:
```java
class Helper {
    int value;   // No modifier = default
}
```

**Scope**: Same package only
**When to Use**: Rarely; mostly internal utilities
**Visuals**: Package icon showing boundary

---

## Slide 8: Encapsulation Pattern
**Content**:
```java
class Temperature {
    private double celsius;     // 🔒 Hidden
    
    public double getCelsius() {           // Public getter
        return celsius;
    }
    
    public void setCelsius(double c) {     // Public setter
        if (c >= -273.15) {                // Validation
            celsius = c;
        }
    }
}
```

**Benefits**:
- Protect object state
- Validate changes
- Flexibility for future changes

**Visuals**: Encapsulation diagram: field → method → user

---

## Slide 9: Read-Only and Write-Only Properties
**Content**:

**Read-Only** (Getter only):
```java
public String getUsername() { return username; }
// No setter - can't change
```

**Write-Only** (Setter only):
```java
public void setPassword(String pwd) { /* ... */ }
// No getter - can't read
```

**Visuals**: Eye icon (readable) vs Pencil icon (writable)

---

## Slide 10: Static Variables - Shared State
**Content**:
```java
class User {
    static int totalUsers = 0;     // Shared by ALL users
    String name;                   // Each user has own
    
    User(String n) {
        name = n;
        totalUsers++;              // Increment shared counter
    }
}
```

**Key Concept**: All instances share ONE static variable

**Visual**: 
- Multiple objects pointing to single static variable
- Each object with own instance variable

---

## Slide 11: Static Methods
**Content**:
```java
class MathUtils {
    static int max(int a, int b) {
        return a > b ? a : b;
    }
    
    static double sqrt(double num) {
        // ...
    }
}

// Call without creating object
int result = MathUtils.max(5, 10);
```

**When to Use**:
- Utility functions
- No instance state needed
- Stateless operations

**Visuals**: Method with no 'this' context

---

## Slide 12: Static Constants
**Content**:
```java
class Constants {
    static final double PI = 3.14159;
    static final int MAX_USERS = 1000;
    static final String VERSION = "1.0.0";
}

// Access
System.out.println(Constants.PI);
```

**Pattern**: 
- Convention: UPPERCASE names
- Shared across all instances
- Cannot be changed

**Visuals**: Constant symbols (π, ∞, lock)

---

## Slide 13: Static vs Instance - Comparison Matrix
**Content**:
```
ASPECT              STATIC              INSTANCE
Access              ClassName.member    object.member
Shared?             YES - all instances ONE per object
Exists when?        Class loads         Object created
Can access          Static only         Static + Instance
Use case            Constants, Utils    Object data
Memory              Single copy         One per object
```

**Visuals**: Side-by-side comparison table

---

## Slide 14: Common Static Pattern - Singleton
**Content**:
```java
class Database {
    private static Database instance;
    
    private Database() { }  // Can't instantiate
    
    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;  // Always same object
    }
}

Database db1 = Database.getInstance();
Database db2 = Database.getInstance();
// db1 == db2  →  true!
```

**Pattern**: One instance for entire application

**Visuals**: Single box with multiple arrows pointing to it

---

## Slide 15: Final Variables - Constants
**Content**:
```java
class Circle {
    final double PI = 3.14159;      // Can't change
    final int radius;               // Must set once
    
    Circle(int r) {
        radius = r;                 // Set in constructor
        // radius = 10;              // ❌ Can't change after
    }
}
```

**Key Rule**: Set once, never change

**Visuals**: Locked box, key thrown away

---

## Slide 16: Final Caveat - Objects vs References
**Content**:
```java
final int[] array = {1, 2, 3};

// array = new int[5];      ❌ Can't reassign reference
array[0] = 99;              ✅ Can modify contents
```

**Distinction**:
- Reference immutable: can't point elsewhere
- Contents mutable: can still change what's inside

**Visuals**: Reference arrow (fixed) vs contents (flexible)

---

## Slide 17: Final Methods - Prevention
**Content**:
```java
class Animal {
    final void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    // ❌ Can't override final method
    // void sleep() { }
}
```

**When to Use**: 
- Critical methods that subclasses shouldn't change
- Banks use for security operations

**Visuals**: "No Override" prohibition sign

---

## Slide 18: Final Classes - Complete Prevention
**Content**:
```java
final class ImmutableData {
    // Can't be extended
}

// ❌ Compiler error
// class MyData extends ImmutableData { }
```

**Examples in Java**: String, Integer, other immutable types

**When to Use**: 
- Prevent tampering
- Security-critical classes
- Immutable value types

**Visuals**: Sealed container icon

---

## Slide 19: The 'this' Keyword - Context
**Content**:
```java
class Person {
    String name;
    
    Person(String name) {
        this.name = name;      // 'this' = current object
    }
    
    void greet() {
        System.out.println("I am " + this.name);
    }
}
```

**'this' Means**:
- Reference to current object
- Disambiguates when names conflict

**Visuals**: Arrow pointing to object in memory

---

## Slide 20: Using 'this' for Constructor Chaining
**Content**:
```java
class Book {
    String title, author;
    int pages;
    
    Book(String t, String a, int p) {
        this.title = t;
        this.author = a;
        this.pages = p;
    }
    
    Book(String t, String a) {
        this(t, a, 0);          // Calls 3-parameter constructor
    }
}
```

**Rules**:
- MUST be first statement
- Only ONE `this()` per constructor

**Visuals**: Constructor chain arrows

---

## Slide 21: Using 'this' for Method Chaining
**Content**:
```java
class StringBuilder {
    String value = "";
    
    StringBuilder append(String str) {
        value += str;
        return this;            // Return the object
    }
}

// Chaining
String result = new StringBuilder()
    .append("Hello")
    .append(" ")
    .append("World")
    .build();
```

**Pattern**: Each method returns 'this' for chaining

**Visuals**: Chained arrows showing sequential calls

---

## Slide 22: Encapsulation Summary - Professional Design
**Content**:
```java
public class User {
    // Private state
    private String email;
    private String password;
    private boolean active;
    
    // Public interface
    public User(String email) { }
    public String getEmail() { }
    public void setPassword(String pwd) { }
    public boolean isActive() { }
    private void validate() { }  // Private helper
}
```

**Design Principles**:
- Fields: private
- API: public
- Helpers: private
- Validation: in setters

**Visuals**: Public interface wrapper around private data

---

## Slide 23: Key Takeaways - Part 2
**Content**:
1. **Access Modifiers** - Control visibility (private protects)
2. **Encapsulation** - Hide implementation, expose interface
3. **Static** - Shared data and utility functions
4. **Final** - Constants and prevention
5. **'this'** - Current object, chaining
6. **Professional Design** - Private data, public interface

**Visuals**: Icons for each concept

---

## Slide 24: Real-World Encapsulation - Bank Account Revisited
**Content**:
```java
public class BankAccount {
    private String accountNumber;
    private double balance;
    
    public BankAccount(String num, double initial) {
        if (initial >= 0) {
            accountNumber = num;
            balance = initial;
        }
    }
    
    public double getBalance() { return balance; }
    
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
}
```

**Encapsulation Benefits**:
- Can't access/modify balance directly
- Validation prevents invalid states
- Implementation can change without affecting users

**Visuals**: Fortified bank vault

---

## Slide 25: Q&A and Common Questions
**Content**:
- Q: Why make fields private?
  A: Protection, validation, flexibility
  
- Q: When use static?
  A: Shared data, utility methods, constants
  
- Q: Why use final?
  A: Constants, prevent accidental changes, security

**Visuals**: Question marks, thought bubbles

---

## Slide 26: Part 2 vs Part 1 Relationship
**Content**:
**Part 1**: How to structure code
- Classes and objects
- Fields and methods
- Constructors and initialization

**Part 2**: How to protect and organize
- Access modifiers (who sees what)
- Static (sharing patterns)
- Final (immutability)
- 'this' (object references)

**Together**: Professional OOP design

**Visuals**: Two puzzle pieces fitting together

---

## Slide 27: Transition to Day 5 (Inheritance)
**Content**:
- Part 1 & 2: Single object design
- Day 5: Multiple objects with relationships
- Inheritance: objects with parent-child bonds
- Polymorphism: flexible object hierarchies

**Preview**: Hierarchy diagrams, is-a relationships

---

## Slide 28: Summary & Homework
**Content**:
**Summary**:
- Access modifiers control encapsulation
- Static for sharing and utilities
- Final for constants and protection
- 'this' for clarity and chaining

**Design Challenge**:
- Redesign Day 1 project with proper encapsulation
- Private fields, public interface
- Getters/setters with validation
- Static where appropriate

**Next Session**:
- Inheritance and polymorphism
- Real power of OOP

**Visuals**: Achievement unlocked badge, forward arrow

---

