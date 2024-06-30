class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        int n = isConnected[0].length;
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                count++;
                bfs(i,visited,isConnected);
            }
        }
        return count;
        
    }
    public void bfs(int i, boolean[] visited, int[][] mat)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(q.size()!=0)
        {
            int vertex = q.remove();
            for(int j=0;j<mat[vertex].length;j++)
            {
                int adv = mat[vertex][j];
                if(!visited[j] && adv!=0)
                {
                    q.add(j);
                    visited[j]=true;
                }
            }
        }
    }
}
