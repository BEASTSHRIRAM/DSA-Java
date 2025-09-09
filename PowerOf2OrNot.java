public class PowerOf2OrNot {
    public static void main(String[] args) {
        int value = 128;
        // while(value>1){
        //     if((value&1)==1){
        //         System.out.println("Not a power of 2");
        //         return;
        //     }
        //     value=value>>1;
        // }
        // System.out.println("powern of 2");
        //KUNAL ANSWER
        boolean ans=(value&(value-1))==0;
        System.out.println(ans);
        


    }
    
}
