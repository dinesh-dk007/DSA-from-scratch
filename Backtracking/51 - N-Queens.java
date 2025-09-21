class Solution {
    public void dfs(int cols,int n,List<List<String>> res,char[][] board,int topDiagonal[],int bottomDiagonal[],int [] left){
        if(cols == n){
            List<String> temp= new ArrayList<>();
            helper(temp,board);
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int row = 0;row<n;row++){
            if(board[cols][row] != 'Q' && left[row] == 0 && topDiagonal[(n-1)+(cols-row)] == 0 && bottomDiagonal[cols+row] == 0){
                board[cols][row] = 'Q';
                left[row] = 1;
                topDiagonal[(n-1)+(cols-row)] = 1;
                bottomDiagonal[cols+row] = 1;
                dfs(cols+1,n,res,board,topDiagonal,bottomDiagonal,left);
                board[cols][row] = '.';
                left[row] = 0;
                topDiagonal[(n-1)+(cols-row)] = 0;
                bottomDiagonal[cols+row] = 0;
            }
        }
    }
    public void helper(List<String> al,char[][] board){
        for(int i = 0;i<board.length;i++){
            String samp = new String(board[i]);
            al.add(samp);
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        int [] topDiagonal = new int [(2*n) - 1];
        int [] bottomDiagonal = new int [(2*n)- 1];
        int [] left =  new int [n];
        for(int i = 0;i<n;i++)Arrays.fill(board[i],'.');
        dfs(0,n,ans,board,topDiagonal,bottomDiagonal,left);
        return ans;
    }
}