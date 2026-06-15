import java.util.PriorityQueue;

public class swiminrisingwater {
    public static void main(String[] args) {
        
    }
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        boolean[][] visited=new boolean[n][n];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b) -> a[0] - b[0]);
        pq.add(new int[]{grid[0][0], 0, 0});
        while (!pq.isEmpty()) {
            int[] top=pq.poll();
            int time=top[0],r=top[1],c=top[2];
            if (r==n-1 &&c==n-1) return time;
            if (visited[r][c])continue;
            visited[r][c]=true;
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr >= 0 && nc >= 0 && nr < n && nc < n && !visited[nr][nc]) {
                    pq.add(new int[]{Math.max(time, grid[nr][nc]), nr, nc});
                }
            }
        }
        return -1;
    }
    
}
