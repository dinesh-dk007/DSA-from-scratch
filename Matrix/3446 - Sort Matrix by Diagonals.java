class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        if(n == 1)return grid;
        for(int i = 1;i < n;i++){
            List<Integer> al = new ArrayList<>();
            for(int j = 0;j<n-i;j++){
                al.add(grid[j][i+j]);
            }
            Collections.sort(al);
            for(int j = 0;j<n-i;j++){
                grid[j][i+j] = al.get(j);
            }
        }
        for(int i = 0;i<n;i++){
            List<Integer> al = new ArrayList<>();
            for(int j = 0;j<n-i;j++){
                al.add(grid[i+j][j]);
            }
            Collections.sort(al,Collections.reverseOrder());
            for(int j = 0;j<n-i;j++){
                grid[i+j][j] = al.get(j);
            }
        }
        return grid;
    }
}