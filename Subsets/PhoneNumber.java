import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {
    public static void main(String[] args) {
        // String s="12";
        // permutationsList("", "12");
        // String digits="2";
        // System.out.println(letterCombinations(digits));
        System.out.println(phonecount("", "12"));

        
    }
    static List<String> letterCombinations(String digits) {
        return permutationsList("", digits);
        
        
    }
    static ArrayList<String> permutationsList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String letters = map[digit];
        ArrayList<String> ans = new ArrayList<>();
        if (letters.isEmpty()) { // handle 0/1 or other non-letter keys
            return new ArrayList<>();
        } else {
            for (int i = 0; i < letters.length(); i++) {
                char ch = letters.charAt(i);
                ans.addAll(permutationsList(p + ch, up.substring(1)));
            }
        }
        return ans;
    }
    static int phonecount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            count+=phonecount(p+ch, up.substring(1));
        }
        return count;

    }


    
}
