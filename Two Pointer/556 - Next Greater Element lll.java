class Solution {
    public void reverse(int [] arr,int left , int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;right--;
        }
    }
    public int nextGreaterElement(int n) {
        int index = -1;
        String num = n+"";
        int [] nums = new int [num.length()];
        for(int i = 0;i<num.length();i++){
            nums[i] = num.charAt(i) - '0';
        }
        int len = nums.length;
        for(int i = len-2;i >= 0;i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            return -1;
        }
        for(int i = len-1;i>index;i--){
            if(nums[i] > nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        reverse(nums,index+1,len-1);
        long ans = 0;
        for(int i : nums)ans = (ans*10)+i;
        if(ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE){
            return -1;
        }else{
            return (int)ans;
        }
    }
}