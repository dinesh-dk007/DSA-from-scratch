class Solution {
    public int getVal(int[] arr , int n){
        int total = 0;
        for(int i = 0;i<arr.length;i++){
            total += Math.ceil((double)(arr[i])/(double)(n));
        }
        return total;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for(int i : nums)max = Math.max(max,i);
        int left = 1;
        int right = max;
        int ans  = 0;
        while(left <= right){
            int mid = (left+right)/2;
            int val = getVal(nums,mid);
            if(val <= threshold){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
}