import java.util.*;

class nearestMeetingCell {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int[] edge = new int[v];
        for(int i=0;i<v;i++)
            edge[i]=s.nextInt();

        int node1 = s.nextInt();
        int node2 = s.nextInt();

        ArrayList<Integer> pathFromNode1 = new ArrayList<>();
        boolean[] vis = new boolean[v];

        //Find path from node1
        findpath(node1, pathFromNode1, edge);

        // Reset visited array for second traversal
        Arrays.fill(vis, false);
        int result = -1;

        //Traverse from node2 and check for common cell
        while (node2 != -1) {
            if (pathFromNode1.contains(node2)) {
                result = node2;
                break;
            }
            node2 = edge[node2];
        }

        System.out.println(result);
    }
//func to traverse node1 and its path
    static void findpath(int node1, ArrayList<Integer> path, int[] edge) {
        while (node1 != -1 && !path.contains(node1)) {
            path.add(node1);
            node1 = edge[node1];
        }
    }
}
