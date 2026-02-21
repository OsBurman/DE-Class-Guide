/**
 * Exercise 10: Complete OOP Design - ShoppingCart Class
 * 
 * TODO: Implement the ShoppingCart class
 */
public class ShoppingCart {
    
    // TODO: Declare private fields
    // private final int cartId;
    // private Product[] items;
    // private int itemCount;
    
    
    // TODO: Declare static members
    // private static int totalCarts = 0;
    // static final int MAX_ITEMS = 10;
    
    
    // TODO: Create constructor
    // Generates unique cartId
    // Increments totalCarts
    // Initialize items array with MAX_ITEMS capacity
    
    
    // TODO: Create addItem(Product product) method
    // Adds product to items array
    // Returns this for chaining
    
    
    // TODO: Create removeItem() method
    // Removes last item (if any)
    // Returns this for chaining
    
    
    // TODO: Create calculateTotal() method
    // Sums all product prices
    
    
    // TODO: Create displayCart() method
    
    
    // TODO: Create static getTotalCarts() method
    
    
    public static void main(String[] args) {
        // TODO: Create products
        Product laptop = new Product("Laptop", 999.99);
        Product mouse = new Product("Mouse", 25.99);
        Product keyboard = new Product("Keyboard", 79.99);
        System.out.println();
        
        // TODO: Create shopping carts
        System.out.println("--- Shopping Carts ---");
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addItem(mouse).addItem(keyboard);
        
        ShoppingCart cart2 = new ShoppingCart();
        cart2.addItem(laptop);
        System.out.println();
        
        // TODO: Display carts
        System.out.println("--- Cart 1 ---");
        cart1.displayCart();
        System.out.println();
        
        System.out.println("--- Cart 2 ---");
        cart2.displayCart();
        System.out.println();
        
        // TODO: Show total carts
        System.out.println("Total Carts Created: " + ShoppingCart.getTotalCarts());
    }
}
