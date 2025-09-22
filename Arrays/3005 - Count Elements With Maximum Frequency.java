class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int arr[] = new int [101];
        for(int i : nums){
            arr[i]++;
            max = Math.max(arr[i],max);
        }
        int count = 0;
        for(int i : arr){
            if(i == max){
                count += max;
            }
        }
        return count;
    }
}