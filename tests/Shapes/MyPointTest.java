package Shapes;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @org.junit.jupiter.api.Test
    void getX() {
        Point2D p = new Point2D(3, 4);
        assertEquals(3, p.getX());
    }

    @org.junit.jupiter.api.Test
    void setX() {
        Point2D p = new Point2D(3, 4);
        p.setX(10);
        assertEquals(10, p.getX());
    }

    @org.junit.jupiter.api.Test
    void getY() {
        Point2D p = new Point2D(3, 4);
        assertEquals(4, p.getY());
    }

    @org.junit.jupiter.api.Test
    void setY() {
        Point2D p = new Point2D(3, 4);
        p.setY(11);
        assertEquals(11, p.getY());
    }

    @org.junit.jupiter.api.Test
    void distance() {
        Point2D p = new Point2D(3, 4);
        Point2D q = new Point2D(3, 4);
        assertEquals(0, p.distance(q));
        p.setX(0);
        p.setY(0);
        q.setX(3);
        q.setY(4);
        assertEquals(5, p.distance(q));
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Point2D p = new Point2D(3, 4);
        assertEquals("(3|4)", p.toString());
    }
}