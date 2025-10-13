import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Anagrams {
    public static void main(String[] args) {
        String[] words = {"abba","baba","bbaa","cd","cd"};
        System.out.println(removeAnagrams(words));
    }
    static List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
    for (String word : words) {
        result.add(word);
        while (result.size() >= 2 && isAnagram(result.get(result.size() - 2), result.get(result.size() - 1))) {
            result.remove(result.size() - 1);
        }
    }
    return result;
        
    }
    static boolean isAnagram(String a,String b){
        if(a.length()!=b.length())return false;
        char[] arrA=a.toCharArray();
        char[] arrB=b.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        return Arrays.equals(arrA,arrB);
    }
    static List<String> removeAnagramsg(String[] words) {
        List<String> list = new ArrayList<>();
        HashSet<String> seen = new HashSet<>();
        for (String word : words) {
            String sorted = sortString(word);
            if (!seen.contains(sorted)) {
                seen.add(sorted);
                list.add(word);
            }
        }
        return list;
    }
    
    static String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
