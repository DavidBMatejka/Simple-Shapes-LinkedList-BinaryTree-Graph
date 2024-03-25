package Graph;

import java.util.*;

public class Graph {
    ArrayList<Node> vertices = new ArrayList<>();

    public void addEdge(String s1, String s2) {
        Node n1 = getNodeOf(s1);
        Node n2 = getNodeOf(s2);

        if (!vertices.contains(n1)) vertices.add(n1);
        if (!vertices.contains(n2)) vertices.add(n2);

        if(n1.containsNot(n2)) n1.addNeighbour(n2);
        if(n2.containsNot(n1)) n2.addNeighbour(n1);
    }

    public boolean contains(String s) {
        return vertices.contains(getNodeOf(s));
    }

    private Node getNodeOf(String s) {
        int i = 0;
        while (i < vertices.size()) {
            if (s.equals(vertices.get(i).getContent())) return vertices.get(i);
            i++;
        }
        return new Node(s);
    }

    public String shortestPath(String start, String end) {
        Node startNode = getNodeOf(start);

        Deque<Node> q = new LinkedList<>();
        q.add(startNode);

        Map<String, String> comingFrom = new HashMap<>();
        comingFrom.put(start, null);

        while (!q.isEmpty()) {
            Node current = q.poll();

            if (current.getContent().equals(end)) {
                StringBuilder sb = new StringBuilder(current.getContent());
                String next = comingFrom.get(current.getContent());
                while (next != null) {
                    sb.append(" ").append(next);
                    next = comingFrom.get(next);
                }
                return sb.reverse().toString();
            }

            for (Node neighbour : current.getNeighbours()) {
                if (!comingFrom.containsKey(neighbour.getContent())) {
                    comingFrom.put(neighbour.getContent(), current.getContent());
                    q.add(neighbour);
                }
            }

        }

        return "no path found";
    }

    @Override
    public String toString() {
        return "Graph{" +
                "vertices=" + vertices +
                '}';
    }
}
