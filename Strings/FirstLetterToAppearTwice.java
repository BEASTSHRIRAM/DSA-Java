import java.util.HashMap;

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {
        String s="abccbaacz";
        System.out.println(yo(s));
        
    }
    static char yo(String s){
        HashMap<Character,Integer> yo=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (yo.containsKey(ch)){
                return ch;
            }else{
                yo.put(ch, 1);
            }
            
        }
        return '\0';
    }
}
