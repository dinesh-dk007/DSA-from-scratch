class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points,(a,b) -> (a[0] == b[0]) ? b[1]-a[1] : a[0]-b[0]);
        int count = 0;
        int n = points.length;
        for(int i = 0;i<n;i++){
            int bounded = Integer.MIN_VALUE;
            int upper = points[i][1];
            for(int j = i+1;j<n;j++){
                if(points[j][1] <= upper && points[j][1] > bounded){
                    bounded = points[j][1];
                    count++;
                }
            }
        }
        return count;
    }
}