class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length;
        int tot = n*(n+1)/2;
        int val1 = 0;
        int sum = 0;
        int [] brr = new int [n+1];
        for(int i : nums){
            sum += i;
            brr[i]++;
            if(brr[i] == 2){
                val1 = i;
            }
        }
        sum -= val1;
        int val2 = tot-sum;
        return new int[]{val1,val2};
    }
}
