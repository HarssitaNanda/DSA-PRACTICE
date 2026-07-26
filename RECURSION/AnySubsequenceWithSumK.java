//This problem aims to stop after it gets one valid subsequence.
import java.util.ArrayList;

public class AnySubsequenceWithSumK {
    public static void main(String[] args) {
        int[] arr={3,1,2};
        int sum=3;
        ArrayList<Integer> list=new ArrayList<>();
        subsequences(arr,0,list,sum,0);

    }
    static boolean subsequences(int[] arr, int i, ArrayList<Integer> list, int k, int sum) {

    if (i == arr.length) {
      if (sum == k) {
    System.out.print("START->");
    System.out.println(list);
    return true;
}
        return false;
    }

    // Pick
    list.add(arr[i]);

    if (subsequences(arr, i + 1, list, k, sum + arr[i]))
        return true;

    // Backtrack
    list.remove(list.size() - 1);

    // Not Pick
    if (subsequences(arr, i + 1, list, k, sum))
        return true;

    return false;
}
}
