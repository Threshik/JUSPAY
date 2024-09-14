class Solution{
    long sum=-1;
    public long largesSumCycle(int N, int Edge[]){
        
        boolean[] vis = new boolean[N];
        boolean[] revis = new boolean[N];
        for(int i=0;i<N;i++)
        checkCycle(i,Edge,vis,revis,new ArrayList<Integer>());
        return sum;
    }
    public void checkCycle(int i,int Edge[],boolean[] vis,boolean[] revis,ArrayList<Integer> adj)
    {
        if(i==-1)
        return;
        //if the cycle exists
        if(revis[i])
        {
            int index = adj.indexOf(i);
            
            if(index!=-1)
            {
                int s=0;
                for(int j=index;j<adj.size();j++)
                {
                s+=adj.get(j);
                }
                if(s>sum)
                sum=s;
              return;
            }
        }
        if(vis[i])
        return;
        vis[i]=true;
        revis[i]=true;
        adj.add(i);
        checkCycle(Edge[i],Edge,vis,revis,adj);
        //backtracking
        revis[i]=false;
        adj.remove(adj.size()-1);
        return;
    }
}
