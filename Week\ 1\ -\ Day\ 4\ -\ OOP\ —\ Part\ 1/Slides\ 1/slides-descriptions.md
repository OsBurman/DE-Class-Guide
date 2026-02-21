# Week 1 - Day 4: OOP Part 1 - Classes, Objects, Constructors, Class Members
## Slide Descriptions (Visual Content)

---

## Slide 1: Title Slide
**Main Title**: Week 1 - Day 4: Object-Oriented Programming Part 1
**Subtitle**: Classes, Objects, Constructors, and Class Members
**Visuals**: 
- Large Java logo or code snippet showing a class definition
- Split into sections: Classes | Objects | Constructors | Members

---

## Slide 2: Learning Objectives
**Content**:
- Understand the blueprint-to-instance relationship
- Create classes with fields and methods
- Implement constructors for object initialization
- Use access modifiers for encapsulation
- Apply method overloading for flexible APIs
- Recognize state and behavior interactions

**Visuals**: Checklist with icons for each objective

---

## Slide 3: What is OOP?
**Content**:
- Programming paradigm based on objects
- Objects = data (state) + methods (behavior)
- Real-world modeling
- Key principles: Encapsulation, Inheritance, Polymorphism

**Visuals**: 
- Left side: Real-world objects (Car, Person, Bank Account)
- Right side: OOP equivalents (class definitions)
- Arrow showing transformation

---

## Slide 4: Classes as Blueprints
**Content**:
```
Real World → Programming
Blueprint → Class
House → House class
Individual House → House object (instance)
```

**Code Example**:
```java
class Car {
    String model;
    int year;
    void drive() { }
}
```

**Visuals**: 
- Blueprint metaphor with architectural drawing
- Multiple cars built from blueprint below

---

## Slide 5: Objects and Instantiation
**Content**:
```
Car car1 = new Car();
car2.model = "Toyota";

Car car2 = new Car();
car2.model = "Honda";
```

**Key Points**:
- `new` keyword creates an instance
- Each object has independent state
- Objects reference fields and methods

**Visuals**: 
- Two car objects with different field values
- Memory diagram showing separate storage

---

## Slide 6: Constructors - Automatic Initialization
**Content**:
- Constructors run when objects are created
- Constructors initialize object state
- Every class has at least one constructor
- If not written, Java provides default

**Code Example**:
```java
class Person {
    String name;
    
    Person(String n) {  // Constructor
        name = n;
    }
}
Person p = new Person("Alice");  // Constructor called
```

**Visuals**: Timeline showing constructor execution

---

## Slide 7: Constructor Types
**Content**:
1. **Default Constructor**
   - No parameters
   - Initializes fields to default values

2. **Parameterized Constructor**
   - Accepts parameters
   - Customizes initialization

3. **Constructor Chaining**
   - Uses `this()` to call another constructor
   - Reduces code duplication

**Visuals**: Three constructor examples side-by-side

---

## Slide 8: Constructor Chaining with this()
**Content**:
```java
class Book {
    String title, author;
    int pages;
    
    Book(String t, String a, int p) {  // Full constructor
        title = t;
        author = a;
        pages = p;
    }
    
    Book(String t, String a) {
        this(t, a, 0);  // Chains to full constructor
    }
}
```

**Key Rules**:
- `this()` must be FIRST statement
- Only ONE `this()` per constructor

**Visuals**: Flow arrow showing delegation

---

## Slide 9: Class Members - Fields (State)
**Content**:
- Instance variables hold object data
- Each object has independent copies
- Initialize in constructor
- Access via `objectName.fieldName`

**Example**:
```java
class Student {
    String name;      // Field
    int studentId;
    double gpa;
}
```

**Visuals**: Table showing fields and their types

---

## Slide 10: Class Members - Methods (Behavior)
**Content**:
- Define what objects can do
- Can access and modify fields
- Can accept parameters
- Can return values

**Example**:
```java
class Student {
    String name;
    double gpa;
    
    void study(String subject) {
        System.out.println(name + " studies " + subject);
    }
    
    char getGrade() {
        if (gpa >= 3.5) return 'A';
        // ...
    }
}
```

**Visuals**: Methods with input/output arrows

---

## Slide 11: Getters and Setters
**Content**:
- **Getter**: Read-only access to field
- **Setter**: Controlled write access
- Enables validation and encapsulation

**Example**:
```java
class Account {
    private double balance;
    
    double getBalance() {          // Getter
        return balance;
    }
    
    void setBalance(double amount) { // Setter with validation
        if (amount >= 0) balance = amount;
    }
}
```

**Visuals**: Lock icon representing protected access

---

