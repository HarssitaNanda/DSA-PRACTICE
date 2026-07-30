

public class MinFlipsOfBulbs {
    
    public static void main(String[] args) {
        String target = "10111";

        Solution obj = new Solution();
        int ans = obj.minFlips(target);

        System.out.println(ans);
    }
}

class Solution {
    public int minFlips(String target) {
        int flips = 0;

        if (target.charAt(0) == '1')
            flips++;

        for (int i = 1; i < target.length(); i++) {
            if (target.charAt(i) != target.charAt(i - 1))
                flips++;
        }

        return flips;
    }
}

