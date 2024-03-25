package Graph;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GraphWithMapTest {

    @Test
    void shortestPath() throws IOException {
        File file = new File("src/Graph/input.txt");
        List<String> input = Files.readAllLines(Paths.get(file.toURI())).stream().toList();

        GraphWithMap graphWithMap = new GraphWithMap(input);
        assertEquals("S C Z", graphWithMap.shortestPath("S", "Z"));
    }
}