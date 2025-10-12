class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int [] frq = new int [101];
        for(int i : nums){
            frq[i]++;
        }
        int sum = 0;
        for(int i  = 0;i<=100;i++){
            if(frq[i]%k == 0){
                sum += frq[i]*i;
            }
        }
        return sum;
    }
}