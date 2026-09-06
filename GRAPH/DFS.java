import java.util.ArrayList;

class DFS{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        int start=1;
        for(int i=0;i<=6;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(1).add(2);
        graph.get(1).add(6);
        graph.get(2).add(1);
        graph.get(2).add(3);
        graph.get(2).add(4);
        graph.get(3).add(2);
        graph.get(4).add(2);
        graph.get(4).add(5);
        boolean[] visited=new boolean[7];
        dfs(start,graph,visited);
    }
    static void dfs(int currVertex,ArrayList<ArrayList<Integer>> graph,boolean[] visited) {
       
       visited[currVertex]=true;
       System.out.println(currVertex);
        for (int neighbor : graph.get(currVertex)) {
            if(!visited[neighbor])
            dfs(neighbor, graph, visited);
}
    }
    }


/*Using a boolean[] instead of an int[] for visited is idiomatic Java and saves memory. */

