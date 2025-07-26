class Solution {
    public int maxProduct(int[] nums) {
        int p1 = 1;
        int p2 = 1;
        int n = nums.length;
        int prod = Integer.MIN_VALUE;
        int i = 0;
        while(i < n){
            if(p1 == 0)p1 =1;
            if(p2==0)p2 =1;
            p1 *= nums[i];
            p2 *= nums[n-i-1];
            prod = Math.max(prod,Math.max(p1,p2));
            i++;
        }
        return prod;


    }
}