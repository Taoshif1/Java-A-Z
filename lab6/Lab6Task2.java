package taoshiflex.lab6;

// Main class for testing
public class Lab6Task2 {
    public static void main(String[] args) {

        // Test GeometricObject
        GeometricObject geo = new GeometricObject("blue", true);
        System.out.println(geo);

        // Test Circle
        Circle circle = new Circle(5.0, "red", true);
        System.out.println(circle);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Circle diameter: " + circle.getDiameter());

        // Test Rectangle
        Rectangle rectangle = new Rectangle(4.0, 6.0, "green", false);
        System.out.println(rectangle);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
    }
}
