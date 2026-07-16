
import java.util.ArrayList;

class Fibonacci{
    public static void main(String[] args) {
        int n=10;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(1);
        ArrayList<Integer> ans=fib(n,list,2);
        System.out.println(ans.toString());
    }
    static ArrayList<Integer> fib(int n,ArrayList<Integer> list,int i){
        if(i>=n) return list;

        int sum=list.get(i-1)+list.get(i-2);
        list.add(sum);

        return fib(n,list,i+1);


    }
}