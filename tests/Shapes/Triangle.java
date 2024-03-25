package Shapes;

public class Triangle {
    private Point2D point1;
    private Point2D point2;
    private Point2D point3;

    public Triangle(Point2D point1, Point2D point2, Point2D point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Point2D getPoint1() {
        return point1;
    }

    public void setPoint1(Point2D point1) {
        this.point1 = point1;
    }

    public Point2D getPoint2() {
        return point2;
    }

    public void setPoint2(Point2D point2) {
        this.point2 = point2;
    }

    public Point2D getPoint3() {
        return point3;
    }

    public void setPoint3(Point2D point3) {
        this.point3 = point3;
    }

    public double area() {
        return TODO();
    }

    public double circumference() {
        return TODO();
    }

    private int TODO() {
        return -1;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
