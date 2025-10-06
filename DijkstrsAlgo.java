import java.util.ArrayList;
import java.util.PriorityQueue;

class Pair {
    int distance;
    int node;
    
    Pair(int distance, int node) {
        this.distance = distance;
        this.node = node;
    }
}

public class DijkstrsAlgo {
    public static void main(String[] args) {
        // Example graph with 5 vertices
        int V = 5;
        int S = 0; // source vertex
        
        // Create adjacency list
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        // Add edges: [destination, weight]
        adj.get(0).add(new ArrayList<>(){{add(1); add(2);}});  // 0->1 weight 2
        adj.get(0).add(new ArrayList<>(){{add(4); add(1);}});  // 0->4 weight 1
        adj.get(1).add(new ArrayList<>(){{add(2); add(3);}});  // 1->2 weight 3
        adj.get(1).add(new ArrayList<>(){{add(3); add(2);}});  // 1->3 weight 2
        adj.get(1).add(new ArrayList<>(){{add(4); add(2);}});  // 1->4 weight 2
        adj.get(2).add(new ArrayList<>(){{add(3); add(1);}});  // 2->3 weight 1
        adj.get(3).add(new ArrayList<>(){{add(4); add(3);}});  // 3->4 weight 3
        
        int[] distances = dijkstra(V, adj, S);
        
        System.out.println("Shortest distances from vertex " + S + ":");
        for(int i = 0; i < V; i++) {
            System.out.println("To vertex " + i + ": " + distances[i]);
        }
    }
     static int[] dijkstra(int V,
    ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // min-heap
        PriorityQueue<Pair> pq =
        new PriorityQueue<Pair>((x,y) -> x.distance - y.distance);

        int []dist = new int[V];
        for(int i =0;i<V;i++) dist[i] = (int)(1e9);

        dist[S] = 0;
        pq.add(new Pair(0,S));

        while(pq.size() != 0) {
            int dis = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();

            for(int i = 0;i<adj.get(node).size();i++) {
                int edgeWeight = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(0);

                if(dis + edgeWeight < dist[adjNode]) {
                    dist[adjNode] = dis + edgeWeight;
                    pq.add(new Pair(dist[adjNode], adjNode));
                }
            }
        }
        return dist;
    }
    
}
