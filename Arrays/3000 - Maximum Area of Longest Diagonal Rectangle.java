class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double diagonal = Double.MIN_VALUE;
        int n = dimensions.length;
        int ans = 0;
        for(int i = 0;i<n;i++){
            double temp = Math.sqrt((dimensions[i][0]*dimensions[i][0]) + (dimensions[i][1]*dimensions[i][1]));
            if(temp > diagonal || temp == diagonal && dimensions[i][0]*dimensions[i][1] > ans){
                ans =  dimensions[i][0]*dimensions[i][1];
                diagonal = temp;
            }
        }
        return ans;
    }
}