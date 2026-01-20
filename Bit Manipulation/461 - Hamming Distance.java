class Solution {
    public int setBits(int n){
        int count = 0;
        while(n != 0){
            n = n&(n-1);
            count++;
        }
        return count;
    }
    public int hammingDistance(int x, int y) {
        int ans = x^y;
        return setBits(ans);
    }
}