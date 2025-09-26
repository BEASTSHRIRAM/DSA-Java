
import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        // ArrayList<String> res = chi("", "abc");
        // System.out.println(res);4
        subseqASCII("", "abc");

    }
    static void subset(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subset(p+ch, up.substring(1));
        subset(p, up.substring(1));
    }
    //lets make the output more systematic and give in arraylist
    static ArrayList<String> subseq(String p,String up,ArrayList<String> hi){
        if(up.isEmpty()){
            hi.add(p);
            return hi;
        }
        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1),hi);
        subseq(p, up.substring(1),hi);
        return hi;
    }
    static ArrayList<String> chi(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left=chi(p+ch, up.substring(1));
        ArrayList<String> right=chi(p, up.substring(1));
        left.addAll(right);
        return left;
    }
    static void subseqASCII(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqASCII(p+ch, up.substring(1));
        subseqASCII(p, up.substring(1));
        subseqASCII(p+(ch+0), up.substring(1));
    }

}
