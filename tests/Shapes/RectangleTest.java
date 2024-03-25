package Shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void getWidth() {
        Point2D p = new Point2D(3, 4);
        Rectangle rect = new Rectangle(p, 10, 5);
        assertEquals(10, rect.getWidth());
    }

    @Test
    void setWidth() {
        Point2D p = new Point2D(3, 4);
        Rectangle rect = new Rectangle(p, 10, 5);
        rect.setWidth(11);
        assertEquals(11, rect.getWidth());
    }

    @Test
    void getHeight() {
        Point2D p = new Point2D(3, 4);
        Rectangle rect = new Rectangle(p, 10, 5);
        assertEquals(5, rect.getHeight());
    }

    @Test
    void setHeight() {
        Point2D p = new Point2D(3, 4);
        Rectangle rect = new Rectangle(p, 10, 5);
        rect.setHeight(13);
        assertEquals(13, rect.getHeight());
    }

    @Test
    void getPoint() {
        Point2D p = new Point2D(3, 4);
        Rectangle rect = new Rectangle(p, 10, 5);
        assertEquals(p, rect.getPoint());
    }

    @Test
    void setPoint() {
        Point2D p = new Point2D(3, 4);
        Rectangle rect = new Rectangle(p, 10, 5);

        Point2D newP = new Point2D(13, 14);
        rect.setPoint(newP);
        assertEquals(newP, rect.getPoint());
    }

    @Test
    void area() {
        Point2D p = new Point2D(3, 4);
        Rectangle rect = new Rectangle(p, 10, 5);
        assertEquals(50, rect.area());
    }

    @Test
    void circumference() {
        Point2D p = new Point2D(3, 4);
        Rectangle rect = new Rectangle(p, 10, 5);
        assertEquals(30, rect.circumference());
    }

    @Test
    void testToString() {
        Point2D p = new Point2D(3, 4);
        Rectangle rect = new Rectangle(p, 10, 5);
        System.out.println(rect);
        assertEquals("(3|4), width: 10, height: 5", rect.toString());
    }
}