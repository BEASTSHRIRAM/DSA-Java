import java.util.*;

public class CodeForcesB{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (k == n * n - 1) {
                System.out.println("NO");
                continue;
            }
            
            System.out.println("YES");
            char[][] grid = new char[n][n];
            if (k == 0) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (j == n - 1) {
                            grid[i][j] = 'D';
                        } else {
                            grid[i][j] = 'R';
                        }
                    }
                }
                grid[n-1][n-1] = 'L';
            } else if (k == n * n) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        grid[i][j] = 'U';
                    }
                }
            } else {
                int count = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (count < k) {
                            grid[i][j] = 'U';
                            count++;
                        } else if (j == n - 1) {
                            grid[i][j] = 'D';
                        } else {
                            grid[i][j] = 'R';
                        }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println(new String(grid[i]));
            }
        }
    }
}
