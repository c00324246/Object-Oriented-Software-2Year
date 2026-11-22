package lab5;

public class Circle extends Point {

    private int radius;

    // Constructor
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    // Getter for radius
    public int getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // toString method
    public String toString() {
        return "X: " + x + ", Y: " + y + ", Radius: " + radius;
    }
}
