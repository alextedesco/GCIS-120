import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import Graphs.AdjacencyGraph;
import Graphs.Graph;

public class GraphReader  {

    public static Graph<String> readGraph (String filename) {
        HashSet<String> lineSet = new HashSet<>();
        Graph<String> graph = new AdjacencyGraph<>();
        try (FileReader fileReader = new FileReader(filename)) {
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null) {
                if (line.charAt(0) == '#') {
                    line = reader.readLine();
                } else {
                    String lines[] = line.split(" ");
                    int count = 0;
                    while (count < lines.length) {
                    lineSet.add(lines[count]);
                    count++;
                    }
                    line = reader.readLine();
                }
            }
            LinkedList<String> lineList = new LinkedList<>(lineSet);
            for (int i=0;i<lineList.size();i++) {
                graph.add(lineList.get(i));
            }
            
    } catch (IOException e) {
        System.err.println("File Not Found!");
        }
        return graph;
    }
    public static void main(String[] args) {
        Graph<String> graph = readGraph("data/a_6_1.txt");
        System.out.println(graph);
    }
}