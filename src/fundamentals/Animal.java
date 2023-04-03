package fundamentals;

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