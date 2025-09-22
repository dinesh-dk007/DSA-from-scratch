class Solution {
    public void dfs(int i,int j,int[][] image,int c,int color){
        if(i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] == color ||image[i][j] != c){
            return;
        }
        image[i][j] = color;
        dfs(i-1,j,image,c,color);
        dfs(i+1,j,image,c,color);
        dfs(i,j-1,image,c,color);
        dfs(i,j+1,image,c,color);
        return;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int c= image[sr][sc];
        dfs(sr,sc,image,c,color);
        return image;
    }
}