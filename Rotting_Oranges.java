class Solution {
    public int orangesRotting(int[][] grid) {
       Queue<int[]> q = new LinkedList<>();
       int rows=grid.length;
       int col = grid[0].length;
       int count_fresh=0;
       for(int i=0;i<rows;i++)
       {
        for(int j=0;j<col;j++)
        {
            if(grid[i][j]==2)
            {
                q.add(new int[] {i,j});
            }
            if(grid[i][j]!=0)
            count_fresh++;
        }
       }

       int countMin=0;
       int count=0;
       int[] dx = {0,0,1,-1};
       int[] dy = {1,-1,0,0};

       while(q.size()!=0)
       {
        int size = q.size();
        count+=size;

        for(int i=0;i<size;i++)
        {
            int[] point = q.remove();
            for(int j=0;j<4;j++)
            {
                int x = point[0]+dx[j];
                int y = point[1]+dy[j];

                if(x<0||y<0||x>=rows||y>=col||grid[x][y]==0||grid[x][y]==2)
                continue;

                grid[x][y]=2;
                q.add(new int[] {x,y});
            }
        }
        if(q.size()!=0)
        countMin++;
       }
   return count_fresh == count ? countMin : -1;
    }
    
}
