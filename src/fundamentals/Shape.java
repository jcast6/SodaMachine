package fundamentals;

/**
 * polymorphism is a powerful feature of object-oriented programming
 * that allows us to write more flexible and maintainable code by abstracting
 * away implementation details and working with objects at a higher level of abstraction.
 */
// Superclass
class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

// Subclasses
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle...");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square...");
    }
}

/*
  we have a Shape superclass that defines a draw() method,
  which simply prints out "Drawing a shape...".
  We also have two subclasses, Circle and Square,
  that extend Shape and override the draw() method to
  print out their respective shapes.
 */