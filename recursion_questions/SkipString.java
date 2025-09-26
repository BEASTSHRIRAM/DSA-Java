public class SkipString {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("bccdappleach"));
        
    }
    static String Skipa(String a){
        if(a.isEmpty()){ return "";}
        if(a.startsWith("apple")){
            return Skipa(a.substring(5));//instead of passing a, index+1 in function we can also do a.substring(1)
        }else{
            return a.charAt(0)+ Skipa(a.substring(1));
        }
    }
    static String skipAppNotApple(String a){
        if(a.isEmpty()){ return "";}
        if(a.startsWith("app")&&!a.startsWith("apple")){
            return skipAppNotApple(a.substring(3));//instead of passing a, index+1 in function we can also do a.substring(1)
        }else{
            return a.charAt(0)+ skipAppNotApple(a.substring(1));
        }

    }
}
