import java.util.*;

public class ShortestPath {
    public static List<Integer> shortestPath(int src, int dest, List<List<Integer>> graph) {
        // Edge case: if source and destination are the same
        if (src == dest) {
            return Collections.singletonList(src);
        }

        // Create a queue for BFS and a map to track the shortest path
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> parentMap = new HashMap<>();
        boolean[] visited = new boolean[graph.size()];

        queue.add(src);
        visited[src] = true;
        parentMap.put(src, null); // Source has no parent

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                    parentMap.put(neighbor, current);

                    // If we reach the destination, reconstruct the path
                    if (neighbor == dest) {
                        return reconstructPath(parentMap, src, dest);
                    }
                }
            }
        }

        // If no path found
        return Collections.emptyList();
    }

    private static List<Integer> reconstructPath(Map<Integer, Integer> parentMap, int src, int dest) {
        List<Integer> path = new LinkedList<>();
        for (Integer at = dest; at != null; at = parentMap.get(at)) {
            path.add(at);
        }
        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args) {

        int numberOfNodes = 5;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numberOfNodes; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1); 
        graph.get(0).add(2); 
        graph.get(1).add(3); 
        graph.get(2).add(3); 
        graph.get(3).add(4); 

        int src = 0; 
        int dest = 4; 

        List<Integer> path = shortestPath(src, dest, graph);
        System.out.println("Shortest path from " + src + " to " + dest + ": " + path);
    }
}
