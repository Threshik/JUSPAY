import java.util.*;

public class findReachability {
    public static boolean isReachable(int src, int dest, ArrayList<ArrayList<Integer>> graph) {
        // Edge case: if source and destination are the same
        if (src == dest) 
            return true;
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.size()];

        // Start BFS from the source node
        q.add(src);
        vis[src] = true;

        while (!q.isEmpty()) {
            int curr = q.poll();

            // Traverse all adjacent nodes
            for (int nei : graph.get(curr)) {
                if (nei == dest) return true; // Destination found
                if (!vis[nei]) {
                    vis[nei] = true;
                    q.add(nei);
                }
            }
        }

        return false; // Destination not found
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Read the number of nodes
        int v = s.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize adjacency lists
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // Manually add edges to the graph
        // Adjust the following lines to set up your graph
        graph.get(0).add(1); // 0 -> 1
        graph.get(0).add(2); // 0 -> 2
        graph.get(1).add(3); // 1 -> 3
        graph.get(2).add(3); // 2 -> 3
        graph.get(3).add(4); // 3 -> 4

        // Read source and destination nodes
        int src = s.nextInt();
        int dest = s.nextInt();

        // Check if destination is reachable from source
        boolean result = isReachable(src, dest, graph);
        System.out.println(result);
    }
}
