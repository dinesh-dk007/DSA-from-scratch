class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return -1;
        int n = grid.length;
        int m = grid[0].length;
        int count_fresh = 0;
        Queue<int []> queue = new LinkedList<>();
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j] == 2){
                    queue.offer(new int []{i,j});
                }
                if(grid[i][j] != 0){
                    count_fresh += 1;
                }
            }
        }
        int count_min = 0;
        int cnt = 0;
        int dx[] = {0,0,1,-1};
        int dy[] = {1,-1,0,0};
        while(!queue.isEmpty()){
            int size = queue.size();
            cnt += size;
            for(int i = 0;i<size;i++){
                int [] rotten = queue.poll();
                for(int j = 0;j<4;j++){
                    int x = rotten[0] + dx[j];
                    int y = rotten[1] + dy[j];
                    if(x < 0 || y < 0 || y >= m || x >= n || grid[x][y] == 0 || grid[x][y] == 2) continue;
                    grid[x][y] = 2;
                    queue.offer(new int[]{x,y});
                }
            }
            if(queue.size() != 0){
                count_min++;
            }
        }
        return cnt == count_fresh ? count_min : -1;
    }
}
