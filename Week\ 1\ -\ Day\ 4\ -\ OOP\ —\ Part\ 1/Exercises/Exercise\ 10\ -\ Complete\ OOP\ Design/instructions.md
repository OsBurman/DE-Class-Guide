# Exercise 10: Complete OOP Design - Integrating All Concepts

## Learning Objectives

After completing this exercise, you should be able to:
- Combine all OOP concepts in a real-world scenario
- Design professional classes with proper encapsulation
- Use constructors, methods, static, and access modifiers effectively
- Build a mini-system with multiple interacting classes

## Problem Statement

You're building a simple **Online Store** system with:
- A **Product** class representing items for sale
- A **ShoppingCart** class that holds products and tracks totals
- Proper encapsulation and validation
- Static tracking of cart count
- Method chaining for adding items

## Requirements

### Part 1: Product Class
Create a class called `Product` with:

**Fields** (private):
- `productId`: int (unique ID from static counter)
- `name`: String
- `price`: double

**Static**:
- `nextProductId`: static int counter
- `generateId()`: static method returning unique ID

**Methods**:
- `Product(String name, double price)`: Constructor
- `getProductId()`, `getName()`, `getPrice()`: Getters
- `displayProduct()`: Prints product info
- `applyDiscount(double percent)`: Returns discounted price

### Part 2: ShoppingCart Class
Create a class called `ShoppingCart` with:

**Fields** (private):
- `cartId`: final int (set once, unique)
- `items`: array to hold products
- `itemCount`: tracks number of items

**Static**:
- `totalCarts`: static counter
- `MAX_ITEMS`: static final = 10

**Methods**:
- `ShoppingCart()`: Constructor that increments totalCarts
- `addItem(Product product)`: Adds item, returns this for chaining
- `removeItem()`: Removes last item, returns this
- `calculateTotal()`: Sums prices of all items
- `displayCart()`: Shows all items and total
- `getTotalCarts()`: Static method returning cart count

### Part 3: Test Your Classes
In the `main()` method:
1. Create 3 products with unique IDs
2. Create 2 shopping carts
3. Add items using method chaining
4. Display cart contents
5. Show totals
6. Verify static tracking

## Example Output

```
--- Products ---
Product ID: 1, Name: Laptop, Price: $999.99
Product ID: 2, Name: Mouse, Price: $25.99
Product ID: 3, Name: Keyboard, Price: $79.99

--- Shopping Cart 1 ---
Cart Contents:
  - Mouse ($25.99)
  - Keyboard ($79.99)
Total: $105.98

--- Shopping Cart 2 ---
Cart Contents:
  - Laptop ($999.99)
Total: $999.99

Total Carts Created: 2
```

## Hints

- Use private fields with getters/setters for protection
- Static counters track unique IDs and cart count
- Method chaining enables fluent API
- Arrays to hold products
- Validate all inputs

## Testing Tips

- Verify unique product IDs
- Test adding/removing from cart
- Calculate totals correctly
- Verify static counter increments
- Test method chaining
- Try different combinations of products

## Complexity Assessment

**Difficulty**: Hard (Comprehensive)  
**Concepts**: All OOP basics integrated, multiple classes, arrays, encapsulation  
**Time Estimate**: 45-60 minutes
