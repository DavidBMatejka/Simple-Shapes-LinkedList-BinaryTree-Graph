package BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void insertTest1() {
        BinaryTree bt = new BinaryTree();
        bt.insert(2);
        assertEquals(2, bt.root.getContent());
        assertNull(bt.root.getLeft());
        assertNull(bt.root.getRight());
    }

    @Test
    void insertTest2() {
        BinaryTree bt = new BinaryTree();
        bt.insert(2);
        bt.insert(5);
        bt.insert(1);
        bt.insert(4);
        assertEquals(2, bt.root.getContent());
        assertEquals(5, bt.root.getRight().getContent());
        assertEquals(4, bt.root.getRight().getLeft().getContent());
        assertEquals(1, bt.root.getLeft().getContent());
    }

    @Test
    void testFindNodeWithContent() {
        BinaryTree bt = new BinaryTree();
        bt.insert(2);
        bt.insert(1);
        bt.insert(5);
        bt.insert(3);

        assertEquals(2, bt.getNodeWithContent(2).getContent());
        assertEquals(3, bt.getNodeWithContent(3).getContent());
    }

    @Test
    void testRemove() {
        BinaryTree bt = new BinaryTree();
        bt.insert(3);
        bt.insert(1);
        bt.insert(2);
        bt.insert(5);
        bt.insert(7);
        bt.insert(9);
        bt.insert(4);
        assertEquals("1 2 3 4 5 7 9", bt.toString());

        bt.remove(5);
        assertEquals("1 2 3 4 7 9", bt.toString());
    }

    @Test
    void testToString() {
        BinaryTree bt = new BinaryTree();
        bt.insert(2);
        bt.insert(5);
        bt.insert(9);
        bt.insert(2);
        bt.insert(8);
        bt.insert(5);
        bt.insert(7);
        assertEquals("2 2 5 5 7 8 9", bt.toString());
    }
}