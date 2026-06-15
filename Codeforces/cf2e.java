import java.util.*;

public class cf2e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long x = sc.nextLong();
            long[] a = new long[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            
            Arrays.sort(a);
            
            long left = 0, right = x;
            long bestDist = 0;
            List<Long> bestTeleports = new ArrayList<>();
            
            while(left <= right) {
                long mid = (left + right) / 2;
                List<Long> teleports = canPlace(a, k, x, mid);
                
                if(teleports != null) {
                    bestDist = mid;
                    bestTeleports = teleports;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            
            for(long tp : bestTeleports) {
                System.out.print(tp + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
    static List<Long> canPlace(long[] friends, int k, long x, long minDist) {
        List<Long> teleports = new ArrayList<>();
        for(long friend : friends) {
            if(teleports.isEmpty() || friend - teleports.get(teleports.size() - 1) > 2 * minDist) {
                long newPos = Math.min(friend + minDist, x);
                teleports.add(newPos);
            }
        }
        long lastPos = teleports.isEmpty() ? 0 : teleports.get(teleports.size() - 1);
        while(teleports.size() < k && lastPos < x) {
            lastPos = Math.min(lastPos + x, x);
            teleports.add(lastPos);
        }
        
        if(teleports.size() >= k) {
            return new ArrayList<>(teleports.subList(0, k));
        }
        
        return null;
    }
}