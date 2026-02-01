class Solution {
    public int collectGold(int i,int j,int n,int m,int [][] grid,boolean [][] visited){
        if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0 || visited[i][j]){
            return 0;
        }
        visited[i][j] = true;
        int left = collectGold(i,j-1,n,m,grid,visited);
        int right = collectGold(i,j+1,n,m,grid,visited);
        int up = collectGold(i-1,j,n,m,grid,visited);
        int down = collectGold(i+1,j,n,m,grid,visited);
        visited[i][j] = false;

        return grid[i][j]+Math.max(left,Math.max(right,Math.max(up,down)));
    }
    public int getMaximumGold(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int max = 0;
        boolean [][] visited =new boolean [n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 0)continue;
                max = Math.max(max,collectGold(i,j,n,m,grid,visited));
            }
        }
        return max;
    }
}