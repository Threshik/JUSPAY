import java.util.Scanner;

//No. of characters to be removed to convert the given string to “Juspay”
public class stringSubsequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String original=s.next();
        String target="Juspay";
        System.out.println(removed(original,target)+" Characters need to be removed!");
    }

    private static int removed(String original, String target) {
        int n = original.length();
        int m = target.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0 || j==0)
                    dp[i][j]=0;
                else if(original.charAt(i-1)==target.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return n-dp[n][m];
    }
}
