package taoshiflex.lab6;

// Subclass representing a circle
class Circle extends GeometricObject {
    private double radius;

    // Default constructor
    public Circle() {
        super();
        this.radius = 1.0;
    }

    // Constructor with radius
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Constructor with all properties
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Calculate perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Get diameter
    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", " + super.toString() + "]";
    }
}
