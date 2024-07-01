class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        boolean[][] vis = new boolean[n][m];
        int[][] ans = new int[n][m];
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    q.add(new int[] { i, j, 0 });
                    vis[i][j] = true;
                }
            }
        }

        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        while (q.size() > 0) {
            int[] p = q.remove();
            int f = p[0];
            int s = p[1];
            int l = p[2];
            ans[f][s] = l;
            for (int i = 0; i < 4; i++) {
                int n1 = p[0] + dx[i];
                int n2 = p[1] + dy[i];
                if (n1 >= 0 && n1 < n && n2 >= 0 && n2 < m && !vis[n1][n2]) {
                    q.add(new int[] { n1, n2, l+1});
                    vis[n1][n2] = true;
                }

            }
        }

        return ans;
    }
}
