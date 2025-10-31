class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int [] arr = new int [n];    
        int [] ans = new int [2];
        int ind = 0;
        for(int i : nums){
            arr[i]++;
            if(arr[i] == 2){
                ans[ind++] = i;
            }
            if(ind > 1)break;
        }
        return ans;
    }
}