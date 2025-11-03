import java.util.Arrays;
import java.util.Scanner;

public class cf2a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i= 0;i<t;i++){
            int[] sticks = new int[4];
            for(int j=0;j<4;j++){
                sticks[j] =sc.nextInt();
            }
            Arrays.sort(sticks);
            if(sticks[0]==sticks[1]&&sticks[1]==sticks[2]&&sticks[2]==sticks[3]){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}