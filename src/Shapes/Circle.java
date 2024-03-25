package Shapes;

public class Circle {
    private Point2D m;
    private float radius;

    public Circle(Point2D m, float radius) {
        this.m = m;
        this.radius = radius;
    }

    public Point2D getM() {
        return m;
    }

    public void setM(Point2D m) {
        this.m = m;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
