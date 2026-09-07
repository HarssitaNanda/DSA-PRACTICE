import java.util.ArrayList;

public class NumberOfProvinces{
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < isConnected.length; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[i].length; j++) {
                if (isConnected[i][j] == 1) graph.get(i).add(j);
            }
        }
        boolean[] visited = new boolean[isConnected.length + 1];
        int count = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited);
                count++;
            }
        }
        return count;
    }

    static void dfs(int currVertex, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
        visited[currVertex] = true;
        System.out.println(currVertex);
        for (int neighbor : graph.get(currVertex)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited);
            }
        }
    }

    public static void main(String[] args) {
        NumberOfProvinces solver = new NumberOfProvinces();

        // Test Case 1: 3 cities, cities 0 and 1 are connected -> 2 provinces
        int[][] isConnected1 = {
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        };
        System.out.println("--- Test Case 1 Traversal ---");
        int provinces1 = solver.findCircleNum(isConnected1);
        System.out.println("Total Provinces: " + provinces1 + "\n");

        // Test Case 2: 3 cities, no interconnections -> 3 provinces
        int[][] isConnected2 = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        System.out.println("--- Test Case 2 Traversal ---");
        int provinces2 = solver.findCircleNum(isConnected2);
        System.out.println("Total Provinces: " + provinces2);
    }
}