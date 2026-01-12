class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;
        int m = points[0].length;

        int time = 0;
        for(int i = 0;i<n-1;i++){
            int start_x = points[i][0];
            int start_y = points[i][1];
            int stop_x = points[i+1][0];
            int stop_y = points[i+1][1];

            int dis_x = Math.abs(start_x-stop_x);
            int dis_y = Math.abs(start_y-stop_y);
            if(dis_x < dis_y){
                time += dis_x;
                time += dis_y-dis_x;
            }else{
                time += dis_y;
                time += dis_x-dis_y;
            }

        }
        return time;
    }
}