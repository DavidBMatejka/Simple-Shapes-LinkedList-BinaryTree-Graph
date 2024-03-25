package SingleLinkedList;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SLLTest {

    @Test
    void getFirst() {
        SLL linkedList = new SLL(2);
        assertEquals(2, linkedList.getFirst().getContent());
    }

    @Test
    void addFirst() {
        SLL linkedList = new SLL(2);
        linkedList.addFirst(4);
        assertEquals(4, linkedList.getFirst().getContent());
    }

    @Test
    void getLast() {
        SLL linkedList = new SLL(2);
        linkedList.addFirst(4);
        assertEquals(2, linkedList.getLast().getContent());
    }

    @Test
    void addLast() {
        SLL linkedList = new SLL(2);
        linkedList.addLast(4);
        assertEquals(4, linkedList.getLast().getContent());
    }


    @Test
    void removeFirst() {
        SLL linkedList = new SLL(2);
        linkedList.addLast(4);
        assertEquals(2, linkedList.getFirst().getContent());
        assertEquals(4, linkedList.getLast().getContent());
        Node tmp = linkedList.removeFirst();
        assertEquals(4, linkedList.getFirst().getContent());
        assertEquals(2, tmp.getContent());
    }

    @Test
    void get() {
        SLL linkedList = new SLL(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        assertEquals(3, linkedList.get(0).getContent());
        assertEquals(4, linkedList.get(1).getContent());
        assertEquals(5, linkedList.get(2).getContent());
        assertEquals(6, linkedList.get(3).getContent());
        assertEquals(6, linkedList.get(4).getContent());
    }

    @Test
    void indexOf() {
        SLL linkedList = new SLL(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        assertEquals(0, linkedList.indexOf(3));
        assertEquals(1, linkedList.indexOf(4));
        assertEquals(2, linkedList.indexOf(5));
        assertEquals(3, linkedList.indexOf(6));
        assertEquals(-1, linkedList.indexOf(9));
    }
}