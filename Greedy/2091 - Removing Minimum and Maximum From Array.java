class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIndex = -1;int minValue = Integer.MAX_VALUE;
        int maxIndex = -1;int maxValue = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(minValue > nums[i]){
                minValue = nums[i];
                minIndex = i;
            }
            if(maxValue < nums[i]){
                maxValue = nums[i];
                maxIndex = i;
            }
        }
        int cal1 = Math.max(minIndex,maxIndex)+1;
        int cal2 = n-Math.min(minIndex,maxIndex);
        int cal3 = minIndex+(n-maxIndex)+1;
        int cal4 = maxIndex+(n-minIndex)+1;
        return Math.min(cal1,Math.min(cal2,Math.min(cal3,cal4)));
    }
}