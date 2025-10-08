import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class Flood {
    public static void main(String[] argjavas) {
        int arr[]={1,2,0,0,2,3};
        System.out.println(Arrays.toString(FloodInCity(arr)));
        
    }
    static int[] FloodInCity(int[] rains){
        int ans[]=new int[rains.length];
        HashMap<Integer, Integer> lastd = new HashMap<>();
        TreeSet<Integer> dd = new TreeSet<>();
        for(int i=0;i<rains.length;i++){
            int lakes=rains[i];
            if(lakes>0){
                ans[i]=-1;
                if(lastd.containsKey(lakes)){
                    int lri=lastd.get(lakes);
                    Integer ddi=dd.higher(lri);
                    if(ddi==null){
                        return new int[]{};
                    }else{
                        ans[ddi]=lakes;
                        dd.remove(ddi);
                    }
                }
                lastd.put(lakes,i);
            }else if(rains[i]==0){
                dd.add(i);
                ans[i]=1;
                
            }
           
        }
        return ans;
    }
    
}
