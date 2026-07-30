import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);
        int ans=fib(n,dp);
        System.out.println(ans);
    }
    static int fib(int n,int[] dp) {
        //Base condition
      dp[0]=0;
      dp[1]=1;
        //Tabulation
       for(int i=2;i<n;i++){
        dp[i]=dp[i-1]+dp[i-2];
       }
    

    return dp[n];
    }
}
