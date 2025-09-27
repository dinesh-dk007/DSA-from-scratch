class Solution {
    public double largestTriangleArea(int[][] points) {
        double max = 0.0;
        for(int i = 0;i<points.length-2;i++){
            for(int j = 0;j<points.length-1;j++){
                for(int k= 0;k<points.length;k++){
                    double x1 = points[i][0];
                    double x2 = points[j][0];
                    double x3 = points[k][0];
                    double y1 = points[i][1];
                    double y2 = points[j][1];
                    double y3 = points[k][1];
                    double area = 0.5 * Math.abs(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2));
                    max = Math.max(area,max);
                }
            }
        }
        return max;
    }
}