package fundamentals.shapeAbstractionExample;


// Abstract class
abstract class ShapeAbst {
    String color;

    // Constructor
    ShapeAbst(String color) {
        this.color = color;
    }

    // Abstract method
    abstract double area();

    // Concrete method
    void display() {
        System.out.println("The color of the shape is " + color);
    }
}

// Subclasses
class Circle extends ShapeAbst {
    double radius;

    // Constructor
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Implementing abstract method
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends ShapeAbst {
    double length, width;

    // Constructor
    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method
    double area() {
        return length * width;
    }
}

