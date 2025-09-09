public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 600;
        int[] cache = new int[n + 1];
        System.out.println(climbStairs(n, cache));
    }
    static int climbStairs(int n, int[] cache) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        if (cache[n] != 0) return cache[n]; 
        cache[n] = climbStairs(n - 1, cache) + climbStairs(n - 2, cache);
        return cache[n];
    }
}
