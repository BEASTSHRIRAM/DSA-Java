import java.util.Arrays;

public class SuccessfulPairOfSpells {
    public static void main(String[] args) {
        int[] spells = {5, 1, 3};
        int[] potions = {1, 2, 3, 4, 5};
        long success = 7;
        System.out.println(Arrays.toString(successfulPairs(spells, potions, success)));
}

    static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] yo=new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            long minP=(success+spells[i]-1)/spells[i];
            int x=bs(potions,minP);
            yo[i]=potions.length-x;
        }
        return yo;
    }
    static int bs(int []potions,long target){
        int l=0,r=potions.length;
        while (l<r) {
            int m=l+(r-l)/2;
            if(potions[m]>=target){
                r=m;
            }else{
                l=m+1;
            }
            
        }
        return l;
    }
    
}
