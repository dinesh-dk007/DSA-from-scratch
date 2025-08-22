class Solution {
    public boolean isSquare(int [][] arr , int i,int j,int f,int n,int m){
        for(int k = i;k < n && k < i+f;k++){
            for(int l = j;l <m && l <j+f;l++){
                if(arr[k][l] == 0)return false;
            }
        }
        return true;
    }
    public int countSquares(int[][] matrix) {
        int count = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j] == 1){
                    int f = 1;
                    while(i+f <= n && j+f <=m && isSquare(matrix,i,j,f,n,m)){
                        f++;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}