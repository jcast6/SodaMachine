package fundamentals;


public class ShapeMain {
    public static void main(String[] args) {
        // Create an array of shapes
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Square();

        // Draw all the shapes in the array
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

/**
 * In the main() method, we create an array of Shape
 * objects and assign a Circle object to the first element and a
 * Square object to the second element.
 * When we loop through the array and call the
 * draw() method on each object, the output will be
 * "Drawing a circle..." for the first object and
 * "Drawing a square..." for the second object.
 *
 *  For polymorphism we are treating each object in the array as a Shape,
 *  even though one is actually a Circle and the
 *  other is a Square. This allows us to write more
 *  generic code that can work with a variety of different types
 *  of objects, as long as they share a common superclass or
 *  interface.
 *
 */