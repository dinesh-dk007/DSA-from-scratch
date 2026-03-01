class Solution {
    public void dfs(int i,int j,char arr[][]){
       if(i <0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == '.')return;
        int dx[] = {-1,1,0,0};
        int dy[] = {0,0,-1,1};
        arr[i][j] = '.';
        for(int k = 0;k<4;k++){
            int x = i+dx[k];
            int y = j+dy[k];
            
            dfs(x,y,arr);
        }
    }
    public int countBattleships(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(board[i][j] == 'X'){
                    count++;
                    dfs(i,j,board);
                }
            }
        }
        return count;
    }
}