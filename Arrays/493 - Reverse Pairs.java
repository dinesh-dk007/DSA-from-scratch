class Solution {
    public static int helper(int []arr,int low,int mid,int high){
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++){
            while (right <= high && arr[i] > (long)2L * arr[right])right++;
            cnt += (right - (mid + 1));
        }
        return cnt;
    }
    public static int merge(int [] arr,int low,int mid,int high){
        int count = 0;
        int left = low;
        int right = mid+1;
        int [] temp = new int [high-low+1];
        int ind = 0;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[ind++] = arr[left];
                left++;
            }else{
                temp[ind++] = arr[right];
                right++;
            }
        }
        while(left <= mid){
            temp[ind++] = arr[left];
            left++;
        }
        while(right <= high){
            temp[ind++] = arr[right];
            right++;
        }
        for(int i = low;i <= high;i++){
            arr[i] = temp[i-low];
        }
        return count;
    }
    public static int mergeSort(int [] arr,int low,int high){
        int count  =0;
        if(low == high)return count;
        int mid = (low+high)/2;
        count += mergeSort(arr,low,mid);
        count += mergeSort(arr,mid+1,high);
        count += helper(arr,low,mid,high);
        merge(arr,low,mid,high);
        return count;
    }
    public int reversePairs(int[] nums) {
        int count = mergeSort(nums,0,nums.length-1);
        return count;
    }
}