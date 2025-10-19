import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            List<Integer> ans = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    ans.add(i);
                }
            }
            
            System.out.println(ans.size());
            for (int i : ans) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
