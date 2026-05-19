package SlidingWindowQs;
    public class isLengthOfSubstring {
        public static void main(String[] args) {
            String s="aabbaaaacab";
            System.out.println(islengthOfLongestSubstring(s));
    }
        static int islengthOfLongestSubstring(String s) {
            boolean[] set =new boolean[256];
            int maxLen=0;
            int i=0;
            int j=-1;
            while(i<s.length()){
                char ch=s.charAt(i);
                while(set[ch]){
                    j++;
                    set[s.charAt(j)]=false;

                }
                set[ch]=true;
                int currLen=i-j;
                if(currLen>maxLen){
                    maxLen=currLen;

                }
                i++;
            }
            return maxLen;


        }
}
