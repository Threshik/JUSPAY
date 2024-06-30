class Solution{
    long sum=-1;
    public long largesSumCycle(int N, int Edge[]){
        boolean[] visited = new boolean[N];
        boolean[] rec = new boolean[N];
        for(int i=0;i<N;i++)
        checkCycle(i,Edge,visited,rec,new ArrayList<Integer>());
        return sum;
    }
    public void checkCycle(int i,int Edge[],boolean[] visited,boolean[] rec, ArrayList<Integer> adj)
    {
        if(i==-1) //base condition
        return;
        if(rec[i]) //to check the current node already in the stack
        {
            int index=adj.indexOf(i);
            if(index!=-1)
            {
                int s = 0;
                for(int j=index;j<adj.size();j++)
                {
                    s+=adj.get(j);
                }
                if(s>sum)
                    sum=s;
                return;
            }
        }
            if(visited[i])
            return;
            visited[i]=true;
            rec[i]=true;
            adj.add(i);
            checkCycle(Edge[i],Edge,visited,rec,adj);
            rec[i]=false;
            adj.remove(adj.size()-1);
            return;
        
    }
}
