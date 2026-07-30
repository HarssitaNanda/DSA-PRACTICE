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
       if (n <= 1)
        return n;
        //Memoization
       if(dp[n]!=-1)
        return dp[n];
    else{
        dp[n]=fib(n-1,dp)+fib(n-2, dp);
    }

    return dp[n];
    }
}
