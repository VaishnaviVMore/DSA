class Solution {
    public List<List<String>> solveNQueens(int n) {
        ArrayList<List<String>>main=new ArrayList<>();
        char[][] board =new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        nQueen(main,board,n,0);
        return main;
    }
    public boolean isSafe(char[][] board,int n,int row,int col){
        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left dia
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //right dia
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
             if(board[i][j]=='Q'){
                return false;
            }
        }
    return true;
    }

    public void nQueen(List<List<String>>main,char[][] board, int n,int row){
        if(row==n){
            List<String>sub=new ArrayList<>();
            for(int i=0;i<n;i++){
                sub.add(new String(board[i]));
            }
            main.add(sub);
            return;
        }
        for(int j=0;j<n;j++){
           if(isSafe(board,n,row,j)){
            board[row][j]='Q';
            nQueen(main,board,n,row+1);
            board[row][j]='.';
            }
        }
    }
}