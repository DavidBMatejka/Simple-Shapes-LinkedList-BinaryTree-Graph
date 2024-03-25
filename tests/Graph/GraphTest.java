package Graph;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void addEdge() {
        Graph graph = new Graph();
        graph.addEdge("S", "A");
        graph.addEdge("S", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "B");
        assertEquals(true, graph.contains("A"));
        assertEquals(true, graph.contains("S"));
        assertEquals(true, graph.contains("B"));
        assertEquals(true, graph.contains("C"));
        assertEquals(false, graph.contains("D"));
    }

    @Test
    void shortestPath() throws IOException {
        File file = new File("src/Graph/input.txt");
        List<String> input = Files.readAllLines(Paths.get(file.toURI()));

        Graph graph = new Graph();
        for (String line : input) {
            List<String> tmp = Arrays.asList(line.split(" : "));
            String s1 = tmp.get(0);
            for (String neighbour : tmp.get(1).split(" ")) {
                graph.addEdge(s1, neighbour);
            }
        }

        assertEquals("S C Z", graph.shortestPath("S", "Z"));
        assertEquals("S A B", graph.shortestPath("S", "B"));
    }
}