import java.util.Scanner;

public class Codeforces1A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int l=Integer.MIN_VALUE;
            for(int g=0;g<n;g++){
                int a=sc.nextInt();
                l=Math.max(l,a);
            }
            System.out.println(l);
        }
        sc.close();
    }
}
