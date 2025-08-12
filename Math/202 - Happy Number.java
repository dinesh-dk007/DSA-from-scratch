class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while(n > 1){
            int sum = 0;
            while(n > 0){
                sum += (int)Math.pow(n%10,2);
                n /= 10;
            }
            if(hs.contains(sum)){
                return false;
            }
            else{
                hs.add(sum);
                n = sum;
            }
        }
        return true;
    }
}