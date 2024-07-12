class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        int n = arr.length;
        int m = arr[0].length;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                res.add(arr[i][j]);
            }
        }
        Collections.sort(res);
        return res;        
    }
}
