class Solution {
    public static int first(int [] arr , int n,int k){
        int left = 0;
        int right = n-1;
        int ans = -1;
        while(left <= right){
            int mid =(left+right)/2;
            if(arr[mid] == k){
                ans = mid;
                right = mid-1;
            }
            else if(arr[mid] < k){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }
    public static int last(int [] arr , int n,int k){
        int left = 0;
        int right = n-1;
        int ans = -1;
        while(left <= right){
            int mid =(left+right)/2;
            if(arr[mid] == k){
                ans = mid;
                left = mid+1;
            }
            else if(arr[mid] < k){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int f = first(nums,n,target);
        int l = last(nums,n,target);
        return new int []{f,l};
    }
}