class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0;i<k;i++){
            leftSum += cardPoints[i];
        }
        int maxSum = leftSum;
        for(int i = 1;i<=k;i++){
            leftSum -= cardPoints[k-i];
            rightSum += cardPoints[n-i];
            maxSum = Math.max(maxSum,leftSum+rightSum);
        }
        return maxSum;
    }
}