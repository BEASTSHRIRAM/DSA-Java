import java.util.Arrays;
import java.util.Scanner;

public class cf2b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            String s=sc.next();
            String g=sc.next();
            char[] arr1=s.toCharArray();
            char[] arr2=g.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            String ss=new String(arr1);
            String st=new String(arr2);
            if(ss.equals(st)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
