import java.util.*;

public class codeforcesc {
    static final int MOD = 676767677;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            System.out.println(solve(n, a));
        }
    }
    
    static long solve(int n, int[] a) {
        if (!isValid(n, a)) return 0;
        int[] leftToRight = new int[n]; 
        int[] rightToLeft = new int[n]; 
        
        for (int i = 0; i < n - 1; i++) {
            int diff = a[i] - a[i + 1];
            if (diff > 0) {
                leftToRight[i + 1] = diff;
            } else if (diff < 0) {
                rightToLeft[i + 1] = -diff;
            }
        }
        return countWays(n, a, leftToRight, rightToLeft);
    }
    
    static boolean isValid(int n, int[] a) {
        for (int i = 0; i < n; i++) {
            if (a[i] < 1 || a[i] > n) return false;
        }
        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(a[i] - a[i + 1]) > n) return false;
        }
        if (a[0] < 1) return false;
        return true;
    }
    
    static long countWays(int n, int[] a, int[] leftToRight, int[] rightToLeft) {
        return bruteForce(n, a, 0, new int[n]);
    }
    
    static long bruteForce(int n, int[] a, int pos, int[] capes) {
        if (pos == n) {
            return isValidArrangement(n, a, capes) ? 1 : 0;
        }
        
        long result = 0;
        for (int cape = 0; cape <= 1; cape++) {
            capes[pos] = cape;
            result = (result + bruteForce(n, a, pos + 1, capes)) % MOD;
        }
        
        return result;
    }
    
    static boolean isValidArrangement(int n, int[] a, int[] capes) {
        for (int i = 0; i < n; i++) {
            int visible = 0;
            for (int j = 0; j < n; j++) {
                if ((capes[j] == 0 && i >= j) || (capes[j] == 1 && i <= j)) {
                    visible++;
                }
            }
            if (visible != a[i]) return false;
        }
        return true;
    }
}
