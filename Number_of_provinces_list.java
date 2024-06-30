class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        boolean visited[] = new boolean[V];
        int count=0;
        for(int i=0;i<V;i++)
        {
            if(!visited[i])
            {
            count++;
            bfs(adj,visited,i);
            }
        }
        return count;
    }
    public static void bfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited,int j)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(j);
        visited[j]=true;
        
        while(q.size()!=0)
        {
            int vertex = q.remove();
           
            for(int i=0;i<adj.get(vertex).size();i++)
            {
                int adv = adj.get(vertex).get(i);
                if(!visited[i] && adv!=0)
                {
                 q.add(i);
                 visited[i]=true;
                
                }
            }
        }
    }
}
