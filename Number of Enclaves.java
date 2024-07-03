class Solution {
    public void dfs(int row,int col,int[][]vis,int[][] grid,int[] dx,int[] dy)
    {
        int n = grid.length;
        int m=grid[0].length;
        vis[row][col]=1;
        for(int i=0;i<4;i++)
        {
            int n1 = row+dx[i];
            int n2 = col+dy[i];

            if(n1>=0 && n1<n && n2>=0 && n2<m && vis[n1][n2]==0 && grid[n1][n2]==1)
            {
                dfs(n1,n2,vis,grid,dx,dy);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int n= grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int[] dx ={0,0,1,-1};
        int[] dy ={1,-1,0,0};

        //checking the boundary

        for(int j=0;j<m;j++)
        {
            if(vis[0][j]==0 && grid[0][j]==1)
            {
                dfs(0,j,vis,grid,dx,dy);
            }
            if(vis[n-1][j]==0 && grid[n-1][j]==1)
            {
                dfs(n-1,j,vis,grid,dx,dy);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(vis[i][0]==0 && grid[i][0]==1)
            {
                dfs(i,0,vis,grid,dx,dy);
            }
            if(vis[i][m-1]==0 && grid[i][m-1]==1)
            {
                dfs(i,m-1,vis,grid,dx,dy);
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==0 && grid[i][j]==1)
                count++;
            }
        }
      return count;
    }
}
