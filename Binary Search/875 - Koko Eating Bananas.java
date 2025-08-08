class Solution {
    public int getHrs(int [] arr ,int n){
        int total = 0;
        for(int i = 0;i<arr.length;i++){
            total += Math.ceil((double)(arr[i])/(double)(n));
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i : piles){
            max = Math.max(i,max);
        }
        int left = 1;
        int ans = 0;
        int right = max;
        while(left <= right){
            int mid = (left+right)/2;
            int hrs = getHrs(piles,mid);
            if(hrs <= h){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;

    }
}