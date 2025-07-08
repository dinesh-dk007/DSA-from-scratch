class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> al = new ArrayList<Integer>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int rows_start = 0;
        int cols_start = 0;
        while(rows_start < rows && cols_start < cols){
            for(int i = cols_start;i < cols;i++){
                al.add(matrix[rows_start][i]);
            }
            rows_start += 1;
            for(int i = rows_start;i< rows;i++){
                al.add(matrix[i][cols-1]);
            }
            cols -= 1;
            if(rows_start < rows){
                for(int i = cols-1;i >= cols_start;i--){
                    al.add(matrix[rows-1][i]);
                }
                rows -= 1;
            }
            if(cols_start < cols){
                for(int i = rows-1;i >= rows_start;i--){
                    al.add(matrix[i][cols_start]);
                }
                cols_start += 1;
            }
        }
        return al;
    }
}