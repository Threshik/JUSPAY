class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
       ArrayList<Integer> res = new ArrayList<>();
       boolean visited[] = new boolean[V];
       Queue<Integer> q = new LinkedList<>();
       int start=0;
       q.add(start);
       visited[start]=true;
       while(q.size()!=0)
       {
           int vertex=q.remove();
           res.add(vertex);
           
           for(int i=0;i<adj.get(vertex).size();i++)
           {
               int adv = adj.get(vertex).get(i);
               if(!visited[adv])
               {
                   q.add(adv);
                   visited[adv]=true;
               }
               
           }
       }
       return res;
    }
}
