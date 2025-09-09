public class StringPal {
    public static void main(String[] args) {
        String a=new String("abcd");
        checkpal(a);
    }
    static int checkpal(String a){
        int start= 0;
        int end=a.length()-1;
        while (start<end) {
            if(a.charAt(start)!=a.charAt(end)){
                System.out.println("not an palindrome");
                return 0;
            }else{
                start++;
                end--;
                System.out.println("it is a palindrome");
                return 0;
            }
            
        

            
        }
        return -1;
        

    }
    
}
