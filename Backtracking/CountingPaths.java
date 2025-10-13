import java.util.ArrayList;
public class CountingPaths {
    public static void main(String[] args) {
        int r=3,c=3;
        // path("",r, c);
        // System.out.println(path1("",r, c));
        System.out.println(pathdiagnol("",r, c));
    }
    //simple one cuz we are just returning the coutns of path
    static int maze(int r,int c){
        if(r==1||c==1){
            return 1;   
        }
        int left = maze(r-1,c);
        int right=maze(r,c-1);
        return left+right;
    }
    //printing paths
    static void path(String p,int r,int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;   
        }
        if (r>1) {
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }
    //[printing in a form of arraylist]
    static ArrayList<String> path1(String p,int r,int c){
        if(r==1&&c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;   
        }
        ArrayList<String> left = new ArrayList<>();
        if (r > 1) {
            left.addAll(path1(p + 'D', r - 1, c));
        }
        if (c > 1) {
            left.addAll(path1(p + 'R', r, c - 1));
        }
        return left;
    }  
    static ArrayList<String> pathdiagnol(String p,int r,int c){
        if(r==1&&c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;   
        }
        ArrayList<String> left = new ArrayList<>();
        if (r > 1) {
            left.addAll(pathdiagnol(p + 'D', r - 1, c));//D=down
        }
        if(r>1&&c>1){
            left.addAll(pathdiagnol(p + 'G', r - 1, c-1));//G=Diagonal
        }
        if (c > 1) {
            left.addAll(pathdiagnol(p + 'R', r, c - 1));//R=Right
        }
        return left;
    }  
}
