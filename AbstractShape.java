abstract class Shape {
    String color;

    // Abstract methods
    abstract double area();

    public abstract String toString();

    // Abstract class can have a constructor
    public Shape(String color) {
        System.out.println("Shape constructor called!");
        this.color = color;
    }

    // This is a concrete method
    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle color is: " + super.getColor() + " and area is: " + area();
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle color is: " + super.getColor() + " and area is: " + area();
    }
}

public class AbstractShape {
    public static void main(String[] args) {
        Shape circle1 = new Circle("Red", 20);
        Shape rect1 = new Rectangle("Purple", 10, 20);

        System.out.println(circle1.toString());
        System.out.println(rect1.toString());
    }
}
