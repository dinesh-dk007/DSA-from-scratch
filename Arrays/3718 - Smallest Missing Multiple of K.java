class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        int [] arr = new int [1001];
        for(int i : nums){
            arr[i]++;
        }
        for(int i = k; i<=1000 ;i += k){
            if(arr[i] == 0){
                return i;
            }
        }
        return -1;
    }
}