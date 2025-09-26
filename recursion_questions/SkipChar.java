public class SkipChar {
    
    static String Skipa(String a, int index){
        if(index==a.length()){ return "";}
        char ch = a.charAt(index);

        if(ch!= 'a'){
            return ch + Skipa(a, index+1);//instead of passing a, index+1 in function we can also do a.substring(1)
        }else{
            return Skipa(a, index+1);
        }
    }
    public static void main(String[] args) {
        String a = "baccacad";
        System.out.println(Skipa(a,0));

    }//kunals approach
    static void skip(String p, String up) {
    if (up.isEmpty()) {
        System.out.println(p);
        return;
    }
    char ch = up.charAt(0);
    if (ch == 'a') {
        skip(p, up.substring(1));
    } else {
        skip(p + ch, up.substring(1));
    }
}

    
}
