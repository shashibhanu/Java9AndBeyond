package java17;

// Sealed classes restrict which other classes can extend them. You define a sealed class by using the sealed modifier before the class keyword. Then, you specify the permitted subclasses using the permits keyword.

// In this example, we have a sealed class called Shape that permits two subclasses: Circle and Rectangle.

// Attempting to create a class that extends Shape other than Circle or Rectangle will result in a compilation error.

sealed abstract class Shape permits Circle, Rectangle {
    abstract void draw();
}

final class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

final class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
}

public class SealedClass {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        circle.draw(); // Output: Drawing a circle with radius 5.0
        rectangle.draw(); // Output: Drawing a rectangle with width 4.0 and height 6.0
    }
}
