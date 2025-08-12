class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int ind1 = -1;int ind2 = -1;
        while(left < right){
            int sum = numbers[left]+numbers[right];
            if(sum == target){
                ind1 = left;
                ind2 = right;
                break;
            }
            else if(sum > target){
                right--;
            }else{
                left++;
            }
            while(left > 0 && left < right && numbers[left] == numbers[left-1])left++;
            while(right < numbers.length-1 && left<right && numbers[right] == numbers[right+1])right--;
        }
        return new int[]{ind1+1,ind2+1};

    }
}