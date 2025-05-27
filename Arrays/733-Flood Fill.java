class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int init = image[sr][sc];
        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int[]{sr,sc});
        int [] dx = {0,0,0,1,-1};
        int [] dy = {0,-1,1,0,0};
        while(!queue.isEmpty()){
            int s = queue.size();
            for(int i = 0;i<s;i++){
                int [] arr = queue.poll();
                for(int j = 0;j<5;j++){
                    int x = arr[0] + dx[j];
                    int y = arr[1] + dy[j];
                    if(x < 0 || y <0 || x >=n || y >= m || image[x][y] == color || image[x][y] != init) continue;
                    image[x][y] = color;
                    queue.offer(new int[]{x,y});
                }
            }
        }
        return image;
        
        
    }
}