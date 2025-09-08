class Solution {
    public int[] getNoZeroIntegers(int n) {
        int left = 0;
        int right = n-1;
        while(left <= right){
            int sum = left+right;
            if(sum == n && (!(left+"").contains("0") && !(right+"").contains("0"))){
                return new int[]{left,right};
            }else if(sum > n){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }
}