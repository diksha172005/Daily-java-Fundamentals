public class Abstraction {
    static abstract class Animal {
        abstract void makeSound();
        
        void sleep() {
            System.out.println("Animal is sleeping");
        }
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Woof!");
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        // Create an instance of Dog and assign it to an Animal reference
        dog.makeSound();
        dog.sleep();
    }
    
}
