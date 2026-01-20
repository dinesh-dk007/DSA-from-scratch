class Solution {
    public int setBits(int n){
        int count = 0;
        while(n != 0){
            n = n&(n-1);
            count++;
        }
        return count;
    }
    public int minBitFlips(int start, int goal) {
        int ans = start^goal;
        return setBits(ans);
    }
}