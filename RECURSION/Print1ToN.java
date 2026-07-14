class Print1ToN{
    public static void main(String[] args){
        int n=10;
        print(n,1);
        System.out.print("Done");
    }
    static void print(int n,int i){
        if(i>n) return;
        System.out.println(i);
        print(n,i+1);
    }
}