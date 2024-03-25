package SingleLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void getContent() {
        Node n = new Node(4);
        assertEquals(4, n.getContent());
    }

    @Test
    void setContent() {
        Node n = new Node(4);
        n.setContent(8);
        assertEquals(8, n.getContent());
    }

    @Test
    void getNext() {
        Node n2 = new Node(10);
        Node n1 = new Node(2);
        n1.setNext(n2);
        assertEquals(n2, n1.getNext());
    }

    @Test
    void setNext() {
        Node n2 = new Node(10);
        Node n1 = new Node(2);
        assertNull(n1.getNext());
        n1.setNext(n2);
        assertEquals(n2, n1.getNext());
    }

    @Test
    void hasNext() {
        Node n2 = new Node(10);
        Node n1 = new Node(2);
        assertFalse(n2.hasNext());
        assertFalse(n1.hasNext());
        n1.setNext(n2);
        assertTrue(n1.hasNext());
    }
}