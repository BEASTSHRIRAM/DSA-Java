package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueensLC {
    public static void main(String[] args) {
        int n=4;
        System.out.println(solveNQueens(n));
    }
    static List<List<String>> solveNQueens(int n){
        List<List<String>> ans=new ArrayList<>();
        boolean[][] board =new boolean[n][n];
        nqueen(board,0,ans);
        return ans;
    }
    static void nqueen(boolean[][] board,int r,List<List<String>> res){
        if(r==board.length){
            res.add(tostring(board));
            return;
        }
        int n=board.length;
        for(int col=0;col<n;col++){
            if(isSafe(board,r,col)){
                board[r][col]=true;
                nqueen(board, r+1, res);//next row
                board[r][col]=false;//backtrack gg
            }
        }
    }
    private static List<String> tostring(boolean[][] board){
        List<String> yo=new ArrayList<>();
        for(boolean[] row:board){
            StringBuilder sb=new StringBuilder();
            for(boolean ele:row){
                sb.append(ele?"Q":",");
            }
            yo.add(sb.toString());
        }
        return yo;
    }
     private static boolean isSafe(boolean[][] board,int row,int col){
        //check vertical row
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        //diagonal left check
        int maxL=Math.min(row, col);
        for (int i = 1; i <=maxL; i++) {
            if (board[row-i][col-i]) {
                return false;
                
            }
            
        }
        int maxr=Math.min(row, board.length-col-1);
        for (int i = 1; i <= maxr; i++) {
            if (board[row-i][col+i]) {
                return false;
                
            }
            
        }
        return true;
    }
    
}