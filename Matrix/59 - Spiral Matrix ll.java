class Solution {
    public int[][] generateMatrix(int n) {
        int [][] arr = new int [n][n];
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = n-1;
        int colEnd = n-1;
        int val = 1;
        while(rowStart <= rowEnd && colStart <= colEnd){
            for(int i = colStart;i<=colEnd;i++){
                arr[rowStart][i] = val++;
            }
            rowStart++;
            for(int i = rowStart;i<= rowEnd;i++){
                arr[i][colEnd] = val++;
            }
            colEnd--;
            for(int i = colEnd;i>=colStart;i--){
                arr[rowEnd][i] = val++;
            }
            rowEnd--;
            for(int i = rowEnd;i>= rowStart;i--){
                arr[i][colStart] = val++;
            }
            colStart++;
        }
        return arr;
    }
}