package Graph;

import java.util.*;

public class GraphWithMap {
    private HashMap<String, List<String>> graph;

    public GraphWithMap(List<String> input) {
        graph = new HashMap<>();
        for (String line : input) {
            List<String> splitted = List.of(line.split(":"));
            String vertex = splitted.getFirst().trim();

            List<String> neighbours = new ArrayList<>();
            for (String s : Arrays.stream(splitted.getLast().split(" ")).toList()) {
                if (!s.isEmpty()) neighbours.add(s.trim());
            }

            graph.put(vertex, neighbours);
        }

    }

    public String shortestPath(String start, String end) {
        Deque<String> q = new LinkedList<>();
        q.add(start);

        Map<String, String> comingFrom = new HashMap<>();
        comingFrom.put(start, null);

        while (!q.isEmpty()) {
            String current = q.poll();

            assert current != null;
            if (current.equals(end)) {
                StringBuilder sb = new StringBuilder(current);
                String next = comingFrom.get(current);
                while (next != null) {
                    sb.append(" ").append(next);
                    next = comingFrom.get(next);
                }
                return sb.reverse().toString();
            }

            for (String neighbour : graph.get(current)) {
                if (!comingFrom.containsKey(neighbour)) {
                    comingFrom.put(neighbour, current);
                    q.add(neighbour);
                }
            }
        }

        return "not path found";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String key : graph.keySet()) {
            sb.append(key).append(": ").append(graph.get(key)).append(", ");
        }
        return sb.toString();
    }
}
