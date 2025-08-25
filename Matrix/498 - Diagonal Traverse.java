class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int [] arr = new int [n*m];
        int i = 0 , j =0;
        int ind= 0;
        while(i < n && j < m){
            while(i >= 0 && j <m){
                arr[ind++] = mat[i--][j++];
            }
            i++;
            if(j == m){
                i++;j--;
            }
            while(i < n && j >= 0){
                arr[ind++] = mat[i++][j--];
            }
            j++;
            if(i == n){
                i--;
                j++;
            }
        }
        return arr;
    }
}