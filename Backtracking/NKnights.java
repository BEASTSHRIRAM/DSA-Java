public class NKnights {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        knights(board, 0, 0, n);
    }
    static void knights(boolean[][] board,int r,int c,int knights){
        if(knights==0){
            display(board);
            System.out.println();
            return;
        }
        if(r==board.length-1&&c==board.length){
            return;
        }
        if(c==board.length){
            knights(board, r+1, 0, knights);
            return;
        }
        if(isSafe(board, r, c)){
            board[r][c]=true;
            knights(board, r, c+1, knights-1);
            board[r][c]=false;
        }
        knights(board, r, c+1, knights);
         

    }
    private static boolean isSafe(boolean[][] board,int row,int col){
        if(isValid(board, row-2, col-1)){
            if (board[row-2][col-1]) {
                return false;
                
            }
        }
        if(isValid(board, row-1, col-2)){
            if (board[row-1][col-2]) {
                return false;
                
            }
        }
        if(isValid(board, row-2, col+1)){
            if (board[row-2][col+1]) {
                return false;
                
            }
        }
        if(isValid(board, row-1, col+2)){
            if (board[row-1][col+2]) {
                return false;
                
            }
        }
        return true;
    }
    // do not repeat yourself, hence created this function
    static boolean isValid(boolean[][] board,int row,int col){
        if(row>=0&&row<board.length&&col>=0&&col<board.length){
            return true;
        }
        return false;
    }
    private static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean element:row){
                if(element){
                    System.out.print("K ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
