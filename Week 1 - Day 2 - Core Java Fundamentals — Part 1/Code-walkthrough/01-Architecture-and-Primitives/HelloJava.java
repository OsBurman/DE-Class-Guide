public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello from Java!");
        System.out.println("Let's verify our Java environment:");
        System.out.println("");
        
        // Print Java version information
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("JVM Name: " + System.getProperty("java.vm.name"));
        System.out.println("JVM Version: " + System.getProperty("java.vm.version"));
        System.out.println("OS Name: " + System.getProperty("os.name"));
        System.out.println("OS Version: " + System.getProperty("os.version"));
        System.out.println("OS Architecture: " + System.getProperty("os.arch"));
        
        System.out.println("");
        System.out.println("This program demonstrates the JVM running the same bytecode");
        System.out.println("on different platforms - platform independence!");
    }
}
