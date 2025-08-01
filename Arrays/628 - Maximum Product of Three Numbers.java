class Solution {
    public int maximumProduct(int[] nums) {
        Thread t1 = new Thread(() -> Arrays.sort(nums));
        t1.start();
        try{
            t1.join();
        }catch(Exception e){}
        int n = nums.length;
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[0]*nums[1]*nums[n-1]);
    }
}