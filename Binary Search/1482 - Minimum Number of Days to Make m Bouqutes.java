class Solution {
    public int counter(int [] arr ,int n,int k){
        int c = 0;
        int total = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] <= n){
                c++;
            }
            else{
                c = 0;
            }
            if(c == k){
                total += 1;
                c= 0;
            }
        }
        return total;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int max = Integer.MIN_VALUE;
        for(int i : bloomDay)max = Math.max(max,i);
        int left = 1;
        int right = max;
        int ans= -1;
        while(left <= right){
            int mid = (left+right)/2;
            //System.out.println(mid);
            int qty = counter(bloomDay,mid,k);
            if(qty >= m){
                System.out.println(qty);
                ans = mid;
                right= mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;

    }
}