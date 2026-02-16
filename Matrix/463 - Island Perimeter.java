class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int perimeter = 0;
        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 1){
                    int count = 0;
                    if(i-1 < 0 || grid[i-1][j] == 0){
                        count++;
                    }
                    if(j-1 < 0 || grid[i][j-1] == 0){
                        count++;
                    }
                    if(i+1 >= n || grid[i+1][j] == 0){
                        count++;
                    }
                    if(j+1 >= m || grid[i][j+1] == 0){
                        count++;
                    }
                    perimeter += count;
                }
            }
        }
        return perimeter;
    }
}