class Solution {
    public int pivotInteger(int n) {
        if(n == 1)return 1;
        int total = (int)(n*(n+1))/2;
        int left = 1;
        int right = n;
        while(left < right){
            int mid = (int)(left+right)/2;
            int val = (mid*(mid+1))/2;
            if(val  == (total-val+mid)){
                return mid;
            }else if(val > (total-val-mid)){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }
}