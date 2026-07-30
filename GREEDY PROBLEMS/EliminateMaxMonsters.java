import java.util.*;

public class EliminateMaxMonsters {

    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        int min = 0;
        int[] time = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            time[i] = (dist[i] + speed[i] - 1) / speed[i];
        }

        Arrays.sort(time);

        for (int i = 0; i < n; i++) {
            if (time[i] > min) {
                count++;
            } else {
                break;
            }
            min++;
        }

        return count;
    }

    public static void main(String[] args) {
        EliminateMaxMonsters obj = new EliminateMaxMonsters();

        int[] dist = {1, 3, 4};
        int[] speed = {1, 1, 1};

        int ans = obj.eliminateMaximum(dist, speed);

        System.out.println("Maximum monsters eliminated: " + ans);
    }
}