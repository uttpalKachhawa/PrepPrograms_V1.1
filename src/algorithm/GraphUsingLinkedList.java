package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author uttpal on Aug, 2020
 */
public class GraphUsingLinkedList {

    private LinkedList<Integer>[] adj;
    private int V;
    private int E;

    public GraphUsingLinkedList(int nodes) {

        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];

        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList();
        }
    }


    public void addEdge(int u, int v) {
        this.adj[u].add(v);
        this.adj[v].add(u);
        E++;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices " + E + " edges " + "\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + " : ");
            for (int w : adj[v]) {
                sb.append(w + " ");
            }

            sb.append("\n");
        }
        return sb.toString();
    }


    //Method of BFS(Breadth First Search Algorithm
    //Here we can find the path and can represnt it
    public void bfs(int s) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];
        visited[s] = true;
        q.offer(s);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " " + "\n");
            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);

                }
            }


        }


    }


    public void dfs(int s) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.println(u + "");

                for (int v : adj[u]) {
                    if (!visited[v]) {
                        stack.push(v);

                    }

                }

            }

        }


    }

    public static void main(String[] args) {
        GraphUsingLinkedList g = new GraphUsingLinkedList(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.addEdge(2, 4);
        g.dfs(0);

        System.out.println(g);
    }


}
