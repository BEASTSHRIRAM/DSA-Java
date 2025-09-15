import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortVowels {
    public static void main(String[] args) {
        String s = "lEetcOde";
        System.out.println(Sortvowels(s));
        
    }
    static String Sortvowels(String s){
        Set<Character> vs = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u','A','E','I','O','U'));
        List<Character> vl = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (vs.contains(c)) {
                vl.add(c);
            }
        }
        Collections.sort(vl);//EeOe se EOee
        StringBuilder res = new StringBuilder();
        int vowelIndex = 0;
        for (char c : s.toCharArray()) {
            if (vs.contains(c)) {
                res.append(vl.get(vowelIndex));
                vowelIndex++;
            } else {
                res.append(c);
            }
        }
        
        return res.toString();
    }
}
    
