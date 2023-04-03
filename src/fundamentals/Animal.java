package fundamentals;

/**
 * Inheritance is a mechanism in object-oriented programming
 * that allows a class to inherit properties and behaviors from another class.
 *
 * the Animal class has an abstract method named makeSound().
 * This means that any subclass of Animal must implement its own version of the
 * makeSound() method, and the implementation of the method will be specific to
 * that subclass.
 *
 * Abstraction is the process of hiding implementation details and providing
 * a simplified interface for the user. In this example, the Animal class is an abstraction
 * of an animal in general, and we provide a method makeSound() that any subclass must implement.
 * This means that we don't have to worry about the specific details of each type of animal when we're dealing with the
 * Animal class; we can simply call makeSound() and the appropriate sound will be produced,
 * regardless of the specific type of animal.
 *
 * In addition, the Animal class has a constructor that sets the name variable.
 * This is another example of abstraction, as it allows us to create instances of the Animal class with a
 * specific name, without having to worry about the implementation details of how the name
 * is stored or retrieved.
 */

// Superclass
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Animal making sound...");
    }
}

// Subclass
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    // Override superclass method
    void makeSound() {
        System.out.println("Woof!");
    }

    void wagTail() {
        System.out.println(name + " is wagging its tail...");
    }

    public static void main(String[] args) {
        // Create Animal object
        Animal animal = new Animal("Generic animal");

        // Animal making sound...
        animal.makeSound();

        // Create Dog object
        Dog dog = new Dog("Fido");

        // Woof!
        dog.makeSound();

        // Fido is wagging its tail...
        dog.wagTail();
    }
}

/**
 * abstraction is an important concept in object-oriented programming
 * because it allows us to create higher-level, more general-purpose
 * classes that can be used in a wide variety of situations, without having to
 * worry about the specific details of each individual situation.
 *
 */