package fundamentals;
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

/**
 * we have a Shape superclass that defines a draw() method,
 * which simply prints out "Drawing a shape...".
 * We also have two subclasses, Circle and Square,
 * that extend Shape and override the draw() method to
 * print out their respective shapes.
 */