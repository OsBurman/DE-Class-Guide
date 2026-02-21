/**
 * Exercise 08: Final Keyword - SOLUTION
 * 
 * This solution demonstrates:
 * - Static final constants shared across instances
 * - Instance final fields set once and immutable
 * - Using final for configuration and protection
 */
public class Configuration {

    // Static final constants - shared by all instances, never change
    static final String APP_NAME = "MyApp";
    static final String APP_VERSION = "1.0.0";
    static final int MAX_RETRIES = 3;
    static final int TIMEOUT_MS = 5000;

    // Instance final fields - each instance has its own, but can't change
    final String apiKey;
    final String environment;

    // Constructor - sets the final fields
    public Configuration(String apiKey, String environment) {
        this.apiKey = apiKey;
        this.environment = environment;
        // Note: apiKey and environment cannot be changed after this
    }

    // Display configuration
    void displayConfig() {
        System.out.println("API Key: " + apiKey + ", Environment: " + environment);
    }

    // Get description
    String getConfigDescription() {
        return APP_NAME + " (" + APP_VERSION + ") - " + environment;
    }

    public static void main(String[] args) {
        // Display static constants
        System.out.println("--- Static Constants ---");
        System.out.println("App Name: " + Configuration.APP_NAME);
        System.out.println("App Version: " + Configuration.APP_VERSION);
        System.out.println("Max Retries: " + Configuration.MAX_RETRIES);
        System.out.println("Timeout: " + Configuration.TIMEOUT_MS + "ms");
        System.out.println();

        // Create Instance 1
        System.out.println("--- Instance 1 ---");
        Configuration config1 = new Configuration("sk_live_123", "production");
        config1.displayConfig();
        System.out.println("Config: " + config1.getConfigDescription());
        System.out.println();

        // Create Instance 2
        System.out.println("--- Instance 2 ---");
        Configuration config2 = new Configuration("sk_test_456", "development");
        config2.displayConfig();
        System.out.println("Config: " + config2.getConfigDescription());
    }
}
