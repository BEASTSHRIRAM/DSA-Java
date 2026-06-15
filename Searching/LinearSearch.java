import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        
        int[] arr={2,4,7,9,10};
        linearsearch(arr);
    }
    static void linearsearch(int[] arr){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.close();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==a) {
                System.out.println(arr[i]+" is found at index "+ i);
                
                
            }
            else{
                System.out.println("Not found");
            }
            
        }
    }
    

}
