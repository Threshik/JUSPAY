//User function Template for Java


class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        //optimized code
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<K;i++)
        {
            for(int j=0;j<K;j++)
            {
                pq.add(arr[i][j]);
            }
        }
        while(pq.size()!=0)
        {
        int p = pq.poll();
        list.add(p);
        }
        return list;
        //less otimized code
        // int n = arr.length;
        // int m = arr[0].length;
        // ArrayList<Integer> res = new ArrayList<>();
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<m;j++){
        //         res.add(arr[i][j]);
        //     }
        // }
        // Collections.sort(res);
        // return res;        
    }
}
