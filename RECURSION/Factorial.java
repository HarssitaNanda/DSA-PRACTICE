class Factorial{
    public static void main(String[] args) {
        int n=4;
        int prod=1;
        System.out.println(fact(n,prod));
    }
    static int fact(int n,int prod){
        prod*=n;
        if(n>1)
        return fact(n-1,prod);
        return prod;
    }
}
