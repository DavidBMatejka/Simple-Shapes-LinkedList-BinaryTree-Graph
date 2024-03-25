package Shapes;

public class Rectangle {
    private int width;
    private int height;

    private Point2D point;

    public Rectangle(Point2D point, int width, int height) {
        this.point = point;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Point2D getPoint() {
        return point;
    }

    public void setPoint(Point2D point) {
        this.point = point;
    }

    public double area() {
        return width * height;
    }

    public int circumference() {
        return 2 * width + 2 * height;
    }

    @Override
    public String toString() {
        return point + ", width: " + width + ", height: " + height;
    }
}
