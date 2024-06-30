class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
       ArrayList<Integer> res = new ArrayList<>();
       boolean[] visited = new boolean[V];
       Stack<Integer> s = new Stack<>();
       int start=0;
       s.push(0);
       
       while(s.size()!=0)
       {
           int vertex = s.pop();
           if(!visited[vertex])
           {
               res.add(vertex);
           }
           visited[vertex]=true;
           
           for(int i=adj.get(vertex).size()-1;i>=0;i--)
           {
               int adv = adj.get(vertex).get(i);
               if(!visited[adv])
               s.push(adv);
           }
       }
       return res;
    }
}
