public class HybridInheritance {
    // Parent class 1
    static class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    // Parent class 2
    static class Mammal {
        void sleep() {
            System.out.println("Mammal is sleeping");
        }
    }

    // Child class inheriting from Animal
    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking");
        }
    }

    // Child class inheriting from Mammal
    static class Cat extends Mammal {
        void meow() {
            System.out.println("Cat is meowing");
        }
    }

    // Concrete class combining multiple inheritance paths
    static class Pet extends Dog {
        void play() {
            System.out.println("Pet is playing");
        }
    }

    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.eat();    // From Animal
        pet.bark();   // From Dog
        pet.play();   // From Pet
    }
}
