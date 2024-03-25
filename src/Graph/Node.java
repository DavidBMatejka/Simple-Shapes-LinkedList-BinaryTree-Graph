package Graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private final String content;
    private final List<Node> neighbours = new ArrayList<>();

    public Node(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public List<Node> getNeighbours() {
        return neighbours;
    }

    public void addNeighbour(Node n) {
        neighbours.add(n);
    }

    public boolean containsNot(Node neighbour) {
        return !neighbours.contains(neighbour);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(content + ": [");
        for (Node neighbour : neighbours) {
            sb.append(neighbour.content + "; ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }
}
