class Solution {
    public int [] reverse(int [] arr , int left,int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        for(int i = n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i = n-1;i>index;i--){
            if(nums[i] > nums[index]){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        nums = reverse(nums,index+1,n-1);
    }
}