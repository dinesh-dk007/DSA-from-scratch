class Solution {
    public int minimumArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int min_r = n;
        int min_c = m;
        int max_r = 0;
        int max_c = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 1){
                    min_r = Math.min(i,min_r);
                    min_c = Math.min(j,min_c);
                    max_r = Math.max(max_r,i);
                    max_c = Math.max(max_c,j);
                }
            }
        }
        return (max_r - min_r +1)*(max_c - min_c + 1);
    }
}