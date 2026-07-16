public class SumOfNNumbers {
    public static void main(String[] args) {
        int n=3;
        
        System.out.println(sum(n,0));
    }
    static int sum(int n,int sum){
        if(n==0) return sum;
        // sum+=n;
        return sum(n-1,sum+n);
        
    }
}
