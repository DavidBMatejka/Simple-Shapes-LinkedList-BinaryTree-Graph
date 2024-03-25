package BinaryTree;

public class Node {
    private final int content;
    private Node left;
    private Node right;

    public Node(int content) {
        this.content = content;
    }

    public int getContent() {
        return content;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    private String inOrder() {
        StringBuilder sb = new StringBuilder();
        if (left != null) sb.append(left.inOrder());
        sb.append(content).append(" ");
        if (right != null) sb.append(right.inOrder());
        return sb.toString();
    }

    @Override
    public String toString() {
        // trim() entfert leerzeichen, die sich um den String befinden
        // die inOrder Methode fügt nach dem Content immer ein Leerzeichen
        // ein, was am Ende des Strings entfernt werden muss
        return this.inOrder().trim();
    }
}
