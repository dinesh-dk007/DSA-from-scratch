class Solution {
    public int sumUp(int [] arr ,int w){
        int count = 1;
        int temp = 0;
        for(int i = 0;i<arr.length;i++){
            if(temp + arr[i] > w){
                count += 1;
                temp = arr[i];
            }else{
                temp += arr[i];
            }
        }
        return count;
            
    }
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : weights){
            max= Math.max(max,i);
            sum += i;
        }
        int left = max;
        int right = sum;
        int ans = 0;
        while(left <= right){
            int mid = (left+right)/2;
            int val = sumUp(weights,mid);
            if(val <= days){
                ans= mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
}