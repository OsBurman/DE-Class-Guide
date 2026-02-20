/*
 * Exercise 01: Runtime Architecture - Understanding JVM, JRE, and JDK
 * 
 * Starter Code
 * 
 * In this exercise, you'll complete this program to display Java environment information.
 * The program has some code written for you, and you need to add more to create a complete
 * environment check utility.
 * 
 * TODO: Fill in the missing sections to complete this exercise.
 */

public class EnvironmentCheck {
    
    public static void main(String[] args) {
        System.out.println("===== Java Runtime Architecture Check =====\n");
        
        // Print Java environment information
        System.out.println("Java Environment Information:");
        System.out.println("  Java Version: " + System.getProperty("java.version"));
        System.out.println("  Java Vendor: " + System.getProperty("java.vendor"));
        // TODO: Add one more Java environment property here
        // HINT: Try "java.runtime.name" or "java.home"
        System.out.println();
        
        // Print JVM information
        System.out.println("JVM Information:");
        System.out.println("  JVM Name: " + System.getProperty("java.vm.name"));
        System.out.println("  JVM Version: " + System.getProperty("java.vm.version"));
        // TODO: Add JVM vendor property here
        System.out.println();
        
        // TODO: Print Operating System Information
        // HINT: Use System.getProperty() with:
        // - "os.name" for OS name
        // - "os.version" for OS version  
        // - "os.arch" for OS architecture
        System.out.println("Operating System Information:");
        System.out.println("  OS Name: " + System.getProperty("os.name"));
        System.out.println("  OS Version: " + System.getProperty("os.version"));
        System.out.println("  OS Architecture: " + System.getProperty("os.arch"));
        System.out.println();
        
        // Print other useful properties
        System.out.println("User and Path Information:");
        // TODO: Add user name property - use "user.name"
        System.out.println("  User Directory: " + System.getProperty("user.dir"));
        // TODO: Add Java temp directory property - use "java.io.tmpdir"
        System.out.println();
        
        // Analysis section
        System.out.println("===== Analysis =====\n");
        
        String javaVersion = System.getProperty("java.version");
        String osName = System.getProperty("os.name");
        String osArch = System.getProperty("os.arch");
        String vmName = System.getProperty("java.vm.name");
        
        System.out.println("This program is running on: " + osName + " " + osArch);
        System.out.println("Using: " + vmName + " version " + javaVersion);
        System.out.println();
        System.out.println("Key Points:");
        System.out.println("  - The bytecode from compilation (.class files) is platform-independent");
        System.out.println("  - The JVM interprets this bytecode for your specific platform (" + osName + ")");
        System.out.println("  - You can copy the same .class file to Windows, macOS, or Linux!");
        System.out.println("  - Each platform needs its own JVM, but the bytecode is the same");
        
        /*
         * TODO: Answer these reflection questions in comments below:
         * 
         * 1. What is the difference between the JVM and the JRE?
         * 
         * 2. Why does Java have a JDK separate from the JRE?
         * 
         * 3. What is bytecode, and why is it important?
         * 
         * 4. How does Java achieve "Write Once, Run Anywhere"?
         * 
         * 5. Can you run a .class file created on one platform on a different platform?
         *    Why or why not?
         */
    }
}
