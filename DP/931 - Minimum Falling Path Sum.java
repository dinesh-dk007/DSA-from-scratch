class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int [] prev = new int [m];
        for(int i = 0;i<m;i++){
            prev[i] = matrix[0][i];
        }
        for(int i = 1;i<n;i++){
            int [] curr = new int [m];
            for(int j = 0;j<m;j++){
                int up = matrix[i][j] + prev[j];
                int lu = Integer.MAX_VALUE,lr= Integer.MAX_VALUE;
                if(j - 1 >= 0){
                    lu = matrix[i][j] + prev[j-1];
                }
                if(j+1 < m){
                    lr = matrix[i][j] + prev[j+1];
                }
                curr[j] = Math.min(up,Math.min(lu,lr));
            }
            prev = curr.clone();
        }
        int min = prev[0];
        for(int i = 1;i<m;i++){
            min = Math.min(min,prev[i]);
        }
        return min;
    }
}