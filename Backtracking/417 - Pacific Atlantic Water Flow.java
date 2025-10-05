class Solution {
    int [][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
    public void dfs(int i,int j,int [][] heights,boolean [][]visited){
        visited[i][j] = true;
        for(int ind = 0;ind<4;ind++){
            int x = i + dir[ind][0];
            int y = j + dir[ind][1];
            if(x >= 0 && y >= 0 && x < heights.length && y < heights[0].length && !visited[x][y] && heights[x][y] >= heights[i][j]){
                dfs(x,y,heights,visited);
            }
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        boolean [][]pac = new boolean [n][m];
        boolean [][]atl = new boolean [n][m];
        List<List<Integer>> ans = new ArrayList<>();
        for(int  i = 0;i<n;i++){
            if(pac[i][0] == false)dfs(i,0,heights,pac);
            if(atl[i][0] == false)dfs(i,m-1,heights,atl);
        }
        for(int  i = 0;i<m;i++){
            if(pac[0][i] == false)dfs(0,i,heights,pac);
            if(atl[n-1][i] == false)dfs(n-1,i,heights,atl);
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(pac[i][j] && atl[i][j]){
                    List<Integer> al = new ArrayList<>();
                    al.add(i);al.add(j);
                    ans.add(al);
                }
            }
        }
        return ans;
    }
}