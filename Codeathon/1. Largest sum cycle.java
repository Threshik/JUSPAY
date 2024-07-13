/*Sample Input :
23
4 4 1 4 13 8 8 8 0 8 14 9 15 11 -1 10 15 22 22 22 22 22 21
Sample Output :
6
*/
import java.util.*;
class HelloWorld {
    static long length=0;
    static long cycle(int V, int[] edges)
    {
        boolean[] vis = new boolean[V];
        boolean[] st = new boolean[V];
        for(int i=0;i<V;i++)
        {
            checkcycle(i,vis,st,edges,new ArrayList<Integer>());
        }
        return length;
    }
    static void checkcycle(int i,boolean[] vis,boolean[] st, int[] edges,ArrayList<Integer> l)
    {
        if(i==-1)
        return;
        //if the st is true then the cycle exists
        if(st[i])
        {
            int index = l.indexOf(i);
            int max=0;
            for(int j=index;j<l.size();j++)
            {
                max++;
                if(max>length)
                length=max;
            }
        }
        // if it visited but it should not be considered as a cycle
        if(vis[i])
        return;
        vis[i]=true;
        st[i]=true;
        l.add(i);
        //checking like 0->1, 1->2
        checkcycle(edges[i],vis,st,edges,l);
        st[i]=false;
        l.remove(l.size()-1);
        return;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int[] edge = new int[v];
        for(int i=0;i<v;i++)
        {
            edge[i]=s.nextInt();
        }
        System.out.println(cycle(v,edge));
    }
}
