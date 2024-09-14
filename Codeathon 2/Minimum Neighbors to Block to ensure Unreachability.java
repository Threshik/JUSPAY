import java.lang.reflect.Array;
import java.util.*;
public class blockMinimumNigbours {
    public static Set<Integer> find(int src,boolean[] vis, ArrayList<ArrayList<Integer>> res)
    {
        //bfs traversal
        Set<Integer> set = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        vis[src]=true;
        while(!q.isEmpty())
        {
            int curr = q.poll();
            set.add(curr);
            for(int nei:res.get(curr))
            {
                if(!vis[nei])
                {
                    vis[nei]=true;
                    set.add(nei);
                }

            }
        }
        return set;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        boolean[] vis = new boolean[v];
        for(int i=0;i<v;i++)
            res.add(new ArrayList<>());
        for(int i=0;i<v;i++)
        {
            int edge=s.nextInt();
            for(int j=0;j<edge;j++)
                res.get(i).add(s.nextInt());
        }
        int src = s.nextInt();
        int dest = s.nextInt();

        //get nodes reachable from src
        Set<Integer> srcSet = find(src,vis,res);
        
        Arrays.fill(vis,false);
        
        //get node reachable from dest
        Set<Integer> destSet = find(dest,vis,res);
        
        //the nodes to be blocked: reachable from src and reach the dest
        srcSet.retainAll(destSet);

        if(srcSet.size()==0)
            System.out.println("No nodes");
        else System.out.println(srcSet);
    }
}
