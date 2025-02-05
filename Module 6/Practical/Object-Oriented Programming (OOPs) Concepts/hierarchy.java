package com.demo;

// Parent class
class Animals {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class of Animal (Level 1)
class Mammal extends Animals {
    void walk() {
        System.out.println("Mammals can walk.");
    }
}

// Child class of Mammal (Level 2)
class Dogs extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class hierarchy {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dogs dog = new Dogs();

        // Call methods from all classes
        dog.eat();  // Method from Animal class
        dog.walk(); // Method from Mammal class
        dog.bark(); // Method from Dog class
    }
}
