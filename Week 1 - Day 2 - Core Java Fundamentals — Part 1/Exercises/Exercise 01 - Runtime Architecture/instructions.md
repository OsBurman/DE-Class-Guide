# Exercise 01: Runtime Architecture - Understanding JVM, JRE, and JDK

## Learning Objectives

After completing this exercise, you should be able to:
- Understand the relationship between JVM, JRE, and JDK
- Verify your Java installation and environment setup
- Understand how Java source code is compiled and executed
- Recognize the platform-independent nature of Java bytecode
- Use system properties to inspect your Java environment

## What You'll Learn

This exercise teaches you the fundamental architecture that makes Java special - the ability to "write once, run anywhere." You'll explore:

1. **JVM (Java Virtual Machine)**: The virtual machine that executes Java bytecode
2. **JRE (Java Runtime Environment)**: The environment with JVM + standard libraries for running Java programs
3. **JDK (Java Development Kit)**: The complete development environment with JRE + compiler + tools
4. **Bytecode**: The intermediate format that enables platform independence
5. **System Properties**: How to inspect your Java environment programmatically

## Your Task

You will create a Java program that:
1. Displays information about your Java environment
2. Shows Java version, vendor, and JVM details
3. Displays operating system information
4. Explains what each component means
5. Demonstrates platform independence through code

## Exercise Flow

### Part 1: Setup and Compilation
1. Open the starter code file: `EnvironmentCheck.java`
2. Review the structure - notice the main method as the entry point
3. Compile the program using `javac EnvironmentCheck.java`
4. Observe the creation of `EnvironmentCheck.class` (bytecode file)

### Part 2: Execution and Observation
1. Run the program using `java EnvironmentCheck`
2. Observe the output showing JVM and OS information
3. Compare outputs if you have access to different platforms

### Part 3: Code Understanding
1. Understand how `System.getProperty()` works
2. Identify which properties tell you about the JVM
3. Identify which properties tell you about the OS

### Part 4: Experimentation
1. Modify the program to add more property queries
2. Research and add additional system properties (e.g., `java.classpath`, `user.dir`, `java.io.tmpdir`)
3. Create a version that prints a formatted report

### Part 5: Reflection
1. Answer the questions in the "Reflection Questions" section below

## Reflection Questions

Please answer these questions in a comment at the end of your modified `EnvironmentCheck.java`:

1. **What is the difference between the JVM and the JRE?**
   - Where does each one fit in the Java architecture?
   - Which one executes Java programs?

2. **Why does Java have a JDK separate from the JRE?**
   - What tools in the JDK are not in the JRE?
   - Why don't end-users need the JDK?

3. **What is bytecode, and why is it important?**
   - Is bytecode human-readable?
   - Where is bytecode created and where is it executed?

4. **How does Java achieve "Write Once, Run Anywhere"?**
   - What role does the JVM play?
   - What role does bytecode play?
   - Why can't you just copy a .exe file from Windows to Mac?

5. **Look at your output. What properties tell you about:**
   - The Java version you're using?
   - The platform (Windows, macOS, Linux) you're on?
   - The architecture (32-bit, 64-bit) of your system?

6. **Can you run a .class file created on one platform on a different platform?**
   - Why or why not?
   - What would need to be different?

## Expected Output Example

When you run the program, you should see output similar to:

```
===== Java Runtime Architecture Check =====

Java Environment Information:
  Java Version: 17.0.1
  Java Vendor: Oracle Corporation
  Java Implementation: OpenJDK Runtime Environment

JVM Information:
  JVM Name: OpenJDK 64-Bit Server VM
  JVM Version: 17.0.1+12-39
  JVM Vendor: Oracle Corporation

Operating System Information:
  OS Name: macOS
  OS Version: 12.1
  OS Architecture: aarch64

Classpath:
  [classpath details]

Current Directory:
  /Users/student/Documents

===== Analysis =====

This program is running on: macOS aarch64 (ARM architecture)
Using: OpenJDK 64-Bit Server VM version 17.0.1

The bytecode from compilation is platform-independent.
The JVM interprets this bytecode for your specific platform.
You can run the same .class file on Windows, macOS, or Linux!
```

## Key Concepts to Remember

1. **Compilation vs. Execution**
   - Compilation (javac) turns .java source into .class bytecode - platform-independent
   - Execution (java) uses the JVM to run bytecode - platform-specific

2. **The Three Layers**
   - JDK includes JRE includes JVM
   - Developers use JDK, end-users use JRE

3. **Platform Independence**
   - Java source code is written once
   - Bytecode is the same on all platforms
   - Different JVMs interpret bytecode for different platforms

4. **System Properties**
   - Accessible via `System.getProperty(String key)`
   - Include information about Java version, OS, and more
   - Useful for writing platform-independent code

## Extension Tasks (If You Finish Early)

1. **Create a SystemInfo class** that's used by EnvironmentCheck to organize the output
2. **Add try-catch error handling** to gracefully handle missing properties
3. **Create a comparison report** that shows what minimum specifications your system meets
4. **Research and add** environment variable access using `System.getenv()`
5. **Create a version** that checks if the JVM is 64-bit and alerts if it's 32-bit

## Common Issues and Solutions

**Issue**: "javac: command not found"
- Solution: The JDK is not installed or not in your PATH. Install the JDK or add it to your PATH.

**Issue**: "Exception in thread 'main'"
- Solution: Check your class name matches the filename and that you're running with correct syntax.

**Issue**: Output is cut off or not fully displaying
- Solution: Redirect to a file: `java EnvironmentCheck > output.txt` and view it in an editor.

## Files in This Exercise

- `EnvironmentCheck.java` - Starter code (given)
- `EnvironmentCheck.class` - Compiled bytecode (created by you)
- Solutions folder contains the complete solution with explanations
