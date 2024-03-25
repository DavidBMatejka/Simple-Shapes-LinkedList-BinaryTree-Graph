package BinaryTree;

import java.util.Arrays;

public class BinaryTree {
    public Node root;

    public void insert(int content) {
        if (root == null) {
            root = new Node(content);
            return;
        }

        Node current = root;
        while (true) {
            if (content <= current.getContent()) {
                if (current.getLeft() == null) {
                    current.setLeft(new Node(content));
                    return;
                }
                current = current.getLeft();
            } else {
                if (current.getRight() == null) {
                    current.setRight(new Node(content));
                    return;
                }
                current = current.getRight();
            }
        }
    }

    public void remove(int content) {
        Node current = root;
        Node prev = null;
        while (true) {
            if (current == null) {
                System.err.println("Inhalt exisitert nicht im Baumexisitert");
                return;
            }

            if (content == current.getContent()) {
                String nachfolger = "";
                if (current.getLeft() != null) {
                    nachfolger += current.getLeft().toString() + " ";
                }
                if (current.getRight() != null) {
                    nachfolger += current.getRight().toString();
                }

                if (prev.getRight().getContent() == content) {
                    prev.setRight(null);
                } else {
                    prev.setLeft(null);
                }

                String[] nachfolgerList = nachfolger.split(" ");
                for (int i = 0; i < nachfolgerList.length; i++) {
                    insert(Integer.parseInt(nachfolgerList[i]));
                }
                return;
            }
            if (content <= current.getContent()) {
                prev = current;
                current = current.getLeft();
            } else {
                prev = current;
                current = current.getRight();
            }
        }
    }

    /**
     * returns first node with specified content
     * or null if node doesn't exist
     */
    public Node getNodeWithContent(int content) {
        Node current = root;

        while (current != null) {
            if (current.getContent() == content) return current;

            if (content <= current.getContent()) current = current.getLeft();
            else current = current.getRight();
        }
        return null;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
