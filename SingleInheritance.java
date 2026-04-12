public class SingleInheritance {
    // Base class (Parent class)
    static class Animal {
        void eat() {
            System.out.println("This animal eats food.");
        }
    }

    // Derived class (Child class) that inherits from Animal
    static class Dog extends Animal {
        void bark() {
            System.out.println("The dog barks.");
        }
    }

    // Main method to demonstrate single inheritance
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        // Accessing method from the base class
        myDog.eat(); // This animal eats food.
        
        // Accessing method from the derived class
        myDog.bark(); // The dog barks.
    }
}
