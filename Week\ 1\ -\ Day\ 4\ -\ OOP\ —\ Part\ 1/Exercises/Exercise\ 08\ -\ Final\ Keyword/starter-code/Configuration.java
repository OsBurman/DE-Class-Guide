/**
 * Exercise 08: Final Keyword
 * 
 * TODO: Create a Configuration class with final constants and fields
 */
public class Configuration {
    
    // TODO: Create 4 static final constants
    // APP_NAME = "MyApp"
    // APP_VERSION = "1.0.0"
    // MAX_RETRIES = 3
    // TIMEOUT_MS = 5000
    
    
    // TODO: Create 2 instance final fields
    // final String apiKey;
    // final String environment;
    
    
    // TODO: Create constructor that sets the final fields
    
    
    // TODO: Create displayConfig() method
    
    
    // TODO: Create getConfigDescription() method
    // Returns format: "[APP_NAME] ([APP_VERSION]) - [environment]"
    
    
    public static void main(String[] args) {
        // TODO: Display static constants without creating object
        System.out.println("--- Static Constants ---");
        System.out.println("App Name: " + Configuration.APP_NAME);
        System.out.println("App Version: " + Configuration.APP_VERSION);
        System.out.println("Max Retries: " + Configuration.MAX_RETRIES);
        System.out.println("Timeout: " + Configuration.TIMEOUT_MS + "ms");
        System.out.println();
        
        // TODO: Create Instance 1
        System.out.println("--- Instance 1 ---");
        Configuration config1 = new Configuration("sk_live_123", "production");
        config1.displayConfig();
        System.out.println("Config: " + config1.getConfigDescription());
        System.out.println();
        
        // TODO: Create Instance 2
        System.out.println("--- Instance 2 ---");
        Configuration config2 = new Configuration("sk_test_456", "development");
        config2.displayConfig();
        System.out.println("Config: " + config2.getConfigDescription());
    }
}
