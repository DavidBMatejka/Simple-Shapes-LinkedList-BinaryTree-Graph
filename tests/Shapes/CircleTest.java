package Shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void area() {
        Circle c = new Circle(new Point2D(0, 0), 3);
        assertEquals(9*Math.PI, c.area());
    }

    @Test
    void circumference() {
        Circle c = new Circle(new Point2D(0, 0), 3);
        assertEquals(Math.PI * 2 * 3, c.circumference());
    }
}