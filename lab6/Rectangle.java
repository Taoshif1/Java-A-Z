package taoshiflex.lab6;

// Subclass representing a rectangle
class Rectangle extends GeometricObject {
    private double width;
    private double height;

    // Default constructor
    public Rectangle() {
        super();
        this.width = 1.0;
        this.height = 1.0;
    }

    // Constructor with width and height
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    // Constructor with all properties
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    // Getters and setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Calculate area
    public double getArea() {
        return width * height;
    }

    // Calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + ", " + super.toString() + "]";
    }
}
