class Solution {
    void dfs(int row,int col,int[][] res,int[][] image,int color,int ini,int[] dx,int[] dy)
    {
        res[row][col]=color;
        int n = image.length;
        int m = image[0].length;
        for(int i=0;i<4;i++)
        {
            int n1 = row+dx[i];
            int n2 = col+dy[i];
            if(n1>=0 && n2>=0 && n1<n && n2<m && image[n1][n2]==ini &&image[n1][n2]!=color)
            dfs(n1,n2,res,image,color,ini,dx,dy);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] res = image;
        int ini = res[sr][sc];
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        dfs(sr,sc,res,image,color,ini,dx,dy);
        return res;

    }
}
