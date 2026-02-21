# Exercise 08: Final Keyword - Constants and Preventing Modification

## Learning Objectives

After completing this exercise, you should be able to:
- Create immutable variables with final
- Create static final constants
- Use final in methods and classes
- Understand immutability patterns
- Know when to use final for protection

## Problem Statement

You're building a **Configuration** class for an application. Configuration values should:
- Be constants (never change after initialization)
- Be shared across all instances
- Be protected from accidental modification
- Be accessible without creating objects

## Requirements

### Part 1: Define the Configuration Class
Create a class called `Configuration` with:

**Static Final Constants**:
- `APP_NAME`: "MyApp"
- `APP_VERSION`: "1.0.0"
- `MAX_RETRIES`: 3
- `TIMEOUT_MS`: 5000

**Instance Fields**:
- `apiKey`: final String - set once in constructor
- `environment`: final String - set once in constructor

**Methods**:
- `Configuration(String apiKey, String environment)`: Sets final fields
- `displayConfig()`: Prints configuration
- `getConfigDescription()`: Returns description

### Part 2: Test Your Class
In the `main()` method:
1. Access static constants without creating object
2. Create configuration instances
3. Display configurations
4. Attempt to modify final fields (should fail)
5. Show that constants are shared

## Example Output

```
--- Static Constants ---
App Name: MyApp
App Version: 1.0.0
Max Retries: 3
Timeout: 5000ms

--- Instance 1 ---
API Key: sk_live_123, Environment: production
Config: MyApp (1.0.0) - production

--- Instance 2 ---
API Key: sk_test_456, Environment: development
Config: MyApp (1.0.0) - development
```

## Hints

- Use `static final` for constants that never change
- Use `final` on instance fields to prevent reassignment
- Final variables can be set once (in constructor)
- Once set, they cannot be changed
- Final prevents bugs from accidental modification

## Testing Tips

- Try accessing static constants
- Create multiple instances with different values
- Verify final fields cannot be reassigned
- Check that all instances see the same static constants

## Complexity Assessment

**Difficulty**: Easy-Medium  
**Concepts**: Final Variables, Constants, Immutability, Static Final  
**Time Estimate**: 15-25 minutes
