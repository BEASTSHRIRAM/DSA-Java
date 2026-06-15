public class Recursion {
    public static void main(String[] args) {
        print(1);

        
    }
    static void print(int n){
        if(n==6){
        return;
    }
        System.out.println(n);
        // recursive call
    // if you are calling a function again and again, you can treat it as a separate call in the stack

    // this is called tail recursion
    // this is the last function call

        print(n+1);
    }
    // static void message1(){
    //     System.out.println("Hello world");
    //     message2();
    // }
    // static void message2(){
    //     System.out.println("Hello world");
    //     message3();
    // }
    // static void message3(){
    //     System.out.println("Hello world");
    //     message4();
    // }
    // static void message4(){
    //     System.out.println("Hello world");
    // }

    
}
