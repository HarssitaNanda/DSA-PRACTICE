import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        reverse(arr,arr.length,0);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr,int n,int i){
        if(i>n/2) return;
        
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;

        reverse(arr, n, i+1);
    }
}

/*Note: In Java, arrays are passed by reference value, which means when you pass an array to a function, the function receives a copy of the reference pointing to the same array object.

So, changing the elements of the array inside the function affects the original array outside the function as well.
Rule to remember
Modifying array elements (arr[i] = x) → reflected outside.
Changing the reference itself (arr = new int[...]) → not reflected outside.

The same behavior applies to objects like ArrayList, StringBuilder, custom classes, etc.
*/