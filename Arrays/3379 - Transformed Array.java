class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            if(nums[i] < 0){
                int moves = (i + nums[i]) % n;
                if(moves < 0){
                    arr[i] = nums[n-(-moves)];
                }else{
                    arr[i] = nums[moves];
                }
            }
            else if(nums[i] > 0){
                int moves = (i + nums[i]) % n;
                if(moves >= n){
                    arr[i] = nums[moves-n];
                }else{
                    arr[i] =nums[moves];
                }
            }else{
                arr[i] = nums[i];
            }
        }
        return arr;
    }
}