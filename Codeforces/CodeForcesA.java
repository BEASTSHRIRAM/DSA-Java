import java.util.Scanner;

public class CodeForcesA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int res=(n-1)+(n-2)+1;
            System.out.println(res);
        }
        sc.close();

    }
    
}
