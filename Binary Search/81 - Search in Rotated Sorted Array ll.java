class Solution {
    public boolean search(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == target)return true;
            if(arr[left] == arr[mid] && arr[mid] == arr[right]){
                left++;
                right--;
                continue;
            }
            if(arr[left] <= arr[mid]){
                if(arr[mid] >= target && target >= arr[left]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            if(arr[right] >= arr[mid]){
                if(arr[mid] <= target && arr[right] >= target){
                    left= mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return false;
    }
}