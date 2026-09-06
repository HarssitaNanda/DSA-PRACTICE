import java.util.Arrays;

class ImplementStackUsingJava{
    public static void main(String[] args) {
        int n=5;
        int[] stk=new int[n];
        // for(int i=n-1;i>=0;i--){
        //     System.out.println(stk[i]);
        // }
        int top=0;
        top=push(5,top,stk,1);
        top=push(5,top,stk,2);
        top=push(5,top,stk,3);
        top=push(5,top,stk,4);
        top=push(5,top,stk,5);
        System.out.println(Arrays.toString(stk));
        top=pop(5, top, stk);
        System.out.println(Arrays.toString(stk));
    }
    static int push(int n,int top,int[] stk,int i){

        if(top<n){
            stk[top]=i;
            top++;
        }
        else
        return top;
    return top;
    }

    static int pop(int n,int top,int[] stk){
        if(top>=0){
            stk[top]=-1;
            top--;
        }
        else
        return top;

        return top;
    }

    static int top(int[] stk,int top){
        return stk[top];
    }

}