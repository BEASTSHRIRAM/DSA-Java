import java.util.ArrayList;
import java.util.List;

public class DiceThrower {
    public static void main(String[] args) {
        int s=4;
        System.out.println(helper(s));
        
    }
    static List<String> helper(int s){
        return dicelist("",s);
    }
    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6&&i<=target;i++){
            dice(p+i, target-i);
            
        }

    }
     static ArrayList<String> dicelist(String p,int target){
        ArrayList<String> list = new ArrayList<>();
        if(target==0){
            list.add(p);
            return list;
        }
        for(int i=1;i<=6&&i<=target;i++){
            list.addAll(dicelist(p + i, target - i));
        }
        return list;
    }
    
}
