import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=5;
        int src=s.nextInt();
        int des=s.nextInt();
        int[][] adj={
            {0,0,0,1,0},
            {0,0,0,1,1},
            {0,1,0,1,0},
            {0,0,0,0,0},
            {0,1,0,0,0}};
            Queue<Integer> q = new LinkedList<>();
            boolean[] vis = new boolean[n];
            boolean flag= false;
            q.add(src);
            while(q.size()!=0)
            {
                int peek = q.poll();
                if(peek==des)
                {
                    flag=true;
                    break;
                }
                for(int i=0;i<n;i++)
                {
                   if(adj[peek][i]==1 && !vis[i])
                   {
                       q.add(i);
                       vis[i]=true;
                   }
                }
            }
            System.out.print(flag);
    }
}
