class Solution {
    public boolean isPowerOfTwo(int n) {
        // Your code goes here
        int count = 0;
        while(n != 0){
            n = n&(n-1);
            count++;
        }
        return count == 1;
    }
}