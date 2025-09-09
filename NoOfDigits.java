public class NoOfDigits {
    public static void main(String[] args) {
        int n=10;
        int b=2;
        String bin=Integer.toBinaryString(n);
        int ans=(int)(Math.log(n)/Math.log(b))+1;//if you want to convert anything to base b then divide it by same log b 
        System.out.println("No of digits are "+ans);
        System.out.println("the binary no is "+bin);
        
    }
    
}
