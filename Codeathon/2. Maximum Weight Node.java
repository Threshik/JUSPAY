/*Sample Input :
23
4 4 1 4 13 8 8 8 0 8 14 9 15 11 -1 10 15 22 22 22 22 22 21
Sample Output :
22

*/
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int[] edge = new int[v];
        for(int i=0;i<v;i++)
        {
            edge[i]=s.nextInt();
        }
        int[] temp = new int[v];
        for(int i=0;i<v;i++)
        {
            if(edge[i]!=-1)
            temp[edge[i]]+=i;
        }
        int max = Integer.MIN_VALUE;
        int node = 0;
        for(int i=0;i<v;i++)
        {
          if(temp[i]>=max)
          {
              max=temp[i];
              node=i;
          }
        }
        System.out.println(node);
    }
}
