/**
 * Exercise 10: Complete OOP Design - Product Class
 * 
 * TODO: Implement the Product class with private fields and static ID
 * generation
 */
public class Product {

    // TODO: Declare private fields
    // private int productId;
    // private String name;
    // private double price;

    // TODO: Declare static members
    // private static int nextProductId = 1;

    // TODO: Create static method generateId()
    // Returns unique ID by incrementing nextProductId

    // TODO: Create constructor that takes name and price
    // Assigns unique productId

    // TODO: Create getters for productId, name, price

    // TODO: Create displayProduct() method

    // TODO: Create applyDiscount(double percent) method
    // Returns: price * (1 - percent/100)

    public static void main(String[] args) {
        // TODO: Create 3 products
        System.out.println("--- Products ---");
        Product product1 = new Product("Laptop", 999.99);
        product1.displayProduct();

        Product product2 = new Product("Mouse", 25.99);
        product2.displayProduct();

        Product product3 = new Product("Keyboard", 79.99);
        product3.displayProduct();
        System.out.println();

        // TODO: Test discount
        System.out.println("--- Discounts ---");
        System.out.printf("Laptop with 10%% discount: $%.2f%n", product1.applyDiscount(10));
        System.out.printf("Mouse with 20%% discount: $%.2f%n", product2.applyDiscount(20));
    }
}
