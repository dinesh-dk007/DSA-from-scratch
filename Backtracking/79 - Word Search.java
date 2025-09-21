class Solution {
    public boolean dfs(char[][] board,boolean visited[][],int i ,int j, int ind,int n,String word){
        if(ind  == n){
            return true;
        }
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(ind) || visited[i[j]){
            return false;
        }
        visited[i][j] = true;
        if(dfs(board,visited,i+1,j,ind+1,n,word) || dfs(board,visited,i-1,j,ind+1,n,word) ||
           dfs(board,visited,i,j+1,ind+1,n,word) || dfs(board,visited,i,j-1,ind+1,n,word)){
            return true;
           }
        visited[i][j] = false;
        return false;

    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        boolean [][] visited = new boolean[n][m];
        boolean result = false;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                result  = dfs(board,visited,i,j,0,word.length(),word);
                if(result)return true;
            }
        }
        return false;
    }
}