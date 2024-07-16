/*Sample Input :
23
4 4 1 4 13 8 8 8 0 8 14 9 15 11 -1 10 15 22 22 22 22 22 21
9 2
Sample Output :
4
*/
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int[] edge = new int[v];
        for(int i=0;i<v;i++)
        edge[i]=s.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] vis = new boolean[v];
        int node1 = s.nextInt();
        int node2 = s.nextInt();
        while(true)
        {
            if(res.contains(node2)||node1==node2)
            {
                System.out.print(node2);
                break;
            }
            else if(node2==-1||vis[node2])
            {
                 System.out.print("-1");
                 break;
            }
            vis[node2]=true;
            node2=edge[node2];
            
        }
    }
    static void findpath(int node1,int node2,ArrayList<Integer> res,int[] edge)
    {
        //reaches the node again or if there is no path then simply return
        if(res.contains(node1)||node1==-1)
        return;
        //if the node1 == node2 then add them and return
        if(node1==node2){
            res.add(node1);
            return;
        }
        //keep on adding the node1 that is we are traversing 
        res.add(node1);
        findpath(edge[node1],node2,res,edge);
    }
}
