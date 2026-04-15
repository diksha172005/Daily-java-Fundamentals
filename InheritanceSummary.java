public class InheritanceSummary {
    // 1. Single Inheritance
    static class Animal {
        void eat() { System.out.println("Eating..."); }
    }

    static class Dog extends Animal {
        void bark() { System.out.println("Barking..."); }
    }

    // 2. Multilevel Inheritance
    static class Puppy extends Dog {
        void play() { System.out.println("Playing..."); }
    }

    // 3. Hierarchical Inheritance
    static class Cat extends Animal {
        void meow() { System.out.println("Meowing..."); }
    }

    // 4. Multiple Inheritance (using Interfaces)
    interface Swimmer {
        void swim();
    }

    interface Runner {
        void run();
    }

    static class Duck extends Animal implements Swimmer, Runner {
        public void swim() { System.out.println("Swimming..."); }
        public void run() { System.out.println("Running..."); }
    }

    // 5. Hybrid Inheritance (combination of multiple types)
    interface Flyer {
        void fly();
    }

    static class Eagle extends Animal implements Flyer, Runner {
        public void fly() { System.out.println("Flying..."); }
        public void run() { System.out.println("Running..."); }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.play();
        
        Duck duck = new Duck();
        duck.eat();
        duck.swim();
        duck.run();
    }
}