## Slide 12: Method Overloading (Part 1)
**Content**:
- Same method name, different parameters
- Parameter count, type, or order differs
- Improves API usability
- Compile-time polymorphism (method resolution at compile time)

**Signature Rule**:
```
signature = method name + parameters
Return type ALONE doesn't create overload
```

**Visuals**: Multiple method boxes with same name, different parameters

---

## Slide 13: Method Overloading - Examples
**Code**:
```java
class Calculator {
    int add(int a, int b) { }           // 2 ints
    int add(int a, int b, int c) { }    // 3 ints
    double add(double a, double b) { }  // 2 doubles
}
```

**Usage**:
```
calc.add(5, 3)           → int add(int, int)
calc.add(5, 3, 2)        → int add(int, int, int)
calc.add(5.5, 3.2)       → double add(double, double)
```

**Visuals**: Decision tree showing parameter matching

---

## Slide 14: State and Behavior Relationship
**Content**:
- State = current field values
- Behavior = what methods do based on state
- Same method can have different results based on state

**Example**:
```java
class TrafficLight {
    String color;  // State
    
    void showStatus() {
        if (color.equals("red")) System.out.println("STOP");
        else if (color.equals("green")) System.out.println("GO");
    }
}
```

**Visuals**: 
- Three traffic light states
- Different behavior output for each state

---

## Slide 15: Real-World Object Modeling - Bank Account
**Content**:
```java
class BankAccount {
    // State (Fields)
    private String accountNumber;
    private double balance;
    
    // Behavior (Methods)
    BankAccount(String num, double initial) { }
    void deposit(double amount) { }
    boolean withdraw(double amount) { }
    double getBalance() { }
}
```

**Usage Flow**:
1. Create account
2. Deposit/withdraw
3. Check balance

**Visuals**: Bank account with transactions

---

## Slide 16: Real-World Object Modeling - E-Commerce Order
**Content**:
```java
class Order {
    // State
    String orderId;
    double subtotal;
    String status;      // pending, processing, shipped, delivered
    
    // Behavior
    void calculateTax() { }
    double getTotal() { }
    void ship() { }
    void deliver() { }
}
```

**Visuals**: Order lifecycle with state transitions

---

## Slide 17: Common Mistakes - Parameter Shadowing
**Content**:
**WRONG**:
```java
class Person {
    String name;
    
    Person(String name) {
        name = name;  // ❌ Parameter shadows field!
    }
}
```

**CORRECT** (Two approaches):
```java
// Approach 1: Different parameter names
Person(String n) {
    name = n;  // ✅
}

// Approach 2: Use 'this' (next slide)
Person(String name) {
    this.name = name;  // ✅
}
```

**Visuals**: X mark for wrong, check mark for correct

---

## Slide 18: Introduction to 'this' Keyword
**Content**:
- `this` = reference to current object
- Resolves parameter shadowing
- Enables constructor chaining
- Improves code clarity

**Example**:
```java
class Person {
    String name;
    
    Person(String name) {
        this.name = name;  // 'this' disambiguates
    }
}
```

**Visuals**: "this" pointing to object in memory

---

## Slide 19: Key Takeaways - Part 1
**Content**:
1. **Classes** = blueprints for objects
2. **Objects** = instances with independent state
3. **Constructors** = initialize objects
4. **Fields** = store object data (state)
5. **Methods** = define object behavior
6. **Overloading** = same name, different parameters
7. **State drives behavior** = same method, different results
8. **'this'** = current object reference

**Visuals**: 8 key concept icons

---

## Slide 20: Transition to Part 2
**Content**:
- Part 1: How to create and use objects
- Part 2: How to control access and organize code

**Preview of Part 2**:
- Access Modifiers (public, private, protected)
- Static members (shared state)
- Final keyword (immutability, protection)
- Advanced use of 'this'

**Visuals**: Lock icon for "access control", connection icon for "shared state"

---

## Slide 21: Q&A - Common Questions
**Content**:
- Q: What's the difference between a class and an object?
  A: Class = blueprint, object = instance
  
- Q: Do I always need a constructor?
  A: No, Java provides default, but write explicit for custom initialization
  
- Q: Can methods return values?
  A: Yes! Use return type (not void)

**Visuals**: Speech bubbles for questions/answers

---

## Slide 22: Summary & Next Steps
**Content**:
**Summary**:
- Understand OOP fundamentals
- Create objects with proper initialization
- Use fields and methods effectively

**Next Session** (Part 2):
- Encapsulation with access modifiers
- Shared state with static
- Constant values with final
- Advanced object relationships

**Visuals**: Progress bar showing Part 1 complete, Part 2 coming

---

