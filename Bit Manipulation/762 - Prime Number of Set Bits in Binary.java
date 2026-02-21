class Solution {
    public boolean isPrime(int n){
        if(n <= 1)return false;
        if(n == 2)return true;
        for(int i = 2;i*i <= n;i++){
            if(n%i == 0)return false;
        }
        return true;
    }
    public int getSetBits(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n&(n-1);
        }
        return count;
    }
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left;i<=right;i++){
            int setBits  = getSetBits(i);
            if(isPrime(setBits)){
                count++;
            }
        }
        return count;
    }
}