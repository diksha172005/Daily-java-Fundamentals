public class CompileTimePolymorphism {
    
    // Method Overloading Example - Compile Time Polymorphism
    
    // Method 1: Add two integers
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Method 2: Add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method 3: Add two doubles
    public static double add(double a, double b) {
        return a + b;
    }
    
    // Method 4: Add two strings (concatenation)
    public static String add(String a, String b) {
        return a + b;
    }
    
    // Main method to demonstrate compile time polymorphism
    public static void main(String[] args) {
        // Compiler determines which method to call based on parameters
        System.out.println("Add two integers: " + add(5, 10));
        System.out.println("Add three integers: " + add(5, 10, 15));
        System.out.println("Add two doubles: " + add(5.5, 10.5));
        System.out.println("Add two strings: " + add("Hello ", "World"));
    }
}