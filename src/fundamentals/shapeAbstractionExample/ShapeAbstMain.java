package fundamentals.shapeAbstractionExample;

import fundamentals.shapeAbstractionExample.Rectangle;

public class ShapeAbstMain {
    public static void main(String[] args) {
        // Create Circle object
        fundamentals.shapeAbstractionExample.Circle circle = new fundamentals.shapeAbstractionExample.Circle("red", 2.0);
        circle.display(); // The color of the shape is red
        System.out.println("Area of the circle is " + circle.area()); // Area of the circle is 12.566370614359172

        // Create Rectangle object
        Rectangle rectangle = new Rectangle("blue", 3.0, 4.0);
        rectangle.display(); // The color of the shape is blue
        System.out.println("Area of the rectangle is " + rectangle.area()); // Area of the rectangle is 12.0
    }
}