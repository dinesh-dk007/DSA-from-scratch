class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] arr = new int [n];
        int prod = 1;
        for(int i = 0;i<n;i++){
            arr[i] = prod;
            prod *= nums[i];
        }
        prod = 1;
        for(int i = n-1;i>=0;i--){
            arr[i] *= prod;
            prod *= nums[i];
        }
        return arr;
    }
}