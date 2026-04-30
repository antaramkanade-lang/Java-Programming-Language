import java.util.*;

public class BellmanFordsAlgorithm {
    static class Edge {
        int src; // source
        int dest; // destination
        int wt; // weight

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE; // infinity.
            }
        }
        int V = graph.length;
        // T.C=O(V*E).
        // algorithm:O(V)
        for (int i = 0; i < V - 1; i++) {
            // edge: O(E):
            for (int j = 0; j < graph.length; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
                    // u,v,wt:
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    // relaxation step:
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }
        // print:
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 vertex:
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        // 1 vertex:
        graph[1].add(new Edge(1, 2, -4));

        // 2 vertex:
        graph[2].add(new Edge(2, 3, 2));

        // 3 vertex:
        graph[3].add(new Edge(3, 4, 4));

        // 4 vertex:
        graph[4].add(new Edge(4, 1, -1));
    }

    public static void main(String args[]) {
        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bellmanFord(graph, 0);
    }
}
