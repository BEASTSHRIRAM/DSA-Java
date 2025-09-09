public class sqrt {
    public static void main(String[] args) {
        int n =8;
        int p=3;
        System.out.println(sqrtwithprecision(n, p));
    }
    static int sqrtof(int n){
        if (n<2) {
            return n;
        }
        int start=0;int end=n;int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            long sq=(long)mid*mid;
            if (sq == n) return mid;
            if (sq < n){
                ans = mid; 
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;


    }
    static double sqrtwithprecision(int n, int p) {
        int s = 0;
        int e = n;

        double root = 0.0;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m * m == n) {
                return m;
            }

            if (m * m > n) {
                e = m - 1;
            } else {
                s = m + 1;
                root = m;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }

        return root;
    }
}
