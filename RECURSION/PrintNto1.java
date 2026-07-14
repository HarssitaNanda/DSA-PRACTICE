public class PrintNto1 {
    public static void main(String[] args){
        int n=10;
        print(n);
        System.out.print("Done");
    }
    static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }
}
