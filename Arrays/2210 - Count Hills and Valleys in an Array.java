class Solution {
    public int countHillValley(int[] nums) {
        int hillCount = 0;
        int valleyCount = 0;
        int n = nums.length;
        for(int i = 1;i<n-1;i++){
            int left = i-1;
            int right = i+1;
            while(left >= 0 && nums[left] == nums[i])left--;
            while(right < n && nums[right] == nums[i])right++;
            if(left >= 0 && right < n && nums[i] != nums[i-1] &&nums[i] > nums[left] && nums[i] > nums[right]){
                hillCount +=1;
            }else if(left >= 0 && right < n && nums[i] != nums[i-1] &&nums[i]  < nums[left] && nums[i] < nums[right]){
                valleyCount += 1;
            }
        }
        return hillCount+valleyCount;
    }
}