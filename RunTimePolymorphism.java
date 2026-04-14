// Run-time polymorphism
class RunTimePolymorphism{
    public static void main(String[] args) {
        // Create references of parent type but objects of child type
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        
        // Runtime polymorphism - method call is resolved at runtime
        animal1.sound(); // Calls Dog's sound method
        animal2.sound(); // Calls Cat's sound method
    }

    // Parent class
    static class Animal {
        public void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Child class 1
    static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }
    }

    // Child class 2
    static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("Cat meows");
        }
    }
}
