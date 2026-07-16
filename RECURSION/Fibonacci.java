

class Fibonacci{
    public static void main(String[] args) {
        int n=10;
        fib(0,1,n);
        
    }
    static void fib(int a, int b, int n) {
        if (n == 0) return;

        System.out.print(a + " ");
        fib(b, a + b, n - 1);
    }
}