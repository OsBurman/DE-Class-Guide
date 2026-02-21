# Exercise 05: Encapsulation Basics - Protecting Object State

## Learning Objectives

After completing this exercise, you should be able to:
- Use private fields to protect object state
- Create public getter methods for safe read access
- Create public setter methods with validation
- Understand the encapsulation pattern
- Recognize why direct field access is dangerous

## Problem Statement

You're building a **Temperature** class where users can read and modify temperature. However, temperature has constraints:
- Celsius must be >= -273.15 (absolute zero)
- Users shouldn't be able to set invalid temperatures
- Setters should validate before modifying state

## Requirements

### Part 1: Define the Temperature Class
Create a class called `Temperature` with:

**Fields** (all private):
- `celsius`: double - the temperature in Celsius

**Methods**:
- `Temperature(double celsius)`: Constructor that validates initial temperature
- `getCelsius()`: Public getter - returns current temperature
- `setCelsius(double temp)`: Public setter - validates and sets temperature
- `getFahrenheit()`: Returns Fahrenheit equivalent (C × 9/5 + 32)
- `isFreezingPoint()`: Returns true if temperature is at or below 0°C
- `isBoilingPoint()`: Returns true if temperature is at or above 100°C

### Part 2: Test Your Class
In the `main()` method:
1. Create temperature objects with different values
2. Test getters
3. Attempt to set invalid temperatures (should fail gracefully)
4. Set valid temperatures and verify
5. Show conversion and checking methods

## Example Output

```
--- Temperature 1 ---
Initial: 25.0°C = 77.0°F
Is freezing? No
Is boiling? No

Attempt to set to -300 (invalid)
Current: 25.0°C (unchanged)

Set to 0.0 (valid)
Current: 0.0°C = 32.0°F
Is freezing? Yes
Is boiling? No

--- Temperature 2 ---
Initial: 100.0°C = 212.0°F
Is boiling? Yes
```

## Hints

- Make all data fields private
- Provide public methods to control access
- Validate in setters before modifying state
- Consider informing user why invalid data was rejected

## Testing Tips

- Test valid and invalid temperatures
- Verify getters return correct values
- Check that invalid sets don't change state
- Test conversion calculations
- Consider edge cases (-273.15, 0, 100, extreme values)

## Complexity Assessment

**Difficulty**: Medium  
**Concepts**: Encapsulation, Access Modifiers, Validation, Getters/Setters  
**Time Estimate**: 25-35 minutes
