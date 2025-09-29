//code forces questiom
import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        sc.close();
        System.out.println(ans(s));
    }
    static String ans(int s){
        if(s%2==0&&s>2){
            return "YES";

        }
        return "NO";
    }
    
}
