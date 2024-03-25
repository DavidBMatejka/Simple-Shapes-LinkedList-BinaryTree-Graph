package SingleLinkedList;

public class SLL {
    private Node root;

    public SLL(int content) {
        root = new Node(content);
    }

    public void addFirst(int content) {
        Node tmp = new Node(content);
        tmp.setNext(root);
        root = tmp;
    }

    public void addLast(int content) {
        if (root == null) root = new Node(content);

        Node current = root;
        while (current.hasNext()) {
            current = current.getNext();
        }
        current.setNext(new Node(content));
    }

    public Node getFirst() {
        return root;
    }


    public Node getLast() {
        if (root == null) return null;

        Node current = root;
        while (current.hasNext()) {
            current = current.getNext();
        }
        return current;
    }

    public Node removeFirst() {
        Node tmp = root;
        root = root.getNext();
        return tmp;
    }

    public Node get(int pos) {
        int i = 0;
        Node current = root;
        while (i < pos && current.hasNext()) {
            i++;
            current = current.getNext();
        }
        return current;
    }

    public int indexOf(int content) {
        int j = 0;
        Node current = root;
        while (current.hasNext() && current.getContent() != content) {
            j++;
            current = current.getNext();
        }
        if (current.getContent() == content) return j;
        return -1;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
