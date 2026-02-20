/*
 * Exercise 01: Runtime Architecture - Understanding JVM, JRE, and JDK
 * 
 * Complete Solution with Explanations
 * 
 * This is the complete, working solution with all TODOs filled in and answers provided.
 */

public class EnvironmentCheck {
    
    public static void main(String[] args) {
        System.out.println("===== Java Runtime Architecture Check =====\n");
        
        // Print Java environment information
        System.out.println("Java Environment Information:");
        System.out.println("  Java Version: " + System.getProperty("java.version"));
        System.out.println("  Java Vendor: " + System.getProperty("java.vendor"));
        // Added Java runtime name to show the implementation (e.g., OpenJDK Runtime Environment)
        System.out.println("  Java Implementation: " + System.getProperty("java.runtime.name"));
        System.out.println();
        
        // Print JVM information
        System.out.println("JVM Information:");
        System.out.println("  JVM Name: " + System.getProperty("java.vm.name"));
        System.out.println("  JVM Version: " + System.getProperty("java.vm.version"));
        // Added JVM vendor property
        System.out.println("  JVM Vendor: " + System.getProperty("java.vm.vendor"));
        System.out.println();
        
        // Print Operating System Information
        System.out.println("Operating System Information:");
        System.out.println("  OS Name: " + System.getProperty("os.name"));
        System.out.println("  OS Version: " + System.getProperty("os.version"));
        System.out.println("  OS Architecture: " + System.getProperty("os.arch"));
        System.out.println();
        
        // Print other useful properties
        System.out.println("User and Path Information:");
        // Added user name property
        System.out.println("  User Name: " + System.getProperty("user.name"));
        System.out.println("  User Directory: " + System.getProperty("user.dir"));
        // Added Java temp directory
        System.out.println("  Temp Directory: " + System.getProperty("java.io.tmpdir"));
        System.out.println();
        
        // Print classpath information
        System.out.println("Classpath:");
        System.out.println("  " + System.getProperty("java.class.path"));
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
         * REFLECTION QUESTION ANSWERS:
         * 
         * 1. What is the difference between the JVM and the JRE?
         *    ANSWER: The JVM (Java Virtual Machine) is the virtual machine that executes Java bytecode.
         *    It's the core engine that interprets bytecode into machine-specific instructions.
         *    The JRE (Java Runtime Environment) includes the JVM plus all the standard Java class libraries
         *    (like java.lang, java.util, etc.) and other runtime components. The JRE is what end-users
         *    need to run Java programs. The JVM is what's inside the JRE doing the execution.
         * 
         * 2. Why does Java have a JDK separate from the JRE?
         *    ANSWER: The JDK (Java Development Kit) is for developers who are writing Java code.
         *    It includes the JRE (so developers can run their code) plus additional tools:
         *    - javac (the compiler that turns .java files into .class bytecode)
         *    - javadoc (generates documentation)
         *    - jdb (debugger)
         *    - And many other development tools
         *    End-users who just want to run Java programs only need the JRE, not the compiler and other
         *    development tools. This keeps the download size smaller for end-users.
         * 
         * 3. What is bytecode, and why is it important?
         *    ANSWER: Bytecode is an intermediate instruction format created when you compile Java source code.
         *    When you run "javac MyProgram.java", it creates "MyProgram.class" containing bytecode.
         *    Bytecode is not human-readable (it's binary), but it's also not specific to any platform.
         *    It's platform-neutral. Bytecode is important because:
         *    - It enables platform independence: the same .class file works on Windows, Mac, Linux, etc.
         *    - It enables security: the JVM can verify bytecode before executing it
         *    - It enables performance: the JVM can optimize bytecode at runtime using Just-In-Time (JIT) compilation
         * 
         * 4. How does Java achieve "Write Once, Run Anywhere"?
         *    ANSWER: Here's the process:
         *    a. Developer writes Java source code (.java files) on any platform
         *    b. Developer uses javac (from the JDK) to compile to bytecode (.class files)
         *    c. The bytecode is platform-independent - no recompilation needed
         *    d. On any other platform, as long as there's a JVM for that platform, you can run "java MyProgram"
         *    e. That platform's JVM interprets the bytecode into platform-specific machine code
         *    Result: The same .class file runs on Windows, macOS, Linux, etc. without recompilation.
         * 
         * 5. Can you run a .class file created on one platform on a different platform?
         *    ANSWER: Yes! That's the whole point of bytecode and the JVM. The bytecode is platform-independent.
         *    A .class file created on Windows can be copied to macOS or Linux and run there, as long as
         *    the JVM is installed on that platform. For example:
         *    - Compile on Windows: javac MyProgram.java → creates MyProgram.class
         *    - Copy MyProgram.class to a Mac
         *    - Run on Mac: java MyProgram → the macOS JVM interprets and executes it
         *    You can't do this with languages like C or C++ where you compile to machine code for a specific
         *    platform. That's what makes Java's approach special and one of its key advantages.
         */
    }
}
