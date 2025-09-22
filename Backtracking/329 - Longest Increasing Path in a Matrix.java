class Solution {
    public int dfs(int i , int j,int [][] arr,int[][] visited,int prev){
        if(i < 0 || i >= arr.length || j  < 0 || j >= arr[0].length || arr[i][j] <= prev){
            return 0;
        }
        if(visited[i][j] != -1)return visited[i][j];
        int up = dfs(i-1,j,arr,visited,arr[i][j]);
        int down = dfs(i+1,j,arr,visited,arr[i][j]);
        int left =dfs(i,j-1,arr,visited,arr[i][j]);
        int right = dfs(i,j+1,arr,visited,arr[i][j]);
        visited[i][j] = 1 + Math.max(Math.max(up,down),Math.max(left,right));;
        return visited[i][j];
    }
    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int max = 0;
        int [][] visited = new int[n][m];
        for(int i = 0;i<n;i++)Arrays.fill(visited[i],-1);
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                max = Math.max(max,dfs(i,j,matrix,visited,Integer.MIN_VALUE));
            }
        }
        return max;
    }
}