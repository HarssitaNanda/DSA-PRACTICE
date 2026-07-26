/*
### **Approach**

* Use recursion to explore **all possible subsequences** of the array.
* At each index, there are **two choices**:

  * **Pick** the current element.
  * **Do not pick** the current element.
* Continue this process until all elements have been considered.

### **Base Case**

* When `i == arr.length`, all elements have been processed.
* If the current sum equals the target sum `k`, return `1` (one valid subsequence found).
* Otherwise, return `0`.

### **Counting Subsequences**

* The **pick** recursive call returns the number of valid subsequences that include the current element.
* The **not-pick** recursive call returns the number of valid subsequences that exclude the current element.
* The total number of valid subsequences is the sum of both results:

  ```java
  return left + right;
  ```

### **Why Not Use a `count` Variable?**

* Java passes primitive data types (`int`, `double`, etc.) **by value**.
* A `count` variable passed as a parameter creates a separate copy for each recursive call.
* Any changes made to `count` inside one recursive call are **not reflected** in other calls.
* Returning the count from each recursive call is a cleaner and more reliable approach.

### **Advantages of Returning the Count**

* No need for global or static variables.
* Avoids side effects caused by shared state.
* Makes the function self-contained and easier to understand.
* Follows the standard recursive pattern commonly used in DSA interviews and competitive programming.

### **Time Complexity**

* **O(2ⁿ)** — Every element has two choices (pick or not pick), generating all possible subsequences.

### **Space Complexity**

* **O(n)** — Due to the recursion call stack, where `n` is the number of elements in the array.

*/
import java.util.ArrayList;

public class CountSubsequencesWithSumK {
    public static void main(String[] args) {
        int[] arr={3,1,2,4,2};
        int sum=4;
        System.out.println(subsequences(arr,0,sum,0,0));

    }
    static int subsequences(int[] arr,int i,int k,int sum,int count){

        if(i==arr.length){
            if(sum==k){
            return 1;
            }
            else return 0;
        }
        sum+=arr[i];
        int l=subsequences(arr, i+1, k,sum,count);
        sum-=arr[i];
        // if(sum==k) //System.out.println(list.toString());
        
        int r=subsequences(arr, i+1,k,sum,count);
        return l+r;
    }
}
