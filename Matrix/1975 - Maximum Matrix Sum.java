class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n = matrix.length;
        int neg = 0;
        int min = Integer.MAX_VALUE;
        long sum = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j] < 0)neg++;
                min = Math.min(Math.abs(matrix[i][j]),min);
                sum += Math.abs(matrix[i][j]);
            }
        }
        if(neg%2 != 0){
            sum -= 2*min;
        }
        return sum;
    }
}