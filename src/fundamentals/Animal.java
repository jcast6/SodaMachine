package fundamentals;

/**
 * Inheritance is a mechanism in object-oriented programming
 * that allows a class to inherit properties and behaviors from another class.
 *
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
 * we have a Animal superclass that has a name property and a
 * makeSound() method that prints "Animal making sound...".
 * We also have a Dog subclass that extends
 * Animal and has an additional wagTail() method.
 *
 * When we create a Dog object, it automatically inherits the name
 * property and makeSound() method from its Animal superclass.
 * However, we can override the makeSound() method in Dog to make it output
 * "Woof!" instead of the default message. This is an example of polymorphism, where
 * a subclass can provide its own implementation of a method
 * inherited from its superclass.
 *
 * We can also define new methods in the Dog subclass, such as wagTail(),
 * which is not present in the Animal superclass. When we call the wagTail()
 * method on a Dog object, it will output a
 * message indicating that the dog is wagging its tail, along with its name.
 *
 * inheritance allows us to create more specialized classes that
 * build on the properties and behaviors of more general classes.
 * This helps to reduce code duplication and makes it easier to maintain
 * and extend our code.
 */