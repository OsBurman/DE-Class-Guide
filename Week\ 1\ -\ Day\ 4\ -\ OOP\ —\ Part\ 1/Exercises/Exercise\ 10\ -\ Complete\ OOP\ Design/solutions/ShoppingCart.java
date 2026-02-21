/**
 * Exercise 10: Complete OOP Design - SOLUTION - ShoppingCart Class
 * 
 * This is the ShoppingCart class for the online store system.
 * Demonstrates:
 * - Private final fields
 * - Static counters
 * - Arrays for storage
 * - Method chaining
 * - Encapsulation
 */
public class ShoppingCart {

    private final int cartId;
    private Product[] items;
    private int itemCount;

    // Static members
    private static int totalCarts = 0;
    static final int MAX_ITEMS = 10;

    // Constructor
    public ShoppingCart() {
        this.cartId = ++totalCarts;
        this.items = new Product[MAX_ITEMS];
        this.itemCount = 0;
    }

    // Add item to cart - returns this for chaining
    public ShoppingCart addItem(Product product) {
        if (itemCount < MAX_ITEMS) {
            items[itemCount++] = product;
        } else {
            System.out.println("Cart is full!");
        }
        return this;
    }

    // Remove last item - returns this for chaining
    public ShoppingCart removeItem() {
        if (itemCount > 0) {
            items[--itemCount] = null;
        }
        return this;
    }

    // Calculate total price of items in cart
    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
        }
        return total;
    }

    // Display cart contents
    public void displayCart() {
        System.out.println("Cart ID: " + cartId);
        System.out.println("Cart Contents:");
        for (int i = 0; i < itemCount; i++) {
            System.out.printf("  - %s ($%.2f)%n", items[i].getName(), items[i].getPrice());
        }
        System.out.printf("Total: $%.2f%n", calculateTotal());
    }

    // Static method to get total carts created
    public static int getTotalCarts() {
        return totalCarts;
    }

    public static void main(String[] args) {
        // Create products
        System.out.println("--- Products ---");
        Product laptop = new Product("Laptop", 999.99);
        laptop.displayProduct();

        Product mouse = new Product("Mouse", 25.99);
        mouse.displayProduct();

        Product keyboard = new Product("Keyboard", 79.99);
        keyboard.displayProduct();
        System.out.println();

        // Create shopping carts using method chaining
        System.out.println("--- Shopping Carts ---");
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addItem(mouse).addItem(keyboard);

        ShoppingCart cart2 = new ShoppingCart();
        cart2.addItem(laptop);
        System.out.println();

        // Display carts
        System.out.println("--- Cart 1 ---");
        cart1.displayCart();
        System.out.println();

        System.out.println("--- Cart 2 ---");
        cart2.displayCart();
        System.out.println();

        // Show total carts
        System.out.println("Total Carts Created: " + ShoppingCart.getTotalCarts());
    }
}
