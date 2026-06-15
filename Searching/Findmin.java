
public class Findmin {
    public static void main(String[] args) {
        
        int[] arr={2,4,-7,9,10};
        System.out.println(smallest(arr));
    }
    static int smallest(int[] arr){
        int ans=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ans) {
                ans=arr[i];
                System.out.println("smallest element is "+ans);
                
                
            }
           
            
            
        }
        return ans;
    }
    

}

