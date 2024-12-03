package taoshiflex.lab6;

import java.util.Date;

// Base class for geometric objects
class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    // Default constructor
    public GeometricObject() {
        this.color = "white";
        this.filled = false;
        this.dateCreated = new Date();
    }

    // Constructor with color and filled
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    // Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject [color= " + color + ", filled= " + filled + ", dateCreated= " + dateCreated + "]";
    }
}
