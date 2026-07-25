import java.util.ArrayList;

class SubsequencesWithSumK{
    public static void main(String[] args) {
        int[] arr={3,1,2,4,2};
        int sum=4;
        ArrayList<Integer> list=new ArrayList<>();
        subsequences(arr,0,list,sum,0);

    }
    static void subsequences(int[] arr,int i,ArrayList<Integer> list,int k,int sum){

        if(i==arr.length){
            if(sum==k)
            System.out.println(list.toString());
            return;
        }

        list.add(arr[i]);
        sum+=arr[i];
        // if(sum==k) //System.out.println(list.toString());
       
        subsequences(arr, i+1, list,k,sum);
        list.remove(list.size() - 1);
        sum-=arr[i];
        // if(sum==k) //System.out.println(list.toString());
        
        subsequences(arr, i+1, list,k,sum);
    }
}