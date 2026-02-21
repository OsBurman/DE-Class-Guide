/**
 * Exercise 10: Complete OOP Design - SOLUTION - Product Class
 * 
 * This is the Product class for the online store system.
 * Demonstrates:
 * - Private fields with getters
 * - Static ID generation
 * - Encapsulation
 */
public class Product {
    
    private int productId;
    private String name;
    private double price;
    
    // Static member for unique ID generation
    private static int nextProductId = 1;
    
    // Static method to generate unique ID
    private static int generateId() {
        return nextProductId++;
    }
    
    // Constructor
    public Product(String name, double price) {
        this.productId = generateId();
        this.name = name;
        this.price = price;
    }
    
    // Getters
    public int getProductId() {
        return productId;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    // Display product information
    public void displayProduct() {
        System.out.printf("Product ID: %d, Name: %s, Price: $%.2f%n", productId, name, price);
    }
    
    // Calculate discounted price
    public double applyDiscount(double percent) {
        return price * (1 - percent / 100.0);
    }
    
    public static void main(String[] args) {
        // Create 3 products
        System.out.println("--- Products ---");
        Product product1 = new Product("Laptop", 999.99);
        product1.displayProduct();
        
        Product product2 = new Product("Mouse", 25.99);
        product2.displayProduct();
        
        Product product3 = new Product("Keyboard", 79.99);
        product3.displayProduct();
        System.out.println();
        
        // Test discount
        System.out.println("--- Discounts ---");
        System.out.printf("Laptop with 10%% discount: $%.2f%n", product1.applyDiscount(10));
        System.out.printf("Mouse with 20%% discount: $%.2f%n", product2.applyDiscount(20));
    }
}
