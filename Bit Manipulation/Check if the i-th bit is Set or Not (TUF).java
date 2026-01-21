class Solution {
    public boolean checkIthBit(int n, int i) {
        // Your code goes here
        boolean ans = (n|(1<<i)) == n;
        return ans;

    }
}