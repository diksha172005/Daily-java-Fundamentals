public class MethodSummary {
    // 1. Method with no parameters and no return value
    public void greet() {
        System.out.println("Hello!");
    }

    // 2. Method with parameters and no return value
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // 3. Method with no parameters and return value
    public int getAge() {
        return 25;
    }

    // 4. Method with parameters and return value
    public int multiply(int x, int y) {
        return x * y;
    }

    // 5. Static method
    public static void displayInfo() {
        System.out.println("Static method example");
    }

    // 6. Method with varargs
    public void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    // 7. Private method
    private String formatString(String str) {
        return str.toUpperCase();
    }

    // 8. Method with multiple parameters and return value
    public boolean isEligible(int age, double income) {
        return age >= 18 && income > 30000;
    }
}
