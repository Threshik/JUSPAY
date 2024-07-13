/*
5
6
0 1
0 3
1 3
1 4
2 3
3 4
2 4
2*/
import java.util.*;
public class minimum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = s.nextInt();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        int m = s.nextInt();

        for(int i=0;i<m;i++)
        {
            int u = s.nextInt();
            int v = s.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int src = s.nextInt();
        int desc = s.nextInt();
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];
        int count=0;
        q.add(src);
        while(q.size()!=0)
        {
            int node = q.poll();
            vis[node]=true;
            if(node==desc) {
                ++count;
                continue;
            }
            for(int i=0;i<adj.get(node).size();i++)
            {
                int adv = adj.get(node).get(i);
                if(!vis[adv])
                    q.add(adv);
            }

        }
        System.out.println(count);
    }
}

