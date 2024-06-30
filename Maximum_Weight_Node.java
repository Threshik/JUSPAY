class Solution{
    public int maxWeightCell(int N, int Edge[]){
        int temp[] = new int[N];
        for(int i=0;i<N;i++)
        {
            if(Edge[i]!=-1)
            {
                temp[Edge[i]]+=i;
            }
        }
        int max = Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<N;i++)
        {
            if(temp[i]>=max)
            {
            max=temp[i];
            index=i;
            }
        }
        
        return index;
       
    }
}
