public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "sentence4 a3 is2 This1";
        String result = sortSentence(s);
        System.out.println(result);
        
    }
    static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];
        for(String word:words){
            int len=word.length();
            int position =Character.getNumericValue(word.charAt(len-1));
            sorted[position - 1] = word.substring(0, len - 1);
        }
        return String.join(" ", sorted);
        
        
    }
    
    
}
