class Solution {
    public int splitter(int [] arr , int m){
        int prev = arr[0];
        int count = 1;
        for(int i = 1;i<arr.length;i++){
            if(prev + arr[i] <= m){
                prev += arr[i];
            }else{
                count++;
                prev = arr[i];
            }
        }
        return count;
    }
    public int splitArray(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : nums){
            sum += i;
            max = Math.max(max,i);
        }
        int left = max;
        int right = sum;
        while(left <= right){
            int mid = (left+right)/2;
            int count = splitter(nums,mid);
            if(count > k){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        if(nums.length >= k) return left;
        return -1;
    }
}