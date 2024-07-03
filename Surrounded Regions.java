class Solution {
    void dfs(int row,int col,int[][] vis,char[][] board,int[] dx,int[] dy)
    {
        vis[row][col]=1;
        int n = board.length;
        int m =board[0].length;
        for(int i=0;i<4;i++)
        {
            int n1=row+dx[i];
            int n2=col+dy[i];
            if(n1>=0 && n1<n && n2>=0 && n2<m && vis[n1][n2]==0 && board[n1][n2]=='O')
            {
                dfs(n1,n2,vis,board,dx,dy);
            }
        }
    }
    public void solve(char[][] board) {
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        int n = board.length;
        int m = board[0].length;
        int[][] vis = new int[n][m];
        //first row and last row
        for(int j=0;j<m;j++)
        {
            if(vis[0][j]==0 && board[0][j]=='O')
            {
                dfs(0,j,vis,board,dx,dy);
            }
            if(vis[n-1][j]==0 && board[n-1][j]=='O')
            {
                dfs(n-1,j,vis,board,dx,dy);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(vis[i][0]==0 && board[i][0]=='O')
            {
                dfs(i,0,vis,board,dx,dy);
            }
            if(vis[i][m-1]==0 && board[i][m-1]=='O')
            {
                dfs(i,m-1,vis,board,dx,dy);
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==0 && board[i][j]=='O')
                board[i][j]='X';
            }
        }
        
    }
}
