class Solution {
    public int maximumLength(int[] nums) {
        int n = nums.length;
        int alt = 1;
        int even = (nums[0]%2 == 0)?1:0;
        int odd =  (nums[0]%2 != 0)?1:0;
        boolean expected_even = (nums[0]%2 == 0)?false:true;
        for(int i = 1;i<n;i++){
            if(nums[i]%2 == 0){
                even++;
                if(expected_even){
                    expected_even = false;
                    alt++;
                }
            }else{
                odd++;
                if(!expected_even){
                    expected_even = true;
                    alt++;
                }
            }
        }
        return Math.max(alt,Math.max(even,odd));
    }
}
