//codeforces

import java.util.Scanner;

public class In_the_Dream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int r1 = a;
            int k1 = b;
            int r2 = c - a;
            int k2 = d - b;

            if (isPossible(r1, k1) && isPossible(r2, k2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
    static boolean isPossible(int x, int y) {
        int big = Math.max(x, y);
        int small = Math.min(x, y);
        return big <= 2 * (small + 1);
    }

    
}
