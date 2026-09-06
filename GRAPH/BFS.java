import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class GraphRepresentation{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<=6;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(1).add(2);
        graph.get(1).add(6);
        graph.get(2).add(1);
        graph.get(2).add(4);
        graph.get(2).add(3);
        graph.get(3).add(2);
        graph.get(4).add(2);
        graph.get(4).add(5);

        bfs(graph);
    }
    static void bfs(ArrayList<ArrayList<Integer>> graph) {
        Queue<Integer> que=new LinkedList<>();
        int[] visited=new int[7];
        visited[2]=1; //start node=2
        que.add(2);
        while(!que.isEmpty()){
            int node=que.poll();
            System.out.println(node);
        // for(int i=0;i<graph.get(node).size();i++){
        //     if(visited[graph.get(node).get(i)]!=1){
        //     que.add(graph.get(node).get(i));
        //     visited[graph.get(node).get(i)]=1;
        //     }


        // }
        for (int neighbor : graph.get(node)) {
    if (visited[neighbor] != 1) {
        que.add(neighbor);
        visited[neighbor] = 1;
    }
}
    }
    }
}

/*
Replace indexed for loops on neighbors with a clean enhanced for loop:

Java
for (int neighbor : graph.get(node)) {
    if (visited[neighbor] != 1) {
        que.add(neighbor);
        visited[neighbor] = 1;
    }
}
Using a boolean[] instead of an int[] for visited is idiomatic Java and saves memory. */