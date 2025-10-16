public class NQueens {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board =new boolean[n][n];
        System.out.println(nqueen(board, 0));
        
    }
    static int nqueen(boolean[][] board,int r){
        if(r==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for(int col=0;col<board.length;col++){
            //place the queen if it ias safe
            if(isSafe(board,r,col)){
                board[r][col]=true;
                count+=nqueen(board,r+1);
                board[r][col]=false;
            }

        }
        return count;

    }//placing the queen and checking every row and col
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

    private static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean element:row){
                if(element){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
