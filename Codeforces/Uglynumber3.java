public class Uglynumber3 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(6,2,3,4));
    }
    static int nthUglyNumber(int n, int a, int b, int c) {
        long low = 1;
        long high = (long) n * Math.min(Math.min(a, b), c);

        while (low < high) {
            long mid = low + (high - low) / 2;
            if (count(mid, a, b, c) < n) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return (int) low; 
    }

    static long count(long x, int a, int b, int c) {
        long ab = lcm(a, b);long bc = lcm(b, c);long ac = lcm(a, c);long abc = lcm(ab, c);

        return x / a + x / b + x / c
             - x / ab - x / bc - x / ac
             + x / abc;
    }

    static long gcd(long a, long b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    static long lcm(long a, long b) {
        return a / gcd(a, b) * b; 
    }
    
}
