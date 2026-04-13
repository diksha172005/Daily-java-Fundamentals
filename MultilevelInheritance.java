// Multilevel Inheritance Example in Java

// Level 1: Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Level 2: Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Level 3: Grandchild class inheriting from Dog
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy is playing");
    }
}

// Main class to demonstrate multilevel inheritance
public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        
        puppy.eat();    // Inherited from Animal
        puppy.bark();   // Inherited from Dog
        puppy.play();   // Own method
    }
}