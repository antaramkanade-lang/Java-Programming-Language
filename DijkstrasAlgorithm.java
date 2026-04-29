import java.util.*;
//T.C=O(V+ E log V) because we used priority Queue.
//without PQ the T.C would be O(V^2) which is greater T.C

public class DijkstrasAlgorithm {
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

    static class Pair implements Comparable<Pair> {
        int n; // node
        int path;

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override // override is used when we implement compareTo.
        public int compareTo(Pair p2) {
            return this.path - p2.path; // return path that has shortest dist.
        }
    }

    public static void dijkstra(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length]; // dist[i]= dist from src to i.
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE; // Initialize each with dist +infinity.
            }
        }
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        // loop:
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;
                // neighbors:
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if (dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt; // update dist from src to v.
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        // print all source to vertices shortest dist:
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
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
        // 2 vertex:
        graph[2].add(new Edge(2, 4, 3));

        // 3 vertex:
        graph[3].add(new Edge(3, 5, 1));

        // 4 vertex:
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    public static void main(String args[]) {
        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        int src = 0;
        dijkstra(graph, src);
    }
}
